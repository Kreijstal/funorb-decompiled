/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uk {
    private int field_b;
    int[] field_f;
    static String field_a;
    byte[] field_i;
    private boolean[] field_n;
    static boolean field_e;
    int field_l;
    static ci field_c;
    int field_k;
    byte[] field_g;
    int field_m;
    int field_j;
    boolean[] field_d;
    int field_o;
    oj[] field_h;

    final static void a(int param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        qk.field_h = param3;
        pg.field_s = param0;
        nc.field_T = 0;
        if (param2 != 28333) {
            uk.c(-83);
        }
        if (!(qk.field_h != 0)) {
            pg.field_s = qk.field_h;
            ma.field_D = false;
        }
        if (!(!da.a(qk.field_h, true))) {
            var4 = 0;
            ae.field_e[qk.field_h].a((byte) 123, param1, var4);
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        oj[] var5 = null;
        if (((uk) this).field_h.length <= ((uk) this).field_o) {
            var5 = new oj[((uk) this).field_o + 8];
            ne.a((Object[]) (Object) ((uk) this).field_h, 0, (Object[]) (Object) var5, 0, ((uk) this).field_h.length);
            ((uk) this).field_h = var5;
        }
        ((uk) this).field_h[((uk) this).field_o] = new oj(param2, param0, param3);
        ((uk) this).field_o = ((uk) this).field_o + 1;
        if (param1 != 0) {
            this.d(-125, 44);
        }
    }

    public static void c(int param0) {
        field_a = null;
        if (param0 != -1) {
            field_e = true;
        }
        field_c = null;
    }

    final int b(int param0) {
        if (param0 != 0) {
            ((uk) this).field_j = 58;
        }
        return ((uk) this).field_m;
    }

    final static void a(boolean param0, int param1) {
        rn.field_a = param1;
        if (param0) {
            uk.a(83, false, 26, 15);
        }
    }

    final void a(un param0, p param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = Chess.field_G;
        var4 = param1.i(-124);
        if (3 < var4) {
          throw new RuntimeException("Version number too recent");
        } else {
          if (param2) {
            if (var4 == 0) {
              throw new RuntimeException("Version number too old");
            } else {
              if ((var4 ^ -1) != -2) {
                if (var4 == 2) {
                  throw new RuntimeException("Version number too old");
                } else {
                  L0: {
                    if (-4 != (var4 ^ -1)) {
                      break L0;
                    } else {
                      L1: {
                        var5 = param1.c(param2);
                        var6 = param1.d((byte) 118);
                        var8 = param1.d((byte) 118);
                        var10 = param1.g(0);
                        if (param0 == null) {
                          break L1;
                        } else {
                          param0.field_e = (int)(50L * (var6 / 1000L));
                          param0.field_B.field_f = var10;
                          param0.field_v = (int)(var8 / 1000L * 50L);
                          break L1;
                        }
                      }
                      var11 = 0;
                      L2: while (true) {
                        if ((var11 ^ -1) <= (var5 ^ -1)) {
                          break L0;
                        } else {
                          var12 = param1.i(-123);
                          var13 = param1.i(-103);
                          var14 = param1.i(-97);
                          ((uk) this).a((byte) 19, var14, var12, var13);
                          var11++;
                          continue L2;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                throw new RuntimeException("Version number too old");
              }
            }
          } else {
            return;
          }
        }
    }

    final boolean a(int param0, int param1, byte param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = Chess.field_G;
        int var4 = ((uk) this).field_m;
        if (param2 != -12) {
            return true;
        }
        boolean[] var12 = new boolean[((uk) this).field_d.length];
        boolean[] var11 = var12;
        boolean[] var5 = var11;
        ne.a(((uk) this).field_d, 0, var5, 0, var12.length);
        int var6 = ((uk) this).field_f[param1];
        if (!(var6 == 0)) {
            var7 = var6 & 16773120;
            if (!(param0 != var7)) {
                ((uk) this).a(param1, true, -1);
                var8 = 0;
                for (var9 = 63; (var9 ^ -1) <= -1; var9--) {
                    if (((uk) this).field_d[var9]) {
                        var8 = 1;
                        break;
                    }
                }
                if (!(var8 == 0)) {
                    this.a(2, var12, var4);
                    return true;
                }
            }
        }
        this.a(2, var12, var4);
        return false;
    }

    final boolean e(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        boolean[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        boolean[] var13 = null;
        boolean[] var14 = null;
        boolean[] var15 = null;
        boolean[] var16 = null;
        var11 = Chess.field_G;
        var3 = -1;
        var4 = 63;
        L0: while (true) {
          L1: {
            if (-1 < (var4 ^ -1)) {
              break L1;
            } else {
              L2: {
                var5_int = ((uk) this).field_f[var4];
                if (0 != var5_int) {
                  var6 = 16773120 & var5_int;
                  var7 = -16773121 & var5_int;
                  if ((param0 ^ -1) != (var6 ^ -1)) {
                    break L2;
                  } else {
                    if (6 == var7) {
                      var3 = var4;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
              var4--;
              continue L0;
            }
          }
          if ((var3 ^ -1) != 0) {
            var4 = ((uk) this).field_m;
            if (param1 >= 49) {
              var16 = new boolean[((uk) this).field_d.length];
              var15 = var16;
              var14 = var15;
              var13 = var14;
              var5 = var13;
              ne.a(((uk) this).field_d, 0, var5, 0, var16.length);
              var6 = 0;
              var12 = 63;
              var7 = var12;
              L3: while (true) {
                L4: {
                  if ((var12 ^ -1) > -1) {
                    break L4;
                  } else {
                    if (var6 != 0) {
                      break L4;
                    } else {
                      L5: {
                        var8 = ((uk) this).field_f[var12];
                        if (-1 != (var8 ^ -1)) {
                          var9 = 16773120 & var8;
                          if (param0 != var9) {
                            ((uk) this).a(var12, false, -1);
                            var10 = ((uk) this).field_d[var3] ? 1 : 0;
                            if (var10 == 0) {
                              break L5;
                            } else {
                              var6 = 1;
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      }
                      var12--;
                      continue L3;
                    }
                  }
                }
                this.a(2, var16, var4);
                return var6 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
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
        var17 = Chess.field_G;
        var5 = ((uk) this).field_f[param2];
        var6 = 16773120 & var5;
        var7 = var5 & -16773121;
        var8 = param2 / 8;
        var9 = param2 % 8;
        var10 = param3 / 8;
        var11 = param3 % 8;
        var12 = var9 + -var11;
        var13 = ((uk) this).field_f[param3];
        if (param0 == 19) {
          L0: {
            L1: {
              var14 = var13 & 16773120;
              if (var7 == 1) {
                break L1;
              } else {
                if (var13 != 0) {
                  break L1;
                } else {
                  if (var6 != 0) {
                    if ((var6 ^ -1) != -4097) {
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
            if (var6 == 0) {
              break L0;
            } else {
              if (var6 != 4096) {
                break L0;
              } else {
                break L0;
              }
            }
          }
          L2: {
            var15 = -16773121 & var13;
            if ((var15 ^ -1) == -5) {
              if (var14 == 4096) {
                L3: {
                  if (var11 == 0) {
                    ((uk) this).field_n[3] = false;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (var11 == 7) {
                  ((uk) this).field_n[2] = false;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                L4: {
                  if (7 != var11) {
                    break L4;
                  } else {
                    ((uk) this).field_n[0] = false;
                    break L4;
                  }
                }
                if (var11 != 0) {
                  break L2;
                } else {
                  ((uk) this).field_n[1] = false;
                  break L2;
                }
              }
            } else {
              break L2;
            }
          }
          L5: {
            if (-4097 != (var6 ^ -1)) {
              break L5;
            } else {
              L6: {
                ((uk) this).field_k = -1;
                if ((var7 ^ -1) == -2) {
                  L7: {
                    if (-7 != (var8 ^ -1)) {
                      break L7;
                    } else {
                      if (var10 == 4) {
                        ((uk) this).field_l = var9;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if ((var10 ^ -1) != -1) {
                      break L8;
                    } else {
                      var5 = var6 | param1;
                      break L8;
                    }
                  }
                  if (((uk) this).field_b == param3) {
                    var16 = 8 + param3;
                    var13 = ((uk) this).field_f[var16];
                    ((uk) this).field_f[var16] = 0;
                    break L6;
                  } else {
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              L9: {
                if (-5 != (var7 ^ -1)) {
                  break L9;
                } else {
                  L10: {
                    if ((var9 ^ -1) != -1) {
                      break L10;
                    } else {
                      ((uk) this).field_n[3] = false;
                      break L10;
                    }
                  }
                  if (-8 != (var9 ^ -1)) {
                    break L9;
                  } else {
                    ((uk) this).field_n[2] = false;
                    break L9;
                  }
                }
              }
              if (var7 != 6) {
                break L5;
              } else {
                ((uk) this).field_n[2] = false;
                ((uk) this).field_n[3] = false;
                if ((var12 ^ -1) != -3) {
                  if ((var12 ^ -1) == 1) {
                    ((uk) this).field_f[(param2 - -param3) / 2] = ((uk) this).field_f[63];
                    ((uk) this).field_f[63] = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  ((uk) this).field_f[(param2 - -param3) / 2] = ((uk) this).field_f[56];
                  ((uk) this).field_f[56] = 0;
                  break L5;
                }
              }
            }
          }
          L11: {
            L12: {
              if (0 == var6) {
                L13: {
                  ((uk) this).field_l = -1;
                  if ((var7 ^ -1) != -2) {
                    break L13;
                  } else {
                    L14: {
                      if (7 == var10) {
                        var5 = param1 | var6;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (var8 != 1) {
                        break L15;
                      } else {
                        if (var10 != 3) {
                          break L15;
                        } else {
                          ((uk) this).field_k = var9;
                          break L15;
                        }
                      }
                    }
                    if ((((uk) this).field_b ^ -1) != (param3 ^ -1)) {
                      break L13;
                    } else {
                      var16 = param3 + -8;
                      var13 = ((uk) this).field_f[var16];
                      ((uk) this).field_f[var16] = 0;
                      break L13;
                    }
                  }
                }
                L16: {
                  if (4 == var7) {
                    L17: {
                      if (var9 != 7) {
                        break L17;
                      } else {
                        ((uk) this).field_n[0] = false;
                        break L17;
                      }
                    }
                    if (-1 == (var9 ^ -1)) {
                      ((uk) this).field_n[1] = false;
                      break L16;
                    } else {
                      break L16;
                    }
                  } else {
                    break L16;
                  }
                }
                if (-7 == (var7 ^ -1)) {
                  ((uk) this).field_n[1] = false;
                  ((uk) this).field_n[0] = false;
                  if (2 == var12) {
                    ((uk) this).field_f[(param2 - -param3) / 2] = ((uk) this).field_f[0];
                    ((uk) this).field_f[0] = 0;
                    break L12;
                  } else {
                    if (1 != (var12 ^ -1)) {
                      break L12;
                    } else {
                      ((uk) this).field_f[(param3 + param2) / 2] = ((uk) this).field_f[7];
                      ((uk) this).field_f[7] = 0;
                      break L12;
                    }
                  }
                } else {
                  ((uk) this).field_b = -1;
                  ((uk) this).field_f[param3] = var5;
                  ((uk) this).field_f[param2] = 0;
                  this.d(3, var13);
                  this.a(param3, 0, param2, param1);
                  ((uk) this).a(-1, false, -1);
                  t.field_Q = true;
                  break L11;
                }
              } else {
                break L12;
              }
            }
            ((uk) this).field_b = -1;
            ((uk) this).field_f[param3] = var5;
            ((uk) this).field_f[param2] = 0;
            this.d(3, var13);
            this.a(param3, 0, param2, param1);
            ((uk) this).a(-1, false, -1);
            t.field_Q = true;
            break L11;
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
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
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[] var25 = null;
        int[] var26 = null;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        var29 = Chess.field_G;
        var4 = -1 + ((uk) this).field_d.length;
        L0: while (true) {
          if (0 > var4) {
            ((uk) this).field_m = param0;
            if (((uk) this).field_m < 0) {
              return;
            } else {
              if ((((uk) this).field_m ^ -1) < (((uk) this).field_f.length ^ -1)) {
                return;
              } else {
                var4 = ((uk) this).field_f[((uk) this).field_m];
                if (-1 == (var4 ^ -1)) {
                  return;
                } else {
                  L1: {
                    L2: {
                      var5 = var4 & 16773120;
                      var6 = -16773121 & var4;
                      var7 = ((uk) this).field_m % 8;
                      var8 = ((uk) this).field_m / 8;
                      var15 = 1;
                      var16 = new int[]{1, 1, -1, -1};
                      var17 = new int[]{var8, var7, var8, var7};
                      var18 = new int[]{1, 1, -1, -1};
                      var19 = new int[]{1, -1, 1, -1};
                      var20 = new int[]{2, 2, 1, -1, -2, -2, -1, 1};
                      var21 = new int[]{param2, 1, 2, 2, 1, -1, -2, -2};
                      var27 = var6;
                      if (var27 == 1) {
                        L3: {
                          if ((var5 ^ -1) == -1) {
                            stackOut_20_0 = 1;
                            stackIn_21_0 = stackOut_20_0;
                            break L3;
                          } else {
                            stackOut_19_0 = -1;
                            stackIn_21_0 = stackOut_19_0;
                            break L3;
                          }
                        }
                        var22 = stackIn_21_0;
                        var11 = var8 + var22;
                        var23 = 1;
                        var27 = -1;
                        L4: while (true) {
                          if (-2 > (var27 ^ -1)) {
                            if (var23 != 0) {
                              L5: {
                                L6: {
                                  L7: {
                                    if (var8 != 1) {
                                      break L7;
                                    } else {
                                      if ((var5 ^ -1) == -1) {
                                        break L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  if ((var8 ^ -1) != -7) {
                                    break L5;
                                  } else {
                                    if (4096 != var5) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                var11 = 2 * var22 + var8;
                                var9 = var11 * 8 + var7;
                                var12 = ((uk) this).field_f[var9];
                                var14 = -16773121 & var12;
                                var13 = 16773120 & var12;
                                if (0 != var12) {
                                  break L5;
                                } else {
                                  this.a(param2 ^ 0, var9, param1);
                                  break L5;
                                }
                              }
                              L8: {
                                var24 = -1;
                                if (0 != var5) {
                                  var24 = ((uk) this).field_k;
                                  break L8;
                                } else {
                                  var24 = ((uk) this).field_l;
                                  break L8;
                                }
                              }
                              if (-1 == var24) {
                                break L2;
                              } else {
                                L9: {
                                  var27 = var7 + -var24;
                                  if (1 == var27) {
                                    break L9;
                                  } else {
                                    if (var27 == -1) {
                                      break L9;
                                    } else {
                                      break L1;
                                    }
                                  }
                                }
                                L10: {
                                  if (var5 != 4096) {
                                    break L10;
                                  } else {
                                    if (3 != var8) {
                                      break L10;
                                    } else {
                                      var11 = var8 - 1;
                                      var9 = 8 * var11 + var24;
                                      ((uk) this).field_b = var9;
                                      this.a(param2 + 0, var9, param1);
                                      break L10;
                                    }
                                  }
                                }
                                L11: {
                                  if ((var5 ^ -1) != -1) {
                                    break L11;
                                  } else {
                                    if (4 != var8) {
                                      break L11;
                                    } else {
                                      var11 = var8 + 1;
                                      var9 = var11 * 8 + var24;
                                      ((uk) this).field_b = var9;
                                      this.a(-1, var9, param1);
                                      break L11;
                                    }
                                  }
                                }
                                break L1;
                              }
                            } else {
                              L12: {
                                var24 = -1;
                                if (0 != var5) {
                                  var24 = ((uk) this).field_k;
                                  break L12;
                                } else {
                                  var24 = ((uk) this).field_l;
                                  break L12;
                                }
                              }
                              if (-1 == var24) {
                                break L2;
                              } else {
                                L13: {
                                  var27 = var7 + -var24;
                                  if (1 == var27) {
                                    break L13;
                                  } else {
                                    if (var27 == -1) {
                                      break L13;
                                    } else {
                                      break L1;
                                    }
                                  }
                                }
                                L14: {
                                  if (var5 != 4096) {
                                    break L14;
                                  } else {
                                    if (3 != var8) {
                                      break L14;
                                    } else {
                                      var11 = var8 - 1;
                                      var9 = 8 * var11 + var24;
                                      ((uk) this).field_b = var9;
                                      this.a(param2 + 0, var9, param1);
                                      break L14;
                                    }
                                  }
                                }
                                L15: {
                                  if ((var5 ^ -1) != -1) {
                                    break L15;
                                  } else {
                                    if (4 != var8) {
                                      break L15;
                                    } else {
                                      var11 = var8 + 1;
                                      var9 = var11 * 8 + var24;
                                      ((uk) this).field_b = var9;
                                      this.a(-1, var9, param1);
                                      break L15;
                                    }
                                  }
                                }
                                break L1;
                              }
                            }
                          } else {
                            L16: {
                              var10 = var7 - -var27;
                              if (-1 < (var10 ^ -1)) {
                                break L16;
                              } else {
                                if (var10 >= 8) {
                                  break L16;
                                } else {
                                  var9 = var10 - -(var11 * 8);
                                  var12 = ((uk) this).field_f[var9];
                                  var14 = -16773121 & var12;
                                  var13 = 16773120 & var12;
                                  if (var27 == 0) {
                                    if (0 == var12) {
                                      this.a(param2 + 0, var9, param1);
                                      break L16;
                                    } else {
                                      var23 = 0;
                                      break L16;
                                    }
                                  } else {
                                    if (-1 == (var12 ^ -1)) {
                                      break L16;
                                    } else {
                                      if ((var13 ^ -1) == (var5 ^ -1)) {
                                        break L16;
                                      } else {
                                        this.a(-1, var9, param1);
                                        break L16;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var27++;
                            continue L4;
                          }
                        }
                      } else {
                        if (4 == var27) {
                          var27 = 0;
                          L17: while (true) {
                            if (4 <= var27) {
                              break L2;
                            } else {
                              var15 = 1;
                              var28 = var17[var27];
                              L18: while (true) {
                                L19: {
                                  if (0 > var28) {
                                    break L19;
                                  } else {
                                    if ((var28 ^ -1) <= -9) {
                                      break L19;
                                    } else {
                                      if (var15 == 0) {
                                        break L19;
                                      } else {
                                        L20: {
                                          L21: {
                                            if (var27 == 0) {
                                              break L21;
                                            } else {
                                              if (2 != var27) {
                                                var9 = var28 + 8 * var8;
                                                break L20;
                                              } else {
                                                break L21;
                                              }
                                            }
                                          }
                                          var9 = var7 - -(var28 * 8);
                                          break L20;
                                        }
                                        L22: {
                                          if (var9 != ((uk) this).field_m) {
                                            L23: {
                                              var12 = ((uk) this).field_f[var9];
                                              var14 = -16773121 & var12;
                                              var13 = var12 & 16773120;
                                              if (-1 != (var12 ^ -1)) {
                                                if (var13 != var5) {
                                                  var15 = 0;
                                                  break L23;
                                                } else {
                                                  var27++;
                                                  continue L17;
                                                }
                                              } else {
                                                break L23;
                                              }
                                            }
                                            this.a(param2 + 0, var9, param1);
                                            break L22;
                                          } else {
                                            break L22;
                                          }
                                        }
                                        var28 = var28 + var16[var27];
                                        continue L18;
                                      }
                                    }
                                  }
                                }
                                var27++;
                                continue L17;
                              }
                            }
                          }
                        } else {
                          if (var27 == 2) {
                            var27 = 0;
                            L24: while (true) {
                              if (8 <= var27) {
                                break L2;
                              } else {
                                L25: {
                                  var11 = var20[var27] + var8;
                                  var10 = var7 + var21[var27];
                                  if ((var11 ^ -1) > -1) {
                                    break L25;
                                  } else {
                                    if (8 <= var11) {
                                      break L25;
                                    } else {
                                      if ((var10 ^ -1) > -1) {
                                        break L25;
                                      } else {
                                        if (8 <= var10) {
                                          break L25;
                                        } else {
                                          L26: {
                                            var9 = 8 * var11 + var10;
                                            var12 = ((uk) this).field_f[var9];
                                            var14 = -16773121 & var12;
                                            var13 = 16773120 & var12;
                                            if (var14 == 0) {
                                              break L26;
                                            } else {
                                              if (var5 != var13) {
                                                break L26;
                                              } else {
                                                break L25;
                                              }
                                            }
                                          }
                                          this.a(param2 + 0, var9, param1);
                                          break L25;
                                        }
                                      }
                                    }
                                  }
                                }
                                var27++;
                                continue L24;
                              }
                            }
                          } else {
                            if (-4 == (var27 ^ -1)) {
                              var27 = 0;
                              L27: while (true) {
                                if (4 <= var27) {
                                  break L2;
                                } else {
                                  var11 = var18[var27] + var8;
                                  var10 = var7 + var19[var27];
                                  var15 = 1;
                                  L28: while (true) {
                                    L29: {
                                      if (var15 == 0) {
                                        break L29;
                                      } else {
                                        if (var11 < 0) {
                                          break L29;
                                        } else {
                                          if ((var11 ^ -1) <= -9) {
                                            break L29;
                                          } else {
                                            if ((var10 ^ -1) > -1) {
                                              break L29;
                                            } else {
                                              if (8 <= var10) {
                                                break L29;
                                              } else {
                                                L30: {
                                                  var9 = var11 * 8 + var10;
                                                  var12 = ((uk) this).field_f[var9];
                                                  var14 = -16773121 & var12;
                                                  var13 = var12 & 16773120;
                                                  if (-1 == (var12 ^ -1)) {
                                                    break L30;
                                                  } else {
                                                    if (var5 != var13) {
                                                      var15 = 0;
                                                      break L30;
                                                    } else {
                                                      break L29;
                                                    }
                                                  }
                                                }
                                                this.a(-1, var9, param1);
                                                var10 = var10 + var19[var27];
                                                var11 = var11 + var18[var27];
                                                continue L28;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var27++;
                                    continue L27;
                                  }
                                }
                              }
                            } else {
                              if (var27 != 5) {
                                if ((var27 ^ -1) != -7) {
                                  break L1;
                                } else {
                                  var26 = new int[]{-1, 0, 1, 1, 1, 0, -1, -1};
                                  var25 = new int[]{1, 1, 1, 0, -1, -1, -1, 0};
                                  var27 = 0;
                                  L31: while (true) {
                                    if (var27 >= 8) {
                                      L32: {
                                        if (4096 != var5) {
                                          break L32;
                                        } else {
                                          if (!param1) {
                                            break L32;
                                          } else {
                                            if (!((uk) this).e(4096, 52)) {
                                              L33: {
                                                if (!((uk) this).field_n[3]) {
                                                  break L33;
                                                } else {
                                                  if (((uk) this).field_d[-1 + ((uk) this).field_m]) {
                                                    if (((uk) this).field_f[((uk) this).field_m + -2] != 0) {
                                                      break L33;
                                                    } else {
                                                      if (0 == ((uk) this).field_f[((uk) this).field_m - 3]) {
                                                        this.a(param2 + 0, -2 + ((uk) this).field_m, param1);
                                                        break L33;
                                                      } else {
                                                        break L33;
                                                      }
                                                    }
                                                  } else {
                                                    break L33;
                                                  }
                                                }
                                              }
                                              if (!((uk) this).field_n[2]) {
                                                break L32;
                                              } else {
                                                if (((uk) this).field_d[((uk) this).field_m + 1]) {
                                                  if ((((uk) this).field_f[((uk) this).field_m + 2] ^ -1) != -1) {
                                                    break L32;
                                                  } else {
                                                    this.a(-1, 2 + ((uk) this).field_m, param1);
                                                    break L32;
                                                  }
                                                } else {
                                                  break L32;
                                                }
                                              }
                                            } else {
                                              break L32;
                                            }
                                          }
                                        }
                                      }
                                      if (0 != var5) {
                                        break L2;
                                      } else {
                                        if (!param1) {
                                          break L2;
                                        } else {
                                          if (!((uk) this).e(0, 82)) {
                                            L34: {
                                              if (!((uk) this).field_n[1]) {
                                                break L34;
                                              } else {
                                                if (((uk) this).field_d[-1 + ((uk) this).field_m]) {
                                                  if (-1 != (((uk) this).field_f[((uk) this).field_m + -2] ^ -1)) {
                                                    break L34;
                                                  } else {
                                                    if (-1 == (((uk) this).field_f[((uk) this).field_m - 3] ^ -1)) {
                                                      this.a(-1, ((uk) this).field_m + -2, param1);
                                                      break L34;
                                                    } else {
                                                      break L34;
                                                    }
                                                  }
                                                } else {
                                                  break L34;
                                                }
                                              }
                                            }
                                            if (!((uk) this).field_n[0]) {
                                              break L2;
                                            } else {
                                              if (((uk) this).field_d[((uk) this).field_m + 1]) {
                                                if ((((uk) this).field_f[((uk) this).field_m - -2] ^ -1) == -1) {
                                                  this.a(-1, 2 + ((uk) this).field_m, param1);
                                                  break L2;
                                                } else {
                                                  break L1;
                                                }
                                              } else {
                                                break L1;
                                              }
                                            }
                                          } else {
                                            break L1;
                                          }
                                        }
                                      }
                                    } else {
                                      L35: {
                                        var10 = var26[var27] + var7;
                                        var11 = var25[var27] + var8;
                                        if (var11 < 0) {
                                          break L35;
                                        } else {
                                          if (var11 >= 8) {
                                            break L35;
                                          } else {
                                            if (var10 < 0) {
                                              break L35;
                                            } else {
                                              if (var10 >= 8) {
                                                break L35;
                                              } else {
                                                L36: {
                                                  var9 = var10 + var11 * 8;
                                                  var12 = ((uk) this).field_f[var9];
                                                  var14 = var12 & -16773121;
                                                  var13 = 16773120 & var12;
                                                  if (var14 == 0) {
                                                    break L36;
                                                  } else {
                                                    if (var13 == var5) {
                                                      break L35;
                                                    } else {
                                                      break L36;
                                                    }
                                                  }
                                                }
                                                this.a(-1, var9, param1);
                                                break L35;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var27++;
                                      continue L31;
                                    }
                                  }
                                }
                              } else {
                                var27 = 0;
                                L37: while (true) {
                                  if ((var27 ^ -1) <= -5) {
                                    var27 = 0;
                                    L38: while (true) {
                                      if ((var27 ^ -1) <= -5) {
                                        break L2;
                                      } else {
                                        var10 = var19[var27] + var7;
                                        var11 = var18[var27] + var8;
                                        var15 = 1;
                                        L39: while (true) {
                                          L40: {
                                            if (var15 == 0) {
                                              break L40;
                                            } else {
                                              if ((var11 ^ -1) > -1) {
                                                break L40;
                                              } else {
                                                if (var11 >= 8) {
                                                  break L40;
                                                } else {
                                                  if ((var10 ^ -1) > -1) {
                                                    break L40;
                                                  } else {
                                                    if (-9 >= (var10 ^ -1)) {
                                                      break L40;
                                                    } else {
                                                      L41: {
                                                        var9 = 8 * var11 + var10;
                                                        var12 = ((uk) this).field_f[var9];
                                                        var14 = var12 & -16773121;
                                                        var13 = var12 & 16773120;
                                                        if (0 != var12) {
                                                          if (var13 == var5) {
                                                            break L40;
                                                          } else {
                                                            var15 = 0;
                                                            break L41;
                                                          }
                                                        } else {
                                                          break L41;
                                                        }
                                                      }
                                                      this.a(-1, var9, param1);
                                                      var10 = var10 + var19[var27];
                                                      var11 = var11 + var18[var27];
                                                      continue L39;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          var27++;
                                          continue L38;
                                        }
                                      }
                                    }
                                  } else {
                                    var15 = 1;
                                    var28 = var17[var27];
                                    L42: while (true) {
                                      L43: {
                                        if (var28 < 0) {
                                          break L43;
                                        } else {
                                          if ((var28 ^ -1) <= -9) {
                                            break L43;
                                          } else {
                                            if (var15 == 0) {
                                              break L43;
                                            } else {
                                              L44: {
                                                L45: {
                                                  if (0 == var27) {
                                                    break L45;
                                                  } else {
                                                    if (var27 != 2) {
                                                      var9 = 8 * var8 + var28;
                                                      break L44;
                                                    } else {
                                                      break L45;
                                                    }
                                                  }
                                                }
                                                var9 = var7 + var28 * 8;
                                                break L44;
                                              }
                                              L46: {
                                                if ((((uk) this).field_m ^ -1) == (var9 ^ -1)) {
                                                  break L46;
                                                } else {
                                                  L47: {
                                                    var12 = ((uk) this).field_f[var9];
                                                    var13 = 16773120 & var12;
                                                    var14 = var12 & -16773121;
                                                    if (var12 != 0) {
                                                      if ((var5 ^ -1) == (var13 ^ -1)) {
                                                        break L43;
                                                      } else {
                                                        var15 = 0;
                                                        break L47;
                                                      }
                                                    } else {
                                                      break L47;
                                                    }
                                                  }
                                                  this.a(-1, var9, param1);
                                                  break L46;
                                                }
                                              }
                                              var28 = var28 + var16[var27];
                                              continue L42;
                                            }
                                          }
                                        }
                                      }
                                      var27++;
                                      continue L37;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    break L1;
                  }
                  return;
                }
              }
            }
          } else {
            ((uk) this).field_d[var4] = false;
            var4--;
            continue L0;
          }
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        int var6 = 0;
        int var7 = 0;
        int var5 = 0;
        if (param0 != -1) {
            this.a(94, -75, 79, -71);
        }
        int var4 = ((uk) this).field_m;
        if (var4 >= 0) {
            if (-65 < (var4 ^ -1)) {
                // if_icmpgt L58
                // if_icmple L58
            } else {
                return;
            }
            if (param2) {
                var5 = 16773120 & ((uk) this).field_f[var4];
                var6 = ((uk) this).field_f[param1];
                ((uk) this).field_f[param1] = ((uk) this).field_f[var4];
                ((uk) this).field_f[var4] = 0;
                var7 = ((uk) this).e(var5, param0 + 105) ? 1 : 0;
                ((uk) this).field_f[var4] = ((uk) this).field_f[param1];
                ((uk) this).field_f[param1] = var6;
                ((uk) this).field_d[param1] = var7 == 0 ? true : false;
            } else {
                ((uk) this).field_d[param1] = true;
            }
            return;
        }
    }

    private final void d(int param0, int param1) {
        int var6 = 0;
        int var7 = Chess.field_G;
        if (-1 == (param1 ^ -1)) {
            return;
        }
        int var3 = 16773120 & param1;
        int var4 = param1 & -16773121;
        byte[] var5 = (var3 ^ -1) != -4097 ? ((uk) this).field_i : ((uk) this).field_g;
        for (var6 = 0; var5[var6] != 0; var6++) {
        }
        if (param0 != 3) {
            this.a(-43, 1, false);
        }
        var5[var6] = (byte)var4;
    }

    private final void a(int param0, boolean[] param1, int param2) {
        ((uk) this).field_m = param2;
        ((uk) this).field_d = param1;
        if (param0 != 2) {
            uk.a(true, 82);
        }
    }

    final boolean a(int param0, int param1) {
        if (param0 >= -105) {
            return true;
        }
        if (!((uk) this).e(param1, 97)) {
            if (!this.c(param1, -105)) {
                return true;
            }
        }
        return false;
    }

    final int b(int param0, int param1) {
        if (param1 != 9550) {
            field_a = null;
        }
        return ((uk) this).field_f[param0];
    }

    private final boolean c(int param0, int param1) {
        int var6 = Chess.field_G;
        int var3 = ((uk) this).field_m;
        boolean[] var4 = new boolean[((uk) this).field_d.length];
        ne.a(((uk) this).field_d, 0, var4, 0, var4.length);
        int var5 = 63;
        if (param1 > -103) {
            uk.c(-10);
        }
        while (-1 >= (var5 ^ -1)) {
            if (!(!((uk) this).a(param0, var5, (byte) -12))) {
                return true;
            }
            var5--;
        }
        this.a(2, var4, var3);
        return false;
    }

    final boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Chess.field_G;
        if (0 > ((uk) this).field_m) {
          return false;
        } else {
          if ((((uk) this).field_m ^ -1) > -65) {
            L0: {
              var2 = ((uk) this).field_f[((uk) this).field_m];
              var3 = 16773120 & var2;
              var4 = var2 & -16773121;
              var5 = ((uk) this).field_m % 8;
              var6 = ((uk) this).field_m / param0;
              if ((var4 ^ -1) != -2) {
                break L0;
              } else {
                L1: {
                  if (0 != var3) {
                    break L1;
                  } else {
                    if (var6 != 6) {
                      break L1;
                    } else {
                      var7 = -1;
                      L2: while (true) {
                        if (var7 > 1) {
                          break L0;
                        } else {
                          L3: {
                            var8 = var6 - -1;
                            var9 = var5 + var7;
                            if (0 > var9) {
                              break L3;
                            } else {
                              if (8 > var9) {
                                var10 = var8 * 8 + var9;
                                if (!((uk) this).field_d[var10]) {
                                  break L3;
                                } else {
                                  return true;
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          var7++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
                if (-4097 != (var3 ^ -1)) {
                  break L0;
                } else {
                  if ((var6 ^ -1) != -2) {
                    break L0;
                  } else {
                    var7 = -1;
                    L4: while (true) {
                      if (-2 > (var7 ^ -1)) {
                        break L0;
                      } else {
                        L5: {
                          var8 = -1 + var6;
                          var9 = var5 + var7;
                          if ((var9 ^ -1) > -1) {
                            break L5;
                          } else {
                            if (var9 < 8) {
                              var10 = var8 * 8 + var9;
                              if (!((uk) this).field_d[var10]) {
                                break L5;
                              } else {
                                return true;
                              }
                            } else {
                              break L5;
                            }
                          }
                        }
                        var7++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
            return false;
          } else {
            return false;
          }
        }
    }

    final int a(byte param0) {
        int var3 = Chess.field_G;
        if (param0 >= -89) {
            return -120;
        }
        int var2 = 0;
        if (((uk) this).field_h.length == 0) {
            return -1;
        }
        while ((var2 ^ -1) > (((uk) this).field_h.length ^ -1)) {
            // if_acmpeq L54
            var2++;
        }
        return var2;
    }

    final boolean a(byte param0, int param1) {
        if (param0 != 61) {
            uk.a(true, -111);
        }
        if (((uk) this).e(param1, 97)) {
            if (!this.c(param1, -111)) {
                return true;
            }
        }
        return false;
    }

    uk() {
        ((uk) this).field_b = -1;
        ((uk) this).field_i = new byte[16];
        ((uk) this).field_l = -1;
        ((uk) this).field_k = -1;
        ((uk) this).field_n = new boolean[]{true, true, true, true};
        ((uk) this).field_g = new byte[16];
        ((uk) this).field_f = new int[df.field_i.length];
        ((uk) this).field_m = -1;
        ((uk) this).field_d = new boolean[64];
        ((uk) this).field_j = -1;
        ((uk) this).field_o = 0;
        ((uk) this).field_h = new oj[]{};
        ne.a(df.field_i, 0, ((uk) this).field_f, 0, df.field_i.length);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
    }
}
