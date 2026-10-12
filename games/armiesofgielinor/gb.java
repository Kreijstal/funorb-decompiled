/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb extends iu {
    static int field_y;
    private int field_C;
    static boolean field_B;
    static int field_z;

    gb(ic param0) {
        super(param0);
        RuntimeException runtimeException = null;
        int var2_int = 0;
        jd var2 = null;
        int var3 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_C = -1;
        try {
          if (!param0.field_xb.field_Cb) {
            this.e(-119, 2);
            if (var3 != 0) {
              this.e(-124, 1);
            }
          } else {
            this.e(-124, 1);
          }
          param0.field_xb.field_f = true;
          param0.field_xb.field_Eb[157].field_a = 1;
          param0.field_xb.field_mb[0] = 10;
          param0.field_xb.field_Eb[217].field_a = 1;
          param0.field_xb.field_Eb[56].field_a = 1;
          param0.field_xb.field_Eb[157].field_a = 1;
          param0.field_xb.field_Eb[217].field_a = 1;
          param0.field_xb.field_Eb[330].field_a = 1;
          param0.field_xb.field_Eb[166].field_a = 0;
          param0.field_xb.field_Eb[65].field_a = 0;
          var2_int = 0;
          do {
            if (!(br.field_c.length > var2_int)) {
              param0.field_xb.a(true, 14, 74, 13, 1, 1, 0);
              param0.field_xb.a(true, 17, 0, 8, 1, 1, 0);
              param0.field_xb.a(true, 10, 0, 14, 1, 1, 0);
              param0.field_xb.a(true, 9, 9, 4, 1, 1, 1);
              param0.field_xb.a(true, 4, 9, 14, 1, 1, 0);
              param0.field_xb.a(true, 1, 16, 11, 1, 1, 3);
              param0.field_xb.a(true, 16, 16, 4, 1, 1, 0);
              param0.field_xb.a(true, 14, 22, 9, 1, 1, 0);
              param0.field_xb.a(true, 3, 22, 12, 1, 1, 1);
              param0.field_xb.a(true, 8, 52, 5, 1, 1, 2);
              param0.field_xb.a(true, 7, 52, 10, 1, 1, 0);
              param0.field_xb.a(true, 5, 52, 5, 1, 1, 3);
              break;
            }
            param0.field_xb.field_Eb[br.field_c[var2_int]].a(126);
            var2_int++;
          } while (var3 == 0);
          var2 = (jd) (param0.field_xb.field_t[1].e((byte) 95));
          while (null != var2) {
            var2.a((jd) (param0.field_xb.field_t[0].e((byte) 94)), 2048);
            var2 = (jd) (param0.field_xb.field_t[1].a((byte) 123));
            if (var3 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_22_0 = runtimeException;
          stackIn_22_1 = new StringBuilder().append("gb.<init>(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          var5_int = 0;
          if (param1 >= -1 &&
            ks.field_y >= param1 &&
            param0 >= -1 &&
            param0 <= ef.field_c) {
            if (param1 == -1 ||
              param1 == ks.field_y) {
              var5_int += 2;
            }
            if (param0 == -1 ||
              ~param0 == ~ef.field_c) {
              var5_int++;
            }
            if (param0 == -1 &&
              ~param1 == ~ks.field_y) {
              var5_int++;
            }
            if (var5_int > 0) {
              boolean decompiledSharedTail0 = (th.a(param0 + param1, 1, 2) != 0);
              if (!decompiledSharedTail0) {
                hq.field_a[0].a(param2, param3);
                decompiledSharedTail0 = (ArmiesOfGielinor.field_M);
              }
              if (decompiledSharedTail0) {
                hq.field_a[(og.field_p[th.a(param1, 1, ks.field_y) + th.a(param0, 1, ef.field_c) * ks.field_y] % 6 + 1 << 2) - 1 + var5_int].a(param2, param3);
              }
            }
            var6 = 88 / ((-21 - param4) / 46);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var5), "gb.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final boolean c(int param0, int param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 == this.field_q.field_xb.field_E[0][param0]) {
            return true;
          }
          if (param1 <= 81) {
            discarded$1 = this.b(37, (byte) -23);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "gb.H(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          kr.field_y[param1] = param6;
          kr.field_D.a(param3, param5, (byte) 18, param4, param2, param0, param1);
          if (param7 >= -26) {
            gb.a((wk[]) null, -121, -66, -22, -91);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("gb.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param7).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2) {
        boolean discarded$0 = false;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var4_int = this.field_k;
          switch ((var5 == 0
            || var4_int == 3
            || var4_int == 6
            || var4_int == 9
            || var4_int == 10
            || var4_int == 12
            ) ? var4_int : -1) {
            case 1:
              if (param2 != 2) {
                break;
              }
              if (this.field_q.field_pb != 0) {
                this.e(-116, 5);
                if (var5 == 0) {
                  break;
                }
              }
              this.e(-122, 3);
              if (var5 == 0) {
                break;
              }
            case 2:
              if (29 != param2) {
                break;
              }
              this.e(param1 ^ 115, 1);
              if (var5 == 0) {
                break;
              }
            case 3:
              if (param2 != 19) {
                break;
              }
              this.e(param1 ^ 126, 5);
              if (var5 == 0) {
                break;
              }
            case 9:
              if (param2 != 2) {
                break;
              }
              if (this.field_C < 4) {
                this.e(param1 ^ 121, 5);
                if (var5 == 0) {
                  break;
                }
              }
              this.e(-128, 14);
              if (var5 == 0) {
                break;
              }
            case 8:
              if (param2 != 25) {
                break;
              }
              if (param0 != this.field_q.field_xb.field_B[0][this.field_C]) {
                break;
              }
              this.h(51);
              if (var5 == 0) {
                break;
              }
            case 11:
              if (param2 != 25) {
                break;
              }
              if (this.field_q.field_xb.field_B[0][this.field_C] != param0) {
                break;
              }
              this.h(85);
              if (var5 == 0) {
                break;
              }
            case 10:
              if (25 != param2 ||
                param0 == this.field_q.field_xb.field_B[0][this.field_C]) {
                if (param2 != 27) {
                  break;
                }
                if (param0 != this.field_q.field_xb.field_B[0][this.field_C]) {
                  break;
                }
                this.e(param1 - 122, 12);
                if (var5 == 0) {
                  break;
                }
              }
              this.e(-126, 11);
              if (var5 == 0) {
                break;
              }
            case 6:
              if (param2 != 25 ||
                param0 == this.field_q.field_xb.field_B[0][this.field_C]) {
                if ((param2 == 28 ||
                  param2 == 4) &&
                  this.j(-36)) {
                  if (uc.field_d[this.field_q.field_xb.field_B[0][this.field_C]][4] != 5) {
                    break;
                  }
                  this.e(-123, 10);
                  if (var5 == 0) {
                    break;
                  }
                }
                if (param2 != 27) {
                  break;
                }
                if (this.field_q.field_xb.field_B[0][this.field_C] != param0) {
                  break;
                }
                this.e(-115, 12);
                if (var5 == 0) {
                  break;
                }
              }
              this.e(-119, 11);
              if (var5 == 0) {
                break;
              }
            case 12:
              if (2 == param2) {
                if (this.field_C >= 4) {
                  this.e(param1 ^ 118, 14);
                  if (var5 == 0) {
                    break;
                  }
                }
                this.e(param1 ^ 117, 5);
              }
            default:
              break;
          }
          if (param1 != -3) {
            discarded$0 = this.b(82, (byte) 62);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4), "gb.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final boolean b(int param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = b.a(false, param0);
          if (this.field_q.field_xb.field_E[0][-1 + jv.a(false, param0)] == 0) {
            return true;
          }
          if ((this.field_q.field_xb.field_a[0][jv.a(false, param0) - 1] & 1 << var3_int) == 0) {
            return true;
          }
          if (param1 > 0) {
            gb.a(-50, 57, -48, -76, (byte) -116);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "gb.B(" + param0 + ',' + param1 + ')');
        }
    }

    private final String a(byte param0, int param1) {
        String stackIn_10_0 = null;
        String stackIn_16_0 = null;
        String stackIn_22_0 = null;
        String stackIn_28_0 = null;
        String stackIn_36_0 = null;
        String stackIn_44_0 = null;
        String stackIn_50_0 = null;
        Object stackIn_55_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (uc.field_d[param1][3] == 4 &&
            1 == uc.field_d[param1][5] &&
            this.c(uc.field_d[param1][6], 121)) {
            stackIn_10_0 = r.field_E[23];
            return stackIn_10_0;
          }
          if (param1 == 115 &&
            this.b(63, (byte) -9)) {
            stackIn_16_0 = r.field_E[25];
            return stackIn_16_0;
          }
          if (param1 == 115 &&
            this.b(63, (byte) -58)) {
            stackIn_22_0 = r.field_E[25];
            return stackIn_22_0;
          }
          if (param1 == 116 &&
            this.b(58, (byte) -62)) {
            stackIn_28_0 = r.field_E[25];
            return stackIn_28_0;
          }
          if (param1 == 117 &&
            this.b(53, (byte) -44)) {
            stackIn_36_0 = r.field_E[25];
            return stackIn_36_0;
          }
          if (param1 == 118 &&
            this.b(59, (byte) -120)) {
            stackIn_44_0 = r.field_E[25];
            return stackIn_44_0;
          }
          if (119 == param1 &&
            this.b(43, (byte) -103)) {
            stackIn_50_0 = r.field_E[25];
            return stackIn_50_0;
          }
          if (param0 != 66) {
            this.b(-6, 14, 3);
          }
          stackIn_55_0 = null;
          return (String) (stackIn_55_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "gb.G(" + param0 + ',' + param1 + ')');
        }
    }

    private final void h(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = this.field_q.field_xb.field_B[0][this.field_C];
            var3 = var2_int;
            if (-1 != var3) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        L6: {
                          L7: {
                            L8: {
                              L9: {
                                L10: {
                                  L11: {
                                    L12: {
                                      L13: {
                                        L14: {
                                          L15: {
                                            L16: {
                                              L17: {
                                                L18: {
                                                  L19: {
                                                    L20: {
                                                      L21: {
                                                        L22: {
                                                          L23: {
                                                            L24: {
                                                              L25: {
                                                                L26: {
                                                                  L27: {
                                                                    L28: {
                                                                      L29: {
                                                                        L30: {
                                                                          L31: {
                                                                            L32: {
                                                                              L33: {
                                                                                L34: {
                                                                                  L35: {
                                                                                    L36: {
                                                                                      L37: {
                                                                                        L38: {
                                                                                          L39: {
                                                                                            L40: {
                                                                                              L41: {
                                                                                                L42: {
                                                                                                  {
                                                                                                    boolean decompiledFrameRemainder2 = true;
                                                                                                    {
                                                                                                      boolean decompiledFrameRemainder1 = true;
                                                                                                      {
                                                                                                        boolean decompiledFrameRemainder0 = true;
                                                                                                        decompiledFrameRemainder0 = !(var3 == 0 &&
                                                                                                          var4 == 0);
                                                                                                        if (decompiledFrameRemainder0) {
                                                                                                          if (1 != var3) {
                                                                                                            decompiledFrameRemainder0 = !(var3 == 2 &&
                                                                                                              var4 == 0);
                                                                                                            if (decompiledFrameRemainder0) {
                                                                                                              if (var3 != 3) {
                                                                                                                decompiledFrameRemainder0 = !(var3 == 4 &&
                                                                                                                  var4 == 0);
                                                                                                                if (decompiledFrameRemainder0) {
                                                                                                                  decompiledFrameRemainder0 = !(var3 == 5 &&
                                                                                                                    var4 == 0);
                                                                                                                  if (decompiledFrameRemainder0) {
                                                                                                                    if (var3 != 6) {
                                                                                                                      decompiledFrameRemainder1 = (var3 != 7);
                                                                                                                      if (decompiledFrameRemainder1) {
                                                                                                                        decompiledFrameRemainder1 = !(var3 == 8 &&
                                                                                                                          var4 == 0);
                                                                                                                        if (decompiledFrameRemainder1) {
                                                                                                                          decompiledFrameRemainder1 = !(var3 == 9 &&
                                                                                                                            var4 == 0);
                                                                                                                          if (decompiledFrameRemainder1) {
                                                                                                                            decompiledFrameRemainder1 = (var3 != 10);
                                                                                                                            if (decompiledFrameRemainder1) {
                                                                                                                              decompiledFrameRemainder1 = !(11 == var3 &&
                                                                                                                                var4 == 0);
                                                                                                                              if (decompiledFrameRemainder1) {
                                                                                                                                decompiledFrameRemainder2 = !(12 == var3 &&
                                                                                                                                  var4 == 0);
                                                                                                                                if (decompiledFrameRemainder2) {
                                                                                                                                  decompiledFrameRemainder2 = (var3 != 13);
                                                                                                                                  if (decompiledFrameRemainder2) {
                                                                                                                                    decompiledFrameRemainder2 = !(var3 == 14 &&
                                                                                                                                      var4 == 0);
                                                                                                                                    if (decompiledFrameRemainder2) {
                                                                                                                                      decompiledFrameRemainder2 = !(15 == var3 &&
                                                                                                                                        var4 == 0);
                                                                                                                                      if (decompiledFrameRemainder2) {
                                                                                                                                        decompiledFrameRemainder2 = (var3 != 16);
                                                                                                                                        if (decompiledFrameRemainder2) {
                                                                                                                                          decompiledFrameRemainder2 = !(var3 == 17 &&
                                                                                                                                            var4 == 0);
                                                                                                                                          if (decompiledFrameRemainder2) {
                                                                                                                                            if (var3 == 18 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L42;
                                                                                                                                            }
                                                                                                                                            if (var3 == 19) {
                                                                                                                                              break L42;
                                                                                                                                            }
                                                                                                                                            if (var3 == 20 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L42;
                                                                                                                                            }
                                                                                                                                            if (21 == var3) {
                                                                                                                                              break L42;
                                                                                                                                            }
                                                                                                                                            if (var3 == 22) {
                                                                                                                                              break L42;
                                                                                                                                            }
                                                                                                                                            if (var3 == 23) {
                                                                                                                                              break L41;
                                                                                                                                            }
                                                                                                                                            if (var3 == 24 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L40;
                                                                                                                                            }
                                                                                                                                            if (var3 == 25) {
                                                                                                                                              break L39;
                                                                                                                                            }
                                                                                                                                            if (var3 == 26) {
                                                                                                                                              break L38;
                                                                                                                                            }
                                                                                                                                            if (27 == var3 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L37;
                                                                                                                                            }
                                                                                                                                            if (var3 == 28 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L36;
                                                                                                                                            }
                                                                                                                                            if (var3 == 29) {
                                                                                                                                              break L36;
                                                                                                                                            }
                                                                                                                                            if (var3 == 30 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L36;
                                                                                                                                            }
                                                                                                                                            if (var3 == 31 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L36;
                                                                                                                                            }
                                                                                                                                            if (32 == var3) {
                                                                                                                                              break L36;
                                                                                                                                            }
                                                                                                                                            if (var3 == 33) {
                                                                                                                                              break L36;
                                                                                                                                            }
                                                                                                                                            if (var3 == 34 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L36;
                                                                                                                                            }
                                                                                                                                            if (var3 == 35 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L36;
                                                                                                                                            }
                                                                                                                                            if (var3 == 36 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L35;
                                                                                                                                            }
                                                                                                                                            if (var3 == 37) {
                                                                                                                                              break L34;
                                                                                                                                            }
                                                                                                                                            if (var3 == 38) {
                                                                                                                                              break L34;
                                                                                                                                            }
                                                                                                                                            if (39 == var3 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L34;
                                                                                                                                            }
                                                                                                                                            if (var3 == 40 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L34;
                                                                                                                                            }
                                                                                                                                            if (var3 == 41 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L34;
                                                                                                                                            }
                                                                                                                                            if (var3 == 42) {
                                                                                                                                              break L34;
                                                                                                                                            }
                                                                                                                                            if (var3 == 43 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L33;
                                                                                                                                            }
                                                                                                                                            if (var3 == 44) {
                                                                                                                                              break L32;
                                                                                                                                            }
                                                                                                                                            if (var3 == 45 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L31;
                                                                                                                                            }
                                                                                                                                            if (var3 == 46) {
                                                                                                                                              break L30;
                                                                                                                                            }
                                                                                                                                            if (var3 == 47) {
                                                                                                                                              break L29;
                                                                                                                                            }
                                                                                                                                            if (48 == var3) {
                                                                                                                                              break L29;
                                                                                                                                            }
                                                                                                                                            if (var3 == 49) {
                                                                                                                                              break L29;
                                                                                                                                            }
                                                                                                                                            if (var3 == 50 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L29;
                                                                                                                                            }
                                                                                                                                            if (51 == var3 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L29;
                                                                                                                                            }
                                                                                                                                            if (var3 == 52) {
                                                                                                                                              break L29;
                                                                                                                                            }
                                                                                                                                            if (var3 == 53) {
                                                                                                                                              break L29;
                                                                                                                                            }
                                                                                                                                            if (var3 == 54 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L28;
                                                                                                                                            }
                                                                                                                                            if (55 == var3) {
                                                                                                                                              break L28;
                                                                                                                                            }
                                                                                                                                            if (var3 == 56 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L28;
                                                                                                                                            }
                                                                                                                                            if (var3 == 57) {
                                                                                                                                              break L28;
                                                                                                                                            }
                                                                                                                                            if (var3 == 58 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L28;
                                                                                                                                            }
                                                                                                                                            if (var3 == 59 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L28;
                                                                                                                                            }
                                                                                                                                            if (var3 == 60) {
                                                                                                                                              break L28;
                                                                                                                                            }
                                                                                                                                            if (var3 == 61 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L27;
                                                                                                                                            }
                                                                                                                                            if (var3 == 62) {
                                                                                                                                              break L27;
                                                                                                                                            }
                                                                                                                                            if (var3 == 63) {
                                                                                                                                              break L27;
                                                                                                                                            }
                                                                                                                                            if (var3 == 64) {
                                                                                                                                              break L27;
                                                                                                                                            }
                                                                                                                                            if (var3 == 65 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L27;
                                                                                                                                            }
                                                                                                                                            if (var3 == 66) {
                                                                                                                                              break L27;
                                                                                                                                            }
                                                                                                                                            if (67 == var3) {
                                                                                                                                              break L27;
                                                                                                                                            }
                                                                                                                                            if (var3 == 68) {
                                                                                                                                              break L26;
                                                                                                                                            }
                                                                                                                                            if (var3 == 69 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 70) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 71 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (72 == var3) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 73 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 74 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (75 == var3 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 76) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 77) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 78) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 79) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 80) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 81) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 82 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 83) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (84 == var3 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (85 == var3 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 86 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 87) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 88 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 89) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (90 == var3) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (91 == var3) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 92 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 93 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 94) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (95 == var3 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 96) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 97) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 98 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 99 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 100 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 101) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 102) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 103) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (104 == var3) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 105 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 106 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 107 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (108 == var3 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 109 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 110) {
                                                                                                                                              break L25;
                                                                                                                                            }
                                                                                                                                            if (var3 == 111) {
                                                                                                                                              break L24;
                                                                                                                                            }
                                                                                                                                            if (var3 == 112) {
                                                                                                                                              break L23;
                                                                                                                                            }
                                                                                                                                            if (113 == var3 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L22;
                                                                                                                                            }
                                                                                                                                            if (var3 == 114 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L21;
                                                                                                                                            }
                                                                                                                                            if (var3 == 115) {
                                                                                                                                              break L20;
                                                                                                                                            }
                                                                                                                                            if (var3 == 116 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L19;
                                                                                                                                            }
                                                                                                                                            if (var3 == 117 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L18;
                                                                                                                                            }
                                                                                                                                            if (var3 == 118) {
                                                                                                                                              break L17;
                                                                                                                                            }
                                                                                                                                            if (var3 == 119) {
                                                                                                                                              break L16;
                                                                                                                                            }
                                                                                                                                            if (120 == var3 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L15;
                                                                                                                                            }
                                                                                                                                            if (var3 == 121) {
                                                                                                                                              break L14;
                                                                                                                                            }
                                                                                                                                            if (var3 == 122) {
                                                                                                                                              break L13;
                                                                                                                                            }
                                                                                                                                            if (var3 == 123) {
                                                                                                                                              break L12;
                                                                                                                                            }
                                                                                                                                            if (var3 == 124) {
                                                                                                                                              break L11;
                                                                                                                                            }
                                                                                                                                            if (125 == var3 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L10;
                                                                                                                                            }
                                                                                                                                            if (var3 == 126 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L9;
                                                                                                                                            }
                                                                                                                                            if (var3 == 127 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L8;
                                                                                                                                            }
                                                                                                                                            if (128 == var3) {
                                                                                                                                              break L7;
                                                                                                                                            }
                                                                                                                                            if (var3 == 129 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L6;
                                                                                                                                            }
                                                                                                                                            if (var3 == 130) {
                                                                                                                                              break L5;
                                                                                                                                            }
                                                                                                                                            if (var3 == 131) {
                                                                                                                                              break L4;
                                                                                                                                            }
                                                                                                                                            if (var3 == 132 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L3;
                                                                                                                                            }
                                                                                                                                            if (133 == var3 &&
                                                                                                                                              var4 == 0) {
                                                                                                                                              break L2;
                                                                                                                                            }
                                                                                                                                            if (var3 != 134) {
                                                                                                                                              break L0;
                                                                                                                                            }
                                                                                                                                            if (var4 == 0) {
                                                                                                                                              break L1;
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      if (decompiledFrameRemainder2) {
                                                                                                        if (decompiledFrameRemainder1) {
                                                                                                          this.a(r.field_E[8], (byte) 122);
                                                                                                          this.e(-128, 6);
                                                                                                          if (var4 == 0) {
                                                                                                            break L0;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                    if (decompiledFrameRemainder2) {
                                                                                                      this.e(-114, 12);
                                                                                                      if (var4 == 0) {
                                                                                                        break L0;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                  this.a(r.field_E[9], (byte) 118);
                                                                                                  this.e(-122, 6);
                                                                                                  if (var4 == 0) {
                                                                                                    break L0;
                                                                                                  }
                                                                                                }
                                                                                                this.a(r.field_E[8], (byte) 113);
                                                                                                this.e(-124, 6);
                                                                                                if (var4 == 0) {
                                                                                                  break L0;
                                                                                                }
                                                                                              }
                                                                                              this.a(r.field_E[15], (byte) 115);
                                                                                              this.e(-121, 6);
                                                                                              if (var4 == 0) {
                                                                                                break L0;
                                                                                              }
                                                                                            }
                                                                                            this.a(r.field_E[13], (byte) 116);
                                                                                            this.e(-117, 6);
                                                                                            if (var4 == 0) {
                                                                                              break L0;
                                                                                            }
                                                                                          }
                                                                                          this.a(r.field_E[12], (byte) 125);
                                                                                          this.e(-126, 6);
                                                                                          if (var4 == 0) {
                                                                                            break L0;
                                                                                          }
                                                                                        }
                                                                                        this.a(r.field_E[13], (byte) 114);
                                                                                        this.e(-123, 6);
                                                                                        if (var4 == 0) {
                                                                                          break L0;
                                                                                        }
                                                                                      }
                                                                                      this.a(r.field_E[11], (byte) 116);
                                                                                      this.e(-123, 6);
                                                                                      if (var4 == 0) {
                                                                                        break L0;
                                                                                      }
                                                                                    }
                                                                                    this.a(r.field_E[9], (byte) 115);
                                                                                    this.e(-126, 6);
                                                                                    if (var4 == 0) {
                                                                                      break L0;
                                                                                    }
                                                                                  }
                                                                                  this.a(r.field_E[8], (byte) 112);
                                                                                  this.e(-116, 6);
                                                                                  if (var4 == 0) {
                                                                                    break L0;
                                                                                  }
                                                                                }
                                                                                if (!this.c(uc.field_d[var2_int][6], 120)) {
                                                                                  this.e(-119, 12);
                                                                                  if (var4 == 0) {
                                                                                    break L0;
                                                                                  }
                                                                                }
                                                                                this.a(r.field_E[23], (byte) 119);
                                                                                this.e(-122, 9);
                                                                                if (var4 == 0) {
                                                                                  break L0;
                                                                                }
                                                                              }
                                                                              this.a(r.field_E[10], (byte) 125);
                                                                              this.e(-114, 6);
                                                                              if (var4 == 0) {
                                                                                break L0;
                                                                              }
                                                                            }
                                                                            this.a(r.field_E[14], (byte) 123);
                                                                            this.e(-119, 6);
                                                                            if (var4 == 0) {
                                                                              break L0;
                                                                            }
                                                                          }
                                                                          this.e(-114, 12);
                                                                          if (var4 == 0) {
                                                                            break L0;
                                                                          }
                                                                        }
                                                                        this.a(r.field_E[9], (byte) 126);
                                                                        this.e(-121, 6);
                                                                        if (var4 == 0) {
                                                                          break L0;
                                                                        }
                                                                      }
                                                                      this.a(r.field_E[13], (byte) 125);
                                                                      this.e(-115, 6);
                                                                      if (var4 == 0) {
                                                                        break L0;
                                                                      }
                                                                    }
                                                                    this.a(r.field_E[9], (byte) 115);
                                                                    this.e(-118, 6);
                                                                    if (var4 == 0) {
                                                                      break L0;
                                                                    }
                                                                  }
                                                                  this.a(r.field_E[13], (byte) 114);
                                                                  this.e(-116, 6);
                                                                  if (var4 == 0) {
                                                                    break L0;
                                                                  }
                                                                }
                                                                this.a(r.field_E[8], (byte) 121);
                                                                this.e(-116, 6);
                                                                if (var4 == 0) {
                                                                  break L0;
                                                                }
                                                              }
                                                              this.a(r.field_E[9], (byte) 120);
                                                              this.e(-114, 6);
                                                              if (var4 == 0) {
                                                                break L0;
                                                              }
                                                            }
                                                            this.a(r.field_E[13], (byte) 125);
                                                            this.e(-117, 6);
                                                            if (var4 == 0) {
                                                              break L0;
                                                            }
                                                          }
                                                          this.a(r.field_E[13], (byte) 123);
                                                          this.e(-115, 6);
                                                          if (var4 == 0) {
                                                            break L0;
                                                          }
                                                        }
                                                        this.a(r.field_E[13], (byte) 112);
                                                        this.e(-115, 6);
                                                        if (var4 == 0) {
                                                          break L0;
                                                        }
                                                      }
                                                      this.a(r.field_E[13], (byte) 122);
                                                      this.e(-124, 6);
                                                      if (var4 == 0) {
                                                        break L0;
                                                      }
                                                    }
                                                    if (!this.b(63, (byte) -72)) {
                                                      this.a(r.field_E[18], (byte) 114);
                                                      this.e(-116, 6);
                                                      if (var4 == 0) {
                                                        break L0;
                                                      }
                                                    }
                                                    this.a(r.field_E[25], (byte) 116);
                                                    this.e(-116, 9);
                                                    if (var4 == 0) {
                                                      break L0;
                                                    }
                                                  }
                                                  if (this.b(58, (byte) -35)) {
                                                    this.a(r.field_E[25], (byte) 118);
                                                    this.e(-118, 9);
                                                    if (var4 == 0) {
                                                      break L0;
                                                    }
                                                  }
                                                  this.a(r.field_E[20], (byte) 115);
                                                  this.e(-128, 6);
                                                  if (var4 == 0) {
                                                    break L0;
                                                  }
                                                }
                                                if (!this.b(53, (byte) -32)) {
                                                  this.a(r.field_E[19], (byte) 112);
                                                  this.e(-115, 6);
                                                  if (var4 == 0) {
                                                    break L0;
                                                  }
                                                }
                                                this.a(r.field_E[25], (byte) 117);
                                                this.e(-123, 9);
                                                if (var4 == 0) {
                                                  break L0;
                                                }
                                              }
                                              if (!this.b(59, (byte) -39)) {
                                                this.a(r.field_E[17], (byte) 124);
                                                this.e(-117, 6);
                                                if (var4 == 0) {
                                                  break L0;
                                                }
                                              }
                                              this.a(r.field_E[25], (byte) 119);
                                              this.e(-114, 9);
                                              if (var4 == 0) {
                                                break L0;
                                              }
                                            }
                                            if (this.b(43, (byte) -79)) {
                                              this.a(r.field_E[25], (byte) 115);
                                              this.e(-125, 9);
                                              if (var4 == 0) {
                                                break L0;
                                              }
                                            }
                                            this.a(r.field_E[21], (byte) 111);
                                            this.e(-117, 6);
                                            if (var4 == 0) {
                                              break L0;
                                            }
                                          }
                                          this.a(r.field_E[9], (byte) 124);
                                          this.e(-115, 6);
                                          if (var4 == 0) {
                                            break L0;
                                          }
                                        }
                                        this.a(r.field_E[8], (byte) 121);
                                        this.e(-116, 6);
                                        if (var4 == 0) {
                                          break L0;
                                        }
                                      }
                                      this.a(r.field_E[8], (byte) 109);
                                      this.e(-128, 6);
                                      if (var4 == 0) {
                                        break L0;
                                      }
                                    }
                                    this.a(r.field_E[8], (byte) 114);
                                    this.e(-128, 6);
                                    if (var4 == 0) {
                                      break L0;
                                    }
                                  }
                                  this.a(r.field_E[9], (byte) 120);
                                  this.e(-121, 6);
                                  if (var4 == 0) {
                                    break L0;
                                  }
                                }
                                this.a(r.field_E[9], (byte) 123);
                                this.e(-116, 6);
                                if (var4 == 0) {
                                  break L0;
                                }
                              }
                              this.a(r.field_E[9], (byte) 125);
                              this.e(-123, 6);
                              if (var4 == 0) {
                                break L0;
                              }
                            }
                            this.a(r.field_E[9], (byte) 126);
                            this.e(-126, 6);
                            if (var4 == 0) {
                              break L0;
                            }
                          }
                          this.a(r.field_E[9], (byte) 118);
                          this.e(-123, 6);
                          if (var4 == 0) {
                            break L0;
                          }
                        }
                        this.a(r.field_E[9], (byte) 119);
                        this.e(-116, 6);
                        if (var4 == 0) {
                          break L0;
                        }
                      }
                      this.a(r.field_E[9], (byte) 126);
                      this.e(-122, 6);
                      if (var4 == 0) {
                        break L0;
                      }
                    }
                    this.a(r.field_E[9], (byte) 125);
                    this.e(-126, 6);
                    if (var4 == 0) {
                      break L0;
                    }
                  }
                  this.a(r.field_E[9], (byte) 120);
                  this.e(-117, 6);
                  if (var4 == 0) {
                    break L0;
                  }
                }
                this.a(r.field_E[9], (byte) 123);
                this.e(-124, 6);
                if (var4 == 0) {
                  break L0;
                }
              }
              this.a(r.field_E[9], (byte) 112);
              this.e(-124, 6);
            }
          }
          if (param0 <= 35) {
            gb.a(-66, 125, 5, 76, (byte) 66);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "gb.E(" + param0 + ')');
        }
    }

    final static void a(wk[] param0, int param1, int param2, int param3, int param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        try {
          if (null != param0 &&
            param3 > 0) {
            var5_int = param0[0].field_A;
            var6 = param0[2].field_A;
            var7 = param0[1].field_A;
            param0[0].g(param1, param2);
            param0[2].g(param3 + (param1 - var6), param2);
            qn.b(an.field_H);
            qn.b(param1 + var5_int, param2, param1 + (param3 - var6), param0[1].field_x + param2);
            var8 = var5_int + param1;
            var9 = param3 + param1 - var6;
            for (param1 = var8; var9 > param1; param1 = param1 + var7) {
              param0[1].g(param1, param2);
            }
            if (param4 != 8941) {
              gb.a((wk[]) null, -52, 126, 81, -73);
            }
            qn.a(an.field_H);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("gb.J(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int i(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_617_0 = 0;
        int stackIn_619_0 = 0;
        int stackIn_621_0 = 0;
        int stackIn_623_0 = 0;
        int stackIn_625_0 = 0;
        int stackIn_627_0 = 0;
        int stackIn_629_0 = 0;
        int stackIn_631_0 = 0;
        int stackIn_633_0 = 0;
        int stackIn_635_0 = 0;
        int stackIn_637_0 = 0;
        int stackIn_639_0 = 0;
        int stackIn_641_0 = 0;
        int stackIn_643_0 = 0;
        int stackIn_645_0 = 0;
        int stackIn_647_0 = 0;
        int stackIn_649_0 = 0;
        int stackIn_651_0 = 0;
        int stackIn_653_0 = 0;
        int stackIn_655_0 = 0;
        int stackIn_657_0 = 0;
        int stackIn_659_0 = 0;
        int stackIn_661_0 = 0;
        int stackIn_663_0 = 0;
        int stackIn_665_0 = 0;
        int stackIn_667_0 = 0;
        int stackIn_669_0 = 0;
        int stackIn_671_0 = 0;
        int stackIn_673_0 = 0;
        int stackIn_675_0 = 0;
        int stackIn_677_0 = 0;
        int stackIn_679_0 = 0;
        int stackIn_681_0 = 0;
        int stackIn_683_0 = 0;
        int stackIn_685_0 = 0;
        int stackIn_687_0 = 0;
        int stackIn_689_0 = 0;
        int stackIn_691_0 = 0;
        int stackIn_693_0 = 0;
        int stackIn_695_0 = 0;
        int stackIn_697_0 = 0;
        int stackIn_699_0 = 0;
        int stackIn_701_0 = 0;
        int stackIn_703_0 = 0;
        int stackIn_705_0 = 0;
        int stackIn_707_0 = 0;
        int stackIn_709_0 = 0;
        int stackIn_711_0 = 0;
        int stackIn_713_0 = 0;
        int stackIn_715_0 = 0;
        int stackIn_717_0 = 0;
        int stackIn_719_0 = 0;
        int stackIn_721_0 = 0;
        int stackIn_723_0 = 0;
        int stackIn_725_0 = 0;
        int stackIn_727_0 = 0;
        int stackIn_729_0 = 0;
        int stackIn_731_0 = 0;
        int stackIn_733_0 = 0;
        int stackIn_735_0 = 0;
        int stackIn_737_0 = 0;
        int stackIn_739_0 = 0;
        int stackIn_741_0 = 0;
        int stackIn_743_0 = 0;
        int stackIn_745_0 = 0;
        int stackIn_747_0 = 0;
        int stackIn_749_0 = 0;
        int stackIn_751_0 = 0;
        int stackIn_753_0 = 0;
        int stackIn_755_0 = 0;
        int stackIn_757_0 = 0;
        int stackIn_759_0 = 0;
        int stackIn_761_0 = 0;
        int stackIn_763_0 = 0;
        int stackIn_765_0 = 0;
        int stackIn_767_0 = 0;
        int stackIn_769_0 = 0;
        int stackIn_771_0 = 0;
        int stackIn_773_0 = 0;
        int stackIn_775_0 = 0;
        int stackIn_777_0 = 0;
        int stackIn_779_0 = 0;
        int stackIn_781_0 = 0;
        int stackIn_783_0 = 0;
        int stackIn_785_0 = 0;
        int stackIn_787_0 = 0;
        int stackIn_789_0 = 0;
        int stackIn_791_0 = 0;
        int stackIn_793_0 = 0;
        int stackIn_795_0 = 0;
        int stackIn_797_0 = 0;
        int stackIn_799_0 = 0;
        int stackIn_801_0 = 0;
        int stackIn_803_0 = 0;
        int stackIn_805_0 = 0;
        int stackIn_807_0 = 0;
        int stackIn_809_0 = 0;
        int stackIn_811_0 = 0;
        int stackIn_813_0 = 0;
        int stackIn_815_0 = 0;
        int stackIn_817_0 = 0;
        int stackIn_819_0 = 0;
        int stackIn_821_0 = 0;
        int stackIn_823_0 = 0;
        int stackIn_825_0 = 0;
        int stackIn_827_0 = 0;
        int stackIn_829_0 = 0;
        int stackIn_831_0 = 0;
        int stackIn_833_0 = 0;
        int stackIn_835_0 = 0;
        int stackIn_837_0 = 0;
        int stackIn_839_0 = 0;
        int stackIn_841_0 = 0;
        int stackIn_843_0 = 0;
        int stackIn_845_0 = 0;
        int stackIn_847_0 = 0;
        int stackIn_849_0 = 0;
        int stackIn_851_0 = 0;
        int stackIn_853_0 = 0;
        int stackIn_855_0 = 0;
        int stackIn_857_0 = 0;
        int stackIn_859_0 = 0;
        int stackIn_861_0 = 0;
        int stackIn_863_0 = 0;
        int stackIn_865_0 = 0;
        int stackIn_867_0 = 0;
        int stackIn_869_0 = 0;
        int stackIn_871_0 = 0;
        int stackIn_873_0 = 0;
        int stackIn_875_0 = 0;
        int stackIn_877_0 = 0;
        int stackIn_879_0 = 0;
        int stackIn_881_0 = 0;
        int stackIn_883_0 = 0;
        int stackIn_885_0 = 0;
        int stackIn_887_0 = 0;
        int stackIn_889_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var2_int = this.field_q.field_xb.field_B[0][this.field_C];
          if (param0 != -134) {
            stackIn_3_0 = 8;
            return stackIn_3_0;
          }
          var3 = var2_int;
          if (var3 == -1 &&
            var4 == 0) {
            stackIn_617_0 = 0;
            return stackIn_617_0;
          }
          if (var3 == 0 &&
            var4 == 0) {
            stackIn_619_0 = 0;
            return stackIn_619_0;
          }
          if (var3 == 1 &&
            var4 == 0) {
            stackIn_621_0 = 0;
            return stackIn_621_0;
          }
          if (2 == var3 &&
            var4 == 0) {
            stackIn_623_0 = 0;
            return stackIn_623_0;
          }
          if (var3 == 3) {
            stackIn_625_0 = 0;
            return stackIn_625_0;
          }
          if (var3 == 4) {
            stackIn_627_0 = 0;
            return stackIn_627_0;
          }
          if (var3 == 5) {
            stackIn_629_0 = 0;
            return stackIn_629_0;
          }
          if (var3 == 6) {
            stackIn_631_0 = 0;
            return stackIn_631_0;
          }
          if (var3 == 7 &&
            var4 == 0) {
            stackIn_633_0 = 1;
            return stackIn_633_0;
          }
          if (var3 == 8 &&
            var4 == 0) {
            stackIn_635_0 = 1;
            return stackIn_635_0;
          }
          if (var3 == 9 &&
            var4 == 0) {
            stackIn_637_0 = 1;
            return stackIn_637_0;
          }
          if (var3 == 10) {
            stackIn_639_0 = 1;
            return stackIn_639_0;
          }
          if (var3 == 11) {
            stackIn_641_0 = 1;
            return stackIn_641_0;
          }
          if (var3 == 12) {
            stackIn_643_0 = 2;
            return stackIn_643_0;
          }
          if (var3 == 13) {
            stackIn_645_0 = 3;
            return stackIn_645_0;
          }
          if (14 == var3 &&
            var4 == 0) {
            stackIn_647_0 = 3;
            return stackIn_647_0;
          }
          if (var3 == 15 &&
            var4 == 0) {
            stackIn_649_0 = 3;
            return stackIn_649_0;
          }
          if (var3 == 16) {
            stackIn_651_0 = 3;
            return stackIn_651_0;
          }
          if (17 == var3) {
            stackIn_653_0 = 3;
            return stackIn_653_0;
          }
          if (var3 == 18) {
            stackIn_655_0 = 4;
            return stackIn_655_0;
          }
          if (var3 == 19 &&
            var4 == 0) {
            stackIn_657_0 = 4;
            return stackIn_657_0;
          }
          if (var3 == 20) {
            stackIn_659_0 = 4;
            return stackIn_659_0;
          }
          if (21 == var3) {
            stackIn_661_0 = 4;
            return stackIn_661_0;
          }
          if (var3 == 22) {
            stackIn_663_0 = 4;
            return stackIn_663_0;
          }
          if (var3 == 23) {
            stackIn_665_0 = 5;
            return stackIn_665_0;
          }
          if (var3 == 24 &&
            var4 == 0) {
            stackIn_667_0 = 5;
            return stackIn_667_0;
          }
          if (25 == var3) {
            stackIn_669_0 = 6;
            return stackIn_669_0;
          }
          if (26 == var3 &&
            var4 == 0) {
            stackIn_671_0 = 6;
            return stackIn_671_0;
          }
          if (var3 == 27) {
            stackIn_673_0 = 7;
            return stackIn_673_0;
          }
          if (var3 == 28 &&
            var4 == 0) {
            stackIn_675_0 = 2;
            return stackIn_675_0;
          }
          if (var3 == 29) {
            stackIn_677_0 = 8;
            return stackIn_677_0;
          }
          if (30 == var3 &&
            var4 == 0) {
            stackIn_679_0 = 8;
            return stackIn_679_0;
          }
          if (var3 == 31 &&
            var4 == 0) {
            stackIn_681_0 = 8;
            return stackIn_681_0;
          }
          if (32 == var3 &&
            var4 == 0) {
            stackIn_683_0 = 8;
            return stackIn_683_0;
          }
          if (33 == var3) {
            stackIn_685_0 = 8;
            return stackIn_685_0;
          }
          if (34 == var3) {
            stackIn_687_0 = 9;
            return stackIn_687_0;
          }
          if (var3 == 35 &&
            var4 == 0) {
            stackIn_689_0 = 9;
            return stackIn_689_0;
          }
          if (var3 == 36) {
            stackIn_691_0 = 10;
            return stackIn_691_0;
          }
          if (var3 == 37) {
            stackIn_693_0 = 11;
            return stackIn_693_0;
          }
          if (var3 == 38 &&
            var4 == 0) {
            stackIn_695_0 = 11;
            return stackIn_695_0;
          }
          if (var3 == 39 &&
            var4 == 0) {
            stackIn_697_0 = 11;
            return stackIn_697_0;
          }
          if (var3 == 40) {
            stackIn_699_0 = 11;
            return stackIn_699_0;
          }
          if (41 == var3) {
            stackIn_701_0 = 11;
            return stackIn_701_0;
          }
          if (42 == var3) {
            stackIn_703_0 = 11;
            return stackIn_703_0;
          }
          if (var3 == 43 &&
            var4 == 0) {
            stackIn_705_0 = 12;
            return stackIn_705_0;
          }
          if (var3 == 44) {
            stackIn_707_0 = 13;
            return stackIn_707_0;
          }
          if (var3 == 45 &&
            var4 == 0) {
            stackIn_709_0 = 14;
            return stackIn_709_0;
          }
          if (46 == var3 &&
            var4 == 0) {
            stackIn_711_0 = 15;
            return stackIn_711_0;
          }
          if (var3 == 47 &&
            var4 == 0) {
            stackIn_713_0 = 16;
            return stackIn_713_0;
          }
          if (var3 == 48 &&
            var4 == 0) {
            stackIn_715_0 = 16;
            return stackIn_715_0;
          }
          if (var3 == 49 &&
            var4 == 0) {
            stackIn_717_0 = 16;
            return stackIn_717_0;
          }
          if (var3 == 50) {
            stackIn_719_0 = 16;
            return stackIn_719_0;
          }
          if (var3 == 51 &&
            var4 == 0) {
            stackIn_721_0 = 16;
            return stackIn_721_0;
          }
          if (var3 == 52) {
            stackIn_723_0 = 16;
            return stackIn_723_0;
          }
          if (var3 == 53 &&
            var4 == 0) {
            stackIn_725_0 = 16;
            return stackIn_725_0;
          }
          if (var3 == 54 &&
            var4 == 0) {
            stackIn_727_0 = 17;
            return stackIn_727_0;
          }
          if (var3 == 55) {
            stackIn_729_0 = 17;
            return stackIn_729_0;
          }
          if (var3 == 56 &&
            var4 == 0) {
            stackIn_731_0 = 17;
            return stackIn_731_0;
          }
          if (var3 == 57) {
            stackIn_733_0 = 17;
            return stackIn_733_0;
          }
          if (58 == var3 &&
            var4 == 0) {
            stackIn_735_0 = 17;
            return stackIn_735_0;
          }
          if (var3 == 59) {
            stackIn_737_0 = 17;
            return stackIn_737_0;
          }
          if (var3 == 60 &&
            var4 == 0) {
            stackIn_739_0 = 17;
            return stackIn_739_0;
          }
          if (var3 == 61) {
            stackIn_741_0 = 18;
            return stackIn_741_0;
          }
          if (var3 == 62 &&
            var4 == 0) {
            stackIn_743_0 = 18;
            return stackIn_743_0;
          }
          if (63 == var3) {
            stackIn_745_0 = 18;
            return stackIn_745_0;
          }
          if (var3 == 64) {
            stackIn_747_0 = 18;
            return stackIn_747_0;
          }
          if (65 == var3) {
            stackIn_749_0 = 18;
            return stackIn_749_0;
          }
          if (var3 == 66) {
            stackIn_751_0 = 18;
            return stackIn_751_0;
          }
          if (67 == var3) {
            stackIn_753_0 = 18;
            return stackIn_753_0;
          }
          if (var3 == 68) {
            stackIn_755_0 = 19;
            return stackIn_755_0;
          }
          if (69 == var3 &&
            var4 == 0) {
            stackIn_757_0 = 2;
            return stackIn_757_0;
          }
          if (var3 == 70) {
            stackIn_759_0 = 21;
            return stackIn_759_0;
          }
          if (71 == var3) {
            stackIn_761_0 = 21;
            return stackIn_761_0;
          }
          if (var3 == 72 &&
            var4 == 0) {
            stackIn_763_0 = 21;
            return stackIn_763_0;
          }
          if (var3 == 73) {
            stackIn_765_0 = 21;
            return stackIn_765_0;
          }
          if (var3 == 74) {
            stackIn_767_0 = 21;
            return stackIn_767_0;
          }
          if (75 == var3 &&
            var4 == 0) {
            stackIn_769_0 = 21;
            return stackIn_769_0;
          }
          if (var3 == 76) {
            stackIn_771_0 = 21;
            return stackIn_771_0;
          }
          if (var3 == 77) {
            stackIn_773_0 = 21;
            return stackIn_773_0;
          }
          if (var3 == 78) {
            stackIn_775_0 = 21;
            return stackIn_775_0;
          }
          if (var3 == 79 &&
            var4 == 0) {
            stackIn_777_0 = 21;
            return stackIn_777_0;
          }
          if (var3 == 80) {
            stackIn_779_0 = 21;
            return stackIn_779_0;
          }
          if (81 == var3) {
            stackIn_781_0 = 21;
            return stackIn_781_0;
          }
          if (var3 == 82 &&
            var4 == 0) {
            stackIn_783_0 = 21;
            return stackIn_783_0;
          }
          if (var3 == 83 &&
            var4 == 0) {
            stackIn_785_0 = 21;
            return stackIn_785_0;
          }
          if (84 == var3 &&
            var4 == 0) {
            stackIn_787_0 = 21;
            return stackIn_787_0;
          }
          if (var3 == 85 &&
            var4 == 0) {
            stackIn_789_0 = 21;
            return stackIn_789_0;
          }
          if (var3 == 86 &&
            var4 == 0) {
            stackIn_791_0 = 21;
            return stackIn_791_0;
          }
          if (var3 == 87 &&
            var4 == 0) {
            stackIn_793_0 = 21;
            return stackIn_793_0;
          }
          if (88 == var3) {
            stackIn_795_0 = 21;
            return stackIn_795_0;
          }
          if (var3 == 89 &&
            var4 == 0) {
            stackIn_797_0 = 21;
            return stackIn_797_0;
          }
          if (var3 == 90) {
            stackIn_799_0 = 21;
            return stackIn_799_0;
          }
          if (91 == var3) {
            stackIn_801_0 = 21;
            return stackIn_801_0;
          }
          if (var3 == 92 &&
            var4 == 0) {
            stackIn_803_0 = 21;
            return stackIn_803_0;
          }
          if (var3 == 93) {
            stackIn_805_0 = 21;
            return stackIn_805_0;
          }
          if (var3 == 94) {
            stackIn_807_0 = 22;
            return stackIn_807_0;
          }
          if (95 == var3 &&
            var4 == 0) {
            stackIn_809_0 = 22;
            return stackIn_809_0;
          }
          if (var3 == 96 &&
            var4 == 0) {
            stackIn_811_0 = 22;
            return stackIn_811_0;
          }
          if (var3 == 97 &&
            var4 == 0) {
            stackIn_813_0 = 22;
            return stackIn_813_0;
          }
          if (var3 == 98 &&
            var4 == 0) {
            stackIn_815_0 = 22;
            return stackIn_815_0;
          }
          if (var3 == 99) {
            stackIn_817_0 = 22;
            return stackIn_817_0;
          }
          if (var3 == 100 &&
            var4 == 0) {
            stackIn_819_0 = 22;
            return stackIn_819_0;
          }
          if (var3 == 101) {
            stackIn_821_0 = 22;
            return stackIn_821_0;
          }
          if (var3 == 102) {
            stackIn_823_0 = 22;
            return stackIn_823_0;
          }
          if (var3 == 103) {
            stackIn_825_0 = 21;
            return stackIn_825_0;
          }
          if (var3 == 104) {
            stackIn_827_0 = 21;
            return stackIn_827_0;
          }
          if (105 == var3 &&
            var4 == 0) {
            stackIn_829_0 = 22;
            return stackIn_829_0;
          }
          if (106 == var3 &&
            var4 == 0) {
            stackIn_831_0 = 22;
            return stackIn_831_0;
          }
          if (var3 == 107) {
            stackIn_833_0 = 22;
            return stackIn_833_0;
          }
          if (var3 == 108) {
            stackIn_835_0 = 23;
            return stackIn_835_0;
          }
          if (var3 == 109 &&
            var4 == 0) {
            stackIn_837_0 = 24;
            return stackIn_837_0;
          }
          if (110 == var3 &&
            var4 == 0) {
            stackIn_839_0 = 2;
            return stackIn_839_0;
          }
          if (var3 == 111 &&
            var4 == 0) {
            stackIn_841_0 = 25;
            return stackIn_841_0;
          }
          if (var3 == 112 &&
            var4 == 0) {
            stackIn_843_0 = 25;
            return stackIn_843_0;
          }
          if (var3 == 113) {
            stackIn_845_0 = 25;
            return stackIn_845_0;
          }
          if (var3 == 114 &&
            var4 == 0) {
            stackIn_847_0 = 25;
            return stackIn_847_0;
          }
          if (var3 == 115) {
            stackIn_849_0 = 26;
            return stackIn_849_0;
          }
          if (var3 == 116 &&
            var4 == 0) {
            stackIn_851_0 = 26;
            return stackIn_851_0;
          }
          if (var3 == 117 &&
            var4 == 0) {
            stackIn_853_0 = 26;
            return stackIn_853_0;
          }
          if (var3 == 118) {
            stackIn_855_0 = 26;
            return stackIn_855_0;
          }
          if (var3 == 119 &&
            var4 == 0) {
            stackIn_857_0 = 26;
            return stackIn_857_0;
          }
          if (var3 == 120 &&
            var4 == 0) {
            stackIn_859_0 = 27;
            return stackIn_859_0;
          }
          if (121 == var3 &&
            var4 == 0) {
            stackIn_861_0 = 28;
            return stackIn_861_0;
          }
          if (var3 == 122 &&
            var4 == 0) {
            stackIn_863_0 = 28;
            return stackIn_863_0;
          }
          if (var3 == 123) {
            stackIn_865_0 = 28;
            return stackIn_865_0;
          }
          if (var3 == 124) {
            stackIn_867_0 = 22;
            return stackIn_867_0;
          }
          if (125 == var3 &&
            var4 == 0) {
            stackIn_869_0 = 22;
            return stackIn_869_0;
          }
          if (var3 == 126) {
            stackIn_871_0 = 22;
            return stackIn_871_0;
          }
          if (var3 == 127 &&
            var4 == 0) {
            stackIn_873_0 = 22;
            return stackIn_873_0;
          }
          if (var3 == 128) {
            stackIn_875_0 = 22;
            return stackIn_875_0;
          }
          if (var3 == 129 &&
            var4 == 0) {
            stackIn_877_0 = 22;
            return stackIn_877_0;
          }
          if (var3 == 130 &&
            var4 == 0) {
            stackIn_879_0 = 22;
            return stackIn_879_0;
          }
          if (var3 == 131 &&
            var4 == 0) {
            stackIn_881_0 = 22;
            return stackIn_881_0;
          }
          if (132 == var3) {
            stackIn_883_0 = 22;
            return stackIn_883_0;
          }
          if (var3 == 133 &&
            var4 == 0) {
            stackIn_885_0 = 22;
            return stackIn_885_0;
          }
          if (var3 == 134) {
            stackIn_887_0 = 22;
            return stackIn_887_0;
          }
          stackIn_889_0 = 0;
          return stackIn_889_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "gb.D(" + param0 + ')');
        }
    }

    private final void e(int param0, int param1) {
        String discarded$0 = null;
        int stackIn_87_0 = 0;
        int stackIn_101_1 = 0;
        String[] stackIn_101_2 = null;
        int stackIn_102_3 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var6Lifetime1;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (param0 > -113) {
            discarded$0 = this.a((byte) -54, -8);
          }
          boolean decompiledFrameRemainder6 = true;
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          this.field_c = true;
          this.field_k = param1;
          this.d((byte) 37);
          this.d(-85, -1);
          var6 = param1;
          if (var6 == 2 &&
            var7 == 0) {
            this.a(r.field_E[2], (byte) 111);
            this.field_w = 4;
            if (var7 == 0) {
              return;
            }
          } else if (var6 != 1 ||
            var7 != 0) {
            decompiledFrameRemainder0 = (var6 != 3);
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameRemainder1 = (5 != var6)) &&
              (decompiledFrameRemainder2 = (11 != var6)) &&
              (decompiledFrameRemainder3 = (var6 != 6 ||
              var7 != 0)) &&
              (decompiledFrameRemainder4 = (10 != var6 ||
              var7 != 0)) &&
              (decompiledFrameRemainder5 = (var6 != 12 ||
              var7 != 0)) &&
              (decompiledFrameRemainder6 = (var6 != 14))) {
              return;
            }
          }
          if ((decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            this.a(r.field_E[0], (byte) 126);
            this.field_w = 0;
            if (var7 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            this.a(r.field_E[1], (byte) 111);
            this.field_w = 1;
            this.d(-75, 255);
            if (var7 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            this.field_C = this.field_C + 1;
            if (-1 == this.field_q.field_xb.field_B[0][this.field_C]) {
              this.a(r.field_E[24], (byte) 117);
              while (this.field_C < 5) {
                if (-1 == this.field_q.field_xb.field_B[0][this.field_C]) {
                  this.field_C = this.field_C + 1;
                  if (var7 == 0) {
                    continue;
                  }
                }
                break;
              }
              this.field_k = 9;
              this.field_w = 0;
              this.field_C = this.field_C - 1;
              return;
            }
            var6Lifetime1 = 0;
            L16: while (true) {
              if (var6Lifetime1 < this.field_C) {
                stackIn_87_0 = ~this.field_q.field_xb.field_B[0][var6Lifetime1];
                if (var7 != 0) {
                  break L16;
                }
                if (stackIn_87_0 == ~this.field_q.field_xb.field_B[0][this.field_C]) {
                  this.a(fo.a(4800, r.field_E[31], new String[]{fq.field_f[this.field_q.field_xb.field_B[0][this.field_C]]}), (byte) 119);
                  this.field_w = 0;
                  this.field_k = 9;
                  while (true) {
                    if (this.field_C < 5 &&
                      var7 == 0 &&
                      ~this.field_q.field_xb.field_B[0][this.field_C] == ~this.field_q.field_xb.field_B[0][var6Lifetime1]) {
                      this.field_C = this.field_C + 1;
                      if (var7 == 0) {
                        continue;
                      }
                    }
                    break;
                  }
                  this.field_C = this.field_C - 1;
                  return;
                }
                var6Lifetime1++;
                if (var7 == 0) {
                  continue;
                }
              }
              stackIn_87_0 = uc.field_d[this.field_q.field_xb.field_B[0][this.field_C]][3];
              break;
            }
            var3_int = stackIn_87_0;
            var4 = this.a((byte) 66, this.field_q.field_xb.field_B[0][this.field_C]);
            boolean decompiledSharedTail0 = (var4 == null);
            if (!decompiledSharedTail0) {
              this.field_k = 9;
              this.field_w = 0;
              decompiledSharedTail0 = (var7 != 0);
            }
            if (decompiledSharedTail0) {
              if (var3_int != 4) {
                var4 = r.field_E[26];
              }
              if (var3_int == 4 ||
                var7 != 0) {
                var4 = r.field_E[22];
              }
              var4 = fo.a(4800, var4, new String[]{fq.field_f[this.field_q.field_xb.field_B[0][this.field_C]]});
              this.field_w = 1;
              this.field_k = 8;
              this.d(-37, this.field_C);
            }
            this.a(fo.a(4800, r.field_E[3 + this.field_C], new String[]{fq.field_f[this.field_q.field_xb.field_B[0][this.field_C]], mn.field_l[this.field_q.field_xb.field_B[0][this.field_C]], var4}), (byte) 109);
            if (var7 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3)) {
            var4 = r.field_E[26];
            var4 = fo.a(4800, var4, new String[]{fq.field_f[this.field_q.field_xb.field_B[0][this.field_C]]});
            stackIn_101_1 = 4800;
            stackIn_101_2 = r.field_E;
            if (this.field_q.field_gc < 0) {
              stackIn_102_3 = 1;
            } else {
              stackIn_102_3 = 0;
            }
            this.a(fo.a(stackIn_101_1, stackIn_101_2[stackIn_102_3 + 32], new String[]{var4}), (byte) 125);
            this.d(-122, this.field_C);
            this.field_w = 1;
            if (var7 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4)) {
            this.field_w = 1;
            if (var7 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5)) {
            this.a(r.field_E[29], (byte) 110);
            this.field_w = 1;
            if (var7 == 0) {
              return;
            }
          }
          if (decompiledFrameRemainder6) {
            var5 = us.field_b[this.i(-134)];
            if (this.field_C == 0) {
              var5 = fo.a(4800, r.field_E[27], new String[]{var5});
            }
            this.a(var5, (byte) 126);
            this.field_w = 0;
            if (var7 == 0) {
              return;
            }
          }
          this.a(r.field_E[30], (byte) 110);
          this.field_w = 3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "gb.F(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean j(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (this.field_q.field_T == null) {
            return false;
          }
          L0: {
            var2_int = this.field_q.field_xb.field_B[0][this.field_C];
            if (var2_int != 36 ||
              var3 != 0) {
              switch (var2_int) {
                case 34:
                  if (this.field_q.field_T.field_O != 0) {
                    break L0;
                  }
                  if (this.field_q.field_T.field_s) {
                    break L0;
                  }
                  return true;
                case 35:
                  if (this.field_q.field_T.field_O != 0) {
                    break L0;
                  }
                  if (this.field_q.field_T.field_s) {
                    break L0;
                  }
                  return true;
                default:
                  break L0;
                case 109:
                  if (var3 == 0) {
                    if (this.field_q.field_T.field_O != 0) {
                      break L0;
                    }
                    if (this.field_q.field_T.field_s) {
                      break L0;
                    }
                    return true;
                  }
                  break;
              }
            }
            if (this.field_q.field_T.field_O != 0 &&
              !this.field_q.field_T.field_s) {
              return true;
            }
          }
          if (param0 != -36) {
            field_z = 53;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "gb.K(" + param0 + ')');
        }
    }

    private final void d(int param0, int param1) {
        try {
          this.field_q.field_Jb = param1;
          if (param0 > 0) {
            field_B = true;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "gb.C(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_B = true;
        field_y = 480;
        field_z = 7;
    }
}
