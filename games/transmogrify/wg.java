/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wg implements Iterator {
    static qj field_f;
    private ri field_a;
    static ik field_d;
    private pf field_c;
    static String field_e;
    private ri field_b;

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        he var3_ref_he = null;
        int var3 = 0;
        gh var4 = null;
        int var4_int = 0;
        Object var5 = null;
        int var6 = 0;
        hj var8 = null;
        byte[] var12 = null;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var8 = nf.field_l;
                var2 = var8.d((byte) 59);
                if (-1 != (var2 ^ -1)) {
                  break L2;
                } else {
                  var3_ref_he = (he) ((Object) pj.field_A.a((byte) -95));
                  if (var3_ref_he != null) {
                    L3: {
                      L4: {
                        var4_int = var8.d((byte) 85);
                        if (0 != var4_int) {
                          break L4;
                        } else {
                          var5 = null;
                          if (var6 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var12 = new byte[var4_int];
                      var8.a(var4_int, 2, var12, 0);
                      break L3;
                    }
                    var8.field_h = var8.field_h + 4;
                    if (!var8.d(5432)) {
                      pc.a(param0 + -3);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var3_ref_he.c(param0 ^ 1);
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    pc.a(param0 ^ 5);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              L5: {
                if (1 == var2) {
                  break L5;
                } else {
                  d.a((Throwable) null, 13, "A1: " + ik.q(48));
                  pc.a(1);
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L5;
                  }
                }
              }
              var3 = var8.c((byte) -122);
              var4 = (gh) ((Object) mf.field_b.a((byte) -95));
              L6: while (true) {
                L7: {
                  L8: {
                    if (var4 == null) {
                      break L8;
                    } else {
                      stackOut_18_0 = var4.field_j;
                      stackOut_18_1 = var3;
                      stackIn_26_0 = stackOut_18_0;
                      stackIn_26_1 = stackOut_18_1;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      if (var6 != 0) {
                        break L7;
                      } else {
                        L9: {
                          if (stackIn_19_0 != stackIn_19_1) {
                            break L9;
                          } else {
                            if (var6 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var4 = (gh) ((Object) mf.field_b.a(true));
                        continue L6;
                      }
                    }
                  }
                  if (var4 == null) {
                    stackOut_25_0 = param0;
                    stackOut_25_1 = -3;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    break L7;
                  } else {
                    var4.c(5);
                    break L1;
                  }
                }
                pc.a(stackIn_26_0 + stackIn_26_1);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
            if (param0 == 4) {
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              field_e = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "wg.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public final void remove() {
        if (this.field_a == null) {
            throw new IllegalStateException();
        }
        this.field_a.b((byte) -81);
        this.field_a = null;
    }

    public final Object next() {
        ri var1 = null;
        var1 = this.field_b;
        if (var1 != this.field_c.field_e) {
          this.field_b = var1.field_h;
          if (Transmogrify.field_A) {
            this.field_b = null;
            var1 = null;
            this.field_a = var1;
            return var1;
          } else {
            this.field_a = var1;
            return var1;
          }
        } else {
          this.field_b = null;
          var1 = null;
          this.field_a = var1;
          return var1;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_f = null;
        if (param0 != 20738) {
            field_d = (ik) null;
        }
    }

    wg(pf param0) {
        this.field_a = null;
        try {
            this.field_c = param0;
            this.field_a = null;
            this.field_b = this.field_c.field_e.field_h;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "wg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean hasNext() {
        return this.field_c.field_e != this.field_b;
    }

    static {
        field_e = "Service unavailable";
        field_f = new qj();
    }
}
