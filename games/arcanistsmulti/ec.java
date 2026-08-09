/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    static String field_a;
    private qb[] field_f;
    static String field_h;
    static String field_e;
    static kc field_d;
    static af field_g;
    static String field_b;
    static String field_c;
    static qb[] field_i;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        gl.a(param4, param0, -27327, param3, this.field_f, param1);
        if (param2 >= -85) {
            field_d = (kc) null;
        }
    }

    public static void b(int param0) {
        field_g = null;
        field_e = null;
        field_d = null;
        if (param0 != 0) {
            field_g = (af) null;
        }
        field_h = null;
        field_c = null;
        field_i = null;
        field_b = null;
        field_a = null;
    }

    final static void a(int param0) {
        uh var1 = (uh) ((Object) km.field_a.d(true));
        if (var1 == null) {
            var1 = new uh();
        }
        if (param0 != 65280) {
            return;
        }
        var1.a(de.field_c, de.field_l, (byte) 27, de.field_k, de.field_h, de.field_j, de.field_e, de.field_i);
        lk.field_j.b(var1, -1);
    }

    final static void a(byte[] param0, byte param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (34 != param0.length) {
                  var2_int = 0;
                  incrementValue$0 = var2_int;
                  var2_int++;
                  var3 = param0[incrementValue$0];
                  if (-1 > (var3 ^ -1)) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if ((var3 ^ -1) <= -1) {
                      incrementValue$1 = var2_int;
                      var2_int++;
                      kg.field_d[0] = ld.field_n[dg.a((int) param0[incrementValue$1], 255)];
                      incrementValue$2 = var2_int;
                      var2_int++;
                      kg.field_d[1] = ud.field_z[dg.a(255, (int) param0[incrementValue$2])];
                      incrementValue$3 = var2_int;
                      var2_int++;
                      kg.field_d[2] = ug.field_d[dg.a((int) param0[incrementValue$3], 255)];
                      incrementValue$4 = var2_int;
                      var2_int++;
                      kg.field_d[3] = hi.field_b[dg.a(255, (int) param0[incrementValue$4])];
                      var4 = 0;
                      L2: while (true) {
                        if ((var4 ^ -1) <= -7) {
                          var4 = 0;
                          L3: while (true) {
                            if (16 <= var4) {
                              break L1;
                            } else {
                              L4: {
                                incrementValue$5 = var2_int;
                                var2_int++;
                                b.field_f[var4] = dg.a(255, (int) param0[incrementValue$5]);
                                if (-256 == (b.field_f[var4] ^ -1)) {
                                  b.field_f[var4] = -1;
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                              var4++;
                              continue L3;
                            }
                          }
                        } else {
                          incrementValue$6 = var2_int;
                          var2_int++;
                          so.field_c[var4] = param0[incrementValue$6];
                          var4++;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                } else {
                  var2_int = 0;
                  kg.field_d[0] = ld.field_n[0];
                  kg.field_d[2] = ug.field_d[0];
                  kg.field_d[1] = ud.field_z[0];
                  kg.field_d[3] = hi.field_b[0];
                  incrementValue$7 = var2_int;
                  var2_int++;
                  incrementValue$8 = var2_int;
                  var2_int++;
                  incrementValue$9 = var2_int;
                  var2_int++;
                  var3 = (param0[incrementValue$7] << -1095242288 & 16711680) - (-(param0[incrementValue$8] << -712991480 & 65280) - (param0[incrementValue$9] & 255));
                  var4 = 0;
                  L5: while (true) {
                    if (ld.field_n.length <= var4) {
                      incrementValue$10 = var2_int;
                      var2_int++;
                      incrementValue$11 = var2_int;
                      var2_int++;
                      incrementValue$12 = var2_int;
                      var2_int++;
                      var3 = ((255 & param0[incrementValue$10]) << 37237520) + (((param0[incrementValue$11] & 255) << 243172040) - -(param0[incrementValue$12] & 255));
                      var4 = 0;
                      L6: while (true) {
                        if (var4 >= ud.field_z.length) {
                          incrementValue$13 = var2_int;
                          var2_int++;
                          incrementValue$14 = var2_int;
                          var2_int++;
                          incrementValue$15 = var2_int;
                          var2_int++;
                          var3 = ((255 & param0[incrementValue$13]) << 238282256) - (-(param0[incrementValue$14] << 1617073416 & 65280) - (255 & param0[incrementValue$15]));
                          var4 = 0;
                          L7: while (true) {
                            if (ug.field_d.length <= var4) {
                              incrementValue$16 = var2_int;
                              var2_int++;
                              incrementValue$17 = var2_int;
                              var2_int++;
                              incrementValue$18 = var2_int;
                              var2_int++;
                              var3 = ((param0[incrementValue$16] & 255) << 1405820656) + ((255 & param0[incrementValue$17]) << -947551768) + (255 & param0[incrementValue$18]);
                              var4 = 0;
                              L8: while (true) {
                                if (hi.field_b.length <= var4) {
                                  var4 = 0;
                                  L9: while (true) {
                                    if (var4 >= 6) {
                                      var4 = 0;
                                      L10: while (true) {
                                        if (var4 >= 16) {
                                          break L1;
                                        } else {
                                          L11: {
                                            incrementValue$19 = var2_int;
                                            var2_int++;
                                            b.field_f[var4] = dg.a((int) param0[incrementValue$19], 255);
                                            if (255 != b.field_f[var4]) {
                                              if (0 > b.field_f[var4]) {
                                                b.field_f[var4] = dg.a(b.field_f[var4], 255);
                                                break L11;
                                              } else {
                                                if (6 > b.field_f[var4]) {
                                                  if (b.field_f[var4] == 1) {
                                                    b.field_f[var4] = 2;
                                                    break L11;
                                                  } else {
                                                    if (2 != b.field_f[var4]) {
                                                      if (-4 == (b.field_f[var4] ^ -1)) {
                                                        b.field_f[var4] = 6;
                                                        break L11;
                                                      } else {
                                                        if ((b.field_f[var4] ^ -1) != -5) {
                                                          if (b.field_f[var4] != 5) {
                                                            break L11;
                                                          } else {
                                                            b.field_f[var4] = 8;
                                                            break L11;
                                                          }
                                                        } else {
                                                          b.field_f[var4] = 10;
                                                          break L11;
                                                        }
                                                      }
                                                    } else {
                                                      b.field_f[var4] = 4;
                                                      break L11;
                                                    }
                                                  }
                                                } else {
                                                  b.field_f[var4] = b.field_f[var4] + 6;
                                                  break L11;
                                                }
                                              }
                                            } else {
                                              b.field_f[var4] = -1;
                                              break L11;
                                            }
                                          }
                                          var4++;
                                          continue L10;
                                        }
                                      }
                                    } else {
                                      incrementValue$20 = var2_int;
                                      var2_int++;
                                      so.field_c[var4] = param0[incrementValue$20];
                                      var4++;
                                      continue L9;
                                    }
                                  }
                                } else {
                                  L12: {
                                    if ((hi.field_b[var4][0] << 260054128 ^ -1) != (var3 & 16711680 ^ -1)) {
                                      break L12;
                                    } else {
                                      if (hi.field_b[var4][1] << -645749080 != (var3 & 65280)) {
                                        break L12;
                                      } else {
                                        if ((var3 & 255) != hi.field_b[var4][2]) {
                                          break L12;
                                        } else {
                                          kg.field_d[3] = hi.field_b[var4];
                                          break L12;
                                        }
                                      }
                                    }
                                  }
                                  var4++;
                                  continue L8;
                                }
                              }
                            } else {
                              if ((ug.field_d[var4][0] << -1431417072 ^ -1) == (var3 & 16711680 ^ -1)) {
                                if (ug.field_d[var4][1] << 153251304 == (65280 & var3)) {
                                  L13: {
                                    if (ug.field_d[var4][2] == (var3 & 255)) {
                                      kg.field_d[2] = ug.field_d[var4];
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  var4++;
                                  continue L7;
                                } else {
                                  var4++;
                                  continue L7;
                                }
                              } else {
                                var4++;
                                continue L7;
                              }
                            }
                          }
                        } else {
                          L14: {
                            if ((16711680 & var3) != ud.field_z[var4][0] << -1814777936) {
                              break L14;
                            } else {
                              if ((var3 & 65280) != ud.field_z[var4][1] << -164935128) {
                                break L14;
                              } else {
                                if ((var3 & 255) != ud.field_z[var4][2]) {
                                  break L14;
                                } else {
                                  kg.field_d[1] = ud.field_z[var4];
                                  break L14;
                                }
                              }
                            }
                          }
                          var4++;
                          continue L6;
                        }
                      }
                    } else {
                      L15: {
                        if ((ld.field_n[var4][0] << -1842811760 ^ -1) != (var3 & 16711680 ^ -1)) {
                          break L15;
                        } else {
                          if (ld.field_n[var4][1] << -1968068600 != (65280 & var3)) {
                            break L15;
                          } else {
                            if ((var3 & 255) != ld.field_n[var4][2]) {
                              break L15;
                            } else {
                              kg.field_d[0] = ld.field_n[var4];
                              break L15;
                            }
                          }
                        }
                      }
                      var4++;
                      continue L5;
                    }
                  }
                }
              }
              L16: {
                if (param1 <= -38) {
                  break L16;
                } else {
                  field_b = (String) null;
                  break L16;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackIn_77_0 = (RuntimeException) (var2);

            stackIn_77_1 = new StringBuilder().append("ec.B(");

            if (param0 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "null";
              break L17;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "{...}";
              break L17;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ',' + param1 + ')');
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

    ec(qb[] param0) {
        try {
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ec.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Join <%0>'s game";
        field_h = "This is the Book of Storm. Storm spells focus on direct attacks and powerful wind effects. You require 5 wands to purchase this spellbook; you currently have ";
        field_e = "That name is not available";
        field_b = "Game";
    }
}
