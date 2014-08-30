/**
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 */

package autosaveworld.threads.purge.byuuids.plugins.mywarp;

import me.taylorkelly.mywarp.MyWarp;
import me.taylorkelly.mywarp.data.Warp;
import autosaveworld.core.logging.MessageLogger;

public class WarpDeleteTask implements MyWarpPurgeTask {

	private Warp warp;

	public WarpDeleteTask(Warp warp) {
		this.warp = warp;
	}

	@Override
	public void performTask() {
		MessageLogger.debug("Deleting warp "+warp.getName());
		MyWarp.inst().getWarpManager().deleteWarp(warp);
	}

}
