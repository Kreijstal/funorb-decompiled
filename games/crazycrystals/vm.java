/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vm {
    String field_l;
    private int field_c;
    static String field_e;
    static String field_h;
    private lm[] field_f;
    static wb field_g;
    private int field_a;
    float field_b;
    private int field_i;
    static int[] field_d;
    static db field_k;
    static Vector[] field_j;

    public static void b(byte param0) {
        field_h = null;
        if (param0 <= 111) {
          mb[] discarded$2 = vm.a((byte) 36);
          field_d = null;
          field_g = null;
          field_e = null;
          field_k = null;
          field_j = null;
          return;
        } else {
          field_d = null;
          field_g = null;
          field_e = null;
          field_k = null;
          field_j = null;
          return;
        }
    }

    final boolean a(int param0) {
        lm var2 = null;
        int var3 = 0;
        lm var4 = null;
        lm var5 = null;
        lm var6 = null;
        var3 = CrazyCrystals.field_B;
        if (param0 != 0) {
          field_d = null;
          L0: while (true) {
            if (((vm) this).field_c > ((vm) this).field_i) {
              var6 = ((vm) this).field_f[((vm) this).field_i];
              var4 = var6;
              var2 = var4;
              if (var6.field_h.a((byte) 102)) {
                L1: {
                  if (var6.field_i < 0) {
                    break L1;
                  } else {
                    if (var6.field_h.e(var6.field_i, 75)) {
                      break L1;
                    } else {
                      this.a(var2, 1, var6.field_h.b(25030, var6.field_i));
                      return false;
                    }
                  }
                }
                L2: {
                  if (var6.field_b == null) {
                    break L2;
                  } else {
                    if (var6.field_h.a(-20402, var6.field_b)) {
                      break L2;
                    } else {
                      this.a(var2, 1, var6.field_h.b(var6.field_b, param0 ^ -75));
                      return false;
                    }
                  }
                }
                L3: {
                  if ((var6.field_i ^ -1) <= -1) {
                    break L3;
                  } else {
                    if (null != var6.field_b) {
                      break L3;
                    } else {
                      if (null == var6.field_f) {
                        break L3;
                      } else {
                        if (!var6.field_h.a(false)) {
                          this.a(var2, param0 ^ 1, var6.field_h.b(param0 + 3492));
                          return false;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                ((vm) this).field_i = ((vm) this).field_i + 1;
                continue L0;
              } else {
                this.a(var6, 1, 0);
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          L4: while (true) {
            if (((vm) this).field_c > ((vm) this).field_i) {
              var5 = ((vm) this).field_f[((vm) this).field_i];
              var4 = var5;
              var2 = var4;
              if (var5.field_h.a((byte) 102)) {
                L5: {
                  if (var5.field_i < 0) {
                    break L5;
                  } else {
                    if (var5.field_h.e(var5.field_i, 75)) {
                      break L5;
                    } else {
                      this.a(var2, 1, var5.field_h.b(25030, var5.field_i));
                      return false;
                    }
                  }
                }
                L6: {
                  if (var5.field_b == null) {
                    break L6;
                  } else {
                    if (var5.field_h.a(-20402, var5.field_b)) {
                      break L6;
                    } else {
                      this.a(var2, 1, var5.field_h.b(var5.field_b, param0 ^ -75));
                      return false;
                    }
                  }
                }
                L7: {
                  if ((var5.field_i ^ -1) <= -1) {
                    break L7;
                  } else {
                    if (null != var5.field_b) {
                      break L7;
                    } else {
                      if (null == var5.field_f) {
                        break L7;
                      } else {
                        if (!var5.field_h.a(false)) {
                          this.a(var2, param0 ^ 1, var5.field_h.b(param0 + 3492));
                          return false;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                }
                ((vm) this).field_i = ((vm) this).field_i + 1;
                continue L4;
              } else {
                this.a(var5, 1, 0);
                return false;
              }
            } else {
              return true;
            }
          }
        }
    }

    final static int a(byte param0, boolean param1, String param2) {
        int var3 = 125 % ((param0 - 22) / 36);
        if (!param1) {
            return ec.field_m.a(param2);
        }
        return gh.field_F.a(param2);
    }

    final static mb[] a(byte param0) {
        if (param0 <= 51) {
          vm.b((byte) -80);
          return new mb[]{gg.field_d, wp.field_c, je.field_b};
        } else {
          return new mb[]{gg.field_d, wp.field_c, je.field_b};
        }
    }

    private final void a(lm param0, int param1, int param2) {
        float var4 = (float)(param1 + ((vm) this).field_i) + (float)param2 / 100.0f;
        ((vm) this).field_b = (float)((vm) this).field_a * var4 / (float)(1 + ((vm) this).field_c);
        if (param2 != 0) {
            ((vm) this).field_l = param0.field_f + " - " + param2 + "%";
        } else {
            ((vm) this).field_l = param0.field_c;
            return;
        }
    }

    private vm() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Return to game";
        field_h = "Email (Login):";
        field_g = new wb();
        field_d = new int[8192];
    }
}
