/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn extends ar {
    private wb field_K;
    static int field_R;
    private v field_Q;
    static int field_T;
    private String field_U;
    private int field_S;
    static String field_O;
    static boolean field_P;

    final String c(int param0) {
        if (param0 == -6696) {
            return null;
        }
        return (String) null;
    }

    final boolean a(pk param0, byte param1) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
        pk var4 = null;
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
              var4 = (pk) null;
              discarded$2 = this.a((pk) null, (byte) 73);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("bn.Q(");
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

    final void a(int param0, int param1, pk param2, int param3) {
        try {
            this.field_S = this.field_S + 1;
            super.a(param0, 83, param2, param3);
            int var5_int = -76 / ((param1 - -25) / 45);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "bn.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        String var5 = null;
        gf var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        wb var16 = null;
        String var17 = null;
        Object var18 = null;
        wb var19 = null;
        wb var20 = null;
        wb var21 = null;
        Object var22 = null;
        wb var23 = null;
        wb var24 = null;
        wb var25 = null;
        wb var26 = null;
        wb var27 = null;
        Object var28 = null;
        wb var29 = null;
        wb var30 = null;
        wb var31 = null;
        de var32 = null;
        de var33 = null;
        de var34 = null;
        L0: {
          var18 = null;
          var22 = null;
          var28 = null;
          var13 = Sumoblitz.field_L ? 1 : 0;
          if (param2 < -35) {
            break L0;
          } else {
            this.a(-71, -15, (byte) -42, -1);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              var6 = this.field_Q.c(-126);
              if (var6 == mb.field_f) {
                break L3;
              } else {
                if (var6 != kt.field_a) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            var5 = hi.field_g;
            if (var13 == 0) {
              break L1;
            } else {
              break L2;
            }
          }
          var17 = this.field_Q.a(3690);
          if (var17 == null) {
            var5 = this.field_U;
            break L1;
          } else {
            L4: {
              if (var17.equals(this.field_m)) {
                break L4;
              } else {
                this.field_m = var17;
                this.a(9);
                break L4;
              }
            }
            L5: {
              L6: {
                super.a(param0, param1, (byte) -119, param3);
                var6 = this.field_Q.c(-106);
                var32 = (de) ((Object) this.field_w);
                var9 = this.field_r + param0;
                var10 = var32.b(param1, (pk) (this), 0) + (var32.b(-3, (pk) (this)).a(true) >> 703130049);
                if (var6 == mb.field_f) {
                  break L6;
                } else {
                  if (kt.field_a == var6) {
                    break L6;
                  } else {
                    L7: {
                      if (qr.field_e != var6) {
                        break L7;
                      } else {
                        var19 = fw.field_m[2];
                        var19.d(var9, -(var19.field_u >> 1730776225) + var10, 256);
                        if (var13 == 0) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (qe.field_a == var6) {
                      var20 = fw.field_m[1];
                      var20.d(var9, var10 - (var20.field_u >> 571136033), 256);
                      if (var13 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
              }
              L8: {
                L9: {
                  var21 = fw.field_m[0];
                  var11 = var21.field_z << -1200806623;
                  var12 = var21.field_w << -1510169887;
                  if (this.field_K == null) {
                    break L9;
                  } else {
                    if (var11 > this.field_K.field_x) {
                      break L9;
                    } else {
                      if (this.field_K.field_u >= var12) {
                        jq.a(7161, this.field_K);
                        lk.b();
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                this.field_K = new wb(var11, var12);
                jq.a(7161, this.field_K);
                if (var13 == 0) {
                  break L8;
                } else {
                  jq.a(7161, this.field_K);
                  lk.b();
                  break L8;
                }
              }
              var21.a(112, 144, var21.field_z << -1323410620, var21.field_w << -1973442844, -this.field_S << 1513949130, 4096);
              su.a((byte) -50);
              this.field_K.d(-(var21.field_z >> 874302625) + var9, -var21.field_w + var10, 256);
              break L5;
            }
            return;
          }
        }
        if (var5.equals(this.field_m)) {
          L10: {
            super.a(param0, param1, (byte) -119, param3);
            var6 = this.field_Q.c(-106);
            var34 = (de) ((Object) this.field_w);
            var9 = this.field_r + param0;
            var10 = var34.b(param1, (pk) (this), 0) + (var34.b(-3, (pk) (this)).a(true) >> 703130049);
            if (var6 == mb.field_f) {
              break L10;
            } else {
              if (kt.field_a == var6) {
                break L10;
              } else {
                L11: {
                  if (qr.field_e != var6) {
                    break L11;
                  } else {
                    var29 = fw.field_m[2];
                    var29.d(var9, -(var29.field_u >> 1730776225) + var10, 256);
                    if (var13 != 0) {
                      break L11;
                    } else {
                      return;
                    }
                  }
                }
                if (qe.field_a == var6) {
                  var30 = fw.field_m[1];
                  var30.d(var9, var10 - (var30.field_u >> 571136033), 256);
                  if (var13 != 0) {
                    break L10;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          L12: {
            var31 = fw.field_m[0];
            var11 = var31.field_z << -1200806623;
            var12 = var31.field_w << -1510169887;
            if (this.field_K == null) {
              break L12;
            } else {
              if (var11 > this.field_K.field_x) {
                break L12;
              } else {
                if (this.field_K.field_u < var12) {
                  this.field_K = new wb(var11, var12);
                  jq.a(7161, this.field_K);
                  if (var13 != 0) {
                    jq.a(7161, this.field_K);
                    lk.b();
                    var31.a(112, 144, var31.field_z << -1323410620, var31.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                    su.a((byte) -50);
                    this.field_K.d(-(var31.field_z >> 874302625) + var9, -var31.field_w + var10, 256);
                    return;
                  } else {
                    var31.a(112, 144, var31.field_z << -1323410620, var31.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                    su.a((byte) -50);
                    this.field_K.d(-(var31.field_z >> 874302625) + var9, -var31.field_w + var10, 256);
                    return;
                  }
                } else {
                  jq.a(7161, this.field_K);
                  lk.b();
                  var31.a(112, 144, var31.field_z << -1323410620, var31.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                  su.a((byte) -50);
                  this.field_K.d(-(var31.field_z >> 874302625) + var9, -var31.field_w + var10, 256);
                  return;
                }
              }
            }
          }
          this.field_K = new wb(var11, var12);
          jq.a(7161, this.field_K);
          if (var13 == 0) {
            var31.a(112, 144, var31.field_z << -1323410620, var31.field_w << -1973442844, -this.field_S << 1513949130, 4096);
            su.a((byte) -50);
            this.field_K.d(-(var31.field_z >> 874302625) + var9, -var31.field_w + var10, 256);
            return;
          } else {
            jq.a(7161, this.field_K);
            lk.b();
            var31.a(112, 144, var31.field_z << -1323410620, var31.field_w << -1973442844, -this.field_S << 1513949130, 4096);
            su.a((byte) -50);
            this.field_K.d(-(var31.field_z >> 874302625) + var9, -var31.field_w + var10, 256);
            return;
          }
        } else {
          this.field_m = var5;
          this.a(9);
          super.a(param0, param1, (byte) -119, param3);
          var6 = this.field_Q.c(-106);
          var33 = (de) ((Object) this.field_w);
          var9 = this.field_r + param0;
          var10 = var33.b(param1, (pk) (this), 0) + (var33.b(-3, (pk) (this)).a(true) >> 703130049);
          if (var6 != mb.field_f) {
            if (kt.field_a != var6) {
              L13: {
                if (qr.field_e != var6) {
                  break L13;
                } else {
                  var25 = fw.field_m[2];
                  var25.d(var9, -(var25.field_u >> 1730776225) + var10, 256);
                  if (var13 != 0) {
                    break L13;
                  } else {
                    return;
                  }
                }
              }
              if (qe.field_a == var6) {
                var26 = fw.field_m[1];
                var26.d(var9, var10 - (var26.field_u >> 571136033), 256);
                if (var13 != 0) {
                  L14: {
                    var27 = fw.field_m[0];
                    var16 = var27;
                    var11 = var27.field_z << -1200806623;
                    var12 = var27.field_w << -1510169887;
                    if (this.field_K == null) {
                      break L14;
                    } else {
                      if (var11 > this.field_K.field_x) {
                        break L14;
                      } else {
                        if (this.field_K.field_u < var12) {
                          this.field_K = new wb(var11, var12);
                          jq.a(7161, this.field_K);
                          jq.a(7161, this.field_K);
                          lk.b();
                          var27.a(112, 144, var27.field_z << -1323410620, var27.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                          su.a((byte) -50);
                          this.field_K.d(-(var27.field_z >> 874302625) + var9, -var27.field_w + var10, 256);
                          return;
                        } else {
                          jq.a(7161, this.field_K);
                          lk.b();
                          var27.a(112, 144, var27.field_z << -1323410620, var27.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                          su.a((byte) -50);
                          this.field_K.d(-(var27.field_z >> 874302625) + var9, -var27.field_w + var10, 256);
                          return;
                        }
                      }
                    }
                  }
                  this.field_K = new wb(var11, var12);
                  jq.a(7161, this.field_K);
                  if (var13 != 0) {
                    jq.a(7161, this.field_K);
                    lk.b();
                    var27.a(112, 144, var27.field_z << -1323410620, var27.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                    su.a((byte) -50);
                    this.field_K.d(-(var27.field_z >> 874302625) + var9, -var27.field_w + var10, 256);
                    return;
                  } else {
                    var27.a(112, 144, var27.field_z << -1323410620, var27.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                    su.a((byte) -50);
                    this.field_K.d(-(var27.field_z >> 874302625) + var9, -var27.field_w + var10, 256);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              L15: {
                L16: {
                  var24 = fw.field_m[0];
                  var16 = var24;
                  var11 = var24.field_z << -1200806623;
                  var12 = var24.field_w << -1510169887;
                  if (this.field_K == null) {
                    break L16;
                  } else {
                    if (var11 > this.field_K.field_x) {
                      break L16;
                    } else {
                      if (this.field_K.field_u >= var12) {
                        jq.a(7161, this.field_K);
                        lk.b();
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                  }
                }
                this.field_K = new wb(var11, var12);
                jq.a(7161, this.field_K);
                if (var13 == 0) {
                  break L15;
                } else {
                  jq.a(7161, this.field_K);
                  lk.b();
                  break L15;
                }
              }
              var24.a(112, 144, var24.field_z << -1323410620, var24.field_w << -1973442844, -this.field_S << 1513949130, 4096);
              su.a((byte) -50);
              this.field_K.d(-(var24.field_z >> 874302625) + var9, -var24.field_w + var10, 256);
              return;
            }
          } else {
            L17: {
              L18: {
                var23 = fw.field_m[0];
                var16 = var23;
                var11 = var23.field_z << -1200806623;
                var12 = var23.field_w << -1510169887;
                if (this.field_K == null) {
                  break L18;
                } else {
                  if (var11 > this.field_K.field_x) {
                    break L18;
                  } else {
                    if (this.field_K.field_u >= var12) {
                      jq.a(7161, this.field_K);
                      lk.b();
                      break L17;
                    } else {
                      break L18;
                    }
                  }
                }
              }
              this.field_K = new wb(var11, var12);
              jq.a(7161, this.field_K);
              if (var13 == 0) {
                break L17;
              } else {
                jq.a(7161, this.field_K);
                lk.b();
                break L17;
              }
            }
            var23.a(112, 144, var23.field_z << -1323410620, var23.field_w << -1973442844, -this.field_S << 1513949130, 4096);
            su.a((byte) -50);
            this.field_K.d(-(var23.field_z >> 874302625) + var9, -var23.field_w + var10, 256);
            return;
          }
        }
    }

    final static void f(int param0) {
        int var1 = 0;
        nv.field_a = nv.field_a + 1;
        jt.field_u = 150;
        var1 = nv.field_a / param0;
        if (un.field_a.length - 1 == var1) {
          ta.field_b = ta.field_b + 1;
          if (ps.field_e[12] != ta.field_b) {
            L0: {
              if (un.field_a.length > var1) {
                break L0;
              } else {
                var1 = un.field_a.length - 1;
                break L0;
              }
            }
            pd.field_p = un.field_a[var1];
            return;
          } else {
            L1: {
              th.b(24753, 243, 12);
              if (un.field_a.length > var1) {
                break L1;
              } else {
                var1 = un.field_a.length - 1;
                break L1;
              }
            }
            pd.field_p = un.field_a[var1];
            return;
          }
        } else {
          L2: {
            if (un.field_a.length > var1) {
              break L2;
            } else {
              var1 = un.field_a.length - 1;
              break L2;
            }
          }
          pd.field_p = un.field_a[var1];
          return;
        }
    }

    bn(v param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, fw.a(0));
        try {
            this.field_U = param1;
            this.field_Q = param0;
            this.a(-60, param2, param3, param5, param4);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "bn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void g(byte param0) {
        field_O = null;
        int var1 = -83 / ((param0 - -17) / 49);
    }

    static {
        field_T = 5;
        field_O = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_P = false;
        field_R = 0;
    }
}
