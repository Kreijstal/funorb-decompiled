/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln {
    static boolean field_e;
    int[] field_b;
    static byte[] field_d;
    static String field_c;
    int[] field_a;

    final int b(byte param0) {
        if (!((((ln) this).field_a[4] ^ -1) != 0)) {
            return -20;
        }
        int var2 = -4 % ((47 - param0) / 62);
        return 0;
    }

    final int a(int param0, int param1, int param2, int param3, String param4, int param5, int param6) {
        if (param1 != 0) {
          int discarded$2 = ((ln) this).b((byte) 83);
          return cc.a(param5, param3, ((ln) this).field_a, param6, -1, true, param2, param4, ((ln) this).field_b, param0);
        } else {
          return cc.a(param5, param3, ((ln) this).field_a, param6, -1, true, param2, param4, ((ln) this).field_b, param0);
        }
    }

    final int a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 21930) {
          ((ln) this).a(42, -104, -118);
          return tt.a(param0 - param3, param4 + -param2, ((ln) this).field_a, false);
        } else {
          return tt.a(param0 - param3, param4 + -param2, ((ln) this).field_a, false);
        }
    }

    final String a(byte param0) {
        int var4 = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        String var2 = "coat=";
        int var3 = -16 % ((param0 - -23) / 40);
        for (var4 = 0; ((ln) this).field_a.length > var4; var4++) {
            var2 = var2 + ((ln) this).field_a[var4] + ":" + ((ln) this).field_b[var4] + ":";
        }
        return var2;
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
            return;
        }
        field_d = null;
    }

    final static void a(kl param0, kl param1, kl param2, int param3) {
        int var4 = 0;
        String var5 = null;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        String var11 = null;
        int var12 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        ck.field_e = new qb[or.field_f.length][];
        var4 = param3;
        L0: while (true) {
          if (or.field_f.length <= var4) {
            if (ta.field_L) {
              nl.a(param1, ck.field_e, param2, (byte) 126);
              nl.a(param1, pv.field_a, param2, (byte) 126);
              qv.c(param3 ^ -11757);
              return;
            } else {
              var12 = 0;
              var4 = var12;
              L1: while (true) {
                if (-7 >= (var12 ^ -1)) {
                  nl.a(param1, ck.field_e, param2, (byte) 126);
                  nl.a(param1, pv.field_a, param2, (byte) 126);
                  qv.c(param3 ^ -11757);
                  return;
                } else {
                  var11 = ArmiesOfGielinor.field_N[var12];
                  var5 = var11;
                  if (var5 == null) {
                    pv.field_a[var12] = new qb[0];
                    var12++;
                    var12++;
                    continue L1;
                  } else {
                    pv.field_a[var12] = new qb[1];
                    var6 = bv.field_u[var12];
                    pv.field_a[var12][0] = new qb(param0, var11, var6);
                    var12++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            var10 = or.field_f[var4];
            var5 = var10;
            var6_int = jq.field_I[var4].length;
            ck.field_e[var4] = new qb[var6_int];
            var7 = 0;
            L2: while (true) {
              if (var6_int <= var7) {
                var4++;
                var4++;
                continue L0;
              } else {
                var8 = jq.field_I[var4][var7];
                ck.field_e[var4][var7] = new qb(param0, var10, var8);
                var7++;
                continue L2;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 < 52) {
            return;
        }
        ((ln) this).field_a[param2] = param1;
    }

    final wk a(String param0, byte param1, boolean param2) {
        int var4 = 0;
        Object var5 = null;
        no.field_P.field_v = qn.field_g;
        if (param1 != -70) {
          L0: {
            var5 = null;
            ((ln) this).a(false, true, (byte) -47, true, false, true, -69, (String) null, 102);
            no.field_P.field_B = qn.field_d;
            no.field_P.field_y = qn.field_l;
            ku.field_J.b();
            qn.b();
            if (param2) {
              break L0;
            } else {
              var4 = ((ln) this).field_a[3];
              ((ln) this).field_a[3] = -1;
              int discarded$4 = cc.a(0, -1, ((ln) this).field_a, -1, -1, false, -1, param0, ((ln) this).field_b, 0);
              ((ln) this).field_a[3] = var4;
              break L0;
            }
          }
          int discarded$5 = dm.a(-1, -1, ((ln) this).field_a, -1, false, ((ln) this).field_b, -1, false, 0, false, 0, param0);
          no.field_P.b();
          return (wk) (Object) ew.a((byte) 107, ku.field_J);
        } else {
          L1: {
            no.field_P.field_B = qn.field_d;
            no.field_P.field_y = qn.field_l;
            ku.field_J.b();
            qn.b();
            if (param2) {
              break L1;
            } else {
              var4 = ((ln) this).field_a[3];
              ((ln) this).field_a[3] = -1;
              int discarded$6 = cc.a(0, -1, ((ln) this).field_a, -1, -1, false, -1, param0, ((ln) this).field_b, 0);
              ((ln) this).field_a[3] = var4;
              break L1;
            }
          }
          int discarded$7 = dm.a(-1, -1, ((ln) this).field_a, -1, false, ((ln) this).field_b, -1, false, 0, false, 0, param0);
          no.field_P.b();
          return (wk) (Object) ew.a((byte) 107, ku.field_J);
        }
    }

    final void a(boolean param0, int param1, int param2, boolean param3, int param4, String param5, boolean param6, boolean param7, boolean param8, int param9) {
        int[] var11_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        Object var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        var17 = ArmiesOfGielinor.field_M ? 1 : 0;
        no.field_P.field_v = qn.field_g;
        no.field_P.field_B = qn.field_d;
        no.field_P.field_y = qn.field_l;
        if (param8) {
          if (null == dv.field_k) {
            dv.field_k = a.field_m[0].g();
            var21 = dv.field_k.field_B;
            var20 = var21;
            var19 = var20;
            var11_ref_int__ = var19;
            var12 = 0;
            L0: while (true) {
              if (var21.length <= var12) {
                dv.field_k.d(-20 + param4, param2 - 15, 92, 92, 256);
                ku.field_J.b();
                qn.b();
                if (param6) {
                  L1: {
                    int discarded$8 = cc.a(0, -1, ((ln) this).field_a, -1, -1, false, -1, param5, ((ln) this).field_b, 0);
                    if (!param7) {
                      if (!param0) {
                        if (param3) {
                          a.field_m[3].g(0, 0);
                          break L1;
                        } else {
                          no.field_P.b();
                          ku.field_J.e(param4, param2);
                          if (param9 != -19744) {
                            var18 = null;
                            ((ln) this).a(true, true, (byte) -68, false, true, false, 10, (String) null, 59);
                            return;
                          } else {
                            return;
                          }
                        }
                      } else {
                        fe.a(a.field_m[2], 0, 0);
                        a.field_m[2].f(0, 0, 228);
                        no.field_P.b();
                        ku.field_J.e(param4, param2);
                        if (param9 != -19744) {
                          var18 = null;
                          ((ln) this).a(true, true, (byte) -68, false, true, false, 10, (String) null, 59);
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      a.field_m[1].g(0, 0);
                      break L1;
                    }
                  }
                  no.field_P.b();
                  ku.field_J.e(param4, param2);
                  if (param9 != -19744) {
                    var18 = null;
                    ((ln) this).a(true, true, (byte) -68, false, true, false, 10, (String) null, 59);
                    return;
                  } else {
                    return;
                  }
                } else {
                  L2: {
                    var11 = ((ln) this).field_a[3];
                    ((ln) this).field_a[3] = -1;
                    int discarded$9 = cc.a(0, -1, ((ln) this).field_a, -1, -1, false, -1, param5, ((ln) this).field_b, 0);
                    ((ln) this).field_a[3] = var11;
                    if (!param7) {
                      if (!param0) {
                        if (param3) {
                          a.field_m[3].g(0, 0);
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        fe.a(a.field_m[2], 0, 0);
                        a.field_m[2].f(0, 0, 228);
                        break L2;
                      }
                    } else {
                      a.field_m[1].g(0, 0);
                      break L2;
                    }
                  }
                  no.field_P.b();
                  ku.field_J.e(param4, param2);
                  if (param9 != -19744) {
                    var18 = null;
                    ((ln) this).a(true, true, (byte) -68, false, true, false, 10, (String) null, 59);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                var13 = 255 & var21[var12];
                var14 = (param1 >> -460363248 & 255) * var13 >> 117135016;
                var15 = var13 * ((65280 & param1) >> -440616568) >> 581166312;
                var16 = (255 & param1) * var13 >> 599129992;
                var11_ref_int__[var12] = (var15 << -644131672) + ((var14 << 1530946064) + var16);
                var12++;
                continue L0;
              }
            }
          } else {
            if (param1 != t.field_f) {
              dv.field_k = a.field_m[0].g();
              var21 = dv.field_k.field_B;
              var20 = var21;
              var19 = var20;
              var11_ref_int__ = var19;
              var12 = 0;
              L3: while (true) {
                if (var21.length <= var12) {
                  dv.field_k.d(-20 + param4, param2 - 15, 92, 92, 256);
                  ku.field_J.b();
                  qn.b();
                  if (param6) {
                    L4: {
                      int discarded$10 = cc.a(0, -1, ((ln) this).field_a, -1, -1, false, -1, param5, ((ln) this).field_b, 0);
                      if (!param7) {
                        if (!param0) {
                          if (param3) {
                            a.field_m[3].g(0, 0);
                            break L4;
                          } else {
                            no.field_P.b();
                            ku.field_J.e(param4, param2);
                            if (param9 == -19744) {
                              return;
                            } else {
                              var18 = null;
                              ((ln) this).a(true, true, (byte) -68, false, true, false, 10, (String) null, 59);
                              return;
                            }
                          }
                        } else {
                          fe.a(a.field_m[2], 0, 0);
                          a.field_m[2].f(0, 0, 228);
                          no.field_P.b();
                          ku.field_J.e(param4, param2);
                          if (param9 == -19744) {
                            return;
                          } else {
                            var18 = null;
                            ((ln) this).a(true, true, (byte) -68, false, true, false, 10, (String) null, 59);
                            return;
                          }
                        }
                      } else {
                        a.field_m[1].g(0, 0);
                        break L4;
                      }
                    }
                    no.field_P.b();
                    ku.field_J.e(param4, param2);
                    if (param9 == -19744) {
                      return;
                    } else {
                      var18 = null;
                      ((ln) this).a(true, true, (byte) -68, false, true, false, 10, (String) null, 59);
                      return;
                    }
                  } else {
                    L5: {
                      var11 = ((ln) this).field_a[3];
                      ((ln) this).field_a[3] = -1;
                      int discarded$11 = cc.a(0, -1, ((ln) this).field_a, -1, -1, false, -1, param5, ((ln) this).field_b, 0);
                      ((ln) this).field_a[3] = var11;
                      if (!param7) {
                        if (!param0) {
                          if (param3) {
                            a.field_m[3].g(0, 0);
                            break L5;
                          } else {
                            break L5;
                          }
                        } else {
                          fe.a(a.field_m[2], 0, 0);
                          a.field_m[2].f(0, 0, 228);
                          break L5;
                        }
                      } else {
                        a.field_m[1].g(0, 0);
                        break L5;
                      }
                    }
                    no.field_P.b();
                    ku.field_J.e(param4, param2);
                    if (param9 == -19744) {
                      return;
                    } else {
                      var18 = null;
                      ((ln) this).a(true, true, (byte) -68, false, true, false, 10, (String) null, 59);
                      return;
                    }
                  }
                } else {
                  var13 = 255 & var21[var12];
                  var14 = (param1 >> -460363248 & 255) * var13 >> 117135016;
                  var15 = var13 * ((65280 & param1) >> -440616568) >> 581166312;
                  var16 = (255 & param1) * var13 >> 599129992;
                  var11_ref_int__[var12] = (var15 << -644131672) + ((var14 << 1530946064) + var16);
                  var12++;
                  continue L3;
                }
              }
            } else {
              dv.field_k.d(-20 + param4, param2 - 15, 92, 92, 256);
              ku.field_J.b();
              qn.b();
              if (param6) {
                L6: {
                  int discarded$12 = cc.a(0, -1, ((ln) this).field_a, -1, -1, false, -1, param5, ((ln) this).field_b, 0);
                  if (!param7) {
                    if (!param0) {
                      if (param3) {
                        a.field_m[3].g(0, 0);
                        break L6;
                      } else {
                        no.field_P.b();
                        ku.field_J.e(param4, param2);
                        if (param9 == -19744) {
                          return;
                        } else {
                          var18 = null;
                          ((ln) this).a(true, true, (byte) -68, false, true, false, 10, (String) null, 59);
                          return;
                        }
                      }
                    } else {
                      fe.a(a.field_m[2], 0, 0);
                      a.field_m[2].f(0, 0, 228);
                      no.field_P.b();
                      ku.field_J.e(param4, param2);
                      if (param9 == -19744) {
                        return;
                      } else {
                        var18 = null;
                        ((ln) this).a(true, true, (byte) -68, false, true, false, 10, (String) null, 59);
                        return;
                      }
                    }
                  } else {
                    a.field_m[1].g(0, 0);
                    break L6;
                  }
                }
                no.field_P.b();
                ku.field_J.e(param4, param2);
                if (param9 == -19744) {
                  return;
                } else {
                  var18 = null;
                  ((ln) this).a(true, true, (byte) -68, false, true, false, 10, (String) null, 59);
                  return;
                }
              } else {
                L7: {
                  var11 = ((ln) this).field_a[3];
                  ((ln) this).field_a[3] = -1;
                  int discarded$13 = cc.a(0, -1, ((ln) this).field_a, -1, -1, false, -1, param5, ((ln) this).field_b, 0);
                  ((ln) this).field_a[3] = var11;
                  if (!param7) {
                    if (!param0) {
                      if (param3) {
                        a.field_m[3].g(0, 0);
                        break L7;
                      } else {
                        break L7;
                      }
                    } else {
                      fe.a(a.field_m[2], 0, 0);
                      a.field_m[2].f(0, 0, 228);
                      break L7;
                    }
                  } else {
                    a.field_m[1].g(0, 0);
                    break L7;
                  }
                }
                no.field_P.b();
                ku.field_J.e(param4, param2);
                if (param9 == -19744) {
                  return;
                } else {
                  var18 = null;
                  ((ln) this).a(true, true, (byte) -68, false, true, false, 10, (String) null, 59);
                  return;
                }
              }
            }
          }
        } else {
          ku.field_J.b();
          qn.b();
          if (param6) {
            L8: {
              int discarded$14 = cc.a(0, -1, ((ln) this).field_a, -1, -1, false, -1, param5, ((ln) this).field_b, 0);
              if (!param7) {
                if (!param0) {
                  if (param3) {
                    a.field_m[3].g(0, 0);
                    break L8;
                  } else {
                    no.field_P.b();
                    ku.field_J.e(param4, param2);
                    if (param9 != -19744) {
                      var18 = null;
                      ((ln) this).a(true, true, (byte) -68, false, true, false, 10, (String) null, 59);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  fe.a(a.field_m[2], 0, 0);
                  a.field_m[2].f(0, 0, 228);
                  no.field_P.b();
                  ku.field_J.e(param4, param2);
                  if (param9 != -19744) {
                    var18 = null;
                    ((ln) this).a(true, true, (byte) -68, false, true, false, 10, (String) null, 59);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                a.field_m[1].g(0, 0);
                break L8;
              }
            }
            no.field_P.b();
            ku.field_J.e(param4, param2);
            if (param9 != -19744) {
              var18 = null;
              ((ln) this).a(true, true, (byte) -68, false, true, false, 10, (String) null, 59);
              return;
            } else {
              return;
            }
          } else {
            var11 = ((ln) this).field_a[3];
            ((ln) this).field_a[3] = -1;
            int discarded$15 = cc.a(0, -1, ((ln) this).field_a, -1, -1, false, -1, param5, ((ln) this).field_b, 0);
            ((ln) this).field_a[3] = var11;
            if (!param7) {
              if (!param0) {
                if (param3) {
                  a.field_m[3].g(0, 0);
                  no.field_P.b();
                  ku.field_J.e(param4, param2);
                  if (param9 != -19744) {
                    var18 = null;
                    ((ln) this).a(true, true, (byte) -68, false, true, false, 10, (String) null, 59);
                    return;
                  } else {
                    return;
                  }
                } else {
                  no.field_P.b();
                  ku.field_J.e(param4, param2);
                  if (param9 != -19744) {
                    var18 = null;
                    ((ln) this).a(true, true, (byte) -68, false, true, false, 10, (String) null, 59);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                fe.a(a.field_m[2], 0, 0);
                a.field_m[2].f(0, 0, 228);
                no.field_P.b();
                ku.field_J.e(param4, param2);
                if (param9 != -19744) {
                  var18 = null;
                  ((ln) this).a(true, true, (byte) -68, false, true, false, 10, (String) null, 59);
                  return;
                } else {
                  return;
                }
              }
            } else {
              a.field_m[1].g(0, 0);
              no.field_P.b();
              ku.field_J.e(param4, param2);
              if (param9 != -19744) {
                var18 = null;
                ((ln) this).a(true, true, (byte) -68, false, true, false, 10, (String) null, 59);
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final void a(boolean param0, boolean param1, byte param2, boolean param3, boolean param4, boolean param5, int param6, String param7, int param8) {
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          no.field_P.field_v = qn.field_g;
          no.field_P.field_B = qn.field_d;
          no.field_P.field_y = qn.field_l;
          ku.field_J.b();
          qn.b();
          if (!param3) {
            var10 = ((ln) this).field_a[3];
            ((ln) this).field_a[3] = -1;
            int discarded$2 = cc.a(0, -1, ((ln) this).field_a, -1, -1, false, -1, param7, ((ln) this).field_b, 0);
            ((ln) this).field_a[3] = var10;
            break L0;
          } else {
            int discarded$3 = cc.a(0, -1, ((ln) this).field_a, -1, -1, false, -1, param7, ((ln) this).field_b, 0);
            break L0;
          }
        }
        if (param0) {
          a.field_m[1].g(0, 0);
          if (param2 != 68) {
            field_d = null;
            ko.field_g.b();
            qn.b();
            ku.field_J.e(0, 0);
            no.field_P.b();
            ko.field_g.h(param8, param6);
            return;
          } else {
            ko.field_g.b();
            qn.b();
            ku.field_J.e(0, 0);
            no.field_P.b();
            ko.field_g.h(param8, param6);
            return;
          }
        } else {
          if (!param5) {
            if (!param4) {
              if (param2 != 68) {
                field_d = null;
                ko.field_g.b();
                qn.b();
                ku.field_J.e(0, 0);
                no.field_P.b();
                ko.field_g.h(param8, param6);
                return;
              } else {
                ko.field_g.b();
                qn.b();
                ku.field_J.e(0, 0);
                no.field_P.b();
                ko.field_g.h(param8, param6);
                return;
              }
            } else {
              a.field_m[3].g(0, 0);
              if (param2 == 68) {
                ko.field_g.b();
                qn.b();
                ku.field_J.e(0, 0);
                no.field_P.b();
                ko.field_g.h(param8, param6);
                return;
              } else {
                field_d = null;
                ko.field_g.b();
                qn.b();
                ku.field_J.e(0, 0);
                no.field_P.b();
                ko.field_g.h(param8, param6);
                return;
              }
            }
          } else {
            fe.a(a.field_m[2], 0, 0);
            a.field_m[2].f(0, 0, 228);
            if (param2 == 68) {
              ko.field_g.b();
              qn.b();
              ku.field_J.e(0, 0);
              no.field_P.b();
              ko.field_g.h(param8, param6);
              return;
            } else {
              field_d = null;
              ko.field_g.b();
              qn.b();
              ku.field_J.e(0, 0);
              no.field_P.b();
              ko.field_g.h(param8, param6);
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2) {
        ((ln) this).field_b[param0] = param1;
        if (param2 > -93) {
            ((ln) this).field_b = null;
        }
    }

    final void a(int param0, String param1, boolean param2, boolean param3, int param4, boolean param5, boolean param6, int param7) {
        int var10 = 0;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param7 > 16) {
          L0: {
            no.field_P.field_y = qn.field_l;
            no.field_P.field_B = qn.field_d;
            no.field_P.field_v = qn.field_g;
            if (param6) {
              a.field_m[0].d(-40 + param0, -30 + param4, 184, 184, 256);
              break L0;
            } else {
              break L0;
            }
          }
          ku.field_J.b();
          qn.b();
          int discarded$2 = cc.a(0, -1, ((ln) this).field_a, -1, -1, false, -1, param1, ((ln) this).field_b, 0);
          if (!param3) {
            if (!param2) {
              if (param5) {
                a.field_m[3].g(0, 0);
                no.field_P.b();
                ku.field_J.h(param0, param4);
                return;
              } else {
                no.field_P.b();
                ku.field_J.h(param0, param4);
                return;
              }
            } else {
              fe.a(a.field_m[2], 0, 0);
              a.field_m[2].f(0, 0, 228);
              no.field_P.b();
              ku.field_J.h(param0, param4);
              return;
            }
          } else {
            a.field_m[1].g(0, 0);
            no.field_P.b();
            ku.field_J.h(param0, param4);
            return;
          }
        } else {
          L1: {
            field_d = null;
            no.field_P.field_y = qn.field_l;
            no.field_P.field_B = qn.field_d;
            no.field_P.field_v = qn.field_g;
            if (param6) {
              a.field_m[0].d(-40 + param0, -30 + param4, 184, 184, 256);
              break L1;
            } else {
              break L1;
            }
          }
          ku.field_J.b();
          qn.b();
          int discarded$3 = cc.a(0, -1, ((ln) this).field_a, -1, -1, false, -1, param1, ((ln) this).field_b, 0);
          if (!param3) {
            if (!param2) {
              if (param5) {
                a.field_m[3].g(0, 0);
                no.field_P.b();
                ku.field_J.h(param0, param4);
                return;
              } else {
                no.field_P.b();
                ku.field_J.h(param0, param4);
                return;
              }
            } else {
              fe.a(a.field_m[2], 0, 0);
              a.field_m[2].f(0, 0, 228);
              no.field_P.b();
              ku.field_J.h(param0, param4);
              return;
            }
          } else {
            a.field_m[1].g(0, 0);
            no.field_P.b();
            ku.field_J.h(param0, param4);
            return;
          }
        }
    }

    ln(int[] param0, int[] param1) {
        ((ln) this).field_a = param0;
        ((ln) this).field_b = param1;
    }

    ln() {
        ((ln) this).field_a = new int[6];
        ((ln) this).field_b = new int[6];
        ((ln) this).field_a[0] = 0;
        ((ln) this).field_a[3] = 0;
        ((ln) this).field_a[2] = -1;
        ((ln) this).field_a[4] = -1;
        ((ln) this).field_a[1] = -1;
        ((ln) this).field_a[5] = 0;
        ((ln) this).field_b[3] = 0;
        ((ln) this).field_b[5] = 0;
        ((ln) this).field_b[2] = 0;
        ((ln) this).field_b[1] = 0;
        ((ln) this).field_b[4] = 0;
        ((ln) this).field_b[0] = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_c = "<%0> of <%1> strength";
    }
}
