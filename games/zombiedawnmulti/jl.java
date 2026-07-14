/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends hq {
    static ri field_u;
    private mk field_w;
    private mk[] field_s;
    static String field_v;
    static String field_t;

    private final void a(jl param0, boolean param1, byte param2) {
        int var4 = 0;
        mk var5 = null;
        mk var6 = null;
        mk var6_ref = null;
        int var7 = 0;
        Object var8 = null;
        mk stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        mk stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        mk stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        mk stackIn_8_2 = null;
        mk stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        mk stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        mk stackOut_7_2 = null;
        mk stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        mk stackOut_6_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        super.a(-3, (hq) (Object) param0);
        if (!param1) {
          d.a((Object[]) (Object) ((jl) this).field_s, 0, (Object[]) (Object) param0.field_s, 0, 6);
          if (param2 < -107) {
            return;
          } else {
            var8 = null;
            ((jl) this).a((ja) null, (byte) -75);
            return;
          }
        } else {
          var4 = 0;
          L0: while (true) {
            if (6 <= var4) {
              if (param2 >= -107) {
                var8 = null;
                ((jl) this).a((ja) null, (byte) -75);
                return;
              } else {
                return;
              }
            } else {
              var5 = ((jl) this).field_s[var4];
              var6 = var5;
              var6 = var5;
              if (var5 != null) {
                L1: {
                  var6_ref = param0.field_s[var4];
                  stackOut_5_0 = (mk) var5;
                  stackOut_5_1 = 100;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  if (var6_ref != null) {
                    stackOut_7_0 = (mk) (Object) stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = (mk) var6_ref;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    break L1;
                  } else {
                    param0.field_s[var4] = new mk();
                    stackOut_6_0 = (mk) (Object) stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = new mk();
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    break L1;
                  }
                }
                ((mk) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2);
                var4++;
                continue L0;
              } else {
                param0.field_s[var4] = null;
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, fm param6, pd param7, pd param8, int param9, int param10, int param11, int param12, int param13, int param14, fm param15, int param16, int param17, pd param18, int param19, boolean param20) {
        lj.a(param6, param4, param15, 61);
        ek.a(param16, param0, 1829947600, param9, param10);
        uo.a(param13, param1, 1633);
        if (!param20) {
            field_t = null;
        }
        vl.a(param18, param8, 127, param2, param12, param11);
        qb.a(param17, (byte) -115, param7, param14);
        nn.a((byte) 55, param3, param19, param5);
    }

    final mk a(int param0, byte param1) {
        Object var4 = null;
        if (param1 != -36) {
          var4 = null;
          this.a((jl) null, false, (byte) -31);
          ((jl) this).field_s[param0] = new mk();
          return new mk();
        } else {
          ((jl) this).field_s[param0] = new mk();
          return new mk();
        }
    }

    final void a(ja[] param0, int param1, boolean param2) {
        int var4 = 0;
        if (!param2) {
          var4 = param1;
          if (null == ((jl) this).field_s[var4]) {
            ((jl) this).field_s[var4] = new mk();
            ((jl) this).field_s[param1].field_e = param0;
            return;
          } else {
            ((jl) this).field_s[param1].field_e = param0;
            return;
          }
        } else {
          return;
        }
    }

    jl(jl param0, boolean param1) {
        this();
        param0.a((jl) this, param1, (byte) -122);
    }

    final static java.applet.Applet b(int param0) {
        if (null != fd.field_L) {
            return fd.field_L;
        }
        if (param0 != 0) {
            field_v = null;
            return (java.applet.Applet) (Object) tg.field_i;
        }
        return (java.applet.Applet) (Object) tg.field_i;
    }

    public final void a(boolean param0, int param1, int param2, int param3, cf param4) {
        mk var7 = null;
        Object var10 = null;
        gn var11 = null;
        mk var12 = null;
        mk var13 = null;
        mk var16 = null;
        mk var18 = null;
        mk var19 = null;
        mk var20 = null;
        mk var21 = null;
        mk var23 = null;
        mk var24 = null;
        mk var25 = null;
        mk var26 = null;
        mk var27 = null;
        mk var28 = null;
        mk var29 = null;
        mk var30 = null;
        mk var31 = null;
        mk var32 = null;
        mk var33 = null;
        cf stackIn_3_0 = null;
        cf stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param4 instanceof gn) {
            stackOut_2_0 = (cf) param4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (cf) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (gn) (Object) stackIn_3_0;
          nm.a(param3 - -param4.field_y, param4.field_w + (param4.field_i + param1), (byte) 105, param3 - -param4.field_y - -param4.field_n, param1 - -param4.field_i);
          if (var11 == null) {
            break L1;
          } else {
            param0 = param0 & var11.field_F;
            break L1;
          }
        }
        L2: {
          var7 = ((jl) this).field_s[0];
          ((jl) this).field_w.a((byte) 11);
          var7.a(-11108, param3, param1, (jl) this, param4, ((jl) this).field_w);
          if (var11 != null) {
            L3: {
              if (var11.field_G) {
                var12 = ((jl) this).field_s[1];
                if (var12 != null) {
                  var12.a(param2 + 4004, param3, param1, (jl) this, param4, ((jl) this).field_w);
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            if (var11.field_l) {
              var13 = ((jl) this).field_s[3];
              if (var11.field_u != 0) {
                if (var13 == null) {
                  var27 = ((jl) this).field_s[2];
                  if (var27 != null) {
                    var27.a(param2 + 4004, param3, param1, (jl) this, param4, ((jl) this).field_w);
                    break L2;
                  } else {
                    if (param4.c(126)) {
                      var24 = ((jl) this).field_s[5];
                      if (var24 == null) {
                        if (!param0) {
                          var26 = ((jl) this).field_s[4];
                          if (var26 == null) {
                            ((jl) this).field_w.a(param3, false, (jl) this, param4, param1);
                            ql.a(true);
                            if (param2 != -15112) {
                              var10 = null;
                              this.a((jl) null, false, (byte) -63);
                              return;
                            } else {
                              return;
                            }
                          } else {
                            L4: {
                              var26.a(-11108, param3, param1, (jl) this, param4, ((jl) this).field_w);
                              ((jl) this).field_w.a(param3, false, (jl) this, param4, param1);
                              ql.a(true);
                              if (param2 == -15112) {
                                break L4;
                              } else {
                                var10 = null;
                                this.a((jl) null, false, (byte) -63);
                                break L4;
                              }
                            }
                            return;
                          }
                        } else {
                          L5: {
                            ((jl) this).field_w.a(param3, false, (jl) this, param4, param1);
                            ql.a(true);
                            if (param2 == -15112) {
                              break L5;
                            } else {
                              var10 = null;
                              this.a((jl) null, false, (byte) -63);
                              break L5;
                            }
                          }
                          return;
                        }
                      } else {
                        L6: {
                          var24.a(-11108, param3, param1, (jl) this, param4, ((jl) this).field_w);
                          if (!param0) {
                            var25 = ((jl) this).field_s[4];
                            if (var25 == null) {
                              break L6;
                            } else {
                              var25.a(-11108, param3, param1, (jl) this, param4, ((jl) this).field_w);
                              break L6;
                            }
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          ((jl) this).field_w.a(param3, false, (jl) this, param4, param1);
                          ql.a(true);
                          if (param2 == -15112) {
                            break L7;
                          } else {
                            var10 = null;
                            this.a((jl) null, false, (byte) -63);
                            break L7;
                          }
                        }
                        return;
                      }
                    } else {
                      L8: {
                        if (!param0) {
                          var23 = ((jl) this).field_s[4];
                          if (var23 == null) {
                            break L8;
                          } else {
                            var23.a(-11108, param3, param1, (jl) this, param4, ((jl) this).field_w);
                            break L8;
                          }
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        ((jl) this).field_w.a(param3, false, (jl) this, param4, param1);
                        ql.a(true);
                        if (param2 == -15112) {
                          break L9;
                        } else {
                          var10 = null;
                          this.a((jl) null, false, (byte) -63);
                          break L9;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L10: {
                    var13.a(param2 ^ 4196, param3, param1, (jl) this, param4, ((jl) this).field_w);
                    if (param4.c(126)) {
                      var28 = ((jl) this).field_s[5];
                      if (var28 == null) {
                        break L10;
                      } else {
                        var28.a(-11108, param3, param1, (jl) this, param4, ((jl) this).field_w);
                        break L10;
                      }
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (!param0) {
                      var29 = ((jl) this).field_s[4];
                      if (var29 == null) {
                        break L11;
                      } else {
                        var29.a(-11108, param3, param1, (jl) this, param4, ((jl) this).field_w);
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    ((jl) this).field_w.a(param3, false, (jl) this, param4, param1);
                    ql.a(true);
                    if (param2 == -15112) {
                      break L12;
                    } else {
                      var10 = null;
                      this.a((jl) null, false, (byte) -63);
                      break L12;
                    }
                  }
                  return;
                }
              } else {
                L13: {
                  var16 = ((jl) this).field_s[2];
                  if (var16 == null) {
                    break L13;
                  } else {
                    var16.a(param2 + 4004, param3, param1, (jl) this, param4, ((jl) this).field_w);
                    break L13;
                  }
                }
                if (param4.c(126)) {
                  var19 = ((jl) this).field_s[5];
                  if (var19 == null) {
                    if (!param0) {
                      var21 = ((jl) this).field_s[4];
                      if (var21 == null) {
                        ((jl) this).field_w.a(param3, false, (jl) this, param4, param1);
                        ql.a(true);
                        if (param2 != -15112) {
                          var10 = null;
                          this.a((jl) null, false, (byte) -63);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        L14: {
                          var21.a(-11108, param3, param1, (jl) this, param4, ((jl) this).field_w);
                          ((jl) this).field_w.a(param3, false, (jl) this, param4, param1);
                          ql.a(true);
                          if (param2 == -15112) {
                            break L14;
                          } else {
                            var10 = null;
                            this.a((jl) null, false, (byte) -63);
                            break L14;
                          }
                        }
                        return;
                      }
                    } else {
                      L15: {
                        ((jl) this).field_w.a(param3, false, (jl) this, param4, param1);
                        ql.a(true);
                        if (param2 == -15112) {
                          break L15;
                        } else {
                          var10 = null;
                          this.a((jl) null, false, (byte) -63);
                          break L15;
                        }
                      }
                      return;
                    }
                  } else {
                    L16: {
                      var19.a(-11108, param3, param1, (jl) this, param4, ((jl) this).field_w);
                      if (!param0) {
                        var20 = ((jl) this).field_s[4];
                        if (var20 == null) {
                          break L16;
                        } else {
                          var20.a(-11108, param3, param1, (jl) this, param4, ((jl) this).field_w);
                          break L16;
                        }
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      ((jl) this).field_w.a(param3, false, (jl) this, param4, param1);
                      ql.a(true);
                      if (param2 == -15112) {
                        break L17;
                      } else {
                        var10 = null;
                        this.a((jl) null, false, (byte) -63);
                        break L17;
                      }
                    }
                    return;
                  }
                } else {
                  L18: {
                    if (!param0) {
                      var18 = ((jl) this).field_s[4];
                      if (var18 == null) {
                        break L18;
                      } else {
                        var18.a(-11108, param3, param1, (jl) this, param4, ((jl) this).field_w);
                        break L18;
                      }
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    ((jl) this).field_w.a(param3, false, (jl) this, param4, param1);
                    ql.a(true);
                    if (param2 == -15112) {
                      break L19;
                    } else {
                      var10 = null;
                      this.a((jl) null, false, (byte) -63);
                      break L19;
                    }
                  }
                  return;
                }
              }
            } else {
              break L2;
            }
          } else {
            break L2;
          }
        }
        if (param4.c(126)) {
          var31 = ((jl) this).field_s[5];
          if (var31 == null) {
            if (!param0) {
              var33 = ((jl) this).field_s[4];
              if (var33 == null) {
                ((jl) this).field_w.a(param3, false, (jl) this, param4, param1);
                ql.a(true);
                if (param2 == -15112) {
                  return;
                } else {
                  var10 = null;
                  this.a((jl) null, false, (byte) -63);
                  return;
                }
              } else {
                var33.a(-11108, param3, param1, (jl) this, param4, ((jl) this).field_w);
                ((jl) this).field_w.a(param3, false, (jl) this, param4, param1);
                ql.a(true);
                if (param2 != -15112) {
                  var10 = null;
                  this.a((jl) null, false, (byte) -63);
                  return;
                } else {
                  return;
                }
              }
            } else {
              ((jl) this).field_w.a(param3, false, (jl) this, param4, param1);
              ql.a(true);
              if (param2 != -15112) {
                var10 = null;
                this.a((jl) null, false, (byte) -63);
                return;
              } else {
                return;
              }
            }
          } else {
            var31.a(-11108, param3, param1, (jl) this, param4, ((jl) this).field_w);
            if (!param0) {
              var32 = ((jl) this).field_s[4];
              if (var32 == null) {
                ((jl) this).field_w.a(param3, false, (jl) this, param4, param1);
                ql.a(true);
                if (param2 != -15112) {
                  var10 = null;
                  this.a((jl) null, false, (byte) -63);
                  return;
                } else {
                  return;
                }
              } else {
                L20: {
                  var32.a(-11108, param3, param1, (jl) this, param4, ((jl) this).field_w);
                  ((jl) this).field_w.a(param3, false, (jl) this, param4, param1);
                  ql.a(true);
                  if (param2 == -15112) {
                    break L20;
                  } else {
                    var10 = null;
                    this.a((jl) null, false, (byte) -63);
                    break L20;
                  }
                }
                return;
              }
            } else {
              ((jl) this).field_w.a(param3, false, (jl) this, param4, param1);
              ql.a(true);
              if (param2 == -15112) {
                return;
              } else {
                var10 = null;
                this.a((jl) null, false, (byte) -63);
                return;
              }
            }
          }
        } else {
          L21: {
            if (!param0) {
              var30 = ((jl) this).field_s[4];
              if (var30 == null) {
                break L21;
              } else {
                var30.a(-11108, param3, param1, (jl) this, param4, ((jl) this).field_w);
                break L21;
              }
            } else {
              break L21;
            }
          }
          ((jl) this).field_w.a(param3, false, (jl) this, param4, param1);
          ql.a(true);
          if (param2 != -15112) {
            var10 = null;
            this.a((jl) null, false, (byte) -63);
            return;
          } else {
            return;
          }
        }
    }

    final void a(ja param0, byte param1) {
        mk[] var3 = null;
        int var4 = 0;
        mk var5_ref_mk = null;
        int var5 = 0;
        int var6 = 0;
        mk[] var7 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var7 = ((jl) this).field_s;
        var3 = var7;
        var4 = 0;
        L0: while (true) {
          if (var7.length <= var4) {
            var5 = 3 % ((22 - param1) / 49);
            return;
          } else {
            var5_ref_mk = var7[var4];
            if (var5_ref_mk != null) {
              var5_ref_mk.field_k = param0;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, byte param1, int param2, boolean param3, int param4, int param5, int param6) {
        String var7 = null;
        Object var8 = null;
        L0: {
          if ((va.field_a ^ -1) == -3) {
            var7 = nc.field_c;
            break L0;
          } else {
            var7 = pi.field_e;
            break L0;
          }
        }
        gf.a(127, param2, param4, param5, var7, param6, param0, param3);
        if (param1 != -97) {
          var8 = null;
          jl.a(-33, 72, 86, 111, -101, -58, (fm) null, (pd) null, (pd) null, -42, -100, -45, 56, 89, -124, (fm) null, -98, -113, (pd) null, -13, true);
          return;
        } else {
          return;
        }
    }

    final void a(ja[] param0, boolean param1) {
        mk[] var3 = null;
        int var4 = 0;
        mk var5 = null;
        int var6 = 0;
        mk[] var7 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var7 = ((jl) this).field_s;
        var3 = var7;
        var4 = 0;
        L0: while (true) {
          if (var7.length <= var4) {
            if (param1) {
              ((jl) this).field_w = null;
              return;
            } else {
              return;
            }
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_e = param0;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    public jl() {
        ((jl) this).field_s = new mk[6];
        ((jl) this).field_w = new mk();
        ((jl) this).field_s[0] = new mk();
        mk var1 = new mk();
        var1.a((byte) 11);
    }

    public static void a(boolean param0) {
        field_t = null;
        field_v = null;
        field_u = null;
        if (param0) {
            field_t = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Average rating";
        field_v = "Logging in...";
    }
}
