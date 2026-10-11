/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static int field_b;
    static String field_a;

    final static void a(boolean param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param0) {
            mf.a(68);
          }
          if (~param1 != ~mc.field_I) {
            mc.field_I = param1;
            jf.field_c = 1;
            mb.field_s.a(500, 8000);
            le.field_D = 0;
            ha.field_w.field_l = false;
            if (param1 != 3 &&
              param1 != 2) {
              return;
            }
            if (q.field_g != null) {
              q.field_g.c(0);
            }
            L4: {
              if (bm.field_c == 0 &&
                hh.field_d == rl.field_c) {
                var2_int = rl.field_c;
                switch ((var3 == 0
                  || var2_int == 4
                  || var2_int == 5
                  || var2_int == 6
                  || var2_int == 7
                  || var2_int == 9
                  ) ? var2_int : -1) {
                  case 4:
                    ti.a(244, (byte) -115, 11);
                    if (var3 == 0) {
                      break L4;
                    }
                  case 5:
                    ti.a(243, (byte) 22, 12);
                    if (var3 == 0) {
                      break L4;
                    }
                  case 6:
                    ti.a(242, (byte) 126, 13);
                    if (var3 == 0) {
                      break L4;
                    }
                  case 7:
                    ti.a(241, (byte) -120, 14);
                    if (var3 == 0) {
                      break L4;
                    }
                  case 8:
                    ti.a(240, (byte) 17, 15);
                    if (var3 == 0) {
                      break L4;
                    }
                  case 9:
                    break;
                  default:
                    break L4;
                }
                ti.a(239, (byte) -122, 16);
              }
            }
            if (bm.field_c == 1 &&
              hh.field_d == rl.field_c) {
              boolean decompiledFrameRemainder6 = true;
              boolean decompiledFrameRemainder5 = true;
              boolean decompiledFrameRemainder4 = true;
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameRemainder1 = true;
              boolean decompiledFrameRemainder0 = true;
              var2_int = rl.field_c;
              if ((1 != var2_int) &&
                (decompiledFrameRemainder0 = (var2_int != 2 ||
                var3 != 0)) &&
                (decompiledFrameRemainder1 = (var2_int != 3)) &&
                (decompiledFrameRemainder2 = (var2_int != 4 ||
                var3 != 0)) &&
                (decompiledFrameRemainder3 = (var2_int != 5)) &&
                (decompiledFrameRemainder4 = (var2_int != 6 ||
                var3 != 0)) &&
                (decompiledFrameRemainder5 = (var2_int != 7))) {
                if (var2_int != 8) {
                  return;
                }
                decompiledFrameRemainder6 = (var3 != 0);
              }
              if ((decompiledFrameRemainder6) &&
                (decompiledFrameRemainder5) &&
                (decompiledFrameRemainder4) &&
                (decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (decompiledFrameRemainder1) &&
                (decompiledFrameRemainder0)) {
                ti.a(222, (byte) -117, 33);
                if (var3 == 0) {
                  return;
                }
              }
              if ((decompiledFrameRemainder6) &&
                (decompiledFrameRemainder5) &&
                (decompiledFrameRemainder4) &&
                (decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (decompiledFrameRemainder1)) {
                ti.a(221, (byte) -118, 34);
                if (var3 == 0) {
                  return;
                }
              }
              if ((decompiledFrameRemainder6) &&
                (decompiledFrameRemainder5) &&
                (decompiledFrameRemainder4) &&
                (decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2)) {
                ti.a(220, (byte) -120, 35);
                if (var3 == 0) {
                  return;
                }
              }
              if ((decompiledFrameRemainder6) &&
                (decompiledFrameRemainder5) &&
                (decompiledFrameRemainder4) &&
                (decompiledFrameRemainder3)) {
                ti.a(219, (byte) 92, 36);
                if (var3 == 0) {
                  return;
                }
              }
              if ((decompiledFrameRemainder6) &&
                (decompiledFrameRemainder5) &&
                (decompiledFrameRemainder4)) {
                ti.a(218, (byte) 27, 37);
                if (var3 == 0) {
                  return;
                }
              }
              if ((decompiledFrameRemainder6) &&
                (decompiledFrameRemainder5)) {
                ti.a(217, (byte) -122, 38);
                if (var3 == 0) {
                  return;
                }
              }
              if (decompiledFrameRemainder6) {
                ti.a(216, (byte) -120, 39);
                if (var3 == 0) {
                  return;
                }
              }
              ti.a(215, (byte) -110, 40);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "mf.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(int param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 36) {
            field_a = (String) null;
          }
          stackIn_4_0 = sg.field_o;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "mf.B(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        try {
          field_a = null;
          int var1_int = -16 / ((39 - param0) / 62);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "mf.A(" + param0 + ')');
        }
    }

    final static String a(boolean param0, CharSequence param1) {
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        boolean stackIn_7_0 = false;
        int stackIn_14_0 = 0;
        boolean stackIn_16_0 = false;
        int stackIn_25_0 = 0;
        Object stackIn_30_0 = null;
        boolean stackIn_34_0 = false;
        int stackIn_42_0 = 0;
        Object stackIn_46_0 = null;
        String stackIn_49_0 = null;
        String stackIn_51_0 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        boolean stackOut_15_0;
        boolean stackOut_33_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_14_0Lifetime1;
        boolean stackIn_16_0Lifetime1;
        boolean stackOut_15_0Lifetime1;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (null == param1) {
            stackIn_3_0 = null;
            return (String) (stackIn_3_0);
          }
          var2_int = 0;
          var3 = param1.length();
          L1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var3 > var2_int) {
              stackOut_6_0 = rg.a((byte) -109, param1.charAt(var2_int));
              stackIn_14_0 = stackOut_6_0 ? 1 : 0;
              stackIn_7_0 = stackOut_6_0;
              if (var9 != 0) {
                if (stackIn_14_0 > ~var3) {
                  stackOut_15_0 = rg.a((byte) -109, param1.charAt(var3 - 1));
                  stackIn_25_0 = stackOut_15_0 ? 1 : 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L1;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_7_0) {
                  var2_int++;
                  continue;
                }
              }
            }
            if (decompiledFrameRemainder0) {
              while (true) {
                stackIn_14_0Lifetime1 = ~var2_int;
                if (stackIn_14_0Lifetime1 <= ~var3) {
                  break;
                }
                stackOut_15_0Lifetime1 = rg.a((byte) -109, param1.charAt(var3 - 1));
                stackIn_25_0 = stackOut_15_0Lifetime1 ? 1 : 0;
                stackIn_16_0Lifetime1 = stackOut_15_0Lifetime1;
                if (var9 != 0) {
                  break L1;
                }
                if (!stackIn_16_0Lifetime1) {
                  break;
                }
                var3--;
              }
            }
            stackIn_25_0 = -var2_int + var3;
            break;
          }
          var4 = stackIn_25_0;
          if (var4 >= 1 &&
            12 >= var4) {
            var5 = new StringBuilder(var4);
            var6 = var2_int;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var3 <= var6))) {
              var7 = param1.charAt(var6);
              stackOut_33_0 = sg.a((char) var7, true);
              stackIn_42_0 = stackOut_33_0 ? 1 : 0;
              stackIn_34_0 = stackOut_33_0;
              if (var9 == 0) {
                if (stackIn_34_0) {
                  var8 = om.a((byte) -115, (char) var7);
                  if (var8 != 0) {
                    discarded$0 = var5.append((char) var8);
                  }
                }
                var6++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_42_0 = ~var5.length();
            }
            if (stackIn_42_0 == -1) {
              stackIn_46_0 = null;
              return (String) (stackIn_46_0);
            }
            if (!param0) {
              stackIn_51_0 = var5.toString();
              return stackIn_51_0;
            }
            stackIn_49_0 = (String) null;
            return stackIn_49_0;
          }
          stackIn_30_0 = null;
          return (String) (stackIn_30_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("mf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(')').toString());
        }
    }

    static {
        field_a = "<col=ffffff>Explosive<nbsp>charge</col><br>A high-powered explosive that should be planted in a specific position and set on a timer.";
    }
}
