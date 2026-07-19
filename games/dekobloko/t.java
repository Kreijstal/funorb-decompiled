/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class t extends bl {
    private int field_db;
    private int field_gb;
    private int field_eb;
    static String field_bb;
    static String field_ib;
    private int field_jb;
    static String[] field_cb;
    private int field_hb;
    private int field_fb;

    boolean h(byte param0) {
        int fieldTemp$2 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (-1 <= (this.field_hb ^ -1)) {
            break L0;
          } else {
            L1: {
              L2: {
                var2 = this.field_jb;
                var3 = this.field_gb;
                fieldTemp$2 = this.field_eb + 1;
                this.field_eb = this.field_eb + 1;
                if (this.field_hb > fieldTemp$2) {
                  break L2;
                } else {
                  this.field_hb = 0;
                  this.j((byte) -52);
                  if (!client.field_A) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var4 = (-this.field_eb + 2 * this.field_hb) * this.field_eb;
              var5 = this.field_hb * this.field_hb;
              var2 = var4 * (this.field_jb + -this.field_db) / var5 + this.field_db;
              var3 = this.field_fb + var4 * (-this.field_fb + this.field_gb) / var5;
              break L1;
            }
            this.a(110, var2, var3);
            break L0;
          }
        }
        if (param0 >= 15) {
          return super.h((byte) 90);
        } else {
          return true;
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param3 != 194) {
            this.b(35, 121, -128, 19);
        }
        if (param1 <= 0) {
            this.a(121, param0, param2);
            return;
        }
        this.field_hb = param1;
        this.field_gb = param2;
        this.field_db = this.field_t;
        this.field_fb = this.field_y;
        this.field_jb = param0;
        this.field_eb = 0;
    }

    final static void k(byte param0) {
        if (param0 != -73) {
            return;
        }
        de.field_W.c(new lg(), (byte) 121);
    }

    void j(int param0) {
        if (!(this.field_hb > 0)) {
            return;
        }
        this.a(112, this.field_jb, this.field_gb);
        this.field_hb = 0;
        this.j((byte) -32);
        int var2 = 40 % ((param0 - -15) / 49);
    }

    final static boolean i(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 124) {
            break L0;
          } else {
            field_bb = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (-11 < (hc.field_d ^ -1)) {
              break L2;
            } else {
              if (-14 < (ca.field_vb ^ -1)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    t(ka param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_eb = 0;
        this.field_hb = 0;
    }

    boolean f(byte param0) {
        this.j(38);
        if (param0 < 77) {
            field_bb = (String) null;
        }
        return super.f((byte) 125);
    }

    void j(byte param0) {
        int var2 = -128 % ((param0 - 30) / 39);
    }

    final static void a(int param0, boolean param1) {
        if (param0 < 104) {
            return;
        }
        uc.a(true, param1, 54);
    }

    void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
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
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        var16 = client.field_A ? 1 : 0;
        if (param0 <= -127) {
          hk.d(6 + param2, 35 + param1, -12 + this.field_t, this.field_y - 40, 2105376, 0);
          var5 = 211;
          var4 = 35;
          var6 = 194;
          var7 = 0;
          var8 = param1;
          L0: while (true) {
            L1: {
              L2: {
                if ((var4 ^ -1) >= (var7 ^ -1)) {
                  break L2;
                } else {
                  stackOut_4_0 = hk.field_h;
                  stackOut_4_1 = var8;
                  stackIn_38_0 = stackOut_4_0;
                  stackIn_38_1 = stackOut_4_1;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  if (var16 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_5_0 > stackIn_5_1) {
                        break L3;
                      } else {
                        if ((hk.field_b ^ -1) >= (var8 ^ -1)) {
                          break L3;
                        } else {
                          L4: {
                            L5: {
                              var9 = var5 - -((-var5 + var6) * var7 / var4);
                              var10 = 0;
                              var11 = this.field_t;
                              if (20 >= var7) {
                                L6: while (true) {
                                  if ((var10 ^ -1) < -21) {
                                    break L5;
                                  } else {
                                    var12 = (20 + -var7) * (-var7 + 20) - -((-var10 + 20) * (20 + -var10));
                                    stackOut_10_0 = 462;
                                    stackOut_10_1 = var12;
                                    stackIn_20_0 = stackOut_10_0;
                                    stackIn_20_1 = stackOut_10_1;
                                    stackIn_11_0 = stackOut_10_0;
                                    stackIn_11_1 = stackOut_10_1;
                                    if (var16 != 0) {
                                      break L4;
                                    } else {
                                      L7: {
                                        L8: {
                                          if (stackIn_11_0 >= stackIn_11_1) {
                                            break L8;
                                          } else {
                                            if (var16 == 0) {
                                              break L7;
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                        L9: {
                                          if ((var12 ^ -1) <= -421) {
                                            break L9;
                                          } else {
                                            if (var16 == 0) {
                                              break L5;
                                            } else {
                                              break L9;
                                            }
                                          }
                                        }
                                        var13 = (-var12 + 462) * var9 / 42;
                                        var13 = var13 | (var13 << 1261671240 | var13 << 720680144);
                                        hk.field_l[hk.field_j * var8 - -param2 - -var10] = var13;
                                        break L7;
                                      }
                                      var10++;
                                      if (var16 == 0) {
                                        continue L6;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L5;
                              }
                            }
                            stackOut_19_0 = -21;
                            stackOut_19_1 = var7 ^ -1;
                            stackIn_20_0 = stackOut_19_0;
                            stackIn_20_1 = stackOut_19_1;
                            break L4;
                          }
                          L10: {
                            L11: {
                              if (stackIn_20_0 <= stackIn_20_1) {
                                var12 = var11;
                                var11 -= 21;
                                var13 = 0;
                                L12: while (true) {
                                  L13: {
                                    if (20 < var13) {
                                      break L13;
                                    } else {
                                      var14 = (-var7 + 20) * (20 + -var7) + var13 * var13;
                                      stackOut_24_0 = -463;
                                      stackOut_24_1 = var14 ^ -1;
                                      stackIn_35_0 = stackOut_24_0;
                                      stackIn_35_1 = stackOut_24_1;
                                      stackIn_25_0 = stackOut_24_0;
                                      stackIn_25_1 = stackOut_24_1;
                                      if (var16 != 0) {
                                        break L10;
                                      } else {
                                        L14: {
                                          if (stackIn_25_0 <= stackIn_25_1) {
                                            break L14;
                                          } else {
                                            if (var16 == 0) {
                                              break L13;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                        L15: {
                                          L16: {
                                            if (420 > var14) {
                                              var12 = var11 - -1;
                                              if (var16 == 0) {
                                                break L15;
                                              } else {
                                                break L16;
                                              }
                                            } else {
                                              break L16;
                                            }
                                          }
                                          var15 = (462 - var14) * var9 / 42;
                                          var15 = var15 | (var15 << -1614545976 | var15 << -192934416);
                                          hk.field_l[param2 + var8 * hk.field_j + var11] = var15;
                                          break L15;
                                        }
                                        var13++;
                                        var11++;
                                        if (var16 == 0) {
                                          continue L12;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                  }
                                  var11 = var12;
                                  break L11;
                                }
                              } else {
                                break L11;
                              }
                            }
                            var9 = var9 | (var9 << -1835908592 | var9 << -1970200856);
                            stackOut_34_0 = var10 + param2;
                            stackOut_34_1 = var8;
                            stackIn_35_0 = stackOut_34_0;
                            stackIn_35_1 = stackOut_34_1;
                            break L10;
                          }
                          hk.a(stackIn_35_0, stackIn_35_1, -var10 + var11, var9);
                          break L3;
                        }
                      }
                    }
                    var7++;
                    var8++;
                    if (var16 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var6 = 169;
              var4 = 22;
              var5 = 194;
              var7 = 0;
              stackOut_37_0 = param1;
              stackOut_37_1 = -35;
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              break L1;
            }
            var8 = stackIn_38_0 - stackIn_38_1;
            L17: while (true) {
              L18: {
                L19: {
                  if (var7 >= var4) {
                    break L19;
                  } else {
                    var9 = (-var5 + var6) * var7 / var4 + var5;
                    var9 = var9 | (var9 << -1910141936 | var9 << -1313540568);
                    hk.a(param2, var8, 6, var9);
                    hk.a(param2 + this.field_t + -6, var8, 6, var9);
                    var7++;
                    var8++;
                    if (var16 != 0) {
                      break L18;
                    } else {
                      if (var16 == 0) {
                        continue L17;
                      } else {
                        break L19;
                      }
                    }
                  }
                }
                jm.field_q.c(-90 + (param2 - -this.field_t), 10 + param1);
                ng.a(c.field_m, -10 + this.field_t, param1 + 35, -1, 5 + param2);
                ng.a(g.field_O, this.field_t, param1 + (this.field_y + -22), -1, param2);
                var4 = this.field_y + -79;
                var5 = 169;
                var6 = 127;
                var7 = 0;
                break L18;
              }
              var8 = 57 + param1;
              L20: while (true) {
                L21: {
                  if (var7 >= var4) {
                    break L21;
                  } else {
                    var9 = var5 - -(var7 * (var6 + -var5) / var4);
                    var9 = var9 | (var9 << 23526640 | var9 << 495246472);
                    hk.a(param2, var8, 6, var9);
                    hk.a(-6 + (this.field_t + param2), var8, 6, var9);
                    var8++;
                    var7++;
                    if (var16 != 0) {
                      break L21;
                    } else {
                      if (var16 == 0) {
                        continue L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final static pi[] a(String param0, ji param1, boolean param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        pi[] stackIn_2_0 = null;
        pi[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        pi[] stackOut_3_0 = null;
        pi[] stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!param2) {
              var4_int = param1.b(-1, param3);
              var5 = param1.a(var4_int, 13030, param0);
              stackOut_3_0 = on.a(var5, (byte) 37, var4_int, param1);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (pi[]) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("t.MA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void l(byte param0) {
        pi[] discarded$0 = null;
        field_bb = null;
        field_ib = null;
        if (param0 != 94) {
            discarded$0 = t.a((String) null, (ji) null, true, (String) null);
        }
        field_cb = null;
    }

    final static hm k(int param0) {
        try {
            Throwable var1 = null;
            hm stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            hm stackOut_2_0 = null;
            if (param0 == -22) {
              try {
                L0: {
                  stackOut_2_0 = (hm) (Class.forName("ag").newInstance());
                  stackIn_3_0 = stackOut_2_0;
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = decompiledCaughtException;
                return null;
              }
              return stackIn_3_0;
            } else {
              return (hm) null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_bb = "Matching Score: ";
        field_ib = "Animals";
        field_cb = new String[255];
    }
}
