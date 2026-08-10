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
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        wl var5 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3_int = param1.d((byte) -88);
              if (var3_int != 0) {
                this.a(var3_int, param0 ^ 2598, param1);
                continue L1;
              } else {
                L2: {
                  if (param0 == 80) {
                    break L2;
                  } else {
                    var5 = (wl) null;
                    this.a((byte) 71, (wl) null);
                    break L2;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("me.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final String f(byte param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = client.field_A ? 1 : 0;
        StringBuilder var6 = new StringBuilder(80);
        StringBuilder var2 = var6;
        if (param0 > -57) {
            wl var5 = (wl) null;
            this.a((byte) 104, (wl) null);
        }
        if (null == this.field_H) {
            return "";
        }
        StringBuilder discarded$0 = var6.append(this.field_H[0]);
        for (var3 = 1; this.field_H.length > var3; var3++) {
            discarded$1 = var2.append("...");
            discarded$2 = var6.append(this.field_H[var3]);
        }
        return var2.toString();
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = client.field_A ? 1 : 0;
        if (param0 != 19423) {
            me.c(-120);
        }
        if (!(this.field_F == null)) {
            for (var2 = 0; var2 < this.field_F.length; var2++) {
                this.field_F[var2] = de.b(this.field_F[var2], 32768);
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
        int[] array$0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        qm var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param1 == 2678) {
              L1: {
                if ((param0 ^ -1) == -2) {
                  this.field_H = ji.a('<', (byte) 66, param2.c((byte) -38));
                  break L1;
                } else {
                  L2: {
                    if (param0 == 2) {
                      var4_int = param2.d((byte) -86);
                      this.field_F = new int[var4_int];
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var4_int) {
                          break L2;
                        } else {
                          this.field_F[var5] = param2.e(3);
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      if (param0 == 3) {
                        var4_int = param2.d((byte) -89);
                        this.field_D = new int[var4_int][];
                        this.field_A = new int[var4_int];
                        var5 = 0;
                        L4: while (true) {
                          if (var4_int <= var5) {
                            break L2;
                          } else {
                            L5: {
                              var6 = param2.e(3);
                              var7 = je.a(-121, var6);
                              if (var7 == null) {
                                break L5;
                              } else {
                                this.field_A[var5] = var6;
                                array$0 = new int[var7.field_f];
                                this.field_D[var5] = array$0;
                                var8 = 0;
                                L6: while (true) {
                                  if (var8 >= var7.field_f) {
                                    break L5;
                                  } else {
                                    this.field_D[var5][var8] = param2.e(qm.b(param1, 2677));
                                    var8++;
                                    continue L6;
                                  }
                                }
                              }
                            }
                            var5++;
                            continue L4;
                          }
                        }
                      } else {
                        if (param0 != 4) {
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
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
          L7: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("me.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            int var4 = 0;
            java.net.URL var5 = null;
            try {
              L0: {
                try {
                  L1: {
                    var5 = param1.getCodeBase();
                    var3 = gn.a(var5, -1, param1).getFile();
                    nc.a("updatelinks", -14541, param1, new Object[]{"home", var3 + "home.ws"});
                    var4 = -128 / ((param0 - 10) / 61);
                    nc.a("updatelinks", -14541, param1, new Object[]{"gamelist", var3 + "togamelist.ws"});
                    nc.a("updatelinks", -14541, param1, new Object[]{"serverlist", var3 + "toserverlist.ws"});
                    nc.a("updatelinks", -14541, param1, new Object[]{"options", var3 + "options.ws"});
                    nc.a("updatelinks", -14541, param1, new Object[]{"terms", var3 + "terms.ws"});
                    nc.a("updatelinks", -14541, param1, new Object[]{"privacy", var3 + "privacy.ws"});
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2 = decompiledCaughtException;
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_6_0 = (RuntimeException) (var2_ref);

                stackIn_6_1 = new StringBuilder().append("me.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "null";
                  break L3;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "{...}";
                  break L3;
                }
              }
              throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
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
        ck stackIn_60_0 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ck var11 = null;
        ck var12 = null;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            param0.b();
            var11 = new ck(36, 36);
            var12 = var11;
            var5 = 0;
            L1: while (true) {
              if (-19 >= (var5 ^ -1)) {
                var5 = 0;
                L2: while (true) {
                  if (var5 >= 17) {
                    L3: {
                      if (!param1) {
                        break L3;
                      } else {
                        var5 = 0;
                        L4: while (true) {
                          if (-37 >= (var5 ^ -1)) {
                            break L3;
                          } else {
                            L5: {
                              L6: {
                                var6 = var11.field_D[1224 - -var5];
                                var7 = var11.field_D[var5];
                                var8 = (8355711 & var6 >> -1625883615) + ((16711423 & var7) >> 622570241);
                                if (((var7 | var6) ^ -1) <= -16777217) {
                                  break L6;
                                } else {
                                  L7: {
                                    if ((var6 & 16777215) == 0) {
                                      break L7;
                                    } else {
                                      if (-1 != (16777215 & var7 ^ -1)) {
                                        break L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  var8 = 0;
                                  break L5;
                                }
                              }
                              if (var8 != 0) {
                                break L5;
                              } else {
                                var8 = 1;
                                break L5;
                              }
                            }
                            var12.field_D[36 + var5 + 1224] = var8;
                            var5++;
                            continue L4;
                          }
                        }
                      }
                    }
                    var5 = 0;
                    L8: while (true) {
                      if (-19 >= (var5 ^ -1)) {
                        var5 = 23 % ((59 - param2) / 42);
                        stackIn_60_0 = (ck) (var12);
                        break L0;
                      } else {
                        var6 = 0;
                        L9: while (true) {
                          if ((var6 ^ -1) <= -37) {
                            var5++;
                            continue L8;
                          } else {
                            var7 = var12.field_D[72 * var5 - -var6];
                            var7 = var7 & 16777215;
                            var12.field_D[var6 + 72 * var5] = var7;
                            var6++;
                            continue L9;
                          }
                        }
                      }
                    }
                  } else {
                    var6 = 0;
                    L10: while (true) {
                      if (-37 >= (var6 ^ -1)) {
                        var5++;
                        continue L2;
                      } else {
                        L11: {
                          L12: {
                            var7 = var12.field_D[var6 + var5 * 72];
                            var8 = var12.field_D[var6 + (var5 * 72 + 72)];
                            var9 = ((var8 & 16711423) >> 2082759745) + ((16711423 & var7) >> -1478008351);
                            if (((var7 | var8) ^ -1) <= -16777217) {
                              break L12;
                            } else {
                              L13: {
                                if ((16777215 & var7) == 0) {
                                  break L13;
                                } else {
                                  if ((16777215 & var8) != 0) {
                                    break L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              var9 = 0;
                              break L11;
                            }
                          }
                          if (var9 != 0) {
                            break L11;
                          } else {
                            var9 = 1;
                            break L11;
                          }
                        }
                        var12.field_D[36 + (var6 + 72 * var5)] = var9;
                        var6++;
                        continue L10;
                      }
                    }
                  }
                }
              } else {
                var6 = 0;
                L14: while (true) {
                  if ((var6 ^ -1) <= -19) {
                    var6 = 0;
                    L15: while (true) {
                      if (-18 >= (var6 ^ -1)) {
                        L16: {
                          if (param3) {
                            L17: {
                              var6 = var12.field_D[34 + 72 * var5];
                              var7 = var11.field_D[72 * var5];
                              var8 = ((16711422 & var6) >> -1241284703) + ((var7 & 16711423) >> 395104033);
                              if (var8 != 0) {
                                break L17;
                              } else {
                                if ((var7 | var6) == 0) {
                                  break L17;
                                } else {
                                  var8 = 1;
                                  break L17;
                                }
                              }
                            }
                            L18: {
                              if (var6 == 0) {
                                break L18;
                              } else {
                                if (0 == var7) {
                                  break L18;
                                } else {
                                  var8 = var8 + 16777216;
                                  break L18;
                                }
                              }
                            }
                            var12.field_D[34 + (var5 * 72 + 1)] = var8;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        var5++;
                        continue L1;
                      } else {
                        L19: {
                          var7 = var12.field_D[var6 * 2 + 72 * var5];
                          var8 = var12.field_D[2 + var6 * 2 + var5 * 72];
                          var9 = ((var8 & 16711423) >> -860505119) + ((16711423 & var7) >> 1709048353);
                          if (-1 != (var9 ^ -1)) {
                            break L19;
                          } else {
                            if ((var8 | var7) != 0) {
                              var9 = 1;
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                        }
                        L20: {
                          if (-1 == (var7 ^ -1)) {
                            break L20;
                          } else {
                            if (var8 != 0) {
                              var9 = var9 + 16777216;
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                        }
                        var12.field_D[1 + var5 * 72 - -(var6 * 2)] = var9;
                        var6++;
                        continue L15;
                      }
                    }
                  } else {
                    L21: {
                      var7 = param0.field_D[var5 * 18 - -var6];
                      if (-1 == (var7 ^ -1)) {
                        break L21;
                      } else {
                        var7 = var7 + 16777216;
                        break L21;
                      }
                    }
                    var12.field_D[var5 * 72 + 2 * var6] = var7;
                    var6++;
                    continue L14;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var4 = decompiledCaughtException;
            stackIn_63_0 = (RuntimeException) (var4);

            stackIn_63_1 = new StringBuilder().append("me.D(");

            if (param0 == null) {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "null";
              break L22;
            } else {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "{...}";
              break L22;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_64_0), stackIn_64_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_60_0;
    }

    static {
        field_B = "Orb coins: ";
        field_G = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_C = "Members";
        field_J = new pi(0, 0, 0);
        field_y = 9;
        field_I = new int[8];
    }
}
