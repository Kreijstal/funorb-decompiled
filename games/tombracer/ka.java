/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ka {
    static float[] field_b;
    boolean field_a;
    private static String[] field_c;

    abstract void FA(int param0);

    abstract void I(int param0, int[] param1, int param2, int param3, int param4, boolean param5, int param6, int[] param7);

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != -11) {
            ka.a((byte) -43);
        }
    }

    abstract void b();

    abstract void O(int param0, int param1, int param2);

    final static pr a(byte param0, byte[] param1, int param2, kda param3) {
        byte[] var11 = null;
        if (param1 == null) {
            return null;
        }
        if (param1.length == 0) {
            return null;
        }
        long var4 = jaggl.OpenGL.glCreateShaderObjectARB(param2);
        jaggl.OpenGL.glShaderSourceRawARB(var4, param1);
        jaggl.OpenGL.glCompileShaderARB(var4);
        int var6 = 35 / ((param0 - -29) / 46);
        jaggl.OpenGL.glGetObjectParameterivARB(var4, 35713, ita.field_a, 0);
        if (!(ita.field_a[0] != -1)) {
            if (-1 == ita.field_a[0]) {
                System.out.println("Shader compile failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var4, 35716, ita.field_a, 1);
            if ((ita.field_a[1] ^ -1) < -2) {
                var11 = new byte[ita.field_a[1]];
                jaggl.OpenGL.glGetInfoLogARB(var4, ita.field_a[1], ita.field_a, 0, var11, 0);
                System.out.println(new String(var11));
            }
            if (!(ita.field_a[0] != 0)) {
                jaggl.OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new pr(param3, var4, param2);
    }

    abstract void a(gda param0, el param1, int param2);

    abstract ka a(byte param0, int param1, boolean param2);

    abstract void a();

    abstract void a(gda param0, el param1, int param2, int param3);

    private final void a(int[] param0, int param1, int param2, int[] param3, boolean param4, int param5, int param6, int param7, int param8, byte param9) {
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        L0: {
          var12 = TombRacer.field_G ? 1 : 0;
          if (param1 != -2) {
            if (param1 != -3) {
              if ((param1 ^ -1) != -4) {
                break L0;
              } else {
                L1: {
                  if (0 == param2) {
                    break L1;
                  } else {
                    if ((param2 ^ -1) != -2) {
                      if (param2 != 3) {
                        if ((param2 ^ -1) == -3) {
                          var11 = param7;
                          param7 = param6 & 16383;
                          param6 = -var11 & 16383;
                          break L0;
                        } else {
                          break L0;
                        }
                      } else {
                        var11 = param7;
                        param7 = param6;
                        param6 = var11;
                        break L0;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                var11 = param7;
                param7 = -param6;
                param6 = var11;
                break L0;
              }
            } else {
              L2: {
                if (-1 == param2) {
                  break L2;
                } else {
                  if (param2 == 1) {
                    break L2;
                  } else {
                    if ((param2 ^ -1) != -3) {
                      break L0;
                    } else {
                      param6 = 16383 & -param6;
                      param7 = 16383 & -param7;
                      break L0;
                    }
                  }
                }
              }
              param7 = -param7;
              param6 = -param6;
              break L0;
            }
          } else {
            L3: {
              if (0 == param2) {
                break L3;
              } else {
                if (-2 != param2) {
                  if (-4 != (param2 ^ -1)) {
                    if (param2 == 2) {
                      var11 = param7;
                      param7 = 16383 & -param6;
                      param6 = 16383 & var11;
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    var11 = param7;
                    param7 = param6;
                    param6 = var11;
                    break L0;
                  }
                } else {
                  break L3;
                }
              }
            }
            var11 = -param7;
            param7 = param6;
            param6 = var11;
            break L0;
          }
        }
        L4: {
          if (param9 > 81) {
            break L4;
          } else {
            var13 = null;
            ((ka) this).a((gda) null, (el) null, -114);
            break L4;
          }
        }
        L5: {
          if (-65536 != (param5 ^ -1)) {
            ((ka) this).I(param2, param0, param7, param8, param6, param4, param5, param3);
            break L5;
          } else {
            ((ka) this).a(param2, param0, param7, param8, param6, param1, param4);
            break L5;
          }
        }
    }

    private final void a(int param0, boolean param1, boolean param2, rq param3, int param4, int[] param5, int param6, nk param7, rq param8, int param9, boolean[] param10, boolean param11) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        L0: {
          var36 = TombRacer.field_G ? 1 : 0;
          if (param8 == null) {
            break L0;
          } else {
            if (0 != param0) {
              L1: {
                var37 = 0;
                var13 = var37;
                var38 = 0;
                var14 = var38;
                var39 = 0;
                var15 = var39;
                if (!param11) {
                  break L1;
                } else {
                  ((ka) this).field_a = true;
                  break L1;
                }
              }
              L2: while (true) {
                if (var39 >= param7.field_j) {
                  return;
                } else {
                  L3: {
                    var16 = 0;
                    if (param3.field_i <= var37) {
                      break L3;
                    } else {
                      if (var39 != param3.field_m[var37]) {
                        break L3;
                      } else {
                        var16 = 1;
                        break L3;
                      }
                    }
                  }
                  L4: {
                    var17 = 0;
                    if (param8.field_i <= var38) {
                      break L4;
                    } else {
                      if (var39 == param8.field_m[var38]) {
                        var17 = 1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (var16 != 0) {
                      break L5;
                    } else {
                      if (var17 != 0) {
                        break L5;
                      } else {
                        var39++;
                        continue L2;
                      }
                    }
                  }
                  L6: {
                    if (param10 == null) {
                      break L6;
                    } else {
                      L7: {
                        if (param10[var39]) {
                          stackOut_35_0 = 0;
                          stackIn_36_0 = stackOut_35_0;
                          break L7;
                        } else {
                          stackOut_34_0 = 1;
                          stackIn_36_0 = stackOut_34_0;
                          break L7;
                        }
                      }
                      L8: {
                        stackOut_36_0 = stackIn_36_0;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_37_0 = stackOut_36_0;
                        if (param1) {
                          stackOut_38_0 = stackIn_38_0;
                          stackOut_38_1 = 0;
                          stackIn_39_0 = stackOut_38_0;
                          stackIn_39_1 = stackOut_38_1;
                          break L8;
                        } else {
                          stackOut_37_0 = stackIn_37_0;
                          stackOut_37_1 = 1;
                          stackIn_39_0 = stackOut_37_0;
                          stackIn_39_1 = stackOut_37_1;
                          break L8;
                        }
                      }
                      if (stackIn_39_0 == stackIn_39_1) {
                        break L6;
                      } else {
                        if (-1 != (param7.field_h[var39] ^ -1)) {
                          L9: {
                            if (var16 == 0) {
                              break L9;
                            } else {
                              var37++;
                              break L9;
                            }
                          }
                          if (var17 != 0) {
                            var38++;
                            var39++;
                            continue L2;
                          } else {
                            var39++;
                            continue L2;
                          }
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  L10: {
                    L11: {
                      var18 = 0;
                      var19 = param7.field_h[var39];
                      if (3 == var19) {
                        break L11;
                      } else {
                        if ((var19 ^ -1) == -11) {
                          break L11;
                        } else {
                          break L10;
                        }
                      }
                    }
                    var18 = 128;
                    break L10;
                  }
                  L12: {
                    if (var16 != 0) {
                      var20 = param3.field_l[var37];
                      var21 = param3.field_k[var37];
                      var22 = param3.field_d[var37];
                      var23 = param3.field_j[var37];
                      var24 = param3.field_a[var37];
                      var37++;
                      break L12;
                    } else {
                      var20 = var18;
                      var24 = 0;
                      var22 = var18;
                      var23 = -1;
                      var21 = var18;
                      break L12;
                    }
                  }
                  L13: {
                    if (var17 != 0) {
                      var26 = param8.field_k[var38];
                      var28 = param8.field_j[var38];
                      var27 = param8.field_d[var38];
                      var25 = param8.field_l[var38];
                      var29 = param8.field_a[var38];
                      var38++;
                      break L13;
                    } else {
                      var27 = var18;
                      var25 = var18;
                      var29 = 0;
                      var26 = var18;
                      var28 = -1;
                      break L13;
                    }
                  }
                  L14: {
                    if (-1 == var23) {
                      if (-1 != var28) {
                        this.a(param7.field_f[var28], param4, 0, param5, param2, param7.field_i[var28] & param6, 0, 0, 0, (byte) 85);
                        break L14;
                      } else {
                        break L14;
                      }
                    } else {
                      this.a(param7.field_f[var23], param4, 0, param5, param2, param7.field_i[var23] & param6, 0, 0, 0, (byte) 103);
                      break L14;
                    }
                  }
                  L15: {
                    L16: {
                      if ((var24 & 2) != -1) {
                        break L16;
                      } else {
                        if (-1 == (var29 & 1)) {
                          if (var19 == 2) {
                            L17: {
                              var33 = 16383 & -var20 + var25;
                              var34 = var26 - var21 & 16383;
                              if (var33 >= 8192) {
                                // wide iinc 33 -16384
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            L18: {
                              if (-8193 >= (var34 ^ -1)) {
                                // wide iinc 34 -16384
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            L19: {
                              var35 = 16383 & var27 + -var22;
                              var30 = 16383 & param0 * var33 / param9 + var20;
                              var31 = var21 + param0 * var34 / param9 & 16383;
                              if (var35 < 8192) {
                                break L19;
                              } else {
                                // wide iinc 35 -16384
                                break L19;
                              }
                            }
                            var32 = var22 - -(param0 * var35 / param9) & 16383;
                            break L15;
                          } else {
                            if (var19 == 9) {
                              L20: {
                                var33 = 16383 & -var20 + var25;
                                if (8192 <= var33) {
                                  // wide iinc 33 -16384
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              var30 = var20 - -(param0 * var33 / param9) & 16383;
                              var31 = 0;
                              var32 = 0;
                              break L15;
                            } else {
                              if (7 != var19) {
                                var31 = var21 - -((-var21 + var26) * param0 / param9);
                                var30 = (var25 + -var20) * param0 / param9 + var20;
                                var32 = param0 * (var27 - var22) / param9 + var22;
                                break L15;
                              } else {
                                L21: {
                                  var33 = 63 & -var20 + var25;
                                  if (var33 >= 32) {
                                    var33 -= 64;
                                    break L21;
                                  } else {
                                    break L21;
                                  }
                                }
                                var30 = var20 - -(param0 * var33 / param9) & 63;
                                var32 = var22 - -((var27 - var22) * param0 / param9);
                                var31 = var21 + param0 * (-var21 + var26) / param9;
                                break L15;
                              }
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    var32 = var22;
                    var31 = var21;
                    var30 = var20;
                    break L15;
                  }
                  this.a(param7.field_f[var39], param4, var19, param5, param2, param6 & param7.field_i[var39], var32, var30, var31, (byte) 114);
                  var39++;
                  continue L2;
                }
              }
            } else {
              break L0;
            }
          }
        }
        var13 = 0;
        L22: while (true) {
          if (param3.field_i <= var13) {
            return;
          } else {
            L23: {
              var14 = param3.field_m[var13];
              if (param10 == null) {
                break L23;
              } else {
                L24: {
                  if (param1) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L24;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L24;
                  }
                }
                L25: {
                  stackOut_9_0 = stackIn_9_0;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (param10[var14]) {
                    stackOut_11_0 = stackIn_11_0;
                    stackOut_11_1 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L25;
                  } else {
                    stackOut_10_0 = stackIn_10_0;
                    stackOut_10_1 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L25;
                  }
                }
                if (stackIn_12_0 == stackIn_12_1) {
                  break L23;
                } else {
                  if (param7.field_h[var14] == 0) {
                    break L23;
                  } else {
                    var13++;
                    continue L22;
                  }
                }
              }
            }
            L26: {
              var15 = param3.field_j[var13];
              if (-1 == var15) {
                break L26;
              } else {
                this.a(param7.field_f[var15], param4, 0, param5, param2, param7.field_i[var15] & param6, 0, 0, 0, (byte) 96);
                break L26;
              }
            }
            this.a(param7.field_f[var14], param4, param7.field_h[var14], param5, param2, param7.field_i[var14] & param6, (int) param3.field_d[var13], (int) param3.field_l[var13], (int) param3.field_k[var13], (byte) 90);
            var13++;
            continue L22;
          }
        }
    }

    abstract void a(int param0, int param1, int param2, int param3);

    abstract void H(int param0, int param1, int param2);

    final void a(int param0, ena param1, int param2, int param3, int param4, ena param5, int param6, boolean param7, int param8) {
        rq var15 = null;
        if (-1 == param3) {
            return;
        }
        ((ka) this).a();
        if (!((ka) this).NA()) {
            ((ka) this).b();
            return;
        }
        rq var14 = param1.field_o[param3];
        nk var11 = var14.field_f;
        Object var12 = null;
        if (param5 != null) {
            var15 = param5.field_o[param2];
            if (var11 != var15.field_f) {
                var12 = null;
            }
        }
        int var13 = -124 / ((-85 - param0) / 35);
        this.a(param4, false, param7, var14, param8, (int[]) null, 65535, var11, (rq) var12, param6, (boolean[]) null, false);
        ((ka) this).wa();
        ((ka) this).b();
    }

    abstract void wa();

    final static void a(byte param0) {
        if (param0 != -33) {
            ka.a((byte) 65);
        }
        if (ci.field_l != null) {
            ci.field_l.i((byte) -7);
        }
        md.field_F = new efa();
        um.field_l.a(100, (ae) (Object) md.field_F);
    }

    abstract void a(int param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6);

    protected ka() {
        ((ka) this).field_a = false;
    }

    abstract boolean NA();

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_b = new float[4];
        field_c = new String[4];
        for (var0 = 0; (var0 ^ -1) > -5; var0++) {
            field_c[var0] = "Test Model " + (var0 + 1);
        }
    }
}
