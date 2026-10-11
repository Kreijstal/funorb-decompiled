/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends ug {
    String field_jb;
    int field_R;
    String field_ib;

    final static Class a(byte param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_4_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_22_0 = null;
        Class stackIn_27_0 = null;
        Class stackIn_30_0 = null;
        Class stackIn_36_0 = null;
        Class stackIn_38_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.equals("B")) {
            stackIn_4_0 = Byte.TYPE;
            return stackIn_4_0;
          }
          if (param1.equals("I")) {
            stackIn_7_0 = Integer.TYPE;
            return stackIn_7_0;
          }
          if (param1.equals("S")) {
            stackIn_11_0 = Short.TYPE;
            return stackIn_11_0;
          }
          if (param1.equals("J")) {
            stackIn_15_0 = Long.TYPE;
            return stackIn_15_0;
          }
          if (param0 != 11) {
            ve.a(-101, 122, 42, (pf) null, false);
          }
          if (param1.equals("Z")) {
            stackIn_22_0 = Boolean.TYPE;
            return stackIn_22_0;
          }
          if (param1.equals("F")) {
            stackIn_27_0 = Float.TYPE;
            return stackIn_27_0;
          }
          if (param1.equals("D")) {
            stackIn_30_0 = Double.TYPE;
            return stackIn_30_0;
          }
          if (param1.equals("C")) {
            stackIn_36_0 = Character.TYPE;
            return stackIn_36_0;
          }
          stackIn_38_0 = Class.forName(param1);
          return stackIn_38_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_42_0 = var2;
          stackIn_42_1 = new StringBuilder().append("ve.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, pf param3, boolean param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_39_0Lifetime1;
        int stackIn_39_1Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        var20 = TrackController.field_F ? 1 : 0;
        try {
          var5_int = ea.b(false, 3 * (param2 - param1));
          var7 = -112 % ((0 - param0) / 41);
          var6 = param1 * 3;
          var8 = -10 + var5_int;
          ud.a(-119);
          if (param3.field_a > 0 &&
            null != param3.field_x) {
            nj.a((byte) 125);
          }
          ug.field_Q = 0;
          var9 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param3.field_E > var9)))) {
            var10 = param3.field_O[var9];
            var11 = param3.field_g[var9];
            var12 = param3.field_d[var9];
            stackOut_10_0 = param4;
            stackIn_48_0 = stackOut_10_0 ? 1 : 0;
            stackIn_11_0 = stackOut_10_0;
            if (var20 == 0) {
              if (stackIn_11_0) {
                var13 = qa.field_b[var10];
                var14 = ui.field_r[var10];
                var15 = -var13 + qa.field_b[var11];
                var16 = -var13 + qa.field_b[var12];
                var17 = -var14 + ui.field_r[var11];
                var18 = ui.field_r[var12] - var14;
              }
              if (!stackIn_11_0 ||
                !(-(var16 * var17) + var15 * var18 >= 0)) {
                var13Lifetime1 = od.field_c[var10];
                if (-2147483648 != var13Lifetime1) {
                  var14Lifetime1 = od.field_c[var11];
                  if (-2147483648 != var14Lifetime1) {
                    var15 = od.field_c[var12];
                    if (var15 != -2147483648) {
                      var16 = var15 + var14Lifetime1 + (var13Lifetime1 - var6);
                      stackIn_27_0 = -1;
                      stackIn_27_1 = rf.field_a.length;
                      if (var8 < 0) {
                        stackIn_28_2 = var16 << -var8;
                      } else {
                        stackIn_28_2 = var16 >> var8;
                      }
                      var17 = stackIn_27_0 + (stackIn_27_1 - stackIn_28_2);
                      var18 = rf.field_a[var17];
                      while (true) {
                        if (var18 >> 4 != 0) {
                          var17--;
                          stackIn_39_0 = ~var17;
                          stackIn_39_1 = -1;
                          if (stackIn_39_0 > stackIn_39_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var18 = rf.field_a[var17];
                          continue;
                        }
                        stackIn_39_0Lifetime1 = var17 << 4;
                        stackIn_39_1Lifetime1 = var18;
                        var19 = stackIn_39_0Lifetime1 + stackIn_39_1Lifetime1;
                        gk.field_b[var19] = var9;
                        rf.field_a[var17] = 1 + var18;
                        if (param3.field_a > 0 &&
                          null != param3.field_x) {
                          dupTemp$0 = param3.field_x[var9];
                          ok.field_F[dupTemp$0] = ok.field_F[dupTemp$0] + 1;
                        }
                        ug.field_Q = ug.field_Q + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var9++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_48_0 = -1;
          }
          if (stackIn_48_0 > ~param3.field_a &&
            param3.field_x != null) {
            var9Lifetime1 = 0;
            var10Lifetime1 = 0;
            while (!(var10Lifetime1 >= ok.field_F.length)) {
              var11Lifetime1 = ok.field_F[var10Lifetime1];
              ok.field_F[var10Lifetime1] = var9Lifetime1;
              var9Lifetime1 = var9Lifetime1 + var11Lifetime1;
              var10Lifetime1++;
              if (var20 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_62_0 = var5;
          stackIn_62_1 = new StringBuilder().append("ve.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(byte param0, byte[] param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_66_1 = 0;
        int stackIn_80_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        int stackIn_94_1 = 0;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_103_2 = null;
        RuntimeException decompiledCaughtException = null;
        be var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_80_0Lifetime1;
        int stackIn_85_0Lifetime1;
        int stackIn_85_1Lifetime1;
        int stackIn_85_2Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        int var12Lifetime3;
        var15 = TrackController.field_F ? 1 : 0;
        try {
          var2 = new be(param1);
          var2.field_k = -2 + param1.length;
          gi.field_o = var2.d((byte) -46);
          fk.field_d = new byte[gi.field_o][];
          ka.field_f = new int[gi.field_o];
          j.field_f = new int[gi.field_o];
          cf.field_p = new int[gi.field_o];
          ga.field_b = new boolean[gi.field_o];
          qk.field_M = new byte[gi.field_o][];
          vb.field_a = new int[gi.field_o];
          var2.field_k = -(gi.field_o * 8) + (param1.length - 7);
          ab.field_a = var2.d((byte) -57);
          qe.field_p = var2.d((byte) -119);
          var3 = (var2.h(16383) & 255) + 1;
          var4 = 0;
          do {
            if (!(var4 < gi.field_o)) {
              var4 = 0;
              break;
            }
            ka.field_f[var4] = var2.d((byte) -111);
            var4++;
          } while (var15 == 0);
          do {
            if (!(gi.field_o > var4)) {
              var4 = 0;
              break;
            }
            vb.field_a[var4] = var2.d((byte) -101);
            var4++;
          } while (var15 == 0);
          do {
            if (!(gi.field_o > var4)) {
              var4 = 0;
              break;
            }
            cf.field_p[var4] = var2.d((byte) -66);
            var4++;
          } while (var15 == 0);
          do {
            if (!(var4 < gi.field_o)) {
              var2.field_k = param1.length - 7 - gi.field_o * 8 + 3 - var3 * 3;
              qe.field_z = new int[var3];
              break;
            }
            j.field_f[var4] = var2.d((byte) -62);
            var4++;
          } while (var15 == 0);
          var4 = 1;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3 <= var4))) {
            qe.field_z[var4] = var2.e(8);
            stackIn_42_0 = ~qe.field_z[var4];
            stackIn_42_1 = -1;
            if (var15 == 0) {
              if (stackIn_42_0 == stackIn_42_1) {
                qe.field_z[var4] = 1;
              }
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_42_0 = param0;
            stackIn_42_1 = -28;
          }
          if (stackIn_42_0 != stackIn_42_1) {
            ve.a((byte) -62, (byte[]) null);
          }
          var2.field_k = 0;
          var4 = 0;
          L17: while (true) {
            stackIn_47_0 = var4;
            if (stackIn_47_0 < gi.field_o) {
              var5 = cf.field_p[var4];
              var6 = j.field_f[var4];
              var7 = var6 * var5;
              var8 = new byte[var7];
              qk.field_M[var4] = var8;
              var9 = new byte[var7];
              fk.field_d[var4] = var9;
              var10 = 0;
              var11 = var2.h(16383);
              if (var15 != 0) {
                return;
              }
              stackIn_51_0 = 0;
              stackIn_51_1 = var11;
              stackIn_51_2 = 1;
              while (true) {
                {
                  if (stackIn_51_0 == (stackIn_51_1 & stackIn_51_2)) {
                    var12 = 0;
                    while (var12 < var7) {
                      var8[var12] = var2.f(-126);
                      var12++;
                    }
                    if (((var11 & 2) != 0)) {
                      var12Lifetime3 = 0;
                      while (var12Lifetime3 < var7) {
                        dupTemp$0 = var2.f(param0 - 99);
                        var9[var12Lifetime3] = dupTemp$0;
                        var13 = dupTemp$0;
                        stackIn_51_0 = var10;
                        stackIn_51_1 = 0;
                        stackIn_51_2 = ~var13;
                        if (stackIn_51_1 == stackIn_51_2) {
                          stackIn_66_1 = 0;
                        } else {
                          stackIn_66_1 = 1;
                        }
                        var10 = stackIn_51_0 | stackIn_66_1;
                        var12Lifetime3++;
                      }
                    }
                  } else {
                    var12Lifetime1 = 0;
                    while (var12Lifetime1 < var5) {
                      stackIn_80_0 = 0;
                      var13Lifetime1 = stackIn_80_0;
                      while (var6 > var13Lifetime1) {
                        var8[var12Lifetime1 + var13Lifetime1 * var5] = var2.f(-125);
                        var13Lifetime1++;
                      }
                      var12Lifetime1++;
                    }
                    stackIn_80_0Lifetime1 = -1;
                    if (stackIn_80_0Lifetime1 != ~(2 & var11)) {
                      var12Lifetime2 = 0;
                      while (true) {
                        stackIn_85_0 = ~var5;
                        stackIn_85_1 = var12Lifetime2;
                        stackIn_85_2 = -1;
                        if (stackIn_85_0 >= (stackIn_85_1 ^ stackIn_85_2)) {
                          break;
                        }
                        stackIn_47_0 = 0;
                        var13Lifetime2 = stackIn_47_0;
                        while (var13Lifetime2 < var6) {
                          dupTemp$1 = var2.f(-125);
                          var9[var13Lifetime2 * var5 + var12Lifetime2] = dupTemp$1;
                          var14 = dupTemp$1;
                          stackIn_85_0Lifetime1 = var10;
                          stackIn_85_1Lifetime1 = -1;
                          stackIn_85_2Lifetime1 = var14;
                          if (stackIn_85_1Lifetime1 == stackIn_85_2Lifetime1) {
                            stackIn_94_1 = 0;
                          } else {
                            stackIn_94_1 = 1;
                          }
                          var10 = stackIn_85_0Lifetime1 | stackIn_94_1;
                          var13Lifetime2++;
                        }
                        var12Lifetime2++;
                      }
                    }
                  }
                }
                ga.field_b[var4] = var10 != 0;
                var4++;
                continue L17;
              }
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_102_0 = var2_ref;
          stackIn_102_1 = new StringBuilder().append("ve.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_103_2 = "null";
          } else {
            stackIn_103_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_102_0), ((StringBuilder) (Object) stackIn_102_1).append(stackIn_103_2).append(')').toString());
        }
    }

    ve() {
        super(0L, (ug) null);
    }

    static {
    }
}
