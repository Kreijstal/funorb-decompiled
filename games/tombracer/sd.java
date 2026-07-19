/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends lga {
    static int field_K;
    private nua field_I;
    static String field_J;
    private int field_F;
    private iu field_H;
    static int field_G;
    private String field_E;

    final static int a(char param0, byte param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = param2.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var4 <= var5) {
                      break L4;
                    } else {
                      var8 = param0;
                      var7 = param2.charAt(var5);
                      if (var6 != 0) {
                        if (var7 == var8) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          if (var7 == var8) {
                            var3_int++;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var5++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param1 == 93) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                field_G = 37;
                break L2;
              }
              stackOut_12_0 = var3_int;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("sd.F(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    final boolean a(ae param0, boolean param1) {
        int discarded$2 = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (!param1) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              var4 = (CharSequence) null;
              discarded$2 = sd.a('+', (byte) -127, (CharSequence) null);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("sd.S(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void a(int param0, int param1, ae param2, int param3) {
        try {
            this.field_F = this.field_F + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sd.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        it var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        iu var16 = null;
        String var17 = null;
        Object var18 = null;
        iu var19 = null;
        iu var20 = null;
        iu var21 = null;
        Object var22 = null;
        iu var23 = null;
        iu var24 = null;
        iu var25 = null;
        String var26 = null;
        Object var27 = null;
        iu var28 = null;
        iu var29 = null;
        iu var30 = null;
        Object var31 = null;
        iu var32 = null;
        iu var33 = null;
        iu var34 = null;
        String var35 = null;
        Object var36 = null;
        iu var37 = null;
        iu var42 = null;
        Object var47 = null;
        iu var48 = null;
        iu var49 = null;
        iu var50 = null;
        Object var51 = null;
        iu var52 = null;
        iu var53 = null;
        iu var54 = null;
        oaa var55 = null;
        oaa var56 = null;
        oaa var57 = null;
        oaa var58 = null;
        oaa var59 = null;
        oaa var60 = null;
        oaa var61 = null;
        var18 = null;
        var22 = null;
        var27 = null;
        var31 = null;
        var36 = null;
        var47 = null;
        var51 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        var6 = this.field_I.b(-4666);
        if (var6 != gla.field_p) {
          if (tea.field_b != var6) {
            var35 = this.field_I.a(101);
            if (var35 == null) {
              L0: {
                var5 = this.field_E;
                if (var13 == 0) {
                  break L0;
                } else {
                  var5 = ko.field_g;
                  break L0;
                }
              }
              if (var5.equals(this.field_o)) {
                L1: {
                  L2: {
                    super.a(param0, param1, param2, param3);
                    var6 = this.field_I.b(-4666);
                    var61 = (oaa) ((Object) this.field_r);
                    var9 = this.field_i + param0;
                    var10 = var61.a(param1, (ae) (this), (byte) -89) + (var61.a((ae) (this), 14157).b(param2 + -117) >> 348199105);
                    if (gla.field_p == var6) {
                      break L2;
                    } else {
                      if (var6 == tea.field_b) {
                        break L2;
                      } else {
                        L3: {
                          if (fp.field_c != var6) {
                            break L3;
                          } else {
                            var52 = pq.field_b[2];
                            var52.a(var9, -(var52.field_q >> -1089555007) + var10, 256);
                            if (var13 == 0) {
                              break L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                        if (var6 == uh.field_k) {
                          var53 = pq.field_b[1];
                          var53.a(var9, -(var53.field_q >> 1118320961) + var10, 256);
                          if (var13 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L4: {
                    var54 = pq.field_b[0];
                    var11 = var54.field_n << -1655768895;
                    var12 = var54.field_k << -219625215;
                    if (this.field_H == null) {
                      break L4;
                    } else {
                      if (this.field_H.field_m < var11) {
                        break L4;
                      } else {
                        if (var12 > this.field_H.field_q) {
                          break L4;
                        } else {
                          nm.a(this.field_H, (byte) 120);
                          bea.a();
                          if (var13 == 0) {
                            var54.a(112, 144, var54.field_n << -1762329884, var54.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                            pfa.a(1);
                            this.field_H.a(var9 - (var54.field_n >> 638308385), var10 + -var54.field_k, 256);
                            break L1;
                          } else {
                            this.field_H = new iu(var11, var12);
                            nm.a(this.field_H, (byte) 121);
                            var54.a(112, 144, var54.field_n << -1762329884, var54.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                            pfa.a(1);
                            this.field_H.a(var9 - (var54.field_n >> 638308385), var10 + -var54.field_k, 256);
                            return;
                          }
                        }
                      }
                    }
                  }
                  this.field_H = new iu(var11, var12);
                  nm.a(this.field_H, (byte) 121);
                  var54.a(112, 144, var54.field_n << -1762329884, var54.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                  pfa.a(1);
                  this.field_H.a(var9 - (var54.field_n >> 638308385), var10 + -var54.field_k, 256);
                  return;
                }
                return;
              } else {
                L5: {
                  this.field_o = var5;
                  this.b(18758);
                  super.a(param0, param1, param2, param3);
                  var6 = this.field_I.b(-4666);
                  var60 = (oaa) ((Object) this.field_r);
                  var9 = this.field_i + param0;
                  var10 = var60.a(param1, (ae) (this), (byte) -89) + (var60.a((ae) (this), 14157).b(param2 + -117) >> 348199105);
                  if (gla.field_p == var6) {
                    break L5;
                  } else {
                    if (var6 == tea.field_b) {
                      break L5;
                    } else {
                      L6: {
                        if (fp.field_c != var6) {
                          break L6;
                        } else {
                          var48 = pq.field_b[2];
                          var48.a(var9, -(var48.field_q >> -1089555007) + var10, 256);
                          if (var13 != 0) {
                            break L6;
                          } else {
                            return;
                          }
                        }
                      }
                      if (var6 == uh.field_k) {
                        var49 = pq.field_b[1];
                        var49.a(var9, -(var49.field_q >> 1118320961) + var10, 256);
                        if (var13 != 0) {
                          break L5;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                L7: {
                  var50 = pq.field_b[0];
                  var16 = var50;
                  var11 = var50.field_n << -1655768895;
                  var12 = var50.field_k << -219625215;
                  if (this.field_H == null) {
                    break L7;
                  } else {
                    if (this.field_H.field_m < var11) {
                      break L7;
                    } else {
                      if (var12 > this.field_H.field_q) {
                        break L7;
                      } else {
                        nm.a(this.field_H, (byte) 120);
                        bea.a();
                        if (var13 == 0) {
                          var50.a(112, 144, var50.field_n << -1762329884, var50.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                          pfa.a(1);
                          this.field_H.a(var9 - (var50.field_n >> 638308385), var10 + -var50.field_k, 256);
                          return;
                        } else {
                          this.field_H = new iu(var11, var12);
                          nm.a(this.field_H, (byte) 121);
                          var50.a(112, 144, var50.field_n << -1762329884, var50.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                          pfa.a(1);
                          this.field_H.a(var9 - (var50.field_n >> 638308385), var10 + -var50.field_k, 256);
                          return;
                        }
                      }
                    }
                  }
                }
                this.field_H = new iu(var11, var12);
                nm.a(this.field_H, (byte) 121);
                var50.a(112, 144, var50.field_n << -1762329884, var50.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                pfa.a(1);
                this.field_H.a(var9 - (var50.field_n >> 638308385), var10 + -var50.field_k, 256);
                return;
              }
            } else {
              L8: {
                if (var35.equals(this.field_o)) {
                  break L8;
                } else {
                  this.field_o = var35;
                  this.b(18758);
                  break L8;
                }
              }
              L9: {
                super.a(param0, param1, param2, param3);
                var6 = this.field_I.b(-4666);
                var59 = (oaa) ((Object) this.field_r);
                var9 = this.field_i + param0;
                var10 = var59.a(param1, (ae) (this), (byte) -89) + (var59.a((ae) (this), 14157).b(param2 + -117) >> 348199105);
                if (gla.field_p == var6) {
                  break L9;
                } else {
                  if (var6 == tea.field_b) {
                    break L9;
                  } else {
                    L10: {
                      if (fp.field_c != var6) {
                        break L10;
                      } else {
                        var37 = pq.field_b[2];
                        var37.a(var9, -(var37.field_q >> -1089555007) + var10, 256);
                        if (var13 != 0) {
                          break L10;
                        } else {
                          return;
                        }
                      }
                    }
                    if (var6 == uh.field_k) {
                      var42 = pq.field_b[1];
                      var42.a(var9, -(var42.field_q >> 1118320961) + var10, 256);
                      if (var13 != 0) {
                        break L9;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              var16 = pq.field_b[0];
              var11 = var16.field_n << -1655768895;
              var12 = var16.field_k << -219625215;
              if (this.field_H != null) {
                if (this.field_H.field_m >= var11) {
                  if (var12 <= this.field_H.field_q) {
                    nm.a(this.field_H, (byte) 120);
                    bea.a();
                    if (var13 == 0) {
                      var16.a(112, 144, var16.field_n << -1762329884, var16.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                      pfa.a(1);
                      this.field_H.a(var9 - (var16.field_n >> 638308385), var10 + -var16.field_k, 256);
                      return;
                    } else {
                      this.field_H = new iu(var11, var12);
                      nm.a(this.field_H, (byte) 121);
                      var16.a(112, 144, var16.field_n << -1762329884, var16.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                      pfa.a(1);
                      this.field_H.a(var9 - (var16.field_n >> 638308385), var10 + -var16.field_k, 256);
                      return;
                    }
                  } else {
                    this.field_H = new iu(var11, var12);
                    nm.a(this.field_H, (byte) 121);
                    var16.a(112, 144, var16.field_n << -1762329884, var16.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                    pfa.a(1);
                    this.field_H.a(var9 - (var16.field_n >> 638308385), var10 + -var16.field_k, 256);
                    return;
                  }
                } else {
                  this.field_H = new iu(var11, var12);
                  nm.a(this.field_H, (byte) 121);
                  var16.a(112, 144, var16.field_n << -1762329884, var16.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                  pfa.a(1);
                  this.field_H.a(var9 - (var16.field_n >> 638308385), var10 + -var16.field_k, 256);
                  return;
                }
              } else {
                this.field_H = new iu(var11, var12);
                nm.a(this.field_H, (byte) 121);
                var16.a(112, 144, var16.field_n << -1762329884, var16.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                pfa.a(1);
                this.field_H.a(var9 - (var16.field_n >> 638308385), var10 + -var16.field_k, 256);
                return;
              }
            }
          } else {
            var26 = ko.field_g;
            if (var26.equals(this.field_o)) {
              L11: {
                super.a(param0, param1, param2, param3);
                var6 = this.field_I.b(-4666);
                var58 = (oaa) ((Object) this.field_r);
                var9 = this.field_i + param0;
                var10 = var58.a(param1, (ae) (this), (byte) -89) + (var58.a((ae) (this), 14157).b(param2 + -117) >> 348199105);
                if (gla.field_p == var6) {
                  break L11;
                } else {
                  if (var6 == tea.field_b) {
                    break L11;
                  } else {
                    L12: {
                      if (fp.field_c != var6) {
                        break L12;
                      } else {
                        var32 = pq.field_b[2];
                        var32.a(var9, -(var32.field_q >> -1089555007) + var10, 256);
                        if (var13 != 0) {
                          break L12;
                        } else {
                          return;
                        }
                      }
                    }
                    if (var6 == uh.field_k) {
                      var33 = pq.field_b[1];
                      var33.a(var9, -(var33.field_q >> 1118320961) + var10, 256);
                      if (var13 != 0) {
                        break L11;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              var34 = pq.field_b[0];
              var11 = var34.field_n << -1655768895;
              var12 = var34.field_k << -219625215;
              if (this.field_H != null) {
                if (this.field_H.field_m >= var11) {
                  if (var12 <= this.field_H.field_q) {
                    nm.a(this.field_H, (byte) 120);
                    bea.a();
                    if (var13 == 0) {
                      var34.a(112, 144, var34.field_n << -1762329884, var34.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                      pfa.a(1);
                      this.field_H.a(var9 - (var34.field_n >> 638308385), var10 + -var34.field_k, 256);
                      return;
                    } else {
                      this.field_H = new iu(var11, var12);
                      nm.a(this.field_H, (byte) 121);
                      var34.a(112, 144, var34.field_n << -1762329884, var34.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                      pfa.a(1);
                      this.field_H.a(var9 - (var34.field_n >> 638308385), var10 + -var34.field_k, 256);
                      return;
                    }
                  } else {
                    this.field_H = new iu(var11, var12);
                    nm.a(this.field_H, (byte) 121);
                    var34.a(112, 144, var34.field_n << -1762329884, var34.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                    pfa.a(1);
                    this.field_H.a(var9 - (var34.field_n >> 638308385), var10 + -var34.field_k, 256);
                    return;
                  }
                } else {
                  this.field_H = new iu(var11, var12);
                  nm.a(this.field_H, (byte) 121);
                  var34.a(112, 144, var34.field_n << -1762329884, var34.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                  pfa.a(1);
                  this.field_H.a(var9 - (var34.field_n >> 638308385), var10 + -var34.field_k, 256);
                  return;
                }
              } else {
                this.field_H = new iu(var11, var12);
                nm.a(this.field_H, (byte) 121);
                var34.a(112, 144, var34.field_n << -1762329884, var34.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                pfa.a(1);
                this.field_H.a(var9 - (var34.field_n >> 638308385), var10 + -var34.field_k, 256);
                return;
              }
            } else {
              L13: {
                L14: {
                  this.field_o = var26;
                  this.b(18758);
                  super.a(param0, param1, param2, param3);
                  var6 = this.field_I.b(-4666);
                  var57 = (oaa) ((Object) this.field_r);
                  var9 = this.field_i + param0;
                  var10 = var57.a(param1, (ae) (this), (byte) -89) + (var57.a((ae) (this), 14157).b(param2 + -117) >> 348199105);
                  if (gla.field_p == var6) {
                    break L14;
                  } else {
                    if (var6 == tea.field_b) {
                      break L14;
                    } else {
                      L15: {
                        if (fp.field_c != var6) {
                          break L15;
                        } else {
                          var28 = pq.field_b[2];
                          var28.a(var9, -(var28.field_q >> -1089555007) + var10, 256);
                          if (var13 == 0) {
                            break L13;
                          } else {
                            break L15;
                          }
                        }
                      }
                      if (var6 == uh.field_k) {
                        var29 = pq.field_b[1];
                        var29.a(var9, -(var29.field_q >> 1118320961) + var10, 256);
                        if (var13 == 0) {
                          break L13;
                        } else {
                          break L14;
                        }
                      } else {
                        break L13;
                      }
                    }
                  }
                }
                L16: {
                  L17: {
                    var30 = pq.field_b[0];
                    var11 = var30.field_n << -1655768895;
                    var12 = var30.field_k << -219625215;
                    if (this.field_H == null) {
                      break L17;
                    } else {
                      if (this.field_H.field_m < var11) {
                        break L17;
                      } else {
                        if (var12 > this.field_H.field_q) {
                          break L17;
                        } else {
                          nm.a(this.field_H, (byte) 120);
                          bea.a();
                          if (var13 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                    }
                  }
                  this.field_H = new iu(var11, var12);
                  nm.a(this.field_H, (byte) 121);
                  break L16;
                }
                var30.a(112, 144, var30.field_n << -1762329884, var30.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                pfa.a(1);
                this.field_H.a(var9 - (var30.field_n >> 638308385), var10 + -var30.field_k, 256);
                break L13;
              }
              return;
            }
          }
        } else {
          var17 = ko.field_g;
          if (var17.equals(this.field_o)) {
            L18: {
              super.a(param0, param1, param2, param3);
              var6 = this.field_I.b(-4666);
              var56 = (oaa) ((Object) this.field_r);
              var9 = this.field_i + param0;
              var10 = var56.a(param1, (ae) (this), (byte) -89) + (var56.a((ae) (this), 14157).b(param2 + -117) >> 348199105);
              if (gla.field_p == var6) {
                break L18;
              } else {
                if (var6 == tea.field_b) {
                  break L18;
                } else {
                  L19: {
                    if (fp.field_c != var6) {
                      break L19;
                    } else {
                      var23 = pq.field_b[2];
                      var23.a(var9, -(var23.field_q >> -1089555007) + var10, 256);
                      if (var13 != 0) {
                        break L19;
                      } else {
                        return;
                      }
                    }
                  }
                  if (var6 == uh.field_k) {
                    var24 = pq.field_b[1];
                    var24.a(var9, -(var24.field_q >> 1118320961) + var10, 256);
                    if (var13 != 0) {
                      break L18;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            var25 = pq.field_b[0];
            var11 = var25.field_n << -1655768895;
            var12 = var25.field_k << -219625215;
            if (this.field_H != null) {
              if (this.field_H.field_m >= var11) {
                if (var12 <= this.field_H.field_q) {
                  nm.a(this.field_H, (byte) 120);
                  bea.a();
                  if (var13 != 0) {
                    this.field_H = new iu(var11, var12);
                    nm.a(this.field_H, (byte) 121);
                    var25.a(112, 144, var25.field_n << -1762329884, var25.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                    pfa.a(1);
                    this.field_H.a(var9 - (var25.field_n >> 638308385), var10 + -var25.field_k, 256);
                    return;
                  } else {
                    var25.a(112, 144, var25.field_n << -1762329884, var25.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                    pfa.a(1);
                    this.field_H.a(var9 - (var25.field_n >> 638308385), var10 + -var25.field_k, 256);
                    return;
                  }
                } else {
                  this.field_H = new iu(var11, var12);
                  nm.a(this.field_H, (byte) 121);
                  var25.a(112, 144, var25.field_n << -1762329884, var25.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                  pfa.a(1);
                  this.field_H.a(var9 - (var25.field_n >> 638308385), var10 + -var25.field_k, 256);
                  return;
                }
              } else {
                this.field_H = new iu(var11, var12);
                nm.a(this.field_H, (byte) 121);
                var25.a(112, 144, var25.field_n << -1762329884, var25.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                pfa.a(1);
                this.field_H.a(var9 - (var25.field_n >> 638308385), var10 + -var25.field_k, 256);
                return;
              }
            } else {
              this.field_H = new iu(var11, var12);
              nm.a(this.field_H, (byte) 121);
              var25.a(112, 144, var25.field_n << -1762329884, var25.field_k << 1103091652, -this.field_F << -1397251222, 4096);
              pfa.a(1);
              this.field_H.a(var9 - (var25.field_n >> 638308385), var10 + -var25.field_k, 256);
              return;
            }
          } else {
            L20: {
              L21: {
                this.field_o = var17;
                this.b(18758);
                super.a(param0, param1, param2, param3);
                var6 = this.field_I.b(-4666);
                var55 = (oaa) ((Object) this.field_r);
                var9 = this.field_i + param0;
                var10 = var55.a(param1, (ae) (this), (byte) -89) + (var55.a((ae) (this), 14157).b(param2 + -117) >> 348199105);
                if (gla.field_p == var6) {
                  break L21;
                } else {
                  if (var6 == tea.field_b) {
                    break L21;
                  } else {
                    L22: {
                      if (fp.field_c != var6) {
                        break L22;
                      } else {
                        var19 = pq.field_b[2];
                        var19.a(var9, -(var19.field_q >> -1089555007) + var10, 256);
                        if (var13 == 0) {
                          break L20;
                        } else {
                          break L22;
                        }
                      }
                    }
                    if (var6 == uh.field_k) {
                      var20 = pq.field_b[1];
                      var20.a(var9, -(var20.field_q >> 1118320961) + var10, 256);
                      if (var13 == 0) {
                        break L20;
                      } else {
                        break L21;
                      }
                    } else {
                      break L20;
                    }
                  }
                }
              }
              L23: {
                L24: {
                  var21 = pq.field_b[0];
                  var11 = var21.field_n << -1655768895;
                  var12 = var21.field_k << -219625215;
                  if (this.field_H == null) {
                    break L24;
                  } else {
                    if (this.field_H.field_m < var11) {
                      break L24;
                    } else {
                      if (var12 > this.field_H.field_q) {
                        break L24;
                      } else {
                        nm.a(this.field_H, (byte) 120);
                        bea.a();
                        if (var13 == 0) {
                          break L23;
                        } else {
                          break L24;
                        }
                      }
                    }
                  }
                }
                this.field_H = new iu(var11, var12);
                nm.a(this.field_H, (byte) 121);
                break L23;
              }
              var21.a(112, 144, var21.field_n << -1762329884, var21.field_k << 1103091652, -this.field_F << -1397251222, 4096);
              pfa.a(1);
              this.field_H.a(var9 - (var21.field_n >> 638308385), var10 + -var21.field_k, 256);
              break L20;
            }
            return;
          }
        }
    }

    sd(nua param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, nk.a(-21819));
        try {
            this.field_I = param0;
            this.field_E = param1;
            this.a((byte) -31, param4, param5, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void g(byte param0) {
        if (param0 != 10) {
            field_J = (String) null;
            field_J = null;
            return;
        }
        field_J = null;
    }

    final String d(byte param0) {
        int var2 = -89 / ((param0 - -58) / 60);
        return null;
    }

    static {
        field_J = "ESC - cancel this line";
    }
}
