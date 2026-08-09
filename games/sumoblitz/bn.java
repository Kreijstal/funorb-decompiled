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
        RuntimeException var3 = null;
        pk var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 61) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              var4 = (pk) null;
              this.a((pk) null, (byte) 73);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("bn.Q(");

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
        String var5;
        gf var6;
        int var13;
        Object var17;
        Object var22;
        Object var27;
        Object var32;
        Object var37;
        Object var46;
        int var9;
        int var10;
        int var11;
        int var12;
        wb var16;
        wb var18;
        wb var19;
        wb var20;
        String var21;
        wb var23;
        wb var24;
        wb var25;
        String var26;
        wb var28;
        wb var29;
        wb var30;
        String var31;
        wb var33;
        wb var34;
        wb var35;
        String var36;
        wb var38;
        wb var39;
        wb var44;
        wb var45;
        wb var47;
        wb var48;
        wb var49;
        de var50;
        de var51;
        de var52;
        de var53;
        de var54;
        de var55;
        var17 = null;
        var22 = null;
        var27 = null;
        var32 = null;
        var37 = null;
        var46 = null;
        var13 = Sumoblitz.field_L ? 1 : 0;
        if (param2 >= -35) {
          this.a(-71, -15, (byte) -42, -1);
          var6 = this.field_Q.c(-126);
          if (var6 != mb.field_f) {
            if (var6 != kt.field_a) {
              var31 = this.field_Q.a(3690);
              if (var31 == null) {
                var36 = this.field_U;
                if (var36.equals(this.field_m)) {
                  L0: {
                    super.a(param0, param1, (byte) -119, param3);
                    var6 = this.field_Q.c(-106);
                    var55 = (de) ((Object) this.field_w);
                    var9 = this.field_r + param0;
                    var10 = var55.b(param1, (pk) (this), 0) + (var55.b(-3, (pk) (this)).a(true) >> 703130049);
                    if (var6 == mb.field_f) {
                      break L0;
                    } else {
                      if (kt.field_a == var6) {
                        break L0;
                      } else {
                        if (qr.field_e != var6) {
                          if (qe.field_a == var6) {
                            var48 = fw.field_m[1];
                            var48.d(var9, var10 - (var48.field_u >> 571136033), 256);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          var47 = fw.field_m[2];
                          var47.d(var9, -(var47.field_u >> 1730776225) + var10, 256);
                          return;
                        }
                      }
                    }
                  }
                  L1: {
                    var49 = fw.field_m[0];
                    var11 = var49.field_z << -1200806623;
                    var12 = var49.field_w << -1510169887;
                    if (this.field_K == null) {
                      break L1;
                    } else {
                      if (var11 > this.field_K.field_x) {
                        break L1;
                      } else {
                        if (this.field_K.field_u >= var12) {
                          jq.a(7161, this.field_K);
                          lk.b();
                          var49.a(112, 144, var49.field_z << -1323410620, var49.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                          su.a((byte) -50);
                          this.field_K.d(-(var49.field_z >> 874302625) + var9, -var49.field_w + var10, 256);
                          return;
                        } else {
                          this.field_K = new wb(var11, var12);
                          jq.a(7161, this.field_K);
                          var49.a(112, 144, var49.field_z << -1323410620, var49.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                          su.a((byte) -50);
                          this.field_K.d(-(var49.field_z >> 874302625) + var9, -var49.field_w + var10, 256);
                          return;
                        }
                      }
                    }
                  }
                  this.field_K = new wb(var11, var12);
                  jq.a(7161, this.field_K);
                  var49.a(112, 144, var49.field_z << -1323410620, var49.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                  su.a((byte) -50);
                  this.field_K.d(-(var49.field_z >> 874302625) + var9, -var49.field_w + var10, 256);
                  return;
                } else {
                  this.field_m = var36;
                  this.a(9);
                  super.a(param0, param1, (byte) -119, param3);
                  var6 = this.field_Q.c(-106);
                  var54 = (de) ((Object) this.field_w);
                  var9 = this.field_r + param0;
                  var10 = var54.b(param1, (pk) (this), 0) + (var54.b(-3, (pk) (this)).a(true) >> 703130049);
                  if (var6 != mb.field_f) {
                    if (kt.field_a != var6) {
                      if (qr.field_e != var6) {
                        if (qe.field_a == var6) {
                          var45 = fw.field_m[1];
                          var45.d(var9, var10 - (var45.field_u >> 571136033), 256);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        var44 = fw.field_m[2];
                        var44.d(var9, -(var44.field_u >> 1730776225) + var10, 256);
                        return;
                      }
                    } else {
                      L2: {
                        var39 = fw.field_m[0];
                        var16 = var39;
                        var11 = var39.field_z << -1200806623;
                        var12 = var39.field_w << -1510169887;
                        if (this.field_K == null) {
                          break L2;
                        } else {
                          if (var11 > this.field_K.field_x) {
                            break L2;
                          } else {
                            if (this.field_K.field_u >= var12) {
                              jq.a(7161, this.field_K);
                              lk.b();
                              var39.a(112, 144, var39.field_z << -1323410620, var39.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                              su.a((byte) -50);
                              this.field_K.d(-(var39.field_z >> 874302625) + var9, -var39.field_w + var10, 256);
                              return;
                            } else {
                              this.field_K = new wb(var11, var12);
                              jq.a(7161, this.field_K);
                              var39.a(112, 144, var39.field_z << -1323410620, var39.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                              su.a((byte) -50);
                              this.field_K.d(-(var39.field_z >> 874302625) + var9, -var39.field_w + var10, 256);
                              return;
                            }
                          }
                        }
                      }
                      this.field_K = new wb(var11, var12);
                      jq.a(7161, this.field_K);
                      var39.a(112, 144, var39.field_z << -1323410620, var39.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                      su.a((byte) -50);
                      this.field_K.d(-(var39.field_z >> 874302625) + var9, -var39.field_w + var10, 256);
                      return;
                    }
                  } else {
                    L3: {
                      var38 = fw.field_m[0];
                      var11 = var38.field_z << -1200806623;
                      var12 = var38.field_w << -1510169887;
                      if (this.field_K == null) {
                        break L3;
                      } else {
                        if (var11 > this.field_K.field_x) {
                          break L3;
                        } else {
                          if (this.field_K.field_u >= var12) {
                            jq.a(7161, this.field_K);
                            lk.b();
                            var38.a(112, 144, var38.field_z << -1323410620, var38.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                            su.a((byte) -50);
                            this.field_K.d(-(var38.field_z >> 874302625) + var9, -var38.field_w + var10, 256);
                            return;
                          } else {
                            this.field_K = new wb(var11, var12);
                            jq.a(7161, this.field_K);
                            var38.a(112, 144, var38.field_z << -1323410620, var38.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                            su.a((byte) -50);
                            this.field_K.d(-(var38.field_z >> 874302625) + var9, -var38.field_w + var10, 256);
                            return;
                          }
                        }
                      }
                    }
                    this.field_K = new wb(var11, var12);
                    jq.a(7161, this.field_K);
                    var38.a(112, 144, var38.field_z << -1323410620, var38.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                    su.a((byte) -50);
                    this.field_K.d(-(var38.field_z >> 874302625) + var9, -var38.field_w + var10, 256);
                    return;
                  }
                }
              } else {
                L4: {
                  if (var31.equals(this.field_m)) {
                    break L4;
                  } else {
                    this.field_m = var31;
                    this.a(9);
                    break L4;
                  }
                }
                L5: {
                  super.a(param0, param1, (byte) -119, param3);
                  var6 = this.field_Q.c(-106);
                  var53 = (de) ((Object) this.field_w);
                  var9 = this.field_r + param0;
                  var10 = var53.b(param1, (pk) (this), 0) + (var53.b(-3, (pk) (this)).a(true) >> 703130049);
                  if (var6 == mb.field_f) {
                    break L5;
                  } else {
                    if (kt.field_a == var6) {
                      break L5;
                    } else {
                      if (qr.field_e != var6) {
                        if (qe.field_a != var6) {
                          return;
                        } else {
                          var34 = fw.field_m[1];
                          var34.d(var9, var10 - (var34.field_u >> 571136033), 256);
                          return;
                        }
                      } else {
                        var33 = fw.field_m[2];
                        var33.d(var9, -(var33.field_u >> 1730776225) + var10, 256);
                        return;
                      }
                    }
                  }
                }
                var35 = fw.field_m[0];
                var11 = var35.field_z << -1200806623;
                var12 = var35.field_w << -1510169887;
                if (this.field_K != null) {
                  if (var11 > this.field_K.field_x) {
                    this.field_K = new wb(var11, var12);
                    jq.a(7161, this.field_K);
                    var35.a(112, 144, var35.field_z << -1323410620, var35.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                    su.a((byte) -50);
                    this.field_K.d(-(var35.field_z >> 874302625) + var9, -var35.field_w + var10, 256);
                    return;
                  } else {
                    if (this.field_K.field_u >= var12) {
                      jq.a(7161, this.field_K);
                      lk.b();
                      var35.a(112, 144, var35.field_z << -1323410620, var35.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                      su.a((byte) -50);
                      this.field_K.d(-(var35.field_z >> 874302625) + var9, -var35.field_w + var10, 256);
                      return;
                    } else {
                      this.field_K = new wb(var11, var12);
                      jq.a(7161, this.field_K);
                      var35.a(112, 144, var35.field_z << -1323410620, var35.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                      su.a((byte) -50);
                      this.field_K.d(-(var35.field_z >> 874302625) + var9, -var35.field_w + var10, 256);
                      return;
                    }
                  }
                } else {
                  this.field_K = new wb(var11, var12);
                  jq.a(7161, this.field_K);
                  var35.a(112, 144, var35.field_z << -1323410620, var35.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                  su.a((byte) -50);
                  this.field_K.d(-(var35.field_z >> 874302625) + var9, -var35.field_w + var10, 256);
                  return;
                }
              }
            } else {
              L6: {
                var26 = hi.field_g;
                if (var26.equals(this.field_m)) {
                  break L6;
                } else {
                  this.field_m = var26;
                  this.a(9);
                  break L6;
                }
              }
              L7: {
                super.a(param0, param1, (byte) -119, param3);
                var6 = this.field_Q.c(-106);
                var52 = (de) ((Object) this.field_w);
                var9 = this.field_r + param0;
                var10 = var52.b(param1, (pk) (this), 0) + (var52.b(-3, (pk) (this)).a(true) >> 703130049);
                if (var6 == mb.field_f) {
                  break L7;
                } else {
                  if (kt.field_a == var6) {
                    break L7;
                  } else {
                    if (qr.field_e != var6) {
                      if (qe.field_a == var6) {
                        var29 = fw.field_m[1];
                        var29.d(var9, var10 - (var29.field_u >> 571136033), 256);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      var28 = fw.field_m[2];
                      var28.d(var9, -(var28.field_u >> 1730776225) + var10, 256);
                      return;
                    }
                  }
                }
              }
              var30 = fw.field_m[0];
              var11 = var30.field_z << -1200806623;
              var12 = var30.field_w << -1510169887;
              if (this.field_K != null) {
                if (var11 <= this.field_K.field_x) {
                  if (this.field_K.field_u >= var12) {
                    jq.a(7161, this.field_K);
                    lk.b();
                    var30.a(112, 144, var30.field_z << -1323410620, var30.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                    su.a((byte) -50);
                    this.field_K.d(-(var30.field_z >> 874302625) + var9, -var30.field_w + var10, 256);
                    return;
                  } else {
                    this.field_K = new wb(var11, var12);
                    jq.a(7161, this.field_K);
                    var30.a(112, 144, var30.field_z << -1323410620, var30.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                    su.a((byte) -50);
                    this.field_K.d(-(var30.field_z >> 874302625) + var9, -var30.field_w + var10, 256);
                    return;
                  }
                } else {
                  this.field_K = new wb(var11, var12);
                  jq.a(7161, this.field_K);
                  var30.a(112, 144, var30.field_z << -1323410620, var30.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                  su.a((byte) -50);
                  this.field_K.d(-(var30.field_z >> 874302625) + var9, -var30.field_w + var10, 256);
                  return;
                }
              } else {
                this.field_K = new wb(var11, var12);
                jq.a(7161, this.field_K);
                var30.a(112, 144, var30.field_z << -1323410620, var30.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                su.a((byte) -50);
                this.field_K.d(-(var30.field_z >> 874302625) + var9, -var30.field_w + var10, 256);
                return;
              }
            }
          } else {
            L8: {
              var21 = hi.field_g;
              if (var21.equals(this.field_m)) {
                break L8;
              } else {
                this.field_m = var21;
                this.a(9);
                break L8;
              }
            }
            L9: {
              super.a(param0, param1, (byte) -119, param3);
              var6 = this.field_Q.c(-106);
              var51 = (de) ((Object) this.field_w);
              var9 = this.field_r + param0;
              var10 = var51.b(param1, (pk) (this), 0) + (var51.b(-3, (pk) (this)).a(true) >> 703130049);
              if (var6 == mb.field_f) {
                break L9;
              } else {
                if (kt.field_a == var6) {
                  break L9;
                } else {
                  if (qr.field_e != var6) {
                    if (qe.field_a != var6) {
                      return;
                    } else {
                      var24 = fw.field_m[1];
                      var24.d(var9, var10 - (var24.field_u >> 571136033), 256);
                      return;
                    }
                  } else {
                    var23 = fw.field_m[2];
                    var23.d(var9, -(var23.field_u >> 1730776225) + var10, 256);
                    return;
                  }
                }
              }
            }
            var25 = fw.field_m[0];
            var11 = var25.field_z << -1200806623;
            var12 = var25.field_w << -1510169887;
            if (this.field_K != null) {
              if (var11 <= this.field_K.field_x) {
                if (this.field_K.field_u < var12) {
                  this.field_K = new wb(var11, var12);
                  jq.a(7161, this.field_K);
                  var25.a(112, 144, var25.field_z << -1323410620, var25.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                  su.a((byte) -50);
                  this.field_K.d(-(var25.field_z >> 874302625) + var9, -var25.field_w + var10, 256);
                  return;
                } else {
                  jq.a(7161, this.field_K);
                  lk.b();
                  var25.a(112, 144, var25.field_z << -1323410620, var25.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                  su.a((byte) -50);
                  this.field_K.d(-(var25.field_z >> 874302625) + var9, -var25.field_w + var10, 256);
                  return;
                }
              } else {
                this.field_K = new wb(var11, var12);
                jq.a(7161, this.field_K);
                var25.a(112, 144, var25.field_z << -1323410620, var25.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                su.a((byte) -50);
                this.field_K.d(-(var25.field_z >> 874302625) + var9, -var25.field_w + var10, 256);
                return;
              }
            } else {
              this.field_K = new wb(var11, var12);
              jq.a(7161, this.field_K);
              var25.a(112, 144, var25.field_z << -1323410620, var25.field_w << -1973442844, -this.field_S << 1513949130, 4096);
              su.a((byte) -50);
              this.field_K.d(-(var25.field_z >> 874302625) + var9, -var25.field_w + var10, 256);
              return;
            }
          }
        } else {
          L10: {
            L11: {
              var6 = this.field_Q.c(-126);
              if (var6 == mb.field_f) {
                break L11;
              } else {
                if (var6 != kt.field_a) {
                  var5 = this.field_Q.a(3690);
                  if (var5 == null) {
                    var5 = this.field_U;
                    break L10;
                  } else {
                    break L10;
                  }
                } else {
                  break L11;
                }
              }
            }
            var5 = hi.field_g;
            break L10;
          }
          L12: {
            if (var5.equals(this.field_m)) {
              break L12;
            } else {
              this.field_m = var5;
              this.a(9);
              break L12;
            }
          }
          L13: {
            super.a(param0, param1, (byte) -119, param3);
            var6 = this.field_Q.c(-106);
            var50 = (de) ((Object) this.field_w);
            var9 = this.field_r + param0;
            var10 = var50.b(param1, (pk) (this), 0) + (var50.b(-3, (pk) (this)).a(true) >> 703130049);
            if (var6 == mb.field_f) {
              break L13;
            } else {
              if (kt.field_a == var6) {
                break L13;
              } else {
                if (qr.field_e != var6) {
                  if (qe.field_a != var6) {
                    return;
                  } else {
                    var19 = fw.field_m[1];
                    var19.d(var9, var10 - (var19.field_u >> 571136033), 256);
                    return;
                  }
                } else {
                  var18 = fw.field_m[2];
                  var18.d(var9, -(var18.field_u >> 1730776225) + var10, 256);
                  return;
                }
              }
            }
          }
          var20 = fw.field_m[0];
          var11 = var20.field_z << -1200806623;
          var12 = var20.field_w << -1510169887;
          if (this.field_K != null) {
            if (var11 <= this.field_K.field_x) {
              if (this.field_K.field_u < var12) {
                this.field_K = new wb(var11, var12);
                jq.a(7161, this.field_K);
                var20.a(112, 144, var20.field_z << -1323410620, var20.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                su.a((byte) -50);
                this.field_K.d(-(var20.field_z >> 874302625) + var9, -var20.field_w + var10, 256);
                return;
              } else {
                jq.a(7161, this.field_K);
                lk.b();
                var20.a(112, 144, var20.field_z << -1323410620, var20.field_w << -1973442844, -this.field_S << 1513949130, 4096);
                su.a((byte) -50);
                this.field_K.d(-(var20.field_z >> 874302625) + var9, -var20.field_w + var10, 256);
                return;
              }
            } else {
              this.field_K = new wb(var11, var12);
              jq.a(7161, this.field_K);
              var20.a(112, 144, var20.field_z << -1323410620, var20.field_w << -1973442844, -this.field_S << 1513949130, 4096);
              su.a((byte) -50);
              this.field_K.d(-(var20.field_z >> 874302625) + var9, -var20.field_w + var10, 256);
              return;
            }
          } else {
            this.field_K = new wb(var11, var12);
            jq.a(7161, this.field_K);
            var20.a(112, 144, var20.field_z << -1323410620, var20.field_w << -1973442844, -this.field_S << 1513949130, 4096);
            su.a((byte) -50);
            this.field_K.d(-(var20.field_z >> 874302625) + var9, -var20.field_w + var10, 256);
            return;
          }
        }
    }

    final static void f(int param0) {
        int var1;
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
