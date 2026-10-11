/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wh implements Iterator {
    static hm field_b;
    private hb field_c;
    static String field_j;
    private DualNode field_f;
    static String field_a;
    static SceneWidget field_e;
    static String field_h;
    static String field_i;
    private DualNode field_g;
    static int field_d;

    final static void a(boolean param0) {
        int var1 = 0;
        if (null == g.field_c) {
          return;
        }
        if (g.field_c.g()) {
          g.field_c = null;
          var1 = ll.field_q * 2;
          if (256 < var1) {
            var1 = 256;
          }
          ef.a(1, var1);
        }
        if (!param0) {
          return;
        }
        field_i = (String) null;
    }

    public final boolean hasNext() {
        return this.field_c.field_a != this.field_g;
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        jm var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = SteelSentinels.obfuscationControl;
        try {
          var4 = (jm) (ri.field_c.first(13058));
          while (var4 != null) {
            rh.a(param0, 0, var4);
            var4 = (jm) (ri.field_c.next((byte) -45));
          }
          if (param1 == -26077) {
            return;
          }
          field_h = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "wh.A(" + param0 + ',' + param1 + ')');
        }
    }

    public final Object next() {
        Object var1 = this.field_g;
        if (this.field_c.field_a == var1) {
          this.field_g = null;
          var1 = null;
        } else {
          this.field_g = ((DualNode) (var1)).dualNext;
        }
        this.field_f = (DualNode) (var1);
        return var1;
    }

    public final void remove() {
        if (this.field_f == null) {
          throw new IllegalStateException();
        }
        this.field_f.unlinkDual(480);
        this.field_f = null;
    }

    public static void a(byte param0) {
        if (param0 == 46) {
          field_a = null;
          field_i = null;
          field_h = null;
          field_e = null;
          field_j = null;
          field_b = null;
          return;
        }
        field_d = -36;
        field_a = null;
        field_i = null;
        field_h = null;
        field_e = null;
        field_j = null;
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = SteelSentinels.obfuscationControl;
        if (param12 > 14) {
          if (param15 <= param13) {
            if (param9 > param13) {
              PartInstruction.a(param14, param15, param2, param4, param11, param3, param1, param6, param13, param8, param5, param0, 115, param9, param10, SoftwareRaster.field_g, param7);
              return;
            }
            if (param15 < param9) {
              PartInstruction.a(param14, param15, param0, param5, param11, param6, param1, param3, param9, param10, param4, param2, 113, param13, param8, SoftwareRaster.field_g, param7);
              return;
            }
            PartInstruction.a(param2, param9, param0, param5, param4, param6, param3, param1, param15, param7, param11, param14, 120, param13, param8, SoftwareRaster.field_g, param10);
            return;
          }
          if (param9 > param15) {
            PartInstruction.a(param0, param13, param2, param4, param5, param3, param6, param1, param15, param7, param11, param14, -11, param9, param10, SoftwareRaster.field_g, param8);
            return;
          }
          if (param13 < param9) {
            PartInstruction.a(param0, param13, param14, param11, param5, param1, param6, param3, param9, param10, param4, param2, 114, param15, param7, SoftwareRaster.field_g, param8);
            return;
          }
          PartInstruction.a(param2, param9, param14, param11, param4, param1, param3, param6, param13, param8, param5, param0, -88, param15, param7, SoftwareRaster.field_g, param10);
          return;
        }
        field_a = (String) null;
        if (param15 <= param13) {
          if (param9 > param13) {
            PartInstruction.a(param14, param15, param2, param4, param11, param3, param1, param6, param13, param8, param5, param0, 115, param9, param10, SoftwareRaster.field_g, param7);
            return;
          }
          if (param15 < param9) {
            PartInstruction.a(param14, param15, param0, param5, param11, param6, param1, param3, param9, param10, param4, param2, 113, param13, param8, SoftwareRaster.field_g, param7);
            return;
          }
          PartInstruction.a(param2, param9, param0, param5, param4, param6, param3, param1, param15, param7, param11, param14, 120, param13, param8, SoftwareRaster.field_g, param10);
          return;
        }
        if (param9 > param15) {
          PartInstruction.a(param0, param13, param2, param4, param5, param3, param6, param1, param15, param7, param11, param14, -11, param9, param10, SoftwareRaster.field_g, param8);
          return;
        }
        if (param13 < param9) {
          PartInstruction.a(param0, param13, param14, param11, param5, param1, param6, param3, param9, param10, param4, param2, 114, param15, param7, SoftwareRaster.field_g, param8);
          return;
        }
        PartInstruction.a(param2, param9, param14, param11, param4, param1, param3, param6, param13, param8, param5, param0, -88, param15, param7, SoftwareRaster.field_g, param10);
    }

    wh(hb param0) {
        this.field_f = null;
        try {
          this.field_c = param0;
          this.field_f = null;
          this.field_g = this.field_c.field_a.dualNext;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "wh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static ArticulatedPart a(int param0, ArticulatedPart param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ArticulatedPart var4 = null;
        ArticulatedPart stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.field_G;
          var3 = param1.field_E;
          param1.field_E = param1.field_E - 64;
          var4 = new ArticulatedPart(na.field_a, 1, var2_int, var3, 0, param0, new PartInstruction[]{new PartInstruction(var2_int, -64 + var3, 0, 0, param1, false)});
          var4.componentId = param1.componentId;
          param1.componentId = -1;
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("wh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    static {
        field_a = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_i = "You have the maximum number of favourites already saved. You must delete one before you can save any more.";
        field_h = "Holds 1 <times> <%0>";
        field_j = "Please enter your date of birth to enable chat:";
        field_b = new hm();
    }
}
