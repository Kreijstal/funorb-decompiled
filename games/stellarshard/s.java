/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class s implements Iterator {
    private ah field_d;
    static boolean field_i;
    private ah field_h;
    static int field_b;
    static li field_f;
    static bd field_c;
    static va field_e;
    private bg field_a;
    static String field_g;

    public final boolean hasNext() {
        return this.field_h != this.field_a.field_b;
    }

    final static String a(CharSequence param0, boolean param1, byte param2) {
        String stackIn_4_0 = null;
        String stackIn_11_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = stellarshard.field_B;
        try {
          L0: {
            if (param0 == null) {
              stackIn_4_0 = cg.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param0.length();
                if (param2 == 3) {
                  break L1;
                } else {
                  s.a(true);
                  break L1;
                }
              }
              L2: {
                if (1 > var3_int) {
                  break L2;
                } else {
                  if ((var3_int ^ -1) < -13) {
                    break L2;
                  } else {
                    L3: {
                      var4 = nh.a(param0, false);
                      if (var4 == null) {
                        break L3;
                      } else {
                        if (-2 < (var4.length() ^ -1)) {
                          break L3;
                        } else {
                          L4: {
                            if (sk.a(var4.charAt(0), -122)) {
                              break L4;
                            } else {
                              if (!sk.a(var4.charAt(-1 + var4.length()), -105)) {
                                var5 = 0;
                                var6 = 0;
                                L5: while (true) {
                                  if (var6 >= param0.length()) {
                                    if (var5 > 0) {
                                      stackIn_36_0 = jb.field_h;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L6: {
                                      var7 = param0.charAt(var6);
                                      if (sk.a((char) var7, -113)) {
                                        var5++;
                                        break L6;
                                      } else {
                                        var5 = 0;
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if ((var5 ^ -1) > -3) {
                                        break L7;
                                      } else {
                                        if (!param1) {
                                          stackIn_31_0 = t.field_c;
                                          decompiledRegionSelector0 = 4;
                                          break L0;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L5;
                                  }
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                          stackIn_21_0 = jb.field_h;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    stackIn_16_0 = cg.field_b;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackIn_11_0 = cg.field_b;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var3);

            stackIn_39_1 = new StringBuilder().append("s.C(");

            if (param0 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L8;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L8;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_31_0;
                } else {
                  return stackIn_36_0;
                }
              }
            }
          }
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        int var8 = 0;
        char[] var9 = null;
        char[] var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = stellarshard.field_B;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              if (!od.a(param1, false)) {
                var10 = nh.field_e;
                var9 = var10;
                var7 = var9;
                var2 = var7;
                var3 = 0;
                L1: while (true) {
                  if (var10.length <= var3) {
                    var2 = fe.field_g;
                    var3 = 9 % ((-57 - param0) / 61);
                    var8 = 0;
                    var4 = var8;
                    L2: while (true) {
                      if (var8 >= var2.length) {
                        stackIn_21_0 = 0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        var5 = var2[var8];
                        if (param1 == var5) {
                          stackIn_18_0 = 1;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var8++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var4 = var10[var3];
                    if ((param1 ^ -1) != (var4 ^ -1)) {
                      var3++;
                      continue L1;
                    } else {
                      stackIn_11_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              } else {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref), "s.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0 != 0;
              } else {
                return stackIn_21_0 != 0;
              }
            }
          }
        }
    }

    public final void remove() {
        if (null == this.field_d) {
            throw new IllegalStateException();
        }
        this.field_d.c((byte) 36);
        this.field_d = null;
    }

    public final Object next() {
        Object var1 = this.field_h;
        if (this.field_a.field_b != var1) {
            this.field_h = ((ah) (var1)).field_m;
        } else {
            this.field_h = null;
            var1 = null;
        }
        this.field_d = (ah) (var1);
        return var1;
    }

    public static void a(boolean param0) {
        if (param0) {
            s.a(54, 'v');
        }
        field_e = null;
        field_g = null;
        field_f = null;
        field_c = null;
    }

    s(bg param0) {
        this.field_d = null;
        try {
            this.field_a = param0;
            this.field_d = null;
            this.field_h = this.field_a.field_b.field_m;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "s.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = new li(13, 0, 1, 0);
        field_g = "Please check if address is correct";
    }
}
