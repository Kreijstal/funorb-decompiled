/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ii implements Iterator {
    private int field_d;
    private ug field_c;
    private jb field_b;
    static String field_e;
    private jb field_a;

    public final void remove() {
        if (!(null != ((ii) this).field_a)) {
            throw new IllegalStateException();
        }
        ((ii) this).field_a.a(false);
        ((ii) this).field_a = null;
    }

    private final void a(byte param0) {
        if (param0 != -112) {
          ii.a(-107);
          ((ii) this).field_a = null;
          ((ii) this).field_b = ((ii) this).field_c.field_c[0].field_b;
          ((ii) this).field_d = 1;
          return;
        } else {
          ((ii) this).field_a = null;
          ((ii) this).field_b = ((ii) this).field_c.field_c[0].field_b;
          ((ii) this).field_d = 1;
          return;
        }
    }

    public static void a(int param0) {
        if (param0 > -53) {
            return;
        }
        field_e = null;
    }

    final static void a(int[] param0, fq param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var3 = 48 * param1.field_m / param1.field_p;
          var4 = param1.field_o * var3 + 48 * param1.field_A + 24;
          if (vh.field_a) {
            var4 = tm.field_d[0].length * 24;
            break L0;
          } else {
            break L0;
          }
        }
        var5 = 24 + param1.field_t * 48 - -(var3 * param1.field_s);
        if (var4 >= param0[0]) {
          if (param2 >= 116) {
            if (var5 >= param0[2]) {
              if (param0[1] < var4) {
                L1: {
                  param0[1] = var4;
                  if (param0[3] < var5) {
                    param0[3] = var5;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              } else {
                L2: {
                  if (param0[3] < var5) {
                    param0[3] = var5;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              }
            } else {
              param0[2] = var5;
              if (param0[1] < var4) {
                L3: {
                  param0[1] = var4;
                  if (param0[3] < var5) {
                    param0[3] = var5;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              } else {
                L4: {
                  if (param0[3] < var5) {
                    param0[3] = var5;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return;
              }
            }
          } else {
            return;
          }
        } else {
          param0[0] = var4;
          if (param2 >= 116) {
            if (var5 < param0[2]) {
              param0[2] = var5;
              if (param0[1] >= var4) {
                L5: {
                  if (param0[3] < var5) {
                    param0[3] = var5;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                return;
              } else {
                L6: {
                  param0[1] = var4;
                  if (param0[3] < var5) {
                    param0[3] = var5;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                return;
              }
            } else {
              if (param0[1] < var4) {
                L7: {
                  param0[1] = var4;
                  if (param0[3] < var5) {
                    param0[3] = var5;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                return;
              } else {
                L8: {
                  if (param0[3] < var5) {
                    param0[3] = var5;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    ii(ug param0) {
        ((ii) this).field_a = null;
        ((ii) this).field_c = param0;
        this.a((byte) -112);
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = CrazyCrystals.field_B;
        if (((ii) this).field_b == ((ii) this).field_c.field_c[((ii) this).field_d + -1]) {
          L0: while (true) {
            if (((ii) this).field_d < ((ii) this).field_c.field_e) {
              ((ii) this).field_d = ((ii) this).field_d + 1;
              if (((ii) this).field_c.field_c[((ii) this).field_d].field_b != ((ii) this).field_c.field_c[((ii) this).field_d + -1]) {
                ((ii) this).field_b = ((ii) this).field_c.field_c[((ii) this).field_d - 1].field_b;
                return true;
              } else {
                ((ii) this).field_b = ((ii) this).field_c.field_c[-1 + ((ii) this).field_d];
                continue L0;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    public final Object next() {
        jb var1 = null;
        int var2 = 0;
        var2 = CrazyCrystals.field_B;
        if (((ii) this).field_b == ((ii) this).field_c.field_c[-1 + ((ii) this).field_d]) {
          L0: while (true) {
            if (((ii) this).field_d < ((ii) this).field_c.field_e) {
              ((ii) this).field_d = ((ii) this).field_d + 1;
              var1 = ((ii) this).field_c.field_c[((ii) this).field_d].field_b;
              if (var1 == ((ii) this).field_c.field_c[-1 + ((ii) this).field_d]) {
                continue L0;
              } else {
                ((ii) this).field_b = var1.field_b;
                ((ii) this).field_a = var1;
                return (Object) (Object) var1;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = ((ii) this).field_b;
          ((ii) this).field_a = var1;
          ((ii) this).field_b = var1.field_b;
          return (Object) (Object) var1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Rock";
    }
}
