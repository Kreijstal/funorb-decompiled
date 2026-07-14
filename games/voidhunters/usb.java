/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class usb extends oda {
    private int[] field_v;
    private int[] field_y;
    private int field_B;
    private int field_z;
    private int[] field_A;
    int field_w;
    private int field_x;

    private final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        shb[] var5 = null;
        shb[] var6 = null;
        shb[] var7 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (null != ((usb) this).field_y) {
            stackOut_2_0 = ((usb) this).field_y.length;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (param1 == -83) {
          var7 = new shb[var4 * param0];
          var5 = var7;
          if (null != ((usb) this).field_u) {
            if (0 < ((usb) this).field_u.length) {
              if (var7.length > 0) {
                if (-1 > (param2 ^ -1)) {
                  cua.a((Object[]) (Object) ((usb) this).field_u, 0, (Object[]) (Object) var5, 0, Math.min(param2, param0) * var4);
                  ((usb) this).field_u = var5;
                  return;
                } else {
                  ((usb) this).field_u = var5;
                  return;
                }
              } else {
                ((usb) this).field_u = var5;
                return;
              }
            } else {
              ((usb) this).field_u = var5;
              return;
            }
          } else {
            ((usb) this).field_u = var5;
            return;
          }
        } else {
          ((usb) this).field_z = 55;
          var6 = new shb[var4 * param0];
          var5 = var6;
          if (null != ((usb) this).field_u) {
            if (0 < ((usb) this).field_u.length) {
              if (var6.length > 0) {
                if (-1 <= (param2 ^ -1)) {
                  ((usb) this).field_u = var5;
                  return;
                } else {
                  cua.a((Object[]) (Object) ((usb) this).field_u, 0, (Object[]) (Object) var5, 0, Math.min(param2, param0) * var4);
                  ((usb) this).field_u = var5;
                  return;
                }
              } else {
                ((usb) this).field_u = var5;
                return;
              }
            } else {
              ((usb) this).field_u = var5;
              return;
            }
          } else {
            ((usb) this).field_u = var5;
            return;
          }
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var7 = VoidHunters.field_G;
          if (((usb) this).field_A != null) {
            stackOut_2_0 = ((usb) this).field_A.length;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        var9 = new int[var4 * param0];
        var8 = var9;
        var5 = var8;
        if (null != ((usb) this).field_v) {
          if (((usb) this).field_v.length > 0) {
            var9 = var8;
            if (var9.length > 0) {
              if (param2 > 0) {
                var6 = 0;
                L1: while (true) {
                  if (var4 <= var6) {
                    ((usb) this).field_v = var5;
                    if (param1 >= -49) {
                      ((usb) this).field_w = -51;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    cua.a(((usb) this).field_v, param2 * var6, var5, param0 * var6, Math.min(param2, param0));
                    var6++;
                    continue L1;
                  }
                }
              } else {
                ((usb) this).field_v = var5;
                if (param1 >= -49) {
                  ((usb) this).field_w = -51;
                  return;
                } else {
                  return;
                }
              }
            } else {
              ((usb) this).field_v = var5;
              if (param1 >= -49) {
                ((usb) this).field_w = -51;
                return;
              } else {
                return;
              }
            }
          } else {
            ((usb) this).field_v = var5;
            if (param1 >= -49) {
              ((usb) this).field_w = -51;
              return;
            } else {
              return;
            }
          }
        } else {
          ((usb) this).field_v = var5;
          if (param1 >= -49) {
            ((usb) this).field_w = -51;
            return;
          } else {
            return;
          }
        }
    }

    usb(int param0, int param1, int param2, int param3, wwa param4, int param5, int param6) {
        super(param0, param1, param2, param3, param4);
        ((usb) this).field_w = 92;
        ((usb) this).field_B = 0;
        int[] var10 = new int[param5];
        int[] var8 = var10;
        cua.a(var10, 0, param5, 1);
        int[] var9 = new int[param6];
        cua.a(var9, 0, param6, 1);
        this.a(0, var10);
        this.a((byte) -115, var9);
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        shb var5 = null;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        var2 = 0;
        if (param0 == 16777215) {
          var3 = 0;
          L0: while (true) {
            if (((usb) this).field_u.length > var2) {
              if (var3 < ((usb) this).field_A.length) {
                var4 = 0;
                L1: while (true) {
                  if (var2 >= ((usb) this).field_u.length) {
                    var3++;
                    var3++;
                    continue L0;
                  } else {
                    if (var4 < ((usb) this).field_y.length) {
                      var2++;
                      var5 = ((usb) this).field_u[var2];
                      if (var5 != null) {
                        this.a(var3, (byte) 72, var4, var5);
                        var4++;
                        continue L1;
                      } else {
                        var4++;
                        continue L1;
                      }
                    } else {
                      var3++;
                      continue L0;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
    }

    final void a(shb param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = ((usb) this).field_B % ((usb) this).field_y.length;
        if (param1 <= -10) {
          var5 = ((usb) this).field_B / ((usb) this).field_y.length;
          ((usb) this).field_v[((usb) this).field_B] = param2;
          ((usb) this).field_u[((usb) this).field_B] = param0;
          if (param0 != null) {
            this.a(var5, (byte) 104, var4, param0);
            ((usb) this).field_B = ((usb) this).field_B + 1;
            return;
          } else {
            ((usb) this).field_B = ((usb) this).field_B + 1;
            return;
          }
        } else {
          ((usb) this).field_w = 54;
          var5 = ((usb) this).field_B / ((usb) this).field_y.length;
          ((usb) this).field_v[((usb) this).field_B] = param2;
          ((usb) this).field_u[((usb) this).field_B] = param0;
          if (param0 == null) {
            ((usb) this).field_B = ((usb) this).field_B + 1;
            return;
          } else {
            this.a(var5, (byte) 104, var4, param0);
            ((usb) this).field_B = ((usb) this).field_B + 1;
            return;
          }
        }
    }

    private final void a(byte param0, int[] param1) {
        int var9 = VoidHunters.field_G;
        int var3 = 9 % ((-48 - param0) / 36);
        int var4 = ((usb) this).field_A == null ? 0 : ((usb) this).field_A.length;
        int var5 = param1.length;
        ((usb) this).field_A = param1;
        int[] var6 = param1;
        int var7 = 0;
        int var8 = 0;
        while (var6.length > var7) {
            var8 = var8 + var6[var7];
            var6[var7] = var8 + var6[var7];
            var7++;
        }
        this.a(var5, (byte) -83, var4);
        this.b(var5, (byte) -100, var4);
    }

    final void c(int param0, int param1, int param2) {
        Object var5 = null;
        if (param0 != -6) {
          var5 = null;
          boolean discarded$2 = ((usb) this).a(-108, 52, 75, -20, (shb) null, -91, (byte) 106);
          ((usb) this).field_x = param1;
          ((usb) this).field_z = param2;
          return;
        } else {
          ((usb) this).field_x = param1;
          ((usb) this).field_z = param2;
          return;
        }
    }

    private final void b(int param0, byte param1, int param2) {
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (((usb) this).field_y != null) {
            stackOut_2_0 = ((usb) this).field_y.length;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        var5 = new int[var4 * param0];
        var6 = -71 % ((-51 - param1) / 35);
        if (null != ((usb) this).field_v) {
          if (-1 > (((usb) this).field_v.length ^ -1)) {
            if (var5.length > 0) {
              if (param2 <= 0) {
                ((usb) this).field_v = var5;
                return;
              } else {
                cua.a(((usb) this).field_v, 0, var5, 0, Math.min(param2, param0) * var4);
                ((usb) this).field_v = var5;
                return;
              }
            } else {
              ((usb) this).field_v = var5;
              return;
            }
          } else {
            ((usb) this).field_v = var5;
            return;
          }
        } else {
          ((usb) this).field_v = var5;
          return;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        if (param6 > -17) {
          ((usb) this).field_x = 25;
          return super.a(param0, param1, param2, param3, param4, param5, (byte) -120);
        } else {
          return super.a(param0, param1, param2, param3, param4, param5, (byte) -120);
        }
    }

    private final void a(int param0, int[] param1) {
        int var8 = VoidHunters.field_G;
        int var3 = null != ((usb) this).field_y ? ((usb) this).field_y.length : 0;
        int var4 = param1.length;
        ((usb) this).field_y = param1;
        int[] var5 = param1;
        int var6 = 0;
        int var7 = param0;
        while (var5.length > var6) {
            var7 = var7 + var5[var6];
            var5[var6] = var7 + var5[var6];
            var6++;
        }
        this.c(var3, (byte) -86, var4);
        this.b(var4, param0 + -70, var3);
    }

    private final void a(int param0, byte param1, int param2, shb param3) {
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        L0: {
          var20 = VoidHunters.field_G;
          var5 = ((usb) this).field_y[-1 + ((usb) this).field_y.length];
          var6 = ((usb) this).field_A[((usb) this).field_A.length - 1];
          if (0 >= param2) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((usb) this).field_y[param2 + -1];
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0 * ((usb) this).field_h / var5;
          stackOut_3_0 = ((usb) this).field_f;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (0 >= param0) {
            stackOut_5_0 = stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = stackIn_4_0;
            stackOut_4_1 = ((usb) this).field_A[param0 + -1];
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        var8 = stackIn_6_0 * stackIn_6_1 / var6;
        var9 = ((usb) this).field_y[param2] * ((usb) this).field_h / var5;
        var10 = ((usb) this).field_f * ((usb) this).field_A[param0] / var6;
        var11 = param0 * ((usb) this).field_y.length - -param2;
        var12 = ((usb) this).field_v[var11] & 48;
        var13 = 192 & ((usb) this).field_v[var11];
        var14 = param3.field_g;
        if (param1 <= 45) {
          ((usb) this).c(14, 96, 93);
          var15 = param3.field_r;
          var16 = param3.field_h;
          var17 = param3.field_f;
          if (var16 < -var7 + var9) {
            L2: {
              if ((1 & ((usb) this).field_v[var11]) == 0) {
                L3: {
                  if (var9 + -var7 >= var16) {
                    break L3;
                  } else {
                    if ((4 & ((usb) this).field_v[var11]) == -1) {
                      break L3;
                    } else {
                      var16 = -var7 + var9;
                      var14 = var7;
                      break L2;
                    }
                  }
                }
                if (16 == var12) {
                  var14 = -var16 + var9 + var7 >> -662596863;
                  break L2;
                } else {
                  if (-33 == var12) {
                    L4: {
                      var14 = -var16 + var9;
                      if (var17 >= var10 - var8) {
                        break L4;
                      } else {
                        if (-1 == (((usb) this).field_v[var11] & 2 ^ -1)) {
                          break L4;
                        } else {
                          var17 = var10 - var8;
                          var15 = var8;
                          var18 = ((usb) this).field_z;
                          var19 = ((usb) this).field_x;
                          param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
                          return;
                        }
                      }
                    }
                    L5: {
                      if (var10 - var8 >= var17) {
                        break L5;
                      } else {
                        if (-1 == (8 & ((usb) this).field_v[var11] ^ -1)) {
                          break L5;
                        } else {
                          var17 = var10 - var8;
                          var15 = var8;
                          var18 = ((usb) this).field_z;
                          var19 = ((usb) this).field_x;
                          param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
                          return;
                        }
                      }
                    }
                    if (var13 != 64) {
                      if ((var13 ^ -1) != -129) {
                        var15 = var8;
                        var18 = ((usb) this).field_z;
                        var19 = ((usb) this).field_x;
                        param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
                        return;
                      } else {
                        var15 = var10 + -var17;
                        var18 = ((usb) this).field_z;
                        var19 = ((usb) this).field_x;
                        param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
                        return;
                      }
                    } else {
                      var15 = -var17 + var10 + var8 >> 1917246113;
                      var18 = ((usb) this).field_z;
                      var19 = ((usb) this).field_x;
                      param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
                      return;
                    }
                  } else {
                    L6: {
                      L7: {
                        var14 = var7;
                        if (var17 >= var10 - var8) {
                          break L7;
                        } else {
                          if (-1 == (((usb) this).field_v[var11] & 2 ^ -1)) {
                            break L7;
                          } else {
                            var17 = var10 - var8;
                            var15 = var8;
                            break L6;
                          }
                        }
                      }
                      L8: {
                        if (var10 - var8 >= var17) {
                          break L8;
                        } else {
                          if (-1 == (8 & ((usb) this).field_v[var11] ^ -1)) {
                            break L8;
                          } else {
                            var17 = var10 - var8;
                            var15 = var8;
                            break L6;
                          }
                        }
                      }
                      if (var13 != 64) {
                        if ((var13 ^ -1) != -129) {
                          var15 = var8;
                          var18 = ((usb) this).field_z;
                          var19 = ((usb) this).field_x;
                          param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
                          return;
                        } else {
                          var15 = var10 + -var17;
                          var18 = ((usb) this).field_z;
                          var19 = ((usb) this).field_x;
                          param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
                          return;
                        }
                      } else {
                        var15 = -var17 + var10 + var8 >> 1917246113;
                        var18 = ((usb) this).field_z;
                        var19 = ((usb) this).field_x;
                        param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
                        return;
                      }
                    }
                    var18 = ((usb) this).field_z;
                    var19 = ((usb) this).field_x;
                    param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
                    return;
                  }
                }
              } else {
                var16 = -var7 + var9;
                var14 = var7;
                break L2;
              }
            }
            L9: {
              if (var17 >= var10 - var8) {
                break L9;
              } else {
                if (-1 == (((usb) this).field_v[var11] & 2 ^ -1)) {
                  break L9;
                } else {
                  var17 = var10 - var8;
                  var15 = var8;
                  var18 = ((usb) this).field_z;
                  var19 = ((usb) this).field_x;
                  param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
                  return;
                }
              }
            }
            L10: {
              if (var10 - var8 >= var17) {
                break L10;
              } else {
                if (-1 == (8 & ((usb) this).field_v[var11] ^ -1)) {
                  break L10;
                } else {
                  var17 = var10 - var8;
                  var15 = var8;
                  var18 = ((usb) this).field_z;
                  var19 = ((usb) this).field_x;
                  param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
                  return;
                }
              }
            }
            if (var13 != 64) {
              if ((var13 ^ -1) != -129) {
                var15 = var8;
                var18 = ((usb) this).field_z;
                var19 = ((usb) this).field_x;
                param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
                return;
              } else {
                var15 = var10 + -var17;
                var18 = ((usb) this).field_z;
                var19 = ((usb) this).field_x;
                param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
                return;
              }
            } else {
              var15 = -var17 + var10 + var8 >> 1917246113;
              var18 = ((usb) this).field_z;
              var19 = ((usb) this).field_x;
              param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
              return;
            }
          } else {
            L11: {
              L12: {
                if (var9 + -var7 >= var16) {
                  break L12;
                } else {
                  if ((4 & ((usb) this).field_v[var11]) == -1) {
                    break L12;
                  } else {
                    var16 = -var7 + var9;
                    var14 = var7;
                    break L11;
                  }
                }
              }
              if (16 == var12) {
                var14 = -var16 + var9 + var7 >> -662596863;
                break L11;
              } else {
                if (-33 != var12) {
                  L13: {
                    L14: {
                      var14 = var7;
                      if (var17 >= var10 - var8) {
                        break L14;
                      } else {
                        if (-1 == (((usb) this).field_v[var11] & 2 ^ -1)) {
                          break L14;
                        } else {
                          var17 = var10 - var8;
                          var15 = var8;
                          break L13;
                        }
                      }
                    }
                    L15: {
                      if (var10 - var8 >= var17) {
                        break L15;
                      } else {
                        if (-1 == (8 & ((usb) this).field_v[var11] ^ -1)) {
                          break L15;
                        } else {
                          var17 = var10 - var8;
                          var15 = var8;
                          break L13;
                        }
                      }
                    }
                    if (var13 != 64) {
                      if ((var13 ^ -1) == -129) {
                        var15 = var10 + -var17;
                        break L13;
                      } else {
                        var15 = var8;
                        break L13;
                      }
                    } else {
                      var15 = -var17 + var10 + var8 >> 1917246113;
                      break L13;
                    }
                  }
                  var18 = ((usb) this).field_z;
                  var19 = ((usb) this).field_x;
                  param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
                  return;
                } else {
                  L16: {
                    L17: {
                      var14 = -var16 + var9;
                      if (var17 >= var10 - var8) {
                        break L17;
                      } else {
                        if (-1 == (((usb) this).field_v[var11] & 2 ^ -1)) {
                          break L17;
                        } else {
                          var17 = var10 - var8;
                          var15 = var8;
                          break L16;
                        }
                      }
                    }
                    L18: {
                      if (var10 - var8 >= var17) {
                        break L18;
                      } else {
                        if (-1 == (8 & ((usb) this).field_v[var11] ^ -1)) {
                          break L18;
                        } else {
                          var17 = var10 - var8;
                          var15 = var8;
                          break L16;
                        }
                      }
                    }
                    if (var13 != 64) {
                      if ((var13 ^ -1) == -129) {
                        var15 = var10 + -var17;
                        break L16;
                      } else {
                        var15 = var8;
                        break L16;
                      }
                    } else {
                      var15 = -var17 + var10 + var8 >> 1917246113;
                      break L16;
                    }
                  }
                  var18 = ((usb) this).field_z;
                  var19 = ((usb) this).field_x;
                  param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
                  return;
                }
              }
            }
            L19: {
              if (var17 >= var10 - var8) {
                break L19;
              } else {
                if (-1 == (((usb) this).field_v[var11] & 2 ^ -1)) {
                  break L19;
                } else {
                  var17 = var10 - var8;
                  var15 = var8;
                  var18 = ((usb) this).field_z;
                  var19 = ((usb) this).field_x;
                  param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
                  return;
                }
              }
            }
            L20: {
              if (var10 - var8 >= var17) {
                break L20;
              } else {
                if (-1 == (8 & ((usb) this).field_v[var11] ^ -1)) {
                  break L20;
                } else {
                  var17 = var10 - var8;
                  var15 = var8;
                  var18 = ((usb) this).field_z;
                  var19 = ((usb) this).field_x;
                  param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
                  return;
                }
              }
            }
            if (var13 != 64) {
              if ((var13 ^ -1) != -129) {
                var15 = var8;
                var18 = ((usb) this).field_z;
                var19 = ((usb) this).field_x;
                param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
                return;
              } else {
                var15 = var10 + -var17;
                var18 = ((usb) this).field_z;
                var19 = ((usb) this).field_x;
                param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
                return;
              }
            } else {
              var15 = -var17 + var10 + var8 >> 1917246113;
              var18 = ((usb) this).field_z;
              var19 = ((usb) this).field_x;
              param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
              return;
            }
          }
        } else {
          L21: {
            L22: {
              var15 = param3.field_r;
              var16 = param3.field_h;
              var17 = param3.field_f;
              if (var16 >= -var7 + var9) {
                break L22;
              } else {
                if ((1 & ((usb) this).field_v[var11]) == 0) {
                  break L22;
                } else {
                  var16 = -var7 + var9;
                  var14 = var7;
                  break L21;
                }
              }
            }
            L23: {
              if (var9 + -var7 >= var16) {
                break L23;
              } else {
                if ((4 & ((usb) this).field_v[var11]) == -1) {
                  break L23;
                } else {
                  var16 = -var7 + var9;
                  var14 = var7;
                  break L21;
                }
              }
            }
            if (16 == var12) {
              var14 = -var16 + var9 + var7 >> -662596863;
              break L21;
            } else {
              if (-33 != var12) {
                L24: {
                  L25: {
                    var14 = var7;
                    if (var17 >= var10 - var8) {
                      break L25;
                    } else {
                      if (-1 == (((usb) this).field_v[var11] & 2 ^ -1)) {
                        break L25;
                      } else {
                        var17 = var10 - var8;
                        var15 = var8;
                        break L24;
                      }
                    }
                  }
                  L26: {
                    if (var10 - var8 >= var17) {
                      break L26;
                    } else {
                      if (-1 == (8 & ((usb) this).field_v[var11] ^ -1)) {
                        break L26;
                      } else {
                        var17 = var10 - var8;
                        var15 = var8;
                        break L24;
                      }
                    }
                  }
                  if (var13 != 64) {
                    if ((var13 ^ -1) == -129) {
                      var15 = var10 + -var17;
                      break L24;
                    } else {
                      var15 = var8;
                      break L24;
                    }
                  } else {
                    var15 = -var17 + var10 + var8 >> 1917246113;
                    break L24;
                  }
                }
                var18 = ((usb) this).field_z;
                var19 = ((usb) this).field_x;
                param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
                return;
              } else {
                L27: {
                  L28: {
                    var14 = -var16 + var9;
                    if (var17 >= var10 - var8) {
                      break L28;
                    } else {
                      if (-1 == (((usb) this).field_v[var11] & 2 ^ -1)) {
                        break L28;
                      } else {
                        var17 = var10 - var8;
                        var15 = var8;
                        break L27;
                      }
                    }
                  }
                  L29: {
                    if (var10 - var8 >= var17) {
                      break L29;
                    } else {
                      if (-1 == (8 & ((usb) this).field_v[var11] ^ -1)) {
                        break L29;
                      } else {
                        var17 = var10 - var8;
                        var15 = var8;
                        break L27;
                      }
                    }
                  }
                  if (var13 != 64) {
                    if ((var13 ^ -1) == -129) {
                      var15 = var10 + -var17;
                      break L27;
                    } else {
                      var15 = var8;
                      break L27;
                    }
                  } else {
                    var15 = -var17 + var10 + var8 >> 1917246113;
                    break L27;
                  }
                }
                var18 = ((usb) this).field_z;
                var19 = ((usb) this).field_x;
                param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
                return;
              }
            }
          }
          L30: {
            if (var17 >= var10 - var8) {
              break L30;
            } else {
              if (-1 == (((usb) this).field_v[var11] & 2 ^ -1)) {
                break L30;
              } else {
                var17 = var10 - var8;
                var15 = var8;
                var18 = ((usb) this).field_z;
                var19 = ((usb) this).field_x;
                param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
                return;
              }
            }
          }
          L31: {
            if (var10 - var8 >= var17) {
              break L31;
            } else {
              if (-1 == (8 & ((usb) this).field_v[var11] ^ -1)) {
                break L31;
              } else {
                var17 = var10 - var8;
                var15 = var8;
                var18 = ((usb) this).field_z;
                var19 = ((usb) this).field_x;
                param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
                return;
              }
            }
          }
          if (var13 != 64) {
            if ((var13 ^ -1) != -129) {
              var15 = var8;
              var18 = ((usb) this).field_z;
              var19 = ((usb) this).field_x;
              param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
              return;
            } else {
              var15 = var10 + -var17;
              var18 = ((usb) this).field_z;
              var19 = ((usb) this).field_x;
              param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
              return;
            }
          } else {
            var15 = -var17 + var10 + var8 >> 1917246113;
            var18 = ((usb) this).field_z;
            var19 = ((usb) this).field_x;
            param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
            return;
          }
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        int var5 = 0;
        Object var6 = null;
        if (super.a(param0 + 0, param1, param2, param3)) {
          return true;
        } else {
          var5 = param1;
          if (var5 != 98) {
            if (var5 != 99) {
              if (96 != var5) {
                if (97 != var5) {
                  if (param0 != -15834) {
                    var6 = null;
                    usb.a(-25, (no) null, (String) null, 107, 85, 63, 106);
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  return ((usb) this).b(param2, (byte) 39);
                }
              } else {
                return ((usb) this).a(param2, (byte) -123);
              }
            } else {
              return ((usb) this).a(((usb) this).field_y.length, param2, 0);
            }
          } else {
            return ((usb) this).a(param2, 103, ((usb) this).field_y.length);
          }
        }
    }

    final static void a(int param0, no param1, String param2, int param3, int param4, int param5, int param6) {
        int var7 = param1.b(param2);
        int var8 = param1.field_A + param1.field_o;
        int var9 = param3;
        if (!(dma.field_g >= var7 + (var9 - -6))) {
            var9 = -var7 + (dma.field_g - 6);
        }
        int var10 = 32 + (-param1.field_o + param0);
        if (dma.field_j < var8 + var10 - -6) {
            var10 = -var8 + (dma.field_j - 6);
        }
        dma.b(var9, var10, 6 + var7, 6 + var8, param5);
        dma.d(param4 + var9, var10 - -1, 4 + var7, var8 + 4, param6);
        param1.c(param2, 3 + var9, param1.field_o + (var10 + 3), param5, -1);
    }

    private final void c(int param0, byte param1, int param2) {
        int var4 = 0;
        shb[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var7 = VoidHunters.field_G;
          if (null != ((usb) this).field_A) {
            stackOut_2_0 = ((usb) this).field_A.length;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        var5 = new shb[param2 * var4];
        if (null != ((usb) this).field_u) {
          if ((((usb) this).field_u.length ^ -1) < -1) {
            if (-1 > (var5.length ^ -1)) {
              if (param0 > 0) {
                var6 = 0;
                L1: while (true) {
                  if (var4 > var6) {
                    cua.a((Object[]) (Object) ((usb) this).field_u, param0 * var6, (Object[]) (Object) var5, param2 * var6, Math.min(param0, param2));
                    var6++;
                    continue L1;
                  } else {
                    ((usb) this).field_u = var5;
                    var6 = -67 % ((param1 - 32) / 58);
                    return;
                  }
                }
              } else {
                ((usb) this).field_u = var5;
                var6 = -67 % ((param1 - 32) / 58);
                return;
              }
            } else {
              ((usb) this).field_u = var5;
              var6 = -67 % ((param1 - 32) / 58);
              return;
            }
          } else {
            ((usb) this).field_u = var5;
            var6 = -67 % ((param1 - 32) / 58);
            return;
          }
        } else {
          ((usb) this).field_u = var5;
          var6 = -67 % ((param1 - 32) / 58);
          return;
        }
    }

    static {
    }
}
