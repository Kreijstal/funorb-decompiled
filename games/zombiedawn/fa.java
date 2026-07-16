/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class fa extends nb {
    fa field_q;
    fa field_r;
    static int field_p;

    final void d(int param0) {
        if (null != ((fa) this).field_r) {
          ((fa) this).field_r.field_q = ((fa) this).field_q;
          ((fa) this).field_q.field_r = ((fa) this).field_r;
          if (param0 != 0) {
            ((fa) this).field_r = null;
            ((fa) this).field_q = null;
            ((fa) this).field_r = null;
            return;
          } else {
            ((fa) this).field_q = null;
            ((fa) this).field_r = null;
            return;
          }
        } else {
          return;
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        L0: {
          rf.a((java.awt.Component) (Object) param1, -116);
          mj.a(3490, (java.awt.Component) (Object) param1);
          if (null != jl.field_u) {
            jl.field_u.a((java.awt.Component) (Object) param1, (byte) -36);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == -46) {
          return;
        } else {
          field_p = -68;
          return;
        }
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        char[] var14 = null;
        var9 = ZombieDawn.field_J;
        var14 = new char[param1];
        var13 = var14;
        var12 = var13;
        var11 = var12;
        var10 = var11;
        var4 = var10;
        var5 = 0;
        var6 = 0;
        if (param3 >= -58) {
          return null;
        } else {
          L0: {
            if (param1 <= var6) {
              break L0;
            } else {
              L1: {
                var7 = param0[param2 - -var6] & 255;
                if (-1 == (var7 ^ -1)) {
                  var6++;
                  break L1;
                } else {
                  if (-129 >= (var7 ^ -1)) {
                    if (var7 < 160) {
                      L2: {
                        var8 = fj.field_h[-128 + var7];
                        if (var8 == 0) {
                          var8 = 63;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var7 = var8;
                      int incrementValue$3 = var5;
                      var5++;
                      var10[incrementValue$3] = (char)var7;
                      break L1;
                    } else {
                      int incrementValue$4 = var5;
                      var5++;
                      var10[incrementValue$4] = (char)var7;
                      var6++;
                      var6++;
                      var6++;
                      return new String(var14, 0, var5);
                    }
                  } else {
                    int incrementValue$5 = var5;
                    var5++;
                    var10[incrementValue$5] = (char)var7;
                    var6++;
                    var6++;
                    var6++;
                    return new String(var14, 0, var5);
                  }
                }
              }
              var6++;
              var6++;
              var6++;
              break L0;
            }
          }
          return new String(var14, 0, var5);
        }
    }

    protected fa() {
    }

    final static int e(int param0) {
        int var1 = -98 / ((-62 - param0) / 56);
        return 4 + pb.a(so.field_a, 16, 1);
    }

    static {
    }
}
