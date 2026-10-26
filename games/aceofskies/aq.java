/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class aq {
    static java.awt.Font field_b;
    long field_a;
    static java.util.zip.CRC32 field_d;
    private wl field_c;

    final static void b(int param0) {
        int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          Sprite var1 = new Sprite(param0, 140);
          cm.a(var1, param0 - 15032);
          re.a();
          SoftwareRasterizer.clearFramebuffer();
          it.field_c = 0;
          wj.e((byte) -128);
          Sprite var2 = var1.copy();
          for (int var3 = 0; var3 < 15; var3++) {
            var2.c(-2, -2, 16777215);
            SoftwareRasterizer.a(4, 4, 0, 0, 540, 140);
          }
          oo.field_W.makeRasterTarget();
          var1.d(0, 0);
          sl.c(2765);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "aq.C(" + param0 + ')');
        }
    }

    protected final void finalize() throws Throwable {
        this.field_c.a(this.field_a, 3);
        super.finalize();
    }

    public static void a(int param0) {
        if (param0 != 32683) {
          aq.a(-86);
        }
        field_b = null;
        field_d = null;
    }

    final static StringBuilder a(char param0, int param1, int param2, StringBuilder param3) {
        String stackIn_10_2 = null;
        try {
          int var4_int = param3.length();
          param3.setLength(param2);
          if (param1 != -2) {
            StringBuilder var6 = (StringBuilder) null;
            aq.a('.', 9, -96, (StringBuilder) null);
          }
          for (int var5 = var4_int; var5 < param2; var5++) {
            param3.setCharAt(var5, param0);
          }
          StringBuilder stackIn_6_0 = (StringBuilder) (param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var4;
          StringBuilder stackIn_9_1 = new StringBuilder().append("aq.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    aq(wl param0, long param1, int param2) {
        try {
          this.field_a = param1;
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "aq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = new java.util.zip.CRC32();
    }
}
