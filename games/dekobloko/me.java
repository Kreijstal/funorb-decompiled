/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends be {
    int[] field_F;
    static long field_E;
    static String field_C;
    static String field_B;
    static pi field_J;
    private String[] field_H;
    private int[][] field_D;
    static String field_G;
    private int[] field_A;
    static int field_y;
    static jk field_z;
    static int[] field_I;

    final void a(byte param0, wl param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = client.field_A ? 1 : 0;
        L0: while (true) {
          var3 = param1.d((byte) -88);
          if (var3 != 0) {
            this.a(var3, param0 ^ 2598, param1);
            continue L0;
          } else {
            L1: {
              if (param0 == 80) {
                break L1;
              } else {
                var5 = null;
                ((me) this).a((byte) 71, (wl) null);
                break L1;
              }
            }
            return;
          }
        }
    }

    final String f(byte param0) {
        int var3 = 0;
        int var4 = client.field_A ? 1 : 0;
        StringBuilder var6 = new StringBuilder(80);
        StringBuilder var2 = var6;
        if (param0 > -57) {
            Object var5 = null;
            ((me) this).a((byte) 104, (wl) null);
        }
        if (null == ((me) this).field_H) {
            return "";
        }
        StringBuilder discarded$0 = var6.append(((me) this).field_H[0]);
        for (var3 = 1; ((me) this).field_H.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var6.append(((me) this).field_H[var3]);
        }
        return var2.toString();
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = client.field_A ? 1 : 0;
        if (param0 != 19423) {
            me.c(-120);
        }
        if (!(((me) this).field_F == null)) {
            for (var2 = 0; var2 < ((me) this).field_F.length; var2++) {
                ((me) this).field_F[var2] = de.b(((me) this).field_F[var2], 32768);
            }
        }
    }

    public static void c(int param0) {
        field_z = null;
        field_G = null;
        field_B = null;
        field_C = null;
        field_J = null;
        field_I = null;
        if (param0 != 0) {
            field_y = 75;
        }
    }

    private final void a(int param0, int param1, wl param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        qm var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = client.field_A ? 1 : 0;
        if (param1 == 2678) {
          L0: {
            if ((param0 ^ -1) == -2) {
              ((me) this).field_H = ji.a('<', (byte) 66, param2.c((byte) -38));
              break L0;
            } else {
              if (param0 == 2) {
                var4 = param2.d((byte) -86);
                ((me) this).field_F = new int[var4];
                var5 = 0;
                L1: while (true) {
                  if (var5 >= var4) {
                    break L0;
                  } else {
                    ((me) this).field_F[var5] = param2.e(3);
                    var5++;
                    continue L1;
                  }
                }
              } else {
                if (param0 == 3) {
                  var4 = param2.d((byte) -89);
                  ((me) this).field_D = new int[var4][];
                  ((me) this).field_A = new int[var4];
                  var5 = 0;
                  L2: while (true) {
                    if (var4 <= var5) {
                      break L0;
                    } else {
                      var6 = param2.e(3);
                      var7 = je.a(-121, var6);
                      if (var7 != null) {
                        ((me) this).field_A[var5] = var6;
                        ((me) this).field_D[var5] = new int[var7.field_f];
                        var8 = 0;
                        L3: while (true) {
                          if (var8 < var7.field_f) {
                            ((me) this).field_D[var5][var8] = param2.e(qm.b(param1, 2677));
                            var8++;
                            continue L3;
                          } else {
                            var5++;
                            continue L2;
                          }
                        }
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  if (param0 != 4) {
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            int var4 = 0;
            java.net.URL var5 = null;
            Throwable decompiledCaughtException = null;
            try {
              var5 = param1.getCodeBase();
              var3 = gn.a(var5, -1, param1).getFile();
              Object discarded$6 = nc.a("updatelinks", -14541, param1, new Object[2]);
              var4 = -128 / ((param0 - 10) / 61);
              Object discarded$7 = nc.a("updatelinks", -14541, param1, new Object[2]);
              Object discarded$8 = nc.a("updatelinks", -14541, param1, new Object[2]);
              Object discarded$9 = nc.a("updatelinks", -14541, param1, new Object[2]);
              Object discarded$10 = nc.a("updatelinks", -14541, param1, new Object[2]);
              Object discarded$11 = nc.a("updatelinks", -14541, param1, new Object[2]);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    me() {
    }

    final static ck a(ck param0, boolean param1, byte param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ck var11 = null;
        ck var12 = null;
        var10 = client.field_A ? 1 : 0;
        param0.b();
        var11 = new ck(36, 36);
        var12 = var11;
        var5 = 0;
        L0: while (true) {
          if (-19 >= (var5 ^ -1)) {
            var5 = 0;
            L1: while (true) {
              if (var5 >= 17) {
                L2: {
                  if (!param1) {
                    break L2;
                  } else {
                    var5 = 0;
                    L3: while (true) {
                      if (-37 >= (var5 ^ -1)) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            var6 = var11.field_D[1224 - -var5];
                            var7 = var11.field_D[var5];
                            var8 = (8355711 & var6 >> -1625883615) + ((16711423 & var7) >> 622570241);
                            if (((var7 | var6) ^ -1) <= -16777217) {
                              break L5;
                            } else {
                              L6: {
                                if ((var6 & 16777215) == -1) {
                                  break L6;
                                } else {
                                  if (-1 != (16777215 & var7)) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var8 = 0;
                              break L4;
                            }
                          }
                          if (var8 != 0) {
                            break L4;
                          } else {
                            var8 = 1;
                            break L4;
                          }
                        }
                        var12.field_D[36 + var5 + 1224] = var8;
                        var5++;
                        continue L3;
                      }
                    }
                  }
                }
                var5 = 0;
                L7: while (true) {
                  if (-19 >= (var5 ^ -1)) {
                    var5 = 23 % ((59 - param2) / 42);
                    return var12;
                  } else {
                    var6 = 0;
                    L8: while (true) {
                      if ((var6 ^ -1) <= -37) {
                        var5++;
                        continue L7;
                      } else {
                        var7 = var12.field_D[72 * var5 - -var6];
                        var7 = var7 & 16777215;
                        var12.field_D[var6 + 72 * var5] = var7;
                        var6++;
                        continue L8;
                      }
                    }
                  }
                }
              } else {
                var6 = 0;
                L9: while (true) {
                  if (-37 >= (var6 ^ -1)) {
                    var5++;
                    continue L1;
                  } else {
                    L10: {
                      L11: {
                        var7 = var12.field_D[var6 + var5 * 72];
                        var8 = var12.field_D[var6 + (var5 * 72 + 72)];
                        var9 = ((var8 & 16711423) >> 2082759745) + ((16711423 & var7) >> -1478008351);
                        if (((var7 | var8) ^ -1) <= -16777217) {
                          break L11;
                        } else {
                          L12: {
                            if ((16777215 & var7) == 0) {
                              break L12;
                            } else {
                              if ((16777215 & var8) != 0) {
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                          var9 = 0;
                          break L10;
                        }
                      }
                      if (var9 != 0) {
                        break L10;
                      } else {
                        var9 = 1;
                        break L10;
                      }
                    }
                    var12.field_D[36 + (var6 + 72 * var5)] = var9;
                    var6++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            var6 = 0;
            L13: while (true) {
              if (var6 <= -19) {
                var6 = 0;
                L14: while (true) {
                  if (-18 >= (var6 ^ -1)) {
                    if (param3) {
                      L15: {
                        var6 = var12.field_D[34 + 72 * var5];
                        var7 = var11.field_D[72 * var5];
                        var8 = ((16711422 & var6) >> -1241284703) + ((var7 & 16711423) >> 395104033);
                        if (var8 != 0) {
                          break L15;
                        } else {
                          if ((var7 | var6) == 0) {
                            break L15;
                          } else {
                            var8 = 1;
                            break L15;
                          }
                        }
                      }
                      L16: {
                        if (var6 == 0) {
                          break L16;
                        } else {
                          if (0 == var7) {
                            break L16;
                          } else {
                            var8 = var8 + 16777216;
                            break L16;
                          }
                        }
                      }
                      var12.field_D[34 + (var5 * 72 + 1)] = var8;
                      var5++;
                      continue L0;
                    } else {
                      var5++;
                      continue L0;
                    }
                  } else {
                    L17: {
                      var7 = var12.field_D[var6 * 2 + 72 * var5];
                      var8 = var12.field_D[2 + var6 * 2 + var5 * 72];
                      var9 = ((var8 & 16711423) >> -860505119) + ((16711423 & var7) >> 1709048353);
                      if (-1 != (var9 ^ -1)) {
                        break L17;
                      } else {
                        if ((var8 | var7) != -1) {
                          var9 = 1;
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                    }
                    L18: {
                      if (-1 == var7) {
                        break L18;
                      } else {
                        if (var8 != 0) {
                          var9 = var9 + 16777216;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                    }
                    var12.field_D[1 + var5 * 72 - -(var6 * 2)] = var9;
                    var6++;
                    continue L14;
                  }
                }
              } else {
                L19: {
                  var7 = param0.field_D[var5 * 18 - -var6];
                  if (-1 == var7) {
                    break L19;
                  } else {
                    var7 = var7 + 16777216;
                    break L19;
                  }
                }
                var12.field_D[var5 * 72 + 2 * var6] = var7;
                var6++;
                continue L13;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Orb coins: ";
        field_G = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_C = "Members";
        field_J = new pi(0, 0, 0);
        field_y = 9;
        field_I = new int[8];
    }
}
