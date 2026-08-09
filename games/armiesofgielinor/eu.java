/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eu {
    static tp field_e;
    static int field_a;
    private tc field_c;
    private at field_b;
    static String field_d;
    private bb field_f;
    static je field_g;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var20 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5_int = op.field_c[0][param1];
            var6 = var5_int << 1763283489 & 105984 | (13566159 & var5_int) << 1511467521;
            param0 += 16;
            var7 = 3;
            if (param3 >= 62) {
              L1: {
                if (cu.field_a) {
                  break L1;
                } else {
                  var7 = 2;
                  break L1;
                }
              }
              var8 = -64;
              L2: while (true) {
                if (-17 >= (var8 ^ -1)) {
                  if (!cu.field_a) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var8 = -59;
                    L3: while (true) {
                      if (8 <= var8) {
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        L4: {
                          var9 = var8;
                          if (var9 < 0) {
                            var9 = 256 - -(var9 << -1389438334);
                            break L4;
                          } else {
                            var9 = -(var9 * var9 << 334418115) + 256;
                            break L4;
                          }
                        }
                        var10 = var8 / 4;
                        var11 = param0 + (-var10 + -16 + -var8 / 2 << -1722981456 >> 699101424);
                        var12 = param4 - -(var8 * 2);
                        var13 = 1 + var9 / 5 - var10;
                        var14 = var9 >> -1712527101;
                        qn.c(var11, var12, var13, var6, var14);
                        qn.c(var11, 1 + var12, var13, var6, var14);
                        var15 = var11;
                        var15 = var15 + var11 >> -482271679 << 404661096;
                        var16 = (var13 << -174655928) / 6;
                        var17 = var15 - (-(var16 / 2) - (4 * ae.b(var8 + param2 << -754370428, 100) >> 601195080));
                        var18 = var9 >> -1396750812;
                        var19 = 0;
                        L5: while (true) {
                          if (3 <= var19) {
                            var17 = var16 / 4 + var15 - -(var16 / 2);
                            var16 = var16 / 2;
                            var19 = 0;
                            L6: while (true) {
                              if ((var19 ^ -1) <= -4) {
                                var8++;
                                continue L3;
                              } else {
                                qn.c(var17 >> -563956472, var12, var16 >> -262271448, var5_int, var18);
                                qn.c(var17 >> -502887960, 1 + var12, var16 >> 530893992, var5_int, var18);
                                var17 = var17 + 4 * var16;
                                var19++;
                                continue L6;
                              }
                            }
                          } else {
                            qn.c(var17 >> 1717850536, var12, var16 >> -1423110008, var5_int, var18);
                            qn.c(var17 >> 1451373352, 1 + var12, var16 >> -89927480, var5_int, var18);
                            var17 = var17 + var16 * 2;
                            var19++;
                            continue L5;
                          }
                        }
                      }
                    }
                  }
                } else {
                  L7: {
                    var9 = var8;
                    if (var9 >= 0) {
                      var9 = 256 + -(var9 * var9 << -1705581981);
                      break L7;
                    } else {
                      var9 = (var9 << -13702590) + 256;
                      break L7;
                    }
                  }
                  var10 = var8 / 4;
                  var11 = (-var10 + -16 + -var8 / 2 << 2124988688 >> 2125083056) + param0;
                  var12 = param4 + var8 * 2;
                  var13 = -var10 + (var9 / 5 - -1);
                  var14 = var9 >> var7;
                  qn.c(var11, var12, var13, var6, var14);
                  qn.c(var11, var12 - -1, var13, var6, var14);
                  var15 = var11;
                  var15 = var11 + var15 >> -1132735871 << -1409960376;
                  var16 = (var13 << -888062488) / 6;
                  var17 = var16 / 2 + (var15 - -(g.a(-1, param2 + var8 << -1670655771) * 4 >> -1822470552));
                  var18 = var9 >> -881556477;
                  var19 = 0;
                  L8: while (true) {
                    if (3 <= var19) {
                      var17 = var16 / 4 + (var16 / 2 + var15);
                      var16 = var16 / 2;
                      var19 = 0;
                      L9: while (true) {
                        if ((var19 ^ -1) <= -4) {
                          var8++;
                          continue L2;
                        } else {
                          qn.c(var17 >> 1677268744, var12, var16 >> 1514228776, var5_int, var18);
                          qn.c(var17 >> 1649702504, 1 + var12, var16 >> -2139668024, var5_int, var18);
                          var17 = var17 + var16 * 4;
                          var19++;
                          continue L9;
                        }
                      }
                    } else {
                      qn.c(var17 >> 275736552, var12, var16 >> -1134759544, var5_int, var18);
                      qn.c(var17 >> -1665991000, 1 + var12, var16 >> -1418505912, var5_int, var18);
                      var17 = var17 + 2 * var16;
                      var19++;
                      continue L8;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var5), "eu.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final tc d(byte param0) {
        if (param0 < 42) {
            jd var3 = (jd) null;
            this.a(57, (jd) null);
        }
        return this.field_c;
    }

    public static void a(byte param0) {
        field_g = null;
        field_d = null;
        if (param0 != -55) {
            eu.a((byte) 5);
        }
        field_e = null;
    }

    private final boolean c(byte param0) {
        L0: {
          if (null == this.field_c) {
            break L0;
          } else {
            if (this.field_c.field_b == null) {
              break L0;
            } else {
              if (param0 == -33) {
                return false;
              } else {
                field_g = (je) null;
                return false;
              }
            }
          }
        }
        this.field_c = null;
        return true;
    }

    final void a(int param0, jd param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (param0 <= -90) {
              L1: {
                if (this.field_c != param1) {
                  this.field_c = (tc) ((Object) param1);
                  break L1;
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("eu.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        if (param0 <= 11) {
            this.field_f = (bb) null;
        }
        this.c(10201);
        if (null != this.field_c) {
            this.field_f.a(this.field_c, true);
            this.field_c = this.field_f.b(50);
        }
        if (this.field_c == null) {
            this.field_c = this.field_f.c(50);
        }
    }

    final int b(byte param0) {
        if (param0 <= 31) {
            this.b((byte) 71);
        }
        return this.field_b.b(false);
    }

    final static void a(int param0, int param1, int param2, jd param3) {
        try {
            cd.a(27, param2 + -16, param1, 2);
            int var4_int = 110 / ((49 - param0) / 39);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "eu.J(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        boolean discarded$0 = false;
        this.c(10201);
        if (null != this.field_c) {
            this.field_f.a(false, this.field_c);
            this.field_c = this.field_f.b((byte) -112);
        }
        if (param0 >= -50) {
            discarded$0 = this.c((byte) 124);
        }
        if (!(this.field_c != null)) {
            this.field_c = this.field_f.a(50);
        }
    }

    private final void c(int param0) {
        boolean discarded$0 = false;
        if (param0 != 10201) {
            discarded$0 = this.c((byte) -44);
        }
        if (!(!this.c((byte) -33))) {
            this.field_f = new bb(this.field_b);
        }
    }

    eu(at param0) {
        try {
            this.field_b = param0;
            this.field_f = new bb(this.field_b);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "eu.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Secret achievement";
        field_a = 20;
    }
}
