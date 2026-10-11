/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class c implements Iterator {
    private ce field_h;
    static String field_b;
    private uf field_g;
    static String field_c;
    private uf field_e;
    static String field_i;
    private int field_f;
    static String field_d;
    static char[] field_a;

    final static void a(byte param0, ci param1, int param2) {
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        java.applet.Applet var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        var7 = Terraphoenix.field_V;
        try {
          var10 = param1.field_z;
          var9 = var10;
          var3 = var9;
          var4 = 0;
          for (var5 = -1 + param1.field_t; var5 >= 0; var5--) {
            for (var6 = param1.field_r - 1; 0 <= var6; var6--) {
              if (1 == var10[var4]) {
                var3[var4++] = 2;
              } else {
                var4++;
              }
            }
          }
          var4Lifetime1 = 0;
          for (var5Lifetime1 = 0; var5Lifetime1 < param1.field_t; var5Lifetime1++) {
            for (var6Lifetime1 = 0; param1.field_r > var6Lifetime1; var6Lifetime1++) {
              if (var10[var4Lifetime1] == 0) {
                if (0 < var6Lifetime1 &&
                  var3[-1 + var4Lifetime1] > 1) {
                  var10[var4Lifetime1] = 1;
                } else {
                  if (var5Lifetime1 > 0 &&
                    var3[-param1.field_r + var4Lifetime1] > 1) {
                    var10[var4Lifetime1] = 1;
                  } else {
                    if (param1.field_r - 1 > var6Lifetime1 &&
                      var3[var4Lifetime1 + 1] > 1) {
                      var10[var4Lifetime1] = 1;
                    } else {
                      if (param1.field_t - 1 > var5Lifetime1 &&
                        var3[var4Lifetime1 + param1.field_r] > 1) {
                        var10[var4Lifetime1] = 1;
                      }
                    }
                  }
                }
              }
              var4Lifetime1++;
            }
          }
          var4Lifetime2 = 0;
          for (var5Lifetime2 = -1 + param1.field_t; var5Lifetime2 >= 0; var5Lifetime2--) {
            for (var6Lifetime2 = param1.field_r - 1; 0 <= var6Lifetime2; var6Lifetime2--) {
              if (var10[var4Lifetime2] != 1) {
                var4Lifetime2++;
              } else {
                var3[var4Lifetime2++] = param2;
              }
            }
          }
          if (param0 != -86) {
            var8 = (java.applet.Applet) null;
            c.a((byte) 118, (java.applet.Applet) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_49_0 = var3_ref;
          stackIn_49_1 = new StringBuilder().append("c.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        field_i = null;
        if (param0 != 1) {
          c.b(125);
        }
        field_d = null;
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = Terraphoenix.field_V;
        if (this.field_e != this.field_h.field_a[-1 + this.field_f]) {
          return true;
        }
        while (this.field_h.field_c > this.field_f) {
          fieldTemp$0 = this.field_f;
          this.field_f = this.field_f + 1;
          if (this.field_h.field_a[fieldTemp$0].field_d != this.field_h.field_a[this.field_f - 1]) {
            this.field_e = this.field_h.field_a[-1 + this.field_f].field_d;
            return true;
          }
          this.field_e = this.field_h.field_a[this.field_f - 1];
        }
        return false;
    }

    public final void remove() {
        if (this.field_g == null) {
          throw new IllegalStateException();
        }
        this.field_g.b((byte) 12);
        this.field_g = null;
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        uf var1;
        int var2;
        var2 = Terraphoenix.field_V;
        if (this.field_h.field_a[-1 + this.field_f] != this.field_e) {
          var1 = this.field_e;
          this.field_g = var1;
          this.field_e = var1.field_d;
          return var1;
        }
        do {
          if (this.field_f >= this.field_h.field_c) {
            return null;
          }
          fieldTemp$0 = this.field_f;
          this.field_f = this.field_f + 1;
          var1 = this.field_h.field_a[fieldTemp$0].field_d;
        } while (this.field_h.field_a[this.field_f - 1] == var1);
        this.field_g = var1;
        this.field_e = var1.field_d;
        return var1;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              if (param0 != -110) {
                return;
              }
              var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
              param1.getAppletContext().showDocument(bb.a((byte) 126, var2, param1), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("c.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw qk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0) {
        this.field_e = this.field_h.field_a[0].field_d;
        if (param0) {
          return;
        }
        this.field_f = 1;
        this.field_g = null;
    }

    c(ce param0) {
        this.field_g = null;
        try {
          this.field_h = param0;
          this.a(false);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "c.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(int param0) {
        boolean stackIn_9_0 = false;
        if (param0 >= -60) {
          field_d = (String) null;
        }
        boolean decompiledFrameRemainder0 = true;
        if (20 <= uh.field_H &&
          wf.a(31996) && (!(0 < db.field_b) ||
          mi.a((byte) -95))) {
          stackIn_9_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }

    static {
        field_c = "6000pts";
        field_b = "Build ";
        field_d = "Options Menu";
        field_a = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
