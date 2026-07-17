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
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("nf.CA(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0 != 0;
    }

    final String d(int param0) {
        if (param0 > 6) {
            return null;
        }
        return null;
    }

    nf(ia param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (ub) (Object) dn.g(-23009));
        try {
            ((nf) this).field_R = param0;
            ((nf) this).field_S = param1;
            ((nf) this).a(param5, param2, param3, (byte) -119, param4);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "nf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void a(byte param0) {
        po.a(13);
        field_T = null;
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
        Object var8 = null;
        qe var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        jp var14 = null;
        jp var15 = null;
        jp var16 = null;
        var8 = null;
        var13 = BrickABrac.field_J ? 1 : 0;
        var6 = ((nf) this).field_R.b((byte) -31);
        if (var6 != m.field_c) {
          if (var6 != hq.field_z) {
            var5 = ((nf) this).field_R.a(-118);
            if (var5 == null) {
              L0: {
                var5 = ((nf) this).field_S;
                if (var13 == 0) {
                  break L0;
                } else {
                  var5 = jb.field_G;
                  break L0;
                }
              }
              if (var5.equals((Object) (Object) ((nf) this).field_A)) {
                L1: {
                  L2: {
                    super.a(param0, param1, param2, param3);
                    var6 = ((nf) this).field_R.b((byte) -31);
                    var8_ref = (qe) (Object) ((nf) this).field_l;
                    var9 = param1 - -((nf) this).field_o;
                    var10 = var8_ref.a(param0, (byte) -107, (oc) this) + (var8_ref.c((oc) this, param3 ^ 32).a(0) >> 1);
                    if (var6 == m.field_c) {
                      break L2;
                    } else {
                      if (var6 == hq.field_z) {
                        break L2;
                      } else {
                        L3: {
                          if (lp.field_xb != var6) {
                            break L3;
                          } else {
                            var14 = df.field_a[2];
                            var14.f(var9, var10 + -(var14.field_C >> 1), 256);
                            if (var13 == 0) {
                              break L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                        if (ae.field_c == var6) {
                          var15 = df.field_a[1];
                          var15.f(var9, -(var15.field_C >> 1) + var10, 256);
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
                    var16 = df.field_a[0];
                    var11 = var16.field_x << 1;
                    var12 = var16.field_z << 1;
                    if (((nf) this).field_X == null) {
                      break L4;
                    } else {
                      if (var11 > ((nf) this).field_X.field_D) {
                        break L4;
                      } else {
                        if (((nf) this).field_X.field_C < var12) {
                          break L4;
                        } else {
                          fc.a(-70, ((nf) this).field_X);
                          lb.d();
                          if (var13 == 0) {
                            var16.a(112, 144, var16.field_x << 4, var16.field_z << 4, -((nf) this).field_Q << 10, 4096);
                            sc.b(-111);
                            ((nf) this).field_X.f(-(var16.field_x >> 1) + var9, -var16.field_z + var10, 256);
                            break L1;
                          } else {
                            ((nf) this).field_X = new jp(var11, var12);
                            fc.a(-86, ((nf) this).field_X);
                            var16.a(112, 144, var16.field_x << 4, var16.field_z << 4, -((nf) this).field_Q << 10, 4096);
                            sc.b(-111);
                            ((nf) this).field_X.f(-(var16.field_x >> 1) + var9, -var16.field_z + var10, 256);
                            return;
                          }
                        }
                      }
                    }
                  }
                  ((nf) this).field_X = new jp(var11, var12);
                  fc.a(-86, ((nf) this).field_X);
                  var16.a(112, 144, var16.field_x << 4, var16.field_z << 4, -((nf) this).field_Q << 10, 4096);
                  sc.b(-111);
                  ((nf) this).field_X.f(-(var16.field_x >> 1) + var9, -var16.field_z + var10, 256);
                  return;
                }
                return;
              } else {
                L5: {
                  ((nf) this).field_A = var5;
                  ((nf) this).i(param3 + 10);
                  super.a(param0, param1, param2, param3);
                  var6 = ((nf) this).field_R.b((byte) -31);
                  var8_ref = (qe) (Object) ((nf) this).field_l;
                  var9 = param1 - -((nf) this).field_o;
                  var10 = var8_ref.a(param0, (byte) -107, (oc) this) + (var8_ref.c((oc) this, param3 ^ 32).a(0) >> 1);
                  if (var6 == m.field_c) {
                    break L5;
                  } else {
                    if (var6 == hq.field_z) {
                      break L5;
                    } else {
                      L6: {
                        if (lp.field_xb != var6) {
                          break L6;
                        } else {
                          var14 = df.field_a[2];
                          var14.f(var9, var10 + -(var14.field_C >> 1), 256);
                          if (var13 != 0) {
                            break L6;
                          } else {
                            return;
                          }
                        }
                      }
                      if (ae.field_c == var6) {
                        var15 = df.field_a[1];
                        var15.f(var9, -(var15.field_C >> 1) + var10, 256);
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
                  var16 = df.field_a[0];
                  var11 = var16.field_x << 1;
                  var12 = var16.field_z << 1;
                  if (((nf) this).field_X == null) {
                    break L7;
                  } else {
                    if (var11 > ((nf) this).field_X.field_D) {
                      break L7;
                    } else {
                      if (((nf) this).field_X.field_C < var12) {
                        break L7;
                      } else {
                        fc.a(-70, ((nf) this).field_X);
                        lb.d();
                        if (var13 == 0) {
                          var16.a(112, 144, var16.field_x << 4, var16.field_z << 4, -((nf) this).field_Q << 10, 4096);
                          sc.b(-111);
                          ((nf) this).field_X.f(-(var16.field_x >> 1) + var9, -var16.field_z + var10, 256);
                          return;
                        } else {
                          ((nf) this).field_X = new jp(var11, var12);
                          fc.a(-86, ((nf) this).field_X);
                          var16.a(112, 144, var16.field_x << 4, var16.field_z << 4, -((nf) this).field_Q << 10, 4096);
                          sc.b(-111);
                          ((nf) this).field_X.f(-(var16.field_x >> 1) + var9, -var16.field_z + var10, 256);
                          return;
                        }
                      }
                    }
                  }
                }
                ((nf) this).field_X = new jp(var11, var12);
                fc.a(-86, ((nf) this).field_X);
                var16.a(112, 144, var16.field_x << 4, var16.field_z << 4, -((nf) this).field_Q << 10, 4096);
                sc.b(-111);
                ((nf) this).field_X.f(-(var16.field_x >> 1) + var9, -var16.field_z + var10, 256);
                return;
              }
            } else {
              L8: {
                if (var5.equals((Object) (Object) ((nf) this).field_A)) {
                  break L8;
                } else {
                  ((nf) this).field_A = var5;
                  ((nf) this).i(param3 + 10);
                  break L8;
                }
              }
              L9: {
                super.a(param0, param1, param2, param3);
                var6 = ((nf) this).field_R.b((byte) -31);
                var8_ref = (qe) (Object) ((nf) this).field_l;
                var9 = param1 - -((nf) this).field_o;
                var10 = var8_ref.a(param0, (byte) -107, (oc) this) + (var8_ref.c((oc) this, param3 ^ 32).a(0) >> 1);
                if (var6 == m.field_c) {
                  break L9;
                } else {
                  if (var6 == hq.field_z) {
                    break L9;
                  } else {
                    L10: {
                      if (lp.field_xb != var6) {
                        break L10;
                      } else {
                        var14 = df.field_a[2];
                        var14.f(var9, var10 + -(var14.field_C >> 1), 256);
                        if (var13 != 0) {
                          break L10;
                        } else {
                          return;
                        }
                      }
                    }
                    if (ae.field_c == var6) {
                      var15 = df.field_a[1];
                      var15.f(var9, -(var15.field_C >> 1) + var10, 256);
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
              var16 = df.field_a[0];
              var11 = var16.field_x << 1;
              var12 = var16.field_z << 1;
              if (((nf) this).field_X != null) {
                if (var11 <= ((nf) this).field_X.field_D) {
                  if (((nf) this).field_X.field_C >= var12) {
                    fc.a(-70, ((nf) this).field_X);
                    lb.d();
                    if (var13 == 0) {
                      var16.a(112, 144, var16.field_x << 4, var16.field_z << 4, -((nf) this).field_Q << 10, 4096);
                      sc.b(-111);
                      ((nf) this).field_X.f(-(var16.field_x >> 1) + var9, -var16.field_z + var10, 256);
                      return;
                    } else {
                      ((nf) this).field_X = new jp(var11, var12);
                      fc.a(-86, ((nf) this).field_X);
                      var16.a(112, 144, var16.field_x << 4, var16.field_z << 4, -((nf) this).field_Q << 10, 4096);
                      sc.b(-111);
                      ((nf) this).field_X.f(-(var16.field_x >> 1) + var9, -var16.field_z + var10, 256);
                      return;
                    }
                  } else {
                    ((nf) this).field_X = new jp(var11, var12);
                    fc.a(-86, ((nf) this).field_X);
                    var16.a(112, 144, var16.field_x << 4, var16.field_z << 4, -((nf) this).field_Q << 10, 4096);
                    sc.b(-111);
                    ((nf) this).field_X.f(-(var16.field_x >> 1) + var9, -var16.field_z + var10, 256);
                    return;
                  }
                } else {
                  ((nf) this).field_X = new jp(var11, var12);
                  fc.a(-86, ((nf) this).field_X);
                  var16.a(112, 144, var16.field_x << 4, var16.field_z << 4, -((nf) this).field_Q << 10, 4096);
                  sc.b(-111);
                  ((nf) this).field_X.f(-(var16.field_x >> 1) + var9, -var16.field_z + var10, 256);
                  return;
                }
              } else {
                ((nf) this).field_X = new jp(var11, var12);
                fc.a(-86, ((nf) this).field_X);
                var16.a(112, 144, var16.field_x << 4, var16.field_z << 4, -((nf) this).field_Q << 10, 4096);
                sc.b(-111);
                ((nf) this).field_X.f(-(var16.field_x >> 1) + var9, -var16.field_z + var10, 256);
                return;
              }
            }
          } else {
            var5 = jb.field_G;
            if (var5.equals((Object) (Object) ((nf) this).field_A)) {
              L11: {
                super.a(param0, param1, param2, param3);
                var6 = ((nf) this).field_R.b((byte) -31);
                var8_ref = (qe) (Object) ((nf) this).field_l;
                var9 = param1 - -((nf) this).field_o;
                var10 = var8_ref.a(param0, (byte) -107, (oc) this) + (var8_ref.c((oc) this, param3 ^ 32).a(0) >> 1);
                if (var6 == m.field_c) {
                  break L11;
                } else {
                  if (var6 == hq.field_z) {
                    break L11;
                  } else {
                    L12: {
                      if (lp.field_xb != var6) {
                        break L12;
                      } else {
                        var14 = df.field_a[2];
                        var14.f(var9, var10 + -(var14.field_C >> 1), 256);
                        if (var13 != 0) {
                          break L12;
                        } else {
                          return;
                        }
                      }
                    }
                    if (ae.field_c == var6) {
                      var15 = df.field_a[1];
                      var15.f(var9, -(var15.field_C >> 1) + var10, 256);
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
              var16 = df.field_a[0];
              var11 = var16.field_x << 1;
              var12 = var16.field_z << 1;
              if (((nf) this).field_X != null) {
                if (var11 <= ((nf) this).field_X.field_D) {
                  if (((nf) this).field_X.field_C >= var12) {
                    fc.a(-70, ((nf) this).field_X);
                    lb.d();
                    if (var13 == 0) {
                      var16.a(112, 144, var16.field_x << 4, var16.field_z << 4, -((nf) this).field_Q << 10, 4096);
                      sc.b(-111);
                      ((nf) this).field_X.f(-(var16.field_x >> 1) + var9, -var16.field_z + var10, 256);
                      return;
                    } else {
                      ((nf) this).field_X = new jp(var11, var12);
                      fc.a(-86, ((nf) this).field_X);
                      var16.a(112, 144, var16.field_x << 4, var16.field_z << 4, -((nf) this).field_Q << 10, 4096);
                      sc.b(-111);
                      ((nf) this).field_X.f(-(var16.field_x >> 1) + var9, -var16.field_z + var10, 256);
                      return;
                    }
                  } else {
                    ((nf) this).field_X = new jp(var11, var12);
                    fc.a(-86, ((nf) this).field_X);
                    var16.a(112, 144, var16.field_x << 4, var16.field_z << 4, -((nf) this).field_Q << 10, 4096);
                    sc.b(-111);
                    ((nf) this).field_X.f(-(var16.field_x >> 1) + var9, -var16.field_z + var10, 256);
                    return;
                  }
                } else {
                  ((nf) this).field_X = new jp(var11, var12);
                  fc.a(-86, ((nf) this).field_X);
                  var16.a(112, 144, var16.field_x << 4, var16.field_z << 4, -((nf) this).field_Q << 10, 4096);
                  sc.b(-111);
                  ((nf) this).field_X.f(-(var16.field_x >> 1) + var9, -var16.field_z + var10, 256);
                  return;
                }
              } else {
                ((nf) this).field_X = new jp(var11, var12);
                fc.a(-86, ((nf) this).field_X);
                var16.a(112, 144, var16.field_x << 4, var16.field_z << 4, -((nf) this).field_Q << 10, 4096);
                sc.b(-111);
                ((nf) this).field_X.f(-(var16.field_x >> 1) + var9, -var16.field_z + var10, 256);
                return;
              }
            } else {
              L13: {
                L14: {
                  ((nf) this).field_A = var5;
                  ((nf) this).i(param3 + 10);
                  super.a(param0, param1, param2, param3);
                  var6 = ((nf) this).field_R.b((byte) -31);
                  var8_ref = (qe) (Object) ((nf) this).field_l;
                  var9 = param1 - -((nf) this).field_o;
                  var10 = var8_ref.a(param0, (byte) -107, (oc) this) + (var8_ref.c((oc) this, param3 ^ 32).a(0) >> 1);
                  if (var6 == m.field_c) {
                    break L14;
                  } else {
                    if (var6 == hq.field_z) {
                      break L14;
                    } else {
                      L15: {
                        if (lp.field_xb != var6) {
                          break L15;
                        } else {
                          var14 = df.field_a[2];
                          var14.f(var9, var10 + -(var14.field_C >> 1), 256);
                          if (var13 == 0) {
                            break L13;
                          } else {
                            break L15;
                          }
                        }
                      }
                      if (ae.field_c == var6) {
                        var15 = df.field_a[1];
                        var15.f(var9, -(var15.field_C >> 1) + var10, 256);
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
                    var16 = df.field_a[0];
                    var11 = var16.field_x << 1;
                    var12 = var16.field_z << 1;
                    if (((nf) this).field_X == null) {
                      break L17;
                    } else {
                      if (var11 > ((nf) this).field_X.field_D) {
                        break L17;
                      } else {
                        if (((nf) this).field_X.field_C < var12) {
                          break L17;
                        } else {
                          fc.a(-70, ((nf) this).field_X);
                          lb.d();
                          if (var13 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                    }
                  }
                  ((nf) this).field_X = new jp(var11, var12);
                  fc.a(-86, ((nf) this).field_X);
                  break L16;
                }
                var16.a(112, 144, var16.field_x << 4, var16.field_z << 4, -((nf) this).field_Q << 10, 4096);
                sc.b(-111);
                ((nf) this).field_X.f(-(var16.field_x >> 1) + var9, -var16.field_z + var10, 256);
                break L13;
              }
              return;
            }
          }
        } else {
          var5 = jb.field_G;
          if (var5.equals((Object) (Object) ((nf) this).field_A)) {
            L18: {
              super.a(param0, param1, param2, param3);
              var6 = ((nf) this).field_R.b((byte) -31);
              var8_ref = (qe) (Object) ((nf) this).field_l;
              var9 = param1 - -((nf) this).field_o;
              var10 = var8_ref.a(param0, (byte) -107, (oc) this) + (var8_ref.c((oc) this, param3 ^ 32).a(0) >> 1);
              if (var6 == m.field_c) {
                break L18;
              } else {
                if (var6 == hq.field_z) {
                  break L18;
                } else {
                  L19: {
                    if (lp.field_xb != var6) {
                      break L19;
                    } else {
                      var14 = df.field_a[2];
                      var14.f(var9, var10 + -(var14.field_C >> 1), 256);
                      if (var13 != 0) {
                        break L19;
                      } else {
                        return;
                      }
                    }
                  }
                  if (ae.field_c == var6) {
                    var15 = df.field_a[1];
                    var15.f(var9, -(var15.field_C >> 1) + var10, 256);
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
            var16 = df.field_a[0];
            var11 = var16.field_x << 1;
            var12 = var16.field_z << 1;
            if (((nf) this).field_X != null) {
              if (var11 <= ((nf) this).field_X.field_D) {
                if (((nf) this).field_X.field_C >= var12) {
                  fc.a(-70, ((nf) this).field_X);
                  lb.d();
                  if (var13 != 0) {
                    ((nf) this).field_X = new jp(var11, var12);
                    fc.a(-86, ((nf) this).field_X);
                    var16.a(112, 144, var16.field_x << 4, var16.field_z << 4, -((nf) this).field_Q << 10, 4096);
                    sc.b(-111);
                    ((nf) this).field_X.f(-(var16.field_x >> 1) + var9, -var16.field_z + var10, 256);
                    return;
                  } else {
                    var16.a(112, 144, var16.field_x << 4, var16.field_z << 4, -((nf) this).field_Q << 10, 4096);
                    sc.b(-111);
                    ((nf) this).field_X.f(-(var16.field_x >> 1) + var9, -var16.field_z + var10, 256);
                    return;
                  }
                } else {
                  ((nf) this).field_X = new jp(var11, var12);
                  fc.a(-86, ((nf) this).field_X);
                  var16.a(112, 144, var16.field_x << 4, var16.field_z << 4, -((nf) this).field_Q << 10, 4096);
                  sc.b(-111);
                  ((nf) this).field_X.f(-(var16.field_x >> 1) + var9, -var16.field_z + var10, 256);
                  return;
                }
              } else {
                ((nf) this).field_X = new jp(var11, var12);
                fc.a(-86, ((nf) this).field_X);
                var16.a(112, 144, var16.field_x << 4, var16.field_z << 4, -((nf) this).field_Q << 10, 4096);
                sc.b(-111);
                ((nf) this).field_X.f(-(var16.field_x >> 1) + var9, -var16.field_z + var10, 256);
                return;
              }
            } else {
              ((nf) this).field_X = new jp(var11, var12);
              fc.a(-86, ((nf) this).field_X);
              var16.a(112, 144, var16.field_x << 4, var16.field_z << 4, -((nf) this).field_Q << 10, 4096);
              sc.b(-111);
              ((nf) this).field_X.f(-(var16.field_x >> 1) + var9, -var16.field_z + var10, 256);
              return;
            }
          } else {
            L20: {
              L21: {
                ((nf) this).field_A = var5;
                ((nf) this).i(param3 + 10);
                super.a(param0, param1, param2, param3);
                var6 = ((nf) this).field_R.b((byte) -31);
                var8_ref = (qe) (Object) ((nf) this).field_l;
                var9 = param1 - -((nf) this).field_o;
                var10 = var8_ref.a(param0, (byte) -107, (oc) this) + (var8_ref.c((oc) this, param3 ^ 32).a(0) >> 1);
                if (var6 == m.field_c) {
                  break L21;
                } else {
                  if (var6 == hq.field_z) {
                    break L21;
                  } else {
                    L22: {
                      if (lp.field_xb != var6) {
                        break L22;
                      } else {
                        var14 = df.field_a[2];
                        var14.f(var9, var10 + -(var14.field_C >> 1), 256);
                        if (var13 == 0) {
                          break L20;
                        } else {
                          break L22;
                        }
                      }
                    }
                    if (ae.field_c == var6) {
                      var15 = df.field_a[1];
                      var15.f(var9, -(var15.field_C >> 1) + var10, 256);
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
                  var16 = df.field_a[0];
                  var11 = var16.field_x << 1;
                  var12 = var16.field_z << 1;
                  if (((nf) this).field_X == null) {
                    break L24;
                  } else {
                    if (var11 > ((nf) this).field_X.field_D) {
                      break L24;
                    } else {
                      if (((nf) this).field_X.field_C < var12) {
                        break L24;
                      } else {
                        fc.a(-70, ((nf) this).field_X);
                        lb.d();
                        if (var13 == 0) {
                          break L23;
                        } else {
                          break L24;
                        }
                      }
                    }
                  }
                }
                ((nf) this).field_X = new jp(var11, var12);
                fc.a(-86, ((nf) this).field_X);
                break L23;
              }
              var16.a(112, 144, var16.field_x << 4, var16.field_z << 4, -((nf) this).field_Q << 10, 4096);
              sc.b(-111);
              ((nf) this).field_X.f(-(var16.field_x >> 1) + var9, -var16.field_z + var10, 256);
              break L20;
            }
            return;
          }
        }
    }

    final void a(oc param0, byte param1, int param2, int param3) {
        try {
            ((nf) this).field_Q = ((nf) this).field_Q + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "nf.WA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = false;
        field_T = "You have been removed from <%0>'s game.";
    }
}
