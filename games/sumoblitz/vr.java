/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vr extends wp {
    static String field_G;
    private int field_E;
    private v field_H;
    static String field_F;

    final void a(int param0, int param1, pk param2, int param3) {
        try {
            this.field_E = this.field_E + 1;
            int var5_int = 46 / ((param1 - -25) / 45);
            super.a(param0, 54, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "vr.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.removeKeyListener(wd.field_e);
            param0.removeFocusListener(wd.field_e);
            lv.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "vr.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        gf var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        pk var12 = null;
        wb var16 = null;
        wb var17 = null;
        wb var18 = null;
        wb var19 = null;
        wb var20 = null;
        wb var21 = null;
        wb var24 = null;
        wb var25 = null;
        wb var28 = null;
        wb var29 = null;
        wb var30 = null;
        wb var31 = null;
        wb var32 = null;
        wb var33 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        super.a(param0, param1, (byte) -122, param3);
        if (0 != param3) {
          return;
        } else {
          L0: {
            L1: {
              var5 = (this.field_q >> 303200449) + (this.field_r + param0);
              var6 = (this.field_p >> -1573516831) + param1 - -this.field_v;
              var8 = this.field_H.c(-103);
              if (mb.field_f == var8) {
                var19 = fw.field_m[0];
                var9 = var19.field_z << -210870079;
                var10 = var19.field_w << -715242463;
                if (kv.field_a != null) {
                  if (var9 > kv.field_a.field_x) {
                    kv.field_a = new wb(var9, var10);
                    jq.a(7161, kv.field_a);
                    if (var11 == 0) {
                      var19.a(112, 144, var19.field_z << -220647484, var19.field_w << -205145404, -this.field_E << -167177430, 4096);
                      su.a((byte) 126);
                      kv.field_a.d(var5 + -var19.field_z, -var19.field_w + var6, 256);
                      if (var11 == 0) {
                        break L0;
                      } else {
                        break L1;
                      }
                    } else {
                      L2: {
                        jq.a(7161, kv.field_a);
                        lk.b();
                        var19.a(112, 144, var19.field_z << -220647484, var19.field_w << -205145404, -this.field_E << -167177430, 4096);
                        su.a((byte) 126);
                        kv.field_a.d(var5 + -var19.field_z, -var19.field_w + var6, 256);
                        if (var11 == 0) {
                          break L2;
                        } else {
                          L3: {
                            if (qr.field_e != var8) {
                              break L3;
                            } else {
                              var30 = fw.field_m[2];
                              var30.d(-(var30.field_x >> -1843542399) + var5, var6 + -(var30.field_u >> -1789690495), 256);
                              break L3;
                            }
                          }
                          if (var8 != qe.field_a) {
                            break L2;
                          } else {
                            var31 = fw.field_m[1];
                            var31.d(var5 - (var31.field_x >> 732386913), var6 - (var31.field_u >> 698755105), 256);
                            break L2;
                          }
                        }
                      }
                      if (param2 >= -35) {
                        var12 = (pk) null;
                        this.a(86, -51, (pk) null, 16);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (var10 <= kv.field_a.field_u) {
                      L4: {
                        jq.a(7161, kv.field_a);
                        lk.b();
                        var19.a(112, 144, var19.field_z << -220647484, var19.field_w << -205145404, -this.field_E << -167177430, 4096);
                        su.a((byte) 126);
                        kv.field_a.d(var5 + -var19.field_z, -var19.field_w + var6, 256);
                        if (var11 == 0) {
                          break L4;
                        } else {
                          L5: {
                            if (qr.field_e != var8) {
                              break L5;
                            } else {
                              var28 = fw.field_m[2];
                              var28.d(-(var28.field_x >> -1843542399) + var5, var6 + -(var28.field_u >> -1789690495), 256);
                              break L5;
                            }
                          }
                          if (var8 != qe.field_a) {
                            break L4;
                          } else {
                            var29 = fw.field_m[1];
                            var29.d(var5 - (var29.field_x >> 732386913), var6 - (var29.field_u >> 698755105), 256);
                            break L4;
                          }
                        }
                      }
                      if (param2 >= -35) {
                        var12 = (pk) null;
                        this.a(86, -51, (pk) null, 16);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      L6: {
                        kv.field_a = new wb(var9, var10);
                        jq.a(7161, kv.field_a);
                        if (var11 == 0) {
                          break L6;
                        } else {
                          jq.a(7161, kv.field_a);
                          lk.b();
                          break L6;
                        }
                      }
                      L7: {
                        var19.a(112, 144, var19.field_z << -220647484, var19.field_w << -205145404, -this.field_E << -167177430, 4096);
                        su.a((byte) 126);
                        kv.field_a.d(var5 + -var19.field_z, -var19.field_w + var6, 256);
                        if (qr.field_e != var8) {
                          break L7;
                        } else {
                          var24 = fw.field_m[2];
                          var24.d(-(var24.field_x >> -1843542399) + var5, var6 + -(var24.field_u >> -1789690495), 256);
                          break L7;
                        }
                      }
                      L8: {
                        if (var8 != qe.field_a) {
                          break L8;
                        } else {
                          var25 = fw.field_m[1];
                          var25.d(var5 - (var25.field_x >> 732386913), var6 - (var25.field_u >> 698755105), 256);
                          break L8;
                        }
                      }
                      L9: {
                        if (param2 < -35) {
                          break L9;
                        } else {
                          var12 = (pk) null;
                          this.a(86, -51, (pk) null, 16);
                          break L9;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L10: {
                    kv.field_a = new wb(var9, var10);
                    jq.a(7161, kv.field_a);
                    if (var11 == 0) {
                      break L10;
                    } else {
                      jq.a(7161, kv.field_a);
                      lk.b();
                      break L10;
                    }
                  }
                  L11: {
                    var19.a(112, 144, var19.field_z << -220647484, var19.field_w << -205145404, -this.field_E << -167177430, 4096);
                    su.a((byte) 126);
                    kv.field_a.d(var5 + -var19.field_z, -var19.field_w + var6, 256);
                    if (qr.field_e != var8) {
                      break L11;
                    } else {
                      var20 = fw.field_m[2];
                      var20.d(-(var20.field_x >> -1843542399) + var5, var6 + -(var20.field_u >> -1789690495), 256);
                      break L11;
                    }
                  }
                  L12: {
                    if (var8 != qe.field_a) {
                      break L12;
                    } else {
                      var21 = fw.field_m[1];
                      var21.d(var5 - (var21.field_x >> 732386913), var6 - (var21.field_u >> 698755105), 256);
                      break L12;
                    }
                  }
                  L13: {
                    if (param2 < -35) {
                      break L13;
                    } else {
                      var12 = (pk) null;
                      this.a(86, -51, (pk) null, 16);
                      break L13;
                    }
                  }
                  return;
                }
              } else {
                if (kt.field_a != var8) {
                  break L1;
                } else {
                  L14: {
                    L15: {
                      var16 = fw.field_m[0];
                      var9 = var16.field_z << -210870079;
                      var10 = var16.field_w << -715242463;
                      if (kv.field_a == null) {
                        break L15;
                      } else {
                        if (var9 > kv.field_a.field_x) {
                          break L15;
                        } else {
                          if (var10 <= kv.field_a.field_u) {
                            jq.a(7161, kv.field_a);
                            lk.b();
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                    }
                    kv.field_a = new wb(var9, var10);
                    jq.a(7161, kv.field_a);
                    if (var11 == 0) {
                      break L14;
                    } else {
                      jq.a(7161, kv.field_a);
                      lk.b();
                      break L14;
                    }
                  }
                  L16: {
                    var16.a(112, 144, var16.field_z << -220647484, var16.field_w << -205145404, -this.field_E << -167177430, 4096);
                    su.a((byte) 126);
                    kv.field_a.d(var5 + -var16.field_z, -var16.field_w + var6, 256);
                    if (var11 == 0) {
                      break L16;
                    } else {
                      L17: {
                        if (qr.field_e != var8) {
                          break L17;
                        } else {
                          var17 = fw.field_m[2];
                          var17.d(-(var17.field_x >> -1843542399) + var5, var6 + -(var17.field_u >> -1789690495), 256);
                          break L17;
                        }
                      }
                      if (var8 != qe.field_a) {
                        break L16;
                      } else {
                        var18 = fw.field_m[1];
                        var18.d(var5 - (var18.field_x >> 732386913), var6 - (var18.field_u >> 698755105), 256);
                        break L16;
                      }
                    }
                  }
                  if (param2 < -35) {
                    return;
                  } else {
                    var12 = (pk) null;
                    this.a(86, -51, (pk) null, 16);
                    return;
                  }
                }
              }
            }
            L18: {
              if (qr.field_e != var8) {
                break L18;
              } else {
                var32 = fw.field_m[2];
                var32.d(-(var32.field_x >> -1843542399) + var5, var6 + -(var32.field_u >> -1789690495), 256);
                if (var11 == 0) {
                  break L0;
                } else {
                  break L18;
                }
              }
            }
            if (var8 != qe.field_a) {
              break L0;
            } else {
              var33 = fw.field_m[1];
              var33.d(var5 - (var33.field_x >> 732386913), var6 - (var33.field_u >> 698755105), 256);
              break L0;
            }
          }
          if (param2 >= -35) {
            var12 = (pk) null;
            this.a(86, -51, (pk) null, 16);
            return;
          } else {
            return;
          }
        }
    }

    final String c(int param0) {
        if (this.field_k) {
          return this.field_H.a(3690);
        } else {
          if (param0 == -6696) {
            return null;
          } else {
            this.a(-102, 53, (byte) -40, -114);
            return null;
          }
        }
    }

    final boolean a(pk param0, byte param1) {
        RuntimeException var3 = null;
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
            if (param1 == 61) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              this.field_E = 103;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("vr.Q(");
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
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public static void a(int param0) {
        field_G = null;
        field_F = null;
        if (param0 != -21433) {
            java.awt.Component var2 = (java.awt.Component) null;
            vr.a((java.awt.Component) null, -80);
        }
    }

    vr(v param0) {
        try {
            this.field_H = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "vr.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_F = "This password contains your Player Name, and would be easy to guess";
    }
}
