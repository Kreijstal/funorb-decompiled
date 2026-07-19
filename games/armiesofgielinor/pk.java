/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends hv {
    private n field_Z;
    private wk field_Y;
    private int field_U;
    static String field_S;
    static int field_X;
    static String field_W;
    static int[][] field_T;
    static String field_V;
    private String field_L;

    final String h(int param0) {
        if (param0 == 21384) {
            return null;
        }
        this.field_U = -103;
        return null;
    }

    final static int a(byte[] param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = -73 / ((param2 - 55) / 56);
            stackOut_0_0 = im.a(param1, param0, 0, -8779);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("pk.O(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    pk(n param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, ji.a(true));
        try {
            this.field_Z = param0;
            this.field_L = param1;
            this.a(param2, param4, param3, 8192, param5);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "pk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        String var5 = null;
        gu var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var17 = null;
        wk var18 = null;
        wk var19 = null;
        wk var20 = null;
        Object var21 = null;
        wk var22 = null;
        wk var23 = null;
        wk var24 = null;
        Object var25 = null;
        wk var26 = null;
        wk var27 = null;
        wk var28 = null;
        wk var29 = null;
        wk var30 = null;
        wk var31 = null;
        wk var32 = null;
        wk var35 = null;
        wk var36 = null;
        wk var39 = null;
        wk var40 = null;
        wk var41 = null;
        wk var42 = null;
        wk var43 = null;
        wk var44 = null;
        wk var45 = null;
        wk var46 = null;
        wk var47 = null;
        wk var48 = null;
        wk var49 = null;
        wk var50 = null;
        wk var51 = null;
        pm var52 = null;
        pm var53 = null;
        pm var54 = null;
        L0: {
          L1: {
            var17 = null;
            var21 = null;
            var25 = null;
            var13 = ArmiesOfGielinor.field_M ? 1 : 0;
            var6 = this.field_Z.a(false);
            if (ad.field_K == var6) {
              break L1;
            } else {
              if (var6 == so.field_e) {
                break L1;
              } else {
                var5 = this.field_Z.a((byte) 55);
                if (var5 == null) {
                  var5 = this.field_L;
                  if (var13 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
          var5 = gt.field_h;
          break L0;
        }
        if (var5.equals(this.field_v)) {
          super.a(param0, param1, (byte) -114, param3);
          if (param2 <= -82) {
            var6 = this.field_Z.a(false);
            var54 = (pm) ((Object) this.field_k);
            var9 = param0 + this.field_B;
            var10 = var54.a(-18033, param1, (kb) (this)) + (var54.a(-69, (kb) (this)).a((byte) 27) >> -854092863);
            if (var6 == ad.field_K) {
              L2: {
                var41 = db.field_a[0];
                var11 = var41.field_A << 633676609;
                var12 = var41.field_x << 1007017217;
                if (this.field_Y == null) {
                  break L2;
                } else {
                  if (this.field_Y.field_y < var11) {
                    break L2;
                  } else {
                    if (var12 > this.field_Y.field_v) {
                      this.field_Y = new wk(var11, var12);
                      vn.a(this.field_Y, 3);
                      if (var13 != 0) {
                        L3: {
                          L4: {
                            vn.a(this.field_Y, 3);
                            qn.b();
                            var41.b(112, 144, var41.field_A << -1976760156, var41.field_x << -609333596, -this.field_U << 606184554, 4096);
                            rf.b(-18862);
                            this.field_Y.f(var9 - (var41.field_A >> -207799071), -var41.field_x + var10, 256);
                            if (var6 == rn.field_e) {
                              break L4;
                            } else {
                              if (var6 != oo.field_g) {
                                break L3;
                              } else {
                                var42 = db.field_a[1];
                                var42.f(var9, -(var42.field_v >> -1562877407) + var10, 256);
                                break L4;
                              }
                            }
                          }
                          var43 = db.field_a[2];
                          var43.f(var9, -(var43.field_v >> -1937125855) + var10, 256);
                          break L3;
                        }
                        return;
                      } else {
                        L5: {
                          var41.b(112, 144, var41.field_A << -1976760156, var41.field_x << -609333596, -this.field_U << 606184554, 4096);
                          rf.b(-18862);
                          this.field_Y.f(var9 - (var41.field_A >> -207799071), -var41.field_x + var10, 256);
                          if (var13 == 0) {
                            break L5;
                          } else {
                            L6: {
                              if (var6 == rn.field_e) {
                                break L6;
                              } else {
                                if (var6 != oo.field_g) {
                                  break L5;
                                } else {
                                  var44 = db.field_a[1];
                                  var44.f(var9, -(var44.field_v >> -1562877407) + var10, 256);
                                  break L6;
                                }
                              }
                            }
                            var45 = db.field_a[2];
                            var45.f(var9, -(var45.field_v >> -1937125855) + var10, 256);
                            break L5;
                          }
                        }
                        return;
                      }
                    } else {
                      L7: {
                        vn.a(this.field_Y, 3);
                        qn.b();
                        var41.b(112, 144, var41.field_A << -1976760156, var41.field_x << -609333596, -this.field_U << 606184554, 4096);
                        rf.b(-18862);
                        this.field_Y.f(var9 - (var41.field_A >> -207799071), -var41.field_x + var10, 256);
                        if (var13 == 0) {
                          break L7;
                        } else {
                          L8: {
                            if (var6 == rn.field_e) {
                              break L8;
                            } else {
                              if (var6 != oo.field_g) {
                                break L7;
                              } else {
                                var46 = db.field_a[1];
                                var46.f(var9, -(var46.field_v >> -1562877407) + var10, 256);
                                break L8;
                              }
                            }
                          }
                          var47 = db.field_a[2];
                          var47.f(var9, -(var47.field_v >> -1937125855) + var10, 256);
                          break L7;
                        }
                      }
                      return;
                    }
                  }
                }
              }
              this.field_Y = new wk(var11, var12);
              vn.a(this.field_Y, 3);
              if (var13 != 0) {
                L9: {
                  L10: {
                    vn.a(this.field_Y, 3);
                    qn.b();
                    var41.b(112, 144, var41.field_A << -1976760156, var41.field_x << -609333596, -this.field_U << 606184554, 4096);
                    rf.b(-18862);
                    this.field_Y.f(var9 - (var41.field_A >> -207799071), -var41.field_x + var10, 256);
                    if (var6 == rn.field_e) {
                      break L10;
                    } else {
                      if (var6 != oo.field_g) {
                        break L9;
                      } else {
                        var48 = db.field_a[1];
                        var48.f(var9, -(var48.field_v >> -1562877407) + var10, 256);
                        break L10;
                      }
                    }
                  }
                  var49 = db.field_a[2];
                  var49.f(var9, -(var49.field_v >> -1937125855) + var10, 256);
                  break L9;
                }
                return;
              } else {
                L11: {
                  var41.b(112, 144, var41.field_A << -1976760156, var41.field_x << -609333596, -this.field_U << 606184554, 4096);
                  rf.b(-18862);
                  this.field_Y.f(var9 - (var41.field_A >> -207799071), -var41.field_x + var10, 256);
                  if (var13 == 0) {
                    break L11;
                  } else {
                    L12: {
                      if (var6 == rn.field_e) {
                        break L12;
                      } else {
                        if (var6 != oo.field_g) {
                          break L11;
                        } else {
                          var50 = db.field_a[1];
                          var50.f(var9, -(var50.field_v >> -1562877407) + var10, 256);
                          break L12;
                        }
                      }
                    }
                    var51 = db.field_a[2];
                    var51.f(var9, -(var51.field_v >> -1937125855) + var10, 256);
                    break L11;
                  }
                }
                return;
              }
            } else {
              if (so.field_e == var6) {
                var26 = db.field_a[0];
                var11 = var26.field_A << 633676609;
                var12 = var26.field_x << 1007017217;
                if (this.field_Y != null) {
                  if (this.field_Y.field_y >= var11) {
                    if (var12 > this.field_Y.field_v) {
                      this.field_Y = new wk(var11, var12);
                      vn.a(this.field_Y, 3);
                      if (var13 != 0) {
                        L13: {
                          L14: {
                            vn.a(this.field_Y, 3);
                            qn.b();
                            var26.b(112, 144, var26.field_A << -1976760156, var26.field_x << -609333596, -this.field_U << 606184554, 4096);
                            rf.b(-18862);
                            this.field_Y.f(var9 - (var26.field_A >> -207799071), -var26.field_x + var10, 256);
                            if (var6 == rn.field_e) {
                              break L14;
                            } else {
                              if (var6 != oo.field_g) {
                                break L13;
                              } else {
                                var35 = db.field_a[1];
                                var35.f(var9, -(var35.field_v >> -1562877407) + var10, 256);
                                break L14;
                              }
                            }
                          }
                          var36 = db.field_a[2];
                          var36.f(var9, -(var36.field_v >> -1937125855) + var10, 256);
                          break L13;
                        }
                        return;
                      } else {
                        L15: {
                          var26.b(112, 144, var26.field_A << -1976760156, var26.field_x << -609333596, -this.field_U << 606184554, 4096);
                          rf.b(-18862);
                          this.field_Y.f(var9 - (var26.field_A >> -207799071), -var26.field_x + var10, 256);
                          if (var13 == 0) {
                            break L15;
                          } else {
                            L16: {
                              if (var6 == rn.field_e) {
                                break L16;
                              } else {
                                if (var6 != oo.field_g) {
                                  break L15;
                                } else {
                                  var39 = db.field_a[1];
                                  var39.f(var9, -(var39.field_v >> -1562877407) + var10, 256);
                                  break L16;
                                }
                              }
                            }
                            var40 = db.field_a[2];
                            var40.f(var9, -(var40.field_v >> -1937125855) + var10, 256);
                            break L15;
                          }
                        }
                        return;
                      }
                    } else {
                      L17: {
                        vn.a(this.field_Y, 3);
                        qn.b();
                        var26.b(112, 144, var26.field_A << -1976760156, var26.field_x << -609333596, -this.field_U << 606184554, 4096);
                        rf.b(-18862);
                        this.field_Y.f(var9 - (var26.field_A >> -207799071), -var26.field_x + var10, 256);
                        if (var13 == 0) {
                          break L17;
                        } else {
                          L18: {
                            if (var6 == rn.field_e) {
                              break L18;
                            } else {
                              if (var6 != oo.field_g) {
                                break L17;
                              } else {
                                var31 = db.field_a[1];
                                var31.f(var9, -(var31.field_v >> -1562877407) + var10, 256);
                                break L18;
                              }
                            }
                          }
                          var32 = db.field_a[2];
                          var32.f(var9, -(var32.field_v >> -1937125855) + var10, 256);
                          break L17;
                        }
                      }
                      return;
                    }
                  } else {
                    L19: {
                      this.field_Y = new wk(var11, var12);
                      vn.a(this.field_Y, 3);
                      if (var13 == 0) {
                        break L19;
                      } else {
                        vn.a(this.field_Y, 3);
                        qn.b();
                        break L19;
                      }
                    }
                    L20: {
                      var26.b(112, 144, var26.field_A << -1976760156, var26.field_x << -609333596, -this.field_U << 606184554, 4096);
                      rf.b(-18862);
                      this.field_Y.f(var9 - (var26.field_A >> -207799071), -var26.field_x + var10, 256);
                      if (var13 == 0) {
                        break L20;
                      } else {
                        L21: {
                          if (var6 == rn.field_e) {
                            break L21;
                          } else {
                            if (var6 != oo.field_g) {
                              break L20;
                            } else {
                              var29 = db.field_a[1];
                              var29.f(var9, -(var29.field_v >> -1562877407) + var10, 256);
                              break L21;
                            }
                          }
                        }
                        var30 = db.field_a[2];
                        var30.f(var9, -(var30.field_v >> -1937125855) + var10, 256);
                        break L20;
                      }
                    }
                    return;
                  }
                } else {
                  L22: {
                    this.field_Y = new wk(var11, var12);
                    vn.a(this.field_Y, 3);
                    if (var13 == 0) {
                      break L22;
                    } else {
                      vn.a(this.field_Y, 3);
                      qn.b();
                      break L22;
                    }
                  }
                  L23: {
                    var26.b(112, 144, var26.field_A << -1976760156, var26.field_x << -609333596, -this.field_U << 606184554, 4096);
                    rf.b(-18862);
                    this.field_Y.f(var9 - (var26.field_A >> -207799071), -var26.field_x + var10, 256);
                    if (var13 == 0) {
                      break L23;
                    } else {
                      L24: {
                        if (var6 == rn.field_e) {
                          break L24;
                        } else {
                          if (var6 != oo.field_g) {
                            break L23;
                          } else {
                            var27 = db.field_a[1];
                            var27.f(var9, -(var27.field_v >> -1562877407) + var10, 256);
                            break L24;
                          }
                        }
                      }
                      var28 = db.field_a[2];
                      var28.f(var9, -(var28.field_v >> -1937125855) + var10, 256);
                      break L23;
                    }
                  }
                  return;
                }
              } else {
                L25: {
                  L26: {
                    if (var6 == rn.field_e) {
                      break L26;
                    } else {
                      if (var6 != oo.field_g) {
                        break L25;
                      } else {
                        var50 = db.field_a[1];
                        var50.f(var9, -(var50.field_v >> -1562877407) + var10, 256);
                        if (var13 == 0) {
                          break L25;
                        } else {
                          break L26;
                        }
                      }
                    }
                  }
                  var51 = db.field_a[2];
                  var51.f(var9, -(var51.field_v >> -1937125855) + var10, 256);
                  break L25;
                }
                return;
              }
            }
          } else {
            L27: {
              L28: {
                L29: {
                  field_W = (String) null;
                  var6 = this.field_Z.a(false);
                  var53 = (pm) ((Object) this.field_k);
                  var9 = param0 + this.field_B;
                  var10 = var53.a(-18033, param1, (kb) (this)) + (var53.a(-69, (kb) (this)).a((byte) 27) >> -854092863);
                  if (var6 == ad.field_K) {
                    break L29;
                  } else {
                    if (so.field_e != var6) {
                      break L28;
                    } else {
                      break L29;
                    }
                  }
                }
                L30: {
                  L31: {
                    var22 = db.field_a[0];
                    var11 = var22.field_A << 633676609;
                    var12 = var22.field_x << 1007017217;
                    if (this.field_Y == null) {
                      break L31;
                    } else {
                      if (this.field_Y.field_y < var11) {
                        break L31;
                      } else {
                        if (var12 <= this.field_Y.field_v) {
                          vn.a(this.field_Y, 3);
                          qn.b();
                          break L30;
                        } else {
                          break L31;
                        }
                      }
                    }
                  }
                  this.field_Y = new wk(var11, var12);
                  vn.a(this.field_Y, 3);
                  if (var13 == 0) {
                    break L30;
                  } else {
                    vn.a(this.field_Y, 3);
                    qn.b();
                    break L30;
                  }
                }
                var22.b(112, 144, var22.field_A << -1976760156, var22.field_x << -609333596, -this.field_U << 606184554, 4096);
                rf.b(-18862);
                this.field_Y.f(var9 - (var22.field_A >> -207799071), -var22.field_x + var10, 256);
                if (var13 == 0) {
                  break L27;
                } else {
                  break L28;
                }
              }
              L32: {
                if (var6 == rn.field_e) {
                  break L32;
                } else {
                  if (var6 != oo.field_g) {
                    break L27;
                  } else {
                    var23 = db.field_a[1];
                    var23.f(var9, -(var23.field_v >> -1562877407) + var10, 256);
                    if (var13 == 0) {
                      break L27;
                    } else {
                      break L32;
                    }
                  }
                }
              }
              var24 = db.field_a[2];
              var24.f(var9, -(var24.field_v >> -1937125855) + var10, 256);
              break L27;
            }
            return;
          }
        } else {
          L33: {
            this.field_v = var5;
            this.a(-128);
            super.a(param0, param1, (byte) -114, param3);
            if (param2 <= -82) {
              break L33;
            } else {
              field_W = (String) null;
              break L33;
            }
          }
          L34: {
            L35: {
              L36: {
                var6 = this.field_Z.a(false);
                var52 = (pm) ((Object) this.field_k);
                var9 = param0 + this.field_B;
                var10 = var52.a(-18033, param1, (kb) (this)) + (var52.a(-69, (kb) (this)).a((byte) 27) >> -854092863);
                if (var6 == ad.field_K) {
                  break L36;
                } else {
                  if (so.field_e != var6) {
                    break L35;
                  } else {
                    break L36;
                  }
                }
              }
              L37: {
                L38: {
                  var18 = db.field_a[0];
                  var11 = var18.field_A << 633676609;
                  var12 = var18.field_x << 1007017217;
                  if (this.field_Y == null) {
                    break L38;
                  } else {
                    if (this.field_Y.field_y < var11) {
                      break L38;
                    } else {
                      if (var12 <= this.field_Y.field_v) {
                        vn.a(this.field_Y, 3);
                        qn.b();
                        break L37;
                      } else {
                        break L38;
                      }
                    }
                  }
                }
                this.field_Y = new wk(var11, var12);
                vn.a(this.field_Y, 3);
                if (var13 == 0) {
                  break L37;
                } else {
                  vn.a(this.field_Y, 3);
                  qn.b();
                  break L37;
                }
              }
              var18.b(112, 144, var18.field_A << -1976760156, var18.field_x << -609333596, -this.field_U << 606184554, 4096);
              rf.b(-18862);
              this.field_Y.f(var9 - (var18.field_A >> -207799071), -var18.field_x + var10, 256);
              if (var13 == 0) {
                break L34;
              } else {
                break L35;
              }
            }
            L39: {
              if (var6 == rn.field_e) {
                break L39;
              } else {
                if (var6 != oo.field_g) {
                  break L34;
                } else {
                  var19 = db.field_a[1];
                  var19.f(var9, -(var19.field_v >> -1562877407) + var10, 256);
                  if (var13 == 0) {
                    break L34;
                  } else {
                    break L39;
                  }
                }
              }
            }
            var20 = db.field_a[2];
            var20.f(var9, -(var20.field_v >> -1937125855) + var10, 256);
            break L34;
          }
          return;
        }
    }

    final boolean a(int param0, kb param1) {
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
            L1: {
              if (param0 == 11) {
                break L1;
              } else {
                pk.a(56, -104, -60, 38, -92, -10, 85, -99);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("pk.M(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var8 = cq.field_u[param3];
          if (11 != var8) {
            break L0;
          } else {
            var8 = 7;
            break L0;
          }
        }
        if (param5 == -29403) {
          if (var8 != 0) {
            if (7 != var8) {
              L1: {
                if (-10 != (var8 ^ -1)) {
                  break L1;
                } else {
                  var8 = 2;
                  break L1;
                }
              }
              L2: {
                j.field_b = var8;
                uf.field_e = var8;
                rq.field_m = var8;
                np.field_Wb = var8;
                oh.field_E = var8;
                pv.field_b = var8;
                cs.field_Y = var8;
                gt.field_i = var8;
                va.field_z = var8;
                if (0 >= param2) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L2;
                }
              }
              L3: {
                var9 = stackIn_13_0;
                if (param2 >= ks.field_y - 1) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L3;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L3;
                }
              }
              var10 = stackIn_16_0;
              if ((param1 ^ -1) < -1) {
                L4: {
                  if (var9 != 0) {
                    np.field_Wb = cq.field_u[param3 + (-ks.field_y + -1)];
                    break L4;
                  } else {
                    break L4;
                  }
                }
                pv.field_b = cq.field_u[-ks.field_y + param3];
                if (var10 != 0) {
                  L5: {
                    rq.field_m = cq.field_u[-ks.field_y + (param3 + 1)];
                    if (var9 != 0) {
                      cs.field_Y = cq.field_u[-1 + param3];
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (var10 == 0) {
                    var8 = var8 * 20;
                    if (-1 + ef.field_c > param1) {
                      if (var9 == 0) {
                        va.field_z = cq.field_u[ks.field_y + param3];
                        if (var10 == 0) {
                          ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                          return;
                        } else {
                          gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                          ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                          return;
                        }
                      } else {
                        L6: {
                          oh.field_E = cq.field_u[-1 + (param3 + ks.field_y)];
                          va.field_z = cq.field_u[ks.field_y + param3];
                          if (var10 != 0) {
                            gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                        return;
                      }
                    } else {
                      ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                      ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                      ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                      ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                      return;
                    }
                  } else {
                    L7: {
                      uf.field_e = cq.field_u[param3 + 1];
                      var8 = var8 * 20;
                      if (-1 + ef.field_c <= param1) {
                        break L7;
                      } else {
                        L8: {
                          if (var9 == 0) {
                            break L8;
                          } else {
                            oh.field_E = cq.field_u[-1 + (param3 + ks.field_y)];
                            break L8;
                          }
                        }
                        va.field_z = cq.field_u[ks.field_y + param3];
                        if (var10 != 0) {
                          gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                    ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                    return;
                  }
                } else {
                  L9: {
                    if (var9 != 0) {
                      cs.field_Y = cq.field_u[-1 + param3];
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  if (var10 == 0) {
                    var8 = var8 * 20;
                    if (-1 + ef.field_c > param1) {
                      if (var9 == 0) {
                        va.field_z = cq.field_u[ks.field_y + param3];
                        if (var10 == 0) {
                          ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                          return;
                        } else {
                          gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                          ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                          ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                          return;
                        }
                      } else {
                        L10: {
                          oh.field_E = cq.field_u[-1 + (param3 + ks.field_y)];
                          va.field_z = cq.field_u[ks.field_y + param3];
                          if (var10 != 0) {
                            gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                        return;
                      }
                    } else {
                      ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                      ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                      ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                      ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                      return;
                    }
                  } else {
                    L11: {
                      uf.field_e = cq.field_u[param3 + 1];
                      var8 = var8 * 20;
                      if (-1 + ef.field_c <= param1) {
                        break L11;
                      } else {
                        L12: {
                          if (var9 == 0) {
                            break L12;
                          } else {
                            oh.field_E = cq.field_u[-1 + (param3 + ks.field_y)];
                            break L12;
                          }
                        }
                        va.field_z = cq.field_u[ks.field_y + param3];
                        if (var10 != 0) {
                          gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                    ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                    return;
                  }
                }
              } else {
                L13: {
                  if (var9 != 0) {
                    cs.field_Y = cq.field_u[-1 + param3];
                    break L13;
                  } else {
                    break L13;
                  }
                }
                if (var10 == 0) {
                  var8 = var8 * 20;
                  if (-1 + ef.field_c > param1) {
                    if (var9 == 0) {
                      va.field_z = cq.field_u[ks.field_y + param3];
                      if (var10 == 0) {
                        ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                        return;
                      } else {
                        gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                        ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                        ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                        return;
                      }
                    } else {
                      L14: {
                        oh.field_E = cq.field_u[-1 + (param3 + ks.field_y)];
                        va.field_z = cq.field_u[ks.field_y + param3];
                        if (var10 != 0) {
                          gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                      ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                      ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                      ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                      return;
                    }
                  } else {
                    ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                    ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                    return;
                  }
                } else {
                  L15: {
                    uf.field_e = cq.field_u[param3 + 1];
                    var8 = var8 * 20;
                    if (-1 + ef.field_c <= param1) {
                      break L15;
                    } else {
                      L16: {
                        if (var9 == 0) {
                          break L16;
                        } else {
                          oh.field_E = cq.field_u[-1 + (param3 + ks.field_y)];
                          break L16;
                        }
                      }
                      va.field_z = cq.field_u[ks.field_y + param3];
                      if (var10 != 0) {
                        gt.field_i = cq.field_u[1 + (ks.field_y + param3)];
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  }
                  ac.field_k[ls.a(rq.field_m, j.field_b, pv.field_b, uf.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
                  ac.field_k[ls.a(np.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
                  ac.field_k[ls.a(gt.field_i, j.field_b, va.field_z, uf.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
                  ac.field_k[ls.a(oh.field_E, j.field_b, va.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void c(boolean param0) {
        field_S = null;
        field_W = null;
        field_T = (int[][]) null;
        if (param0) {
            field_W = (String) null;
            field_V = null;
            return;
        }
        field_V = null;
    }

    final void a(int param0, int param1, int param2, kb param3) {
        try {
            this.field_U = this.field_U + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "pk.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_T = new int[][]{new int[]{150, 150}, new int[]{300, 150}, new int[]{50, 150}, new int[]{150, 150}, new int[]{425, 450}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{50, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{450, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{250, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{50, 150}, new int[]{300, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{50, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{250, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{400, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{0, 150}, new int[]{100, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{250, 150}, new int[]{100, 150}, new int[]{150, 150}, new int[]{250, 150}, new int[]{150, 150}, new int[]{20, 150}, new int[]{150, 150}, new int[]{50, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{5, 150}, new int[]{150, 150}, new int[]{40, 150}, new int[]{150, 150}, new int[]{400, 450}, new int[]{380, 380}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{425, 450}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 165}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}};
        field_S = "Only show lobby chat from my friends";
        field_W = "Invite <%0> to this game";
        field_V = "You are not currently logged in to the game.";
        field_X = 0;
    }
}
