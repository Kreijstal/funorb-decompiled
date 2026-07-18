/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jwa extends le {
    static llb field_k;
    static int field_l;
    private int field_j;
    private int field_i;
    private int field_m;

    public jwa() {
        this(0);
    }

    private final void b(int param0, int param1) {
        ((jwa) this).field_j = (255 & param0) << 4;
        ((jwa) this).field_i = param0 >> 4 & 4080;
        int var3 = -58 % ((param1 - -77) / 41);
        ((jwa) this).field_m = (16711680 & param0) >> 12;
    }

    final int[][] a(int param0, int param1) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = VoidHunters.field_G;
        int[][] var9 = ((jwa) this).field_d.a(param1, (byte) -98);
        int[][] var3 = var9;
        if (!(!((jwa) this).field_d.field_g)) {
            var4 = var9[0];
            var5 = var9[1];
            var6 = var9[2];
            for (var7 = 0; var7 < hob.field_d; var7++) {
                var4[var7] = ((jwa) this).field_m;
                var5[var7] = ((jwa) this).field_i;
                var6[var7] = ((jwa) this).field_j;
            }
        }
        if (param0 != 255) {
            return null;
        }
        return var3;
    }

    private jwa(int param0) {
        super(0, false);
        this.b(param0, -121);
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (param1 <= -60) {
              L1: {
                var4_int = param0;
                if (var4_int == 0) {
                  this.b(param2.c((byte) -94), -123);
                  break L1;
                } else {
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("jwa.F(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final static String a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_19_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_18_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var9 = VoidHunters.field_G;
        try {
          if (param1 != null) {
            if (!param0) {
              var2_int = 0;
              var3 = param1.length();
              L0: while (true) {
                L1: {
                  if (var2_int >= var3) {
                    break L1;
                  } else {
                    if (!fg.a(param1.charAt(var2_int), 120)) {
                      break L1;
                    } else {
                      var2_int++;
                      continue L0;
                    }
                  }
                }
                L2: while (true) {
                  L3: {
                    if (var3 <= var2_int) {
                      break L3;
                    } else {
                      if (!fg.a(param1.charAt(var3 - 1), 116)) {
                        break L3;
                      } else {
                        var3--;
                        continue L2;
                      }
                    }
                  }
                  var4 = var3 + -var2_int;
                  if (var4 >= 1) {
                    if (12 >= var4) {
                      var5 = new StringBuilder(var4);
                      var6 = var2_int;
                      L4: while (true) {
                        if (var6 >= var3) {
                          if (var5.length() != 0) {
                            return var5.toString();
                          } else {
                            return null;
                          }
                        } else {
                          L5: {
                            var7 = param1.charAt(var6);
                            if (qnb.a((byte) -128, (char) var7)) {
                              int discarded$2 = 102;
                              var8 = rr.a((char) var7);
                              if (var8 != 0) {
                                StringBuilder discarded$3 = var5.append((char) var8);
                                break L5;
                              } else {
                                break L5;
                              }
                            } else {
                              break L5;
                            }
                          }
                          var6++;
                          continue L4;
                        }
                      }
                    } else {
                      stackOut_18_0 = null;
                      stackIn_19_0 = stackOut_18_0;
                      return (String) (Object) stackIn_19_0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (String) (Object) stackIn_6_0;
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var2;
            stackOut_32_1 = new StringBuilder().append("jwa.C(").append(param0).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L6;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ')');
        }
    }

    public static void d(int param0) {
        field_k = null;
        if (param0 > -76) {
            jwa.d(-39);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 2;
    }
}
