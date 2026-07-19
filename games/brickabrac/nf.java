/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf extends lg {
    private int field_Q;
    static int field_P;
    private String field_S;
    static int field_Y;
    static jp[] field_W;
    static boolean field_V;
    private jp field_X;
    private ia field_R;
    static String field_T;
    static jp field_U;

    final boolean a(boolean param0, oc param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("nf.CA(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final String d(int param0) {
        if (param0 > 6) {
            return null;
        }
        return (String) null;
    }

    nf(ia param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, dn.g(-23009));
        try {
            this.field_R = param0;
            this.field_S = param1;
            this.a(param5, param2, param3, (byte) -119, param4);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "nf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(byte param0) {
        po.a(13);
        if (param0 != 109) {
            field_T = (String) null;
        }
    }

    public static void f(byte param0) {
        field_W = null;
        field_U = null;
        field_T = null;
        if (param0 >= -18) {
            nf.a((byte) 48);
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        String var5 = null;
        qh var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        jp var16 = null;
        String var17 = null;
        Object var18 = null;
        qe var18_ref = null;
        jp var19 = null;
        jp var20 = null;
        jp var21 = null;
        Object var22 = null;
        qe var22_ref = null;
        jp var23 = null;
        jp var24 = null;
        jp var25 = null;
        String var26 = null;
        Object var27 = null;
        qe var27_ref = null;
        jp var28 = null;
        jp var29 = null;
        jp var30 = null;
        Object var31 = null;
        qe var31_ref = null;
        jp var32 = null;
        jp var33 = null;
        jp var34 = null;
        String var35 = null;
        Object var36 = null;
        qe var36_ref = null;
        jp var37 = null;
        jp var38 = null;
        jp var39 = null;
        Object var40 = null;
        qe var40_ref = null;
        jp var41 = null;
        jp var42 = null;
        jp var43 = null;
        Object var44 = null;
        qe var44_ref = null;
        jp var45 = null;
        jp var46 = null;
        jp var47 = null;
        Object var50 = null;
        qe var50_ref = null;
        jp var51 = null;
        jp var52 = null;
        jp var53 = null;
        var18 = null;
        var22 = null;
        var27 = null;
        var31 = null;
        var36 = null;
        var40 = null;
        var44 = null;
        var50 = null;
        var13 = BrickABrac.field_J ? 1 : 0;
        var6 = this.field_R.b((byte) -31);
        if (var6 != m.field_c) {
          if (var6 != hq.field_z) {
            var5 = this.field_R.a(-118);
            if (var5 == null) {
              var35 = this.field_S;
              var5 = var35;
              if (var35.equals(this.field_A)) {
                L0: {
                  super.a(param0, param1, param2, param3);
                  var6 = this.field_R.b((byte) -31);
                  var40_ref = (qe) ((Object) this.field_l);
                  var9 = param1 - -this.field_o;
                  var10 = var40_ref.a(param0, (byte) -107, (oc) (this)) + (var40_ref.c((oc) (this), param3 ^ 32).a(0) >> -833648607);
                  if (var6 == m.field_c) {
                    break L0;
                  } else {
                    if (var6 == hq.field_z) {
                      break L0;
                    } else {
                      if (lp.field_xb != var6) {
                        if (ae.field_c == var6) {
                          var42 = df.field_a[1];
                          var42.f(var9, -(var42.field_C >> 2009432417) + var10, 256);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        var41 = df.field_a[2];
                        var41.f(var9, var10 + -(var41.field_C >> -1503530367), 256);
                        return;
                      }
                    }
                  }
                }
                var43 = df.field_a[0];
                var11 = var43.field_x << 502555841;
                var12 = var43.field_z << -163154431;
                if (this.field_X != null) {
                  if (var11 <= this.field_X.field_D) {
                    if (this.field_X.field_C < var12) {
                      this.field_X = new jp(var11, var12);
                      fc.a(-86, this.field_X);
                      var43.a(112, 144, var43.field_x << 132121412, var43.field_z << 75900932, -this.field_Q << 189561354, 4096);
                      sc.b(-111);
                      this.field_X.f(-(var43.field_x >> -1674179551) + var9, -var43.field_z + var10, 256);
                      return;
                    } else {
                      fc.a(-70, this.field_X);
                      lb.d();
                      var43.a(112, 144, var43.field_x << 132121412, var43.field_z << 75900932, -this.field_Q << 189561354, 4096);
                      sc.b(-111);
                      this.field_X.f(-(var43.field_x >> -1674179551) + var9, -var43.field_z + var10, 256);
                      return;
                    }
                  } else {
                    this.field_X = new jp(var11, var12);
                    fc.a(-86, this.field_X);
                    var43.a(112, 144, var43.field_x << 132121412, var43.field_z << 75900932, -this.field_Q << 189561354, 4096);
                    sc.b(-111);
                    this.field_X.f(-(var43.field_x >> -1674179551) + var9, -var43.field_z + var10, 256);
                    return;
                  }
                } else {
                  this.field_X = new jp(var11, var12);
                  fc.a(-86, this.field_X);
                  var43.a(112, 144, var43.field_x << 132121412, var43.field_z << 75900932, -this.field_Q << 189561354, 4096);
                  sc.b(-111);
                  this.field_X.f(-(var43.field_x >> -1674179551) + var9, -var43.field_z + var10, 256);
                  return;
                }
              } else {
                L1: {
                  L2: {
                    this.field_A = var35;
                    this.i(param3 + 10);
                    super.a(param0, param1, param2, param3);
                    var6 = this.field_R.b((byte) -31);
                    var36_ref = (qe) ((Object) this.field_l);
                    var9 = param1 - -this.field_o;
                    var10 = var36_ref.a(param0, (byte) -107, (oc) (this)) + (var36_ref.c((oc) (this), param3 ^ 32).a(0) >> -833648607);
                    if (var6 == m.field_c) {
                      break L2;
                    } else {
                      if (var6 == hq.field_z) {
                        break L2;
                      } else {
                        if (lp.field_xb != var6) {
                          if (ae.field_c == var6) {
                            var38 = df.field_a[1];
                            var38.f(var9, -(var38.field_C >> 2009432417) + var10, 256);
                            break L1;
                          } else {
                            break L1;
                          }
                        } else {
                          var37 = df.field_a[2];
                          var37.f(var9, var10 + -(var37.field_C >> -1503530367), 256);
                          break L1;
                        }
                      }
                    }
                  }
                  L3: {
                    L4: {
                      var39 = df.field_a[0];
                      var11 = var39.field_x << 502555841;
                      var12 = var39.field_z << -163154431;
                      if (this.field_X == null) {
                        break L4;
                      } else {
                        if (var11 > this.field_X.field_D) {
                          break L4;
                        } else {
                          if (this.field_X.field_C < var12) {
                            break L4;
                          } else {
                            fc.a(-70, this.field_X);
                            lb.d();
                            break L3;
                          }
                        }
                      }
                    }
                    this.field_X = new jp(var11, var12);
                    fc.a(-86, this.field_X);
                    break L3;
                  }
                  var39.a(112, 144, var39.field_x << 132121412, var39.field_z << 75900932, -this.field_Q << 189561354, 4096);
                  sc.b(-111);
                  this.field_X.f(-(var39.field_x >> -1674179551) + var9, -var39.field_z + var10, 256);
                  break L1;
                }
                return;
              }
            } else {
              if (var5.equals(this.field_A)) {
                L5: {
                  super.a(param0, param1, param2, param3);
                  var6 = this.field_R.b((byte) -31);
                  var50_ref = (qe) ((Object) this.field_l);
                  var9 = param1 - -this.field_o;
                  var10 = var50_ref.a(param0, (byte) -107, (oc) (this)) + (var50_ref.c((oc) (this), param3 ^ 32).a(0) >> -833648607);
                  if (var6 == m.field_c) {
                    break L5;
                  } else {
                    if (var6 == hq.field_z) {
                      break L5;
                    } else {
                      if (lp.field_xb != var6) {
                        if (ae.field_c == var6) {
                          var52 = df.field_a[1];
                          var52.f(var9, -(var52.field_C >> 2009432417) + var10, 256);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        var51 = df.field_a[2];
                        var51.f(var9, var10 + -(var51.field_C >> -1503530367), 256);
                        return;
                      }
                    }
                  }
                }
                L6: {
                  var53 = df.field_a[0];
                  var11 = var53.field_x << 502555841;
                  var12 = var53.field_z << -163154431;
                  if (this.field_X == null) {
                    break L6;
                  } else {
                    if (var11 > this.field_X.field_D) {
                      break L6;
                    } else {
                      if (this.field_X.field_C < var12) {
                        break L6;
                      } else {
                        fc.a(-70, this.field_X);
                        lb.d();
                        var53.a(112, 144, var53.field_x << 132121412, var53.field_z << 75900932, -this.field_Q << 189561354, 4096);
                        sc.b(-111);
                        this.field_X.f(-(var53.field_x >> -1674179551) + var9, -var53.field_z + var10, 256);
                        return;
                      }
                    }
                  }
                }
                this.field_X = new jp(var11, var12);
                fc.a(-86, this.field_X);
                var53.a(112, 144, var53.field_x << 132121412, var53.field_z << 75900932, -this.field_Q << 189561354, 4096);
                sc.b(-111);
                this.field_X.f(-(var53.field_x >> -1674179551) + var9, -var53.field_z + var10, 256);
                return;
              } else {
                L7: {
                  this.field_A = var5;
                  this.i(param3 + 10);
                  super.a(param0, param1, param2, param3);
                  var6 = this.field_R.b((byte) -31);
                  var44_ref = (qe) ((Object) this.field_l);
                  var9 = param1 - -this.field_o;
                  var10 = var44_ref.a(param0, (byte) -107, (oc) (this)) + (var44_ref.c((oc) (this), param3 ^ 32).a(0) >> -833648607);
                  if (var6 == m.field_c) {
                    break L7;
                  } else {
                    if (var6 == hq.field_z) {
                      break L7;
                    } else {
                      if (lp.field_xb != var6) {
                        if (ae.field_c != var6) {
                          return;
                        } else {
                          var46 = df.field_a[1];
                          var46.f(var9, -(var46.field_C >> 2009432417) + var10, 256);
                          return;
                        }
                      } else {
                        var45 = df.field_a[2];
                        var45.f(var9, var10 + -(var45.field_C >> -1503530367), 256);
                        return;
                      }
                    }
                  }
                }
                var47 = df.field_a[0];
                var16 = var47;
                var11 = var47.field_x << 502555841;
                var12 = var47.field_z << -163154431;
                if (this.field_X != null) {
                  if (var11 <= this.field_X.field_D) {
                    if (this.field_X.field_C >= var12) {
                      fc.a(-70, this.field_X);
                      lb.d();
                      var47.a(112, 144, var47.field_x << 132121412, var47.field_z << 75900932, -this.field_Q << 189561354, 4096);
                      sc.b(-111);
                      this.field_X.f(-(var47.field_x >> -1674179551) + var9, -var47.field_z + var10, 256);
                      return;
                    } else {
                      this.field_X = new jp(var11, var12);
                      fc.a(-86, this.field_X);
                      var47.a(112, 144, var47.field_x << 132121412, var47.field_z << 75900932, -this.field_Q << 189561354, 4096);
                      sc.b(-111);
                      this.field_X.f(-(var47.field_x >> -1674179551) + var9, -var47.field_z + var10, 256);
                      return;
                    }
                  } else {
                    this.field_X = new jp(var11, var12);
                    fc.a(-86, this.field_X);
                    var47.a(112, 144, var47.field_x << 132121412, var47.field_z << 75900932, -this.field_Q << 189561354, 4096);
                    sc.b(-111);
                    this.field_X.f(-(var47.field_x >> -1674179551) + var9, -var47.field_z + var10, 256);
                    return;
                  }
                } else {
                  this.field_X = new jp(var11, var12);
                  fc.a(-86, this.field_X);
                  var47.a(112, 144, var47.field_x << 132121412, var47.field_z << 75900932, -this.field_Q << 189561354, 4096);
                  sc.b(-111);
                  this.field_X.f(-(var47.field_x >> -1674179551) + var9, -var47.field_z + var10, 256);
                  return;
                }
              }
            }
          } else {
            var26 = jb.field_G;
            if (var26.equals(this.field_A)) {
              L8: {
                super.a(param0, param1, param2, param3);
                var6 = this.field_R.b((byte) -31);
                var31_ref = (qe) ((Object) this.field_l);
                var9 = param1 - -this.field_o;
                var10 = var31_ref.a(param0, (byte) -107, (oc) (this)) + (var31_ref.c((oc) (this), param3 ^ 32).a(0) >> -833648607);
                if (var6 == m.field_c) {
                  break L8;
                } else {
                  if (var6 == hq.field_z) {
                    break L8;
                  } else {
                    if (lp.field_xb != var6) {
                      if (ae.field_c != var6) {
                        return;
                      } else {
                        var33 = df.field_a[1];
                        var33.f(var9, -(var33.field_C >> 2009432417) + var10, 256);
                        return;
                      }
                    } else {
                      var32 = df.field_a[2];
                      var32.f(var9, var10 + -(var32.field_C >> -1503530367), 256);
                      return;
                    }
                  }
                }
              }
              var34 = df.field_a[0];
              var11 = var34.field_x << 502555841;
              var12 = var34.field_z << -163154431;
              if (this.field_X != null) {
                if (var11 <= this.field_X.field_D) {
                  if (this.field_X.field_C >= var12) {
                    fc.a(-70, this.field_X);
                    lb.d();
                    var34.a(112, 144, var34.field_x << 132121412, var34.field_z << 75900932, -this.field_Q << 189561354, 4096);
                    sc.b(-111);
                    this.field_X.f(-(var34.field_x >> -1674179551) + var9, -var34.field_z + var10, 256);
                    return;
                  } else {
                    this.field_X = new jp(var11, var12);
                    fc.a(-86, this.field_X);
                    var34.a(112, 144, var34.field_x << 132121412, var34.field_z << 75900932, -this.field_Q << 189561354, 4096);
                    sc.b(-111);
                    this.field_X.f(-(var34.field_x >> -1674179551) + var9, -var34.field_z + var10, 256);
                    return;
                  }
                } else {
                  this.field_X = new jp(var11, var12);
                  fc.a(-86, this.field_X);
                  var34.a(112, 144, var34.field_x << 132121412, var34.field_z << 75900932, -this.field_Q << 189561354, 4096);
                  sc.b(-111);
                  this.field_X.f(-(var34.field_x >> -1674179551) + var9, -var34.field_z + var10, 256);
                  return;
                }
              } else {
                this.field_X = new jp(var11, var12);
                fc.a(-86, this.field_X);
                var34.a(112, 144, var34.field_x << 132121412, var34.field_z << 75900932, -this.field_Q << 189561354, 4096);
                sc.b(-111);
                this.field_X.f(-(var34.field_x >> -1674179551) + var9, -var34.field_z + var10, 256);
                return;
              }
            } else {
              L9: {
                L10: {
                  this.field_A = var26;
                  this.i(param3 + 10);
                  super.a(param0, param1, param2, param3);
                  var6 = this.field_R.b((byte) -31);
                  var27_ref = (qe) ((Object) this.field_l);
                  var9 = param1 - -this.field_o;
                  var10 = var27_ref.a(param0, (byte) -107, (oc) (this)) + (var27_ref.c((oc) (this), param3 ^ 32).a(0) >> -833648607);
                  if (var6 == m.field_c) {
                    break L10;
                  } else {
                    if (var6 == hq.field_z) {
                      break L10;
                    } else {
                      if (lp.field_xb != var6) {
                        if (ae.field_c == var6) {
                          var29 = df.field_a[1];
                          var29.f(var9, -(var29.field_C >> 2009432417) + var10, 256);
                          break L9;
                        } else {
                          break L9;
                        }
                      } else {
                        var28 = df.field_a[2];
                        var28.f(var9, var10 + -(var28.field_C >> -1503530367), 256);
                        break L9;
                      }
                    }
                  }
                }
                L11: {
                  L12: {
                    var30 = df.field_a[0];
                    var11 = var30.field_x << 502555841;
                    var12 = var30.field_z << -163154431;
                    if (this.field_X == null) {
                      break L12;
                    } else {
                      if (var11 > this.field_X.field_D) {
                        break L12;
                      } else {
                        if (this.field_X.field_C < var12) {
                          break L12;
                        } else {
                          fc.a(-70, this.field_X);
                          lb.d();
                          break L11;
                        }
                      }
                    }
                  }
                  this.field_X = new jp(var11, var12);
                  fc.a(-86, this.field_X);
                  break L11;
                }
                var30.a(112, 144, var30.field_x << 132121412, var30.field_z << 75900932, -this.field_Q << 189561354, 4096);
                sc.b(-111);
                this.field_X.f(-(var30.field_x >> -1674179551) + var9, -var30.field_z + var10, 256);
                break L9;
              }
              return;
            }
          }
        } else {
          var17 = jb.field_G;
          if (var17.equals(this.field_A)) {
            L13: {
              super.a(param0, param1, param2, param3);
              var6 = this.field_R.b((byte) -31);
              var22_ref = (qe) ((Object) this.field_l);
              var9 = param1 - -this.field_o;
              var10 = var22_ref.a(param0, (byte) -107, (oc) (this)) + (var22_ref.c((oc) (this), param3 ^ 32).a(0) >> -833648607);
              if (var6 == m.field_c) {
                break L13;
              } else {
                if (var6 == hq.field_z) {
                  break L13;
                } else {
                  if (lp.field_xb != var6) {
                    if (ae.field_c != var6) {
                      return;
                    } else {
                      var24 = df.field_a[1];
                      var24.f(var9, -(var24.field_C >> 2009432417) + var10, 256);
                      return;
                    }
                  } else {
                    var23 = df.field_a[2];
                    var23.f(var9, var10 + -(var23.field_C >> -1503530367), 256);
                    return;
                  }
                }
              }
            }
            var25 = df.field_a[0];
            var11 = var25.field_x << 502555841;
            var12 = var25.field_z << -163154431;
            if (this.field_X != null) {
              if (var11 <= this.field_X.field_D) {
                if (this.field_X.field_C >= var12) {
                  fc.a(-70, this.field_X);
                  lb.d();
                  var25.a(112, 144, var25.field_x << 132121412, var25.field_z << 75900932, -this.field_Q << 189561354, 4096);
                  sc.b(-111);
                  this.field_X.f(-(var25.field_x >> -1674179551) + var9, -var25.field_z + var10, 256);
                  return;
                } else {
                  this.field_X = new jp(var11, var12);
                  fc.a(-86, this.field_X);
                  var25.a(112, 144, var25.field_x << 132121412, var25.field_z << 75900932, -this.field_Q << 189561354, 4096);
                  sc.b(-111);
                  this.field_X.f(-(var25.field_x >> -1674179551) + var9, -var25.field_z + var10, 256);
                  return;
                }
              } else {
                this.field_X = new jp(var11, var12);
                fc.a(-86, this.field_X);
                var25.a(112, 144, var25.field_x << 132121412, var25.field_z << 75900932, -this.field_Q << 189561354, 4096);
                sc.b(-111);
                this.field_X.f(-(var25.field_x >> -1674179551) + var9, -var25.field_z + var10, 256);
                return;
              }
            } else {
              this.field_X = new jp(var11, var12);
              fc.a(-86, this.field_X);
              var25.a(112, 144, var25.field_x << 132121412, var25.field_z << 75900932, -this.field_Q << 189561354, 4096);
              sc.b(-111);
              this.field_X.f(-(var25.field_x >> -1674179551) + var9, -var25.field_z + var10, 256);
              return;
            }
          } else {
            L14: {
              L15: {
                this.field_A = var17;
                this.i(param3 + 10);
                super.a(param0, param1, param2, param3);
                var6 = this.field_R.b((byte) -31);
                var18_ref = (qe) ((Object) this.field_l);
                var9 = param1 - -this.field_o;
                var10 = var18_ref.a(param0, (byte) -107, (oc) (this)) + (var18_ref.c((oc) (this), param3 ^ 32).a(0) >> -833648607);
                if (var6 == m.field_c) {
                  break L15;
                } else {
                  if (var6 == hq.field_z) {
                    break L15;
                  } else {
                    if (lp.field_xb != var6) {
                      if (ae.field_c == var6) {
                        var20 = df.field_a[1];
                        var20.f(var9, -(var20.field_C >> 2009432417) + var10, 256);
                        break L14;
                      } else {
                        break L14;
                      }
                    } else {
                      var19 = df.field_a[2];
                      var19.f(var9, var10 + -(var19.field_C >> -1503530367), 256);
                      break L14;
                    }
                  }
                }
              }
              L16: {
                L17: {
                  var21 = df.field_a[0];
                  var11 = var21.field_x << 502555841;
                  var12 = var21.field_z << -163154431;
                  if (this.field_X == null) {
                    break L17;
                  } else {
                    if (var11 > this.field_X.field_D) {
                      break L17;
                    } else {
                      if (this.field_X.field_C < var12) {
                        break L17;
                      } else {
                        fc.a(-70, this.field_X);
                        lb.d();
                        break L16;
                      }
                    }
                  }
                }
                this.field_X = new jp(var11, var12);
                fc.a(-86, this.field_X);
                break L16;
              }
              var21.a(112, 144, var21.field_x << 132121412, var21.field_z << 75900932, -this.field_Q << 189561354, 4096);
              sc.b(-111);
              this.field_X.f(-(var21.field_x >> -1674179551) + var9, -var21.field_z + var10, 256);
              break L14;
            }
            return;
          }
        }
    }

    final void a(oc param0, byte param1, int param2, int param3) {
        try {
            this.field_Q = this.field_Q + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "nf.WA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_V = false;
        field_T = "You have been removed from <%0>'s game.";
    }
}
