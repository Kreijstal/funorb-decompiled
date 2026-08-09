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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = param2.length();
            var5 = 0;
            L1: while (true) {
              if (var4 <= var5) {
                L2: {
                  if (param1 == 93) {
                    break L2;
                  } else {
                    field_G = 37;
                    break L2;
                  }
                }
                stackIn_11_0 = var3_int;
                break L0;
              } else {
                L3: {
                  if (param2.charAt(var5) == param0) {
                    var3_int++;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("sd.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        return stackIn_11_0;
    }

    final boolean a(ae param0, boolean param1) {
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              var4 = (CharSequence) null;
              sd.a('+', (byte) -127, (CharSequence) null);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("sd.S(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
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
        it var6;
        int var9;
        int var10;
        int var13;
        String var17;
        Object var18;
        iu var19;
        iu var20;
        Object var22;
        Object var27;
        Object var31;
        Object var36;
        Object var40;
        Object var44;
        Object var50;
        oaa var54;
        String var5;
        int var11;
        int var12;
        iu var16;
        iu var21;
        iu var23;
        iu var24;
        iu var25;
        String var26;
        iu var28;
        iu var29;
        iu var30;
        iu var32;
        iu var33;
        iu var34;
        String var35;
        iu var37;
        iu var38;
        iu var39;
        iu var41;
        iu var42;
        iu var43;
        iu var45;
        iu var46;
        iu var47;
        iu var51;
        iu var52;
        iu var53;
        oaa var55;
        oaa var56;
        oaa var57;
        oaa var58;
        oaa var59;
        oaa var60;
        oaa var61;
        var18 = null;
        var22 = null;
        var27 = null;
        var31 = null;
        var36 = null;
        var40 = null;
        var44 = null;
        var50 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        var6 = this.field_I.b(-4666);
        if (var6 != gla.field_p) {
          if (tea.field_b != var6) {
            var5 = this.field_I.a(101);
            if (var5 == null) {
              var35 = this.field_E;
              var5 = var35;
              if (var35.equals(this.field_o)) {
                L0: {
                  super.a(param0, param1, param2, param3);
                  var6 = this.field_I.b(-4666);
                  var59 = (oaa) ((Object) this.field_r);
                  var9 = this.field_i + param0;
                  var10 = var59.a(param1, (ae) (this), (byte) -89) + (var59.a((ae) (this), 14157).b(param2 + -117) >> 348199105);
                  if (gla.field_p == var6) {
                    break L0;
                  } else {
                    if (var6 == tea.field_b) {
                      break L0;
                    } else {
                      if (fp.field_c != var6) {
                        if (var6 == uh.field_k) {
                          var42 = pq.field_b[1];
                          var42.a(var9, -(var42.field_q >> 1118320961) + var10, 256);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        var41 = pq.field_b[2];
                        var41.a(var9, -(var41.field_q >> -1089555007) + var10, 256);
                        return;
                      }
                    }
                  }
                }
                var43 = pq.field_b[0];
                var11 = var43.field_n << -1655768895;
                var12 = var43.field_k << -219625215;
                if (this.field_H != null) {
                  if (this.field_H.field_m >= var11) {
                    if (var12 > this.field_H.field_q) {
                      this.field_H = new iu(var11, var12);
                      nm.a(this.field_H, (byte) 121);
                      var43.a(112, 144, var43.field_n << -1762329884, var43.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                      pfa.a(1);
                      this.field_H.a(var9 - (var43.field_n >> 638308385), var10 + -var43.field_k, 256);
                      return;
                    } else {
                      nm.a(this.field_H, (byte) 120);
                      bea.a();
                      var43.a(112, 144, var43.field_n << -1762329884, var43.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                      pfa.a(1);
                      this.field_H.a(var9 - (var43.field_n >> 638308385), var10 + -var43.field_k, 256);
                      return;
                    }
                  } else {
                    this.field_H = new iu(var11, var12);
                    nm.a(this.field_H, (byte) 121);
                    var43.a(112, 144, var43.field_n << -1762329884, var43.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                    pfa.a(1);
                    this.field_H.a(var9 - (var43.field_n >> 638308385), var10 + -var43.field_k, 256);
                    return;
                  }
                } else {
                  this.field_H = new iu(var11, var12);
                  nm.a(this.field_H, (byte) 121);
                  var43.a(112, 144, var43.field_n << -1762329884, var43.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                  pfa.a(1);
                  this.field_H.a(var9 - (var43.field_n >> 638308385), var10 + -var43.field_k, 256);
                  return;
                }
              } else {
                L1: {
                  L2: {
                    this.field_o = var35;
                    this.b(18758);
                    super.a(param0, param1, param2, param3);
                    var6 = this.field_I.b(-4666);
                    var58 = (oaa) ((Object) this.field_r);
                    var9 = this.field_i + param0;
                    var10 = var58.a(param1, (ae) (this), (byte) -89) + (var58.a((ae) (this), 14157).b(param2 + -117) >> 348199105);
                    if (gla.field_p == var6) {
                      break L2;
                    } else {
                      if (var6 == tea.field_b) {
                        break L2;
                      } else {
                        if (fp.field_c != var6) {
                          if (var6 == uh.field_k) {
                            var38 = pq.field_b[1];
                            var38.a(var9, -(var38.field_q >> 1118320961) + var10, 256);
                            break L1;
                          } else {
                            break L1;
                          }
                        } else {
                          var37 = pq.field_b[2];
                          var37.a(var9, -(var37.field_q >> -1089555007) + var10, 256);
                          break L1;
                        }
                      }
                    }
                  }
                  L3: {
                    L4: {
                      var39 = pq.field_b[0];
                      var11 = var39.field_n << -1655768895;
                      var12 = var39.field_k << -219625215;
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
                            break L3;
                          }
                        }
                      }
                    }
                    this.field_H = new iu(var11, var12);
                    nm.a(this.field_H, (byte) 121);
                    break L3;
                  }
                  var39.a(112, 144, var39.field_n << -1762329884, var39.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                  pfa.a(1);
                  this.field_H.a(var9 - (var39.field_n >> 638308385), var10 + -var39.field_k, 256);
                  break L1;
                }
                return;
              }
            } else {
              if (var5.equals(this.field_o)) {
                L5: {
                  super.a(param0, param1, param2, param3);
                  var6 = this.field_I.b(-4666);
                  var61 = (oaa) ((Object) this.field_r);
                  var9 = this.field_i + param0;
                  var10 = var61.a(param1, (ae) (this), (byte) -89) + (var61.a((ae) (this), 14157).b(param2 + -117) >> 348199105);
                  if (gla.field_p == var6) {
                    break L5;
                  } else {
                    if (var6 == tea.field_b) {
                      break L5;
                    } else {
                      if (fp.field_c != var6) {
                        if (var6 == uh.field_k) {
                          var52 = pq.field_b[1];
                          var52.a(var9, -(var52.field_q >> 1118320961) + var10, 256);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        var51 = pq.field_b[2];
                        var51.a(var9, -(var51.field_q >> -1089555007) + var10, 256);
                        return;
                      }
                    }
                  }
                }
                L6: {
                  var53 = pq.field_b[0];
                  var11 = var53.field_n << -1655768895;
                  var12 = var53.field_k << -219625215;
                  if (this.field_H == null) {
                    break L6;
                  } else {
                    if (this.field_H.field_m < var11) {
                      break L6;
                    } else {
                      if (var12 > this.field_H.field_q) {
                        break L6;
                      } else {
                        nm.a(this.field_H, (byte) 120);
                        bea.a();
                        var53.a(112, 144, var53.field_n << -1762329884, var53.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                        pfa.a(1);
                        this.field_H.a(var9 - (var53.field_n >> 638308385), var10 + -var53.field_k, 256);
                        return;
                      }
                    }
                  }
                }
                this.field_H = new iu(var11, var12);
                nm.a(this.field_H, (byte) 121);
                var53.a(112, 144, var53.field_n << -1762329884, var53.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                pfa.a(1);
                this.field_H.a(var9 - (var53.field_n >> 638308385), var10 + -var53.field_k, 256);
                return;
              } else {
                L7: {
                  this.field_o = var5;
                  this.b(18758);
                  super.a(param0, param1, param2, param3);
                  var6 = this.field_I.b(-4666);
                  var60 = (oaa) ((Object) this.field_r);
                  var9 = this.field_i + param0;
                  var10 = var60.a(param1, (ae) (this), (byte) -89) + (var60.a((ae) (this), 14157).b(param2 + -117) >> 348199105);
                  if (gla.field_p == var6) {
                    break L7;
                  } else {
                    if (var6 == tea.field_b) {
                      break L7;
                    } else {
                      if (fp.field_c != var6) {
                        if (var6 != uh.field_k) {
                          return;
                        } else {
                          var46 = pq.field_b[1];
                          var46.a(var9, -(var46.field_q >> 1118320961) + var10, 256);
                          return;
                        }
                      } else {
                        var45 = pq.field_b[2];
                        var45.a(var9, -(var45.field_q >> -1089555007) + var10, 256);
                        return;
                      }
                    }
                  }
                }
                var47 = pq.field_b[0];
                var16 = var47;
                var11 = var47.field_n << -1655768895;
                var12 = var47.field_k << -219625215;
                if (this.field_H != null) {
                  if (this.field_H.field_m >= var11) {
                    if (var12 <= this.field_H.field_q) {
                      nm.a(this.field_H, (byte) 120);
                      bea.a();
                      var47.a(112, 144, var47.field_n << -1762329884, var47.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                      pfa.a(1);
                      this.field_H.a(var9 - (var47.field_n >> 638308385), var10 + -var47.field_k, 256);
                      return;
                    } else {
                      this.field_H = new iu(var11, var12);
                      nm.a(this.field_H, (byte) 121);
                      var47.a(112, 144, var47.field_n << -1762329884, var47.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                      pfa.a(1);
                      this.field_H.a(var9 - (var47.field_n >> 638308385), var10 + -var47.field_k, 256);
                      return;
                    }
                  } else {
                    this.field_H = new iu(var11, var12);
                    nm.a(this.field_H, (byte) 121);
                    var47.a(112, 144, var47.field_n << -1762329884, var47.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                    pfa.a(1);
                    this.field_H.a(var9 - (var47.field_n >> 638308385), var10 + -var47.field_k, 256);
                    return;
                  }
                } else {
                  this.field_H = new iu(var11, var12);
                  nm.a(this.field_H, (byte) 121);
                  var47.a(112, 144, var47.field_n << -1762329884, var47.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                  pfa.a(1);
                  this.field_H.a(var9 - (var47.field_n >> 638308385), var10 + -var47.field_k, 256);
                  return;
                }
              }
            }
          } else {
            var26 = ko.field_g;
            if (var26.equals(this.field_o)) {
              L8: {
                super.a(param0, param1, param2, param3);
                var6 = this.field_I.b(-4666);
                var57 = (oaa) ((Object) this.field_r);
                var9 = this.field_i + param0;
                var10 = var57.a(param1, (ae) (this), (byte) -89) + (var57.a((ae) (this), 14157).b(param2 + -117) >> 348199105);
                if (gla.field_p == var6) {
                  break L8;
                } else {
                  if (var6 == tea.field_b) {
                    break L8;
                  } else {
                    if (fp.field_c != var6) {
                      if (var6 != uh.field_k) {
                        return;
                      } else {
                        var33 = pq.field_b[1];
                        var33.a(var9, -(var33.field_q >> 1118320961) + var10, 256);
                        return;
                      }
                    } else {
                      var32 = pq.field_b[2];
                      var32.a(var9, -(var32.field_q >> -1089555007) + var10, 256);
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
              L9: {
                L10: {
                  this.field_o = var26;
                  this.b(18758);
                  super.a(param0, param1, param2, param3);
                  var6 = this.field_I.b(-4666);
                  var56 = (oaa) ((Object) this.field_r);
                  var9 = this.field_i + param0;
                  var10 = var56.a(param1, (ae) (this), (byte) -89) + (var56.a((ae) (this), 14157).b(param2 + -117) >> 348199105);
                  if (gla.field_p == var6) {
                    break L10;
                  } else {
                    if (var6 == tea.field_b) {
                      break L10;
                    } else {
                      if (fp.field_c != var6) {
                        if (var6 == uh.field_k) {
                          var29 = pq.field_b[1];
                          var29.a(var9, -(var29.field_q >> 1118320961) + var10, 256);
                          break L9;
                        } else {
                          break L9;
                        }
                      } else {
                        var28 = pq.field_b[2];
                        var28.a(var9, -(var28.field_q >> -1089555007) + var10, 256);
                        break L9;
                      }
                    }
                  }
                }
                L11: {
                  L12: {
                    var30 = pq.field_b[0];
                    var11 = var30.field_n << -1655768895;
                    var12 = var30.field_k << -219625215;
                    if (this.field_H == null) {
                      break L12;
                    } else {
                      if (this.field_H.field_m < var11) {
                        break L12;
                      } else {
                        if (var12 > this.field_H.field_q) {
                          break L12;
                        } else {
                          nm.a(this.field_H, (byte) 120);
                          bea.a();
                          break L11;
                        }
                      }
                    }
                  }
                  this.field_H = new iu(var11, var12);
                  nm.a(this.field_H, (byte) 121);
                  break L11;
                }
                var30.a(112, 144, var30.field_n << -1762329884, var30.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                pfa.a(1);
                this.field_H.a(var9 - (var30.field_n >> 638308385), var10 + -var30.field_k, 256);
                break L9;
              }
              return;
            }
          }
        } else {
          var17 = ko.field_g;
          if (var17.equals(this.field_o)) {
            L13: {
              super.a(param0, param1, param2, param3);
              var6 = this.field_I.b(-4666);
              var55 = (oaa) ((Object) this.field_r);
              var9 = this.field_i + param0;
              var10 = var55.a(param1, (ae) (this), (byte) -89) + (var55.a((ae) (this), 14157).b(param2 + -117) >> 348199105);
              if (gla.field_p == var6) {
                break L13;
              } else {
                if (var6 == tea.field_b) {
                  break L13;
                } else {
                  if (fp.field_c != var6) {
                    if (var6 != uh.field_k) {
                      return;
                    } else {
                      var24 = pq.field_b[1];
                      var24.a(var9, -(var24.field_q >> 1118320961) + var10, 256);
                      return;
                    }
                  } else {
                    var23 = pq.field_b[2];
                    var23.a(var9, -(var23.field_q >> -1089555007) + var10, 256);
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
                  var25.a(112, 144, var25.field_n << -1762329884, var25.field_k << 1103091652, -this.field_F << -1397251222, 4096);
                  pfa.a(1);
                  this.field_H.a(var9 - (var25.field_n >> 638308385), var10 + -var25.field_k, 256);
                  return;
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
            L14: {
              L15: {
                this.field_o = var17;
                this.b(18758);
                super.a(param0, param1, param2, param3);
                var6 = this.field_I.b(-4666);
                var54 = (oaa) ((Object) this.field_r);
                var9 = this.field_i + param0;
                var10 = var54.a(param1, (ae) (this), (byte) -89) + (var54.a((ae) (this), 14157).b(param2 + -117) >> 348199105);
                if (gla.field_p == var6) {
                  break L15;
                } else {
                  if (var6 == tea.field_b) {
                    break L15;
                  } else {
                    if (fp.field_c != var6) {
                      if (var6 == uh.field_k) {
                        var20 = pq.field_b[1];
                        var20.a(var9, -(var20.field_q >> 1118320961) + var10, 256);
                        break L14;
                      } else {
                        break L14;
                      }
                    } else {
                      var19 = pq.field_b[2];
                      var19.a(var9, -(var19.field_q >> -1089555007) + var10, 256);
                      break L14;
                    }
                  }
                }
              }
              L16: {
                L17: {
                  var21 = pq.field_b[0];
                  var11 = var21.field_n << -1655768895;
                  var12 = var21.field_k << -219625215;
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
                        break L16;
                      }
                    }
                  }
                }
                this.field_H = new iu(var11, var12);
                nm.a(this.field_H, (byte) 121);
                break L16;
              }
              var21.a(112, 144, var21.field_n << -1762329884, var21.field_k << 1103091652, -this.field_F << -1397251222, 4096);
              pfa.a(1);
              this.field_H.a(var9 - (var21.field_n >> 638308385), var10 + -var21.field_k, 256);
              break L14;
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
