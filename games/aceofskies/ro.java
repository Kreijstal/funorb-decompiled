/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ro extends ua implements ti {
    static gb field_u;
    static hd field_o;
    private la field_s;
    static String field_p;
    static lh field_r;
    static int field_q;
    static int[] field_t;

    final static byte[] b(int param0, int param1) {
        byte[] var11 = null;
        byte[] var10 = null;
        byte[] var3 = null;
        Random var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = AceOfSkies.field_G ? 1 : 0;
        bi var2 = (bi) (Object) hh.field_b.a((byte) -27, (long)param1);
        if (var2 == null) {
            var11 = new byte[512];
            var10 = var11;
            var3 = var10;
            var4 = new Random((long)param1);
            for (var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte)var5;
            }
            for (var5 = 0; var5 < 255; var5++) {
                var6 = -var5 + 255;
                var7 = bs.a(-1, var4, var6);
                var8 = var11[var7];
                var3[var7] = var11[var6];
                var3[511 + -var5] = (byte) var8;
                var3[var6] = (byte) var8;
            }
            var2 = new bi(var11);
            hh.field_b.a((wt) (Object) var2, 2, (long)param1);
        }
        return var2.field_n;
    }

    ro(jc param0, la param1, boolean param2) {
        super(param0, 34963, param2);
        try {
            ((ro) this).field_s = param1;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "ro.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final void a(int param0, int param1) {
        super.a(param0, param1 * ((ro) this).field_s.field_c);
    }

    public final boolean a(byte param0) {
        int var2 = 16 / ((param0 - -61) / 59);
        return super.a(((ro) this).field_a.field_Qc, (byte) -115);
    }

    public final void a(int param0) {
        super.a(param0);
    }

    public static void d() {
        field_r = null;
        field_o = null;
        field_u = null;
        field_p = null;
        field_t = null;
        int var1 = -41;
    }

    final static int a(int param0, boolean param1, int param2, CharSequence param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_42_0 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < 2) {
                break L1;
              } else {
                if (param0 <= 36) {
                  L2: {
                    var4_int = 0;
                    var5 = 0;
                    var6 = 0;
                    if (param2 <= -77) {
                      break L2;
                    } else {
                      field_p = null;
                      break L2;
                    }
                  }
                  var7 = param3.length();
                  var8 = 0;
                  L3: while (true) {
                    if (var8 >= var7) {
                      if (var5 == 0) {
                        throw new NumberFormatException();
                      } else {
                        stackOut_42_0 = var6;
                        stackIn_43_0 = stackOut_42_0;
                        break L0;
                      }
                    } else {
                      L4: {
                        L5: {
                          var9 = param3.charAt(var8);
                          if (0 == var8) {
                            if (var9 == 45) {
                              var4_int = 1;
                              break L4;
                            } else {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            if (var9 < 48) {
                              break L7;
                            } else {
                              if (var9 <= 57) {
                                var9 -= 48;
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 65) {
                              break L8;
                            } else {
                              if (var9 <= 90) {
                                var9 -= 55;
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (97 > var9) {
                              break L9;
                            } else {
                              if (var9 <= 122) {
                                var9 -= 87;
                                break L6;
                              } else {
                                break L9;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (var9 >= param0) {
                          throw new NumberFormatException();
                        } else {
                          L10: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var10 = var6 * param0 - -var9;
                          if (var10 / param0 != var6) {
                            throw new NumberFormatException();
                          } else {
                            var6 = var10;
                            var5 = 1;
                            break L4;
                          }
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var4;
            stackOut_44_1 = new StringBuilder().append("ro.Q(").append(param0).append(',').append(true).append(',').append(param2).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param3 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L11;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L11;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + ')');
        }
        return stackIn_43_0;
    }

    public final jaclib.memory.Buffer a(boolean param0, int param1) {
        if (param1 != 32570) {
            boolean discarded$0 = ((ro) this).a((byte) -43);
        }
        return super.a(((ro) this).field_a.field_Qc, param0, -10386);
    }

    final static int c() {
        return oj.field_g;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new gb(4.0, 20, 3, 100, 25, 2.0, 20.0, 32, 2);
        field_p = "ACHIEVEMENTS";
        field_o = new hd(1);
        field_r = new lh();
        field_t = new int[8192];
    }
}
