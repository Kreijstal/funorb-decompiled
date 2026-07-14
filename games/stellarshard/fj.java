/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fj {
    float field_a;
    static Calendar field_k;
    String field_g;
    private int field_e;
    private vc[] field_d;
    private int field_c;
    private int field_h;
    static rd field_i;
    static java.math.BigInteger field_l;
    static bd field_f;
    static int[] field_b;
    static long field_j;

    private final void a(int param0, vc param1, byte param2) {
        int var4 = 0;
        float var5 = 0.0f;
        var4 = 72 % ((6 - param2) / 39);
        var5 = (float)(1 + ((fj) this).field_h) + (float)param0 / 100.0f;
        ((fj) this).field_a = var5 * (float)((fj) this).field_e / (float)(((fj) this).field_c - -1);
        if (-1 == (param0 ^ -1)) {
          ((fj) this).field_g = param1.field_d;
          return;
        } else {
          ((fj) this).field_g = param1.field_c + " - " + param0 + "%";
          return;
        }
    }

    final boolean a(boolean param0) {
        int var3 = 0;
        vc var4 = null;
        var3 = stellarshard.field_B;
        L0: while (true) {
          if (((fj) this).field_c <= ((fj) this).field_h) {
            if (!param0) {
              boolean discarded$1 = ((fj) this).a(false);
              return true;
            } else {
              return true;
            }
          } else {
            var4 = ((fj) this).field_d[((fj) this).field_h];
            if (!var4.field_e.a((byte) -36)) {
              this.a(0, var4, (byte) -68);
              return false;
            } else {
              L1: {
                if (0 > var4.field_i) {
                  break L1;
                } else {
                  if (var4.field_e.a(var4.field_i, (byte) 123)) {
                    break L1;
                  } else {
                    this.a(var4.field_e.a(var4.field_i, 0), var4, (byte) -106);
                    return false;
                  }
                }
              }
              L2: {
                if (var4.field_j == null) {
                  break L2;
                } else {
                  if (var4.field_e.a(var4.field_j, (byte) -109)) {
                    break L2;
                  } else {
                    this.a(var4.field_e.b(0, var4.field_j), var4, (byte) 60);
                    return false;
                  }
                }
              }
              L3: {
                if (-1 >= (var4.field_i ^ -1)) {
                  break L3;
                } else {
                  if (var4.field_j != null) {
                    break L3;
                  } else {
                    if (null == var4.field_c) {
                      break L3;
                    } else {
                      if (!var4.field_e.c((byte) -111)) {
                        this.a(var4.field_e.b((byte) 1), var4, (byte) 68);
                        return false;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              ((fj) this).field_h = ((fj) this).field_h + 1;
              continue L0;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_l = null;
        field_i = null;
        field_f = null;
        if (param0 <= 47) {
          fj.a((byte) -58);
          field_k = null;
          return;
        } else {
          field_k = null;
          return;
        }
    }

    private fj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_i = new rd();
        field_l = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
