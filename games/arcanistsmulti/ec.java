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
        gl.a(param4, param0, -27327, param3, ((ec) this).field_f, param1);
        if (param2 >= -85) {
            field_d = null;
        }
    }

    public static void b() {
        field_g = null;
        field_e = null;
        field_d = null;
        field_h = null;
        field_c = null;
        field_i = null;
        field_b = null;
        field_a = null;
    }

    final static void a() {
        uh var1 = (uh) (Object) km.field_a.d(true);
        if (var1 == null) {
            var1 = new uh();
        }
        var1.a(de.field_c, de.field_l, (byte) 27, de.field_k, de.field_h, de.field_j, de.field_e, de.field_i);
        lk.field_j.b((pg) (Object) var1, -1);
    }

    final static void a(byte[] param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == null) {
              return;
            } else {
              L1: {
                if (34 != param0.length) {
                  var2_int = 0;
                  int incrementValue$21 = var2_int;
                  var2_int++;
                  var3 = param0[incrementValue$21];
                  if (var3 > 0) {
                    return;
                  } else {
                    if (var3 >= 0) {
                      int incrementValue$22 = var2_int;
                      var2_int++;
                      kg.field_d[0] = ld.field_n[dg.a((int) param0[incrementValue$22], 255)];
                      int incrementValue$23 = var2_int;
                      var2_int++;
                      kg.field_d[1] = ud.field_z[dg.a(255, (int) param0[incrementValue$23])];
                      int incrementValue$24 = var2_int;
                      var2_int++;
                      kg.field_d[2] = ug.field_d[dg.a((int) param0[incrementValue$24], 255)];
                      int incrementValue$25 = var2_int;
                      var2_int++;
                      kg.field_d[3] = hi.field_b[dg.a(255, (int) param0[incrementValue$25])];
                      var4 = 0;
                      L2: while (true) {
                        if (var4 >= 6) {
                          var4 = 0;
                          L3: while (true) {
                            if (16 <= var4) {
                              break L1;
                            } else {
                              L4: {
                                int incrementValue$26 = var2_int;
                                var2_int++;
                                b.field_f[var4] = dg.a(255, (int) param0[incrementValue$26]);
                                if (b.field_f[var4] == 255) {
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
                          int incrementValue$27 = var2_int;
                          var2_int++;
                          so.field_c[var4] = param0[incrementValue$27];
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
                  int incrementValue$28 = var2_int;
                  var2_int++;
                  int incrementValue$29 = var2_int;
                  var2_int++;
                  int incrementValue$30 = var2_int;
                  var2_int++;
                  var3 = (param0[incrementValue$28] << 16 & 16711680) - (-(param0[incrementValue$29] << 8 & 65280) - (param0[incrementValue$30] & 255));
                  var4 = 0;
                  L5: while (true) {
                    if (ld.field_n.length <= var4) {
                      int incrementValue$31 = var2_int;
                      var2_int++;
                      int incrementValue$32 = var2_int;
                      var2_int++;
                      int incrementValue$33 = var2_int;
                      var2_int++;
                      var3 = ((255 & param0[incrementValue$31]) << 16) + (((param0[incrementValue$32] & 255) << 8) - -(param0[incrementValue$33] & 255));
                      var4 = 0;
                      L6: while (true) {
                        if (var4 >= ud.field_z.length) {
                          int incrementValue$34 = var2_int;
                          var2_int++;
                          int incrementValue$35 = var2_int;
                          var2_int++;
                          int incrementValue$36 = var2_int;
                          var2_int++;
                          var3 = ((255 & param0[incrementValue$34]) << 16) - (-(param0[incrementValue$35] << 8 & 65280) - (255 & param0[incrementValue$36]));
                          var4 = 0;
                          L7: while (true) {
                            if (ug.field_d.length <= var4) {
                              int incrementValue$37 = var2_int;
                              var2_int++;
                              int incrementValue$38 = var2_int;
                              var2_int++;
                              int incrementValue$39 = var2_int;
                              var2_int++;
                              var3 = ((param0[incrementValue$37] & 255) << 16) + ((255 & param0[incrementValue$38]) << 8) + (255 & param0[incrementValue$39]);
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
                                            int incrementValue$40 = var2_int;
                                            var2_int++;
                                            b.field_f[var4] = dg.a((int) param0[incrementValue$40], 255);
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
                                                      if (b.field_f[var4] == 3) {
                                                        b.field_f[var4] = 6;
                                                        break L11;
                                                      } else {
                                                        if (b.field_f[var4] != 4) {
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
                                      int incrementValue$41 = var2_int;
                                      var2_int++;
                                      so.field_c[var4] = param0[incrementValue$41];
                                      var4++;
                                      continue L9;
                                    }
                                  }
                                } else {
                                  L12: {
                                    if (hi.field_b[var4][0] << 16 != (var3 & 16711680)) {
                                      break L12;
                                    } else {
                                      if (hi.field_b[var4][1] << 8 != (var3 & 65280)) {
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
                              L13: {
                                if (ug.field_d[var4][0] << 16 != (var3 & 16711680)) {
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              var4++;
                              continue L7;
                            }
                          }
                        } else {
                          L14: {
                            if ((16711680 & var3) != ud.field_z[var4][0] << 16) {
                              break L14;
                            } else {
                              if ((var3 & 65280) != ud.field_z[var4][1] << 8) {
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
                        if (ld.field_n[var4][0] << 16 != (var3 & 16711680)) {
                          break L15;
                        } else {
                          if (ld.field_n[var4][1] << 8 != (65280 & var3)) {
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
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var2 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var2;
            stackOut_70_1 = new StringBuilder().append("ec.B(");
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L16;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L16;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + 44 + -49 + 41);
        }
    }

    ec(qb[] param0) {
        try {
            ((ec) this).field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ec.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Join <%0>'s game";
        field_h = "This is the Book of Storm. Storm spells focus on direct attacks and powerful wind effects. You require 5 wands to purchase this spellbook; you currently have ";
        field_e = "That name is not available";
        field_b = "Game";
    }
}
