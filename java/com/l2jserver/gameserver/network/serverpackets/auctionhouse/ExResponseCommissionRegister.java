/*
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.l2jserver.gameserver.network.serverpackets.auctionhouse;

import com.l2jserver.gameserver.network.serverpackets.L2GameServerPacket;

/**
 * @author Erlandys
 */
public class ExResponseCommissionRegister extends L2GameServerPacket
{
	private final boolean success;
	
	public ExResponseCommissionRegister(boolean _success)
	{
		success = _success;
	}
	
	@Override
	protected final void writeImpl()
	{
		writeC(0xd3);
		writeD(success ? 1 : 0); // Success
	}
}
