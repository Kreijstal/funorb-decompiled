/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends ug {
    private boolean field_P;
    private vb field_R;
    private vb field_O;
    private vb field_M;
    static nc[] field_L;
    static String field_N;
    static vl field_Q;

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        int var6;
        super.a(param0, param1, param2, (byte) -119, param4);
        var6 = -130 + param4 >> 1701124769;
        if (this.field_P) {
          this.field_M.a(param0, var6, 0, (byte) -119, 25);
          this.field_R.a(param0, 45 + var6, 0, (byte) -119, 25);
          this.field_O.a(param0, 90 + var6, 0, param3, 40);
          return;
        } else {
          this.field_R.a(param0, var6, 0, (byte) -119, 25);
          this.field_M.a(param0, var6 - -45, 0, (byte) -119, 25);
          this.field_O.a(param0, 90 + var6, 0, param3, 40);
          return;
        }
    }

    final String d(int param0) {
        String var2;
        String stackIn_8_0 = null;
        String stackIn_15_0 = null;
        var2 = this.field_M.d(77);
        if (var2 != null) {
          return var2;
        } else {
          if (param0 > 6) {
            if (!this.field_q) {
              return null;
            } else {
              L0: {
                if (this.field_z != null) {
                  stackIn_15_0 = this.field_z;
                  break L0;
                } else {
                  stackIn_15_0 = this.field_A;
                  break L0;
                }
              }
              return stackIn_15_0;
            }
          } else {
            na.j((byte) -82);
            if (!this.field_q) {
              return null;
            } else {
              L1: {
                if (this.field_z != null) {
                  stackIn_8_0 = this.field_z;
                  break L1;
                } else {
                  stackIn_8_0 = this.field_A;
                  break L1;
                }
              }
              return stackIn_8_0;
            }
          }
        }
    }

    final void a(an param0, byte param1) {
        try {
            super.a(param0, param1);
            this.field_R.field_i = (uh) ((Object) param0);
            this.field_M.field_i = (uh) ((Object) param0);
            this.field_O.field_i = (uh) ((Object) param0);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "na.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int i(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 == 5390) {
            break L0;
          } else {
            this.field_M = (vb) null;
            break L0;
          }
        }
        try {
          L1: {
            stackIn_3_0 = Integer.parseInt(this.field_O.field_A);
            break L1;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_3_0;
    }

    final static jp[] a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var6;
        int var7;
        int var8;
        jp var9;
        jp var10;
        jp var11;
        jp var12;
        jp var13;
        Object var14;
        int[] var15;
        jp var16;
        int[] var17;
        int[] var18;
        L0: {
          var18 = lb.field_l;
          var17 = var18;
          var15 = var17;
          var6 = var15;
          var7 = lb.field_c;
          var8 = lb.field_d;
          var9 = new jp(param2, param4 - param2 * 2);
          var9.g();
          lb.g(0, 0, param2, param4 - param2 * 2, param3, param1);
          var10 = new jp(param2, param2);
          var10.g();
          lb.g(0, 0, param2, param2, param3);
          var11 = new jp(16, param2);
          var11.g();
          lb.g(0, 0, 16, param2, param3);
          var12 = new jp(param2, param2);
          var12.g();
          lb.g(0, 0, param2, param2, param1);
          var13 = new jp(16, param2);
          var13.g();
          lb.g(0, 0, 16, param2, param1);
          var14 = null;
          if (0 >= param5) {
            break L0;
          } else {
            var16 = new jp(16, 16);
            var14 = var16;
            var16.g();
            lb.g(0, 0, 16, 16, param5);
            break L0;
          }
        }
        lb.a(var18, var7, var8);
        if (param0) {
          na.a(false, 118, 124, -92, 47, -40);
          return new jp[]{var10, var11, var10, var9, (jp) (var14), var9, var12, var13, var12};
        } else {
          return new jp[]{var10, var11, var10, var9, (jp) (var14), var9, var12, var13, var12};
        }
    }

    private na(ub param0, boolean param1) {
        super(0, 0, 0, 0, (ub) null);
        try {
            this.field_R = (vb) ((Object) new sf("", (uh) null, 2));
            this.field_M = (vb) ((Object) new sf("", (uh) null, 2));
            this.field_O = (vb) ((Object) new sf("", (uh) null, 4));
            this.field_O.field_l = param0;
            this.field_M.field_l = param0;
            this.field_R.field_l = param0;
            this.field_P = param1 ? true : false;
            if (!this.field_P) {
                this.a(this.field_R, true);
                this.a(this.field_M, true);
            } else {
                this.a(this.field_M, true);
                this.a(this.field_R, true);
            }
            this.a(this.field_O, true);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "na.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean j(byte param0) {
        if (param0 == -60) {
          if (tn.field_m != null) {
            if (!tn.field_m.h(param0 ^ -55)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          na.a(true, 76, -125, -71, 104, -123);
          if (tn.field_m != null) {
            if (!tn.field_m.h(param0 ^ -55)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final boolean h(byte param0) {
        if (null != this.field_R.field_A) {
          if (0 != this.field_R.field_A.length()) {
            if (this.field_M.field_A != null) {
              if (this.field_M.field_A.length() != 0) {
                if (param0 == -124) {
                  L0: {
                    if (this.field_O.field_A == null) {
                      break L0;
                    } else {
                      if (this.field_O.field_A.length() == 0) {
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                  return true;
                } else {
                  L1: {
                    field_Q = (vl) null;
                    if (this.field_O.field_A == null) {
                      break L1;
                    } else {
                      if (this.field_O.field_A.length() == 0) {
                        break L1;
                      } else {
                        return false;
                      }
                    }
                  }
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    private final void a(oc param0, String param1, byte param2, int param3, int param4) {
        try {
            og.field_Yb.b(param1, param3 - -param0.field_o + (param0.field_t >> 475251105), param0.field_w + (param4 + -5), 16777215, -1);
            int var6_int = -127 % ((-2 - param2) / 59);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "na.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, String param1, String param2, int param3, int param4) {
        try {
            g.field_n.field_X = param4;
            g.field_n.field_Cb = param1;
            g.field_n.field_Mb = param2;
            g.field_n.field_Ib = g.field_n.field_Ib + ap.field_e.field_Ib;
            ap.field_e.field_P = ap.field_e.field_P + ap.field_e.field_Ib;
            ap.field_e.field_Ib = param3;
            if (param0 >= -72) {
                na.a(true, true, 77, -47);
            }
            g.field_n.field_Ib = g.field_n.field_Ib - ap.field_e.field_Ib;
            ap.field_e.field_P = ap.field_e.field_P - ap.field_e.field_Ib;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "na.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, int param2, int param3) {
        mh stackIn_7_0 = null;
        mh stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        mh stackIn_14_0 = null;
        mh stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        mh stackIn_19_0 = null;
        mh stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        mh stackIn_48_0 = null;
        mh stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        mh stackIn_55_0 = null;
        mh stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        mh stackIn_60_0 = null;
        mh stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int var4;
        on.e(-79);
        if ((m.field_h ^ -1) <= -1) {
          L0: {
            L1: {
              dn.field_N.field_Mb = rd.a(rm.field_c, new String[]{Integer.toString(m.field_h)}, (byte) 103);
              var4 = 34 / ((-10 - param2) / 53);
              stackIn_48_0 = fe.field_gb;

              if (!param0) {
                break L1;
              } else {
                stackIn_48_0 = (mh) ((Object) stackIn_48_0);

                if (param1) {
                  break L1;
                } else {
                  stackIn_48_0 = (mh) ((Object) stackIn_48_0);

                  if (sc.field_c) {
                    break L1;
                  } else {
                    stackIn_48_0 = (mh) ((Object) stackIn_48_0);

                    if (null != o.field_e) {
                      break L1;
                    } else {
                      stackIn_48_0 = (mh) ((Object) stackIn_48_0);

                      if (nl.field_f != null) {
                        break L1;
                      } else {
                        stackIn_49_0 = (mh) ((Object) stackIn_48_0);
                        stackIn_49_1 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            stackIn_49_0 = (mh) ((Object) stackIn_48_0);
            stackIn_49_1 = 0;
            break L0;
          }
          L2: {
            L3: {
              ((mh) (Object) stackIn_49_0).a(stackIn_49_1 != 0, -15211);
              stackIn_55_0 = rm.field_a;

              if (!param0) {
                break L3;
              } else {
                stackIn_55_0 = (mh) ((Object) stackIn_55_0);

                if (param1) {
                  break L3;
                } else {
                  stackIn_55_0 = (mh) ((Object) stackIn_55_0);

                  if (sc.field_c) {
                    break L3;
                  } else {
                    stackIn_55_0 = (mh) ((Object) stackIn_55_0);

                    if (o.field_e != null) {
                      break L3;
                    } else {
                      stackIn_55_0 = (mh) ((Object) stackIn_55_0);

                      if (null != nl.field_f) {
                        break L3;
                      } else {
                        stackIn_56_0 = (mh) ((Object) stackIn_55_0);
                        stackIn_56_1 = 1;
                        break L2;
                      }
                    }
                  }
                }
              }
            }
            stackIn_56_0 = (mh) ((Object) stackIn_55_0);
            stackIn_56_1 = 0;
            break L2;
          }
          L4: {
            L5: {
              ((mh) (Object) stackIn_56_0).a(stackIn_56_1 != 0, -15211);
              stackIn_60_0 = qp.field_f;

              if (!param0) {
                break L5;
              } else {
                stackIn_60_0 = (mh) ((Object) stackIn_60_0);

                if (param1) {
                  break L5;
                } else {
                  stackIn_60_0 = (mh) ((Object) stackIn_60_0);

                  if (!sc.field_c) {
                    break L5;
                  } else {
                    stackIn_61_0 = (mh) ((Object) stackIn_60_0);
                    stackIn_61_1 = 1;
                    break L4;
                  }
                }
              }
            }
            stackIn_61_0 = (mh) ((Object) stackIn_60_0);
            stackIn_61_1 = 0;
            break L4;
          }
          L6: {
            ((mh) (Object) stackIn_61_0).a(stackIn_61_1 != 0, -15211);
            ap.field_b.field_d.i(0);
            if (-1 == (jf.field_k.field_L ^ -1)) {
              break L6;
            } else {
              tq.field_c = true;
              break L6;
            }
          }
          L7: {
            if (gj.field_b.field_L == 0) {
              break L7;
            } else {
              if (ea.field_g) {
                ml.a(param3, -1);
                break L7;
              } else {
                if (-1 > (go.field_c ^ -1)) {
                  ml.a(param3, -1);
                  break L7;
                } else {
                  if (kb.field_Yb < 2) {
                    break L7;
                  } else {
                    if (!pe.field_l[12]) {
                      break L7;
                    } else {
                      ml.a(param3, -1);
                      break L7;
                    }
                  }
                }
              }
            }
          }
          L8: {
            if (td.field_v.field_L != 0) {
              if (1 != w.field_n.length) {
                pl.a(param3, on.field_O, pf.field_i, true, 0, (byte) -102);
                break L8;
              } else {
                if (pf.field_i == w.field_n[0]) {
                  pl.a(param3, on.field_O, pf.field_i, true, 0, (byte) -102);
                  break L8;
                } else {
                  pf.field_i = w.field_n[0];
                  pl.a(param3, on.field_O, pf.field_i, true, 0, (byte) -102);
                  break L8;
                }
              }
            } else {
              break L8;
            }
          }
          L9: {
            if (0 == nh.field_a.field_L) {
              break L9;
            } else {
              sc.field_c = false;
              break L9;
            }
          }
          return;
        } else {
          L10: {
            L11: {
              dn.field_N.field_Mb = null;
              var4 = 34 / ((-10 - param2) / 53);
              stackIn_7_0 = fe.field_gb;

              if (!param0) {
                break L11;
              } else {
                stackIn_7_0 = (mh) ((Object) stackIn_7_0);

                if (param1) {
                  break L11;
                } else {
                  stackIn_7_0 = (mh) ((Object) stackIn_7_0);

                  if (sc.field_c) {
                    break L11;
                  } else {
                    stackIn_7_0 = (mh) ((Object) stackIn_7_0);

                    if (null != o.field_e) {
                      break L11;
                    } else {
                      stackIn_7_0 = (mh) ((Object) stackIn_7_0);

                      if (nl.field_f != null) {
                        break L11;
                      } else {
                        stackIn_8_0 = (mh) ((Object) stackIn_7_0);
                        stackIn_8_1 = 1;
                        break L10;
                      }
                    }
                  }
                }
              }
            }
            stackIn_8_0 = (mh) ((Object) stackIn_7_0);
            stackIn_8_1 = 0;
            break L10;
          }
          L12: {
            L13: {
              ((mh) (Object) stackIn_8_0).a(stackIn_8_1 != 0, -15211);
              stackIn_14_0 = rm.field_a;

              if (!param0) {
                break L13;
              } else {
                stackIn_14_0 = (mh) ((Object) stackIn_14_0);

                if (param1) {
                  break L13;
                } else {
                  stackIn_14_0 = (mh) ((Object) stackIn_14_0);

                  if (sc.field_c) {
                    break L13;
                  } else {
                    stackIn_14_0 = (mh) ((Object) stackIn_14_0);

                    if (o.field_e != null) {
                      break L13;
                    } else {
                      stackIn_14_0 = (mh) ((Object) stackIn_14_0);

                      if (null != nl.field_f) {
                        break L13;
                      } else {
                        stackIn_15_0 = (mh) ((Object) stackIn_14_0);
                        stackIn_15_1 = 1;
                        break L12;
                      }
                    }
                  }
                }
              }
            }
            stackIn_15_0 = (mh) ((Object) stackIn_14_0);
            stackIn_15_1 = 0;
            break L12;
          }
          L14: {
            L15: {
              ((mh) (Object) stackIn_15_0).a(stackIn_15_1 != 0, -15211);
              stackIn_19_0 = qp.field_f;

              if (!param0) {
                break L15;
              } else {
                stackIn_19_0 = (mh) ((Object) stackIn_19_0);

                if (param1) {
                  break L15;
                } else {
                  stackIn_19_0 = (mh) ((Object) stackIn_19_0);

                  if (!sc.field_c) {
                    break L15;
                  } else {
                    stackIn_20_0 = (mh) ((Object) stackIn_19_0);
                    stackIn_20_1 = 1;
                    break L14;
                  }
                }
              }
            }
            stackIn_20_0 = (mh) ((Object) stackIn_19_0);
            stackIn_20_1 = 0;
            break L14;
          }
          L16: {
            ((mh) (Object) stackIn_20_0).a(stackIn_20_1 != 0, -15211);
            ap.field_b.field_d.i(0);
            if (-1 == (jf.field_k.field_L ^ -1)) {
              break L16;
            } else {
              tq.field_c = true;
              break L16;
            }
          }
          L17: {
            if (gj.field_b.field_L == 0) {
              break L17;
            } else {
              if (ea.field_g) {
                ml.a(param3, -1);
                break L17;
              } else {
                if (-1 > (go.field_c ^ -1)) {
                  ml.a(param3, -1);
                  break L17;
                } else {
                  if (kb.field_Yb < 2) {
                    break L17;
                  } else {
                    if (!pe.field_l[12]) {
                      break L17;
                    } else {
                      ml.a(param3, -1);
                      break L17;
                    }
                  }
                }
              }
            }
          }
          L18: {
            if (td.field_v.field_L != 0) {
              if (1 != w.field_n.length) {
                pl.a(param3, on.field_O, pf.field_i, true, 0, (byte) -102);
                break L18;
              } else {
                if (pf.field_i == w.field_n[0]) {
                  pl.a(param3, on.field_O, pf.field_i, true, 0, (byte) -102);
                  break L18;
                } else {
                  pf.field_i = w.field_n[0];
                  pl.a(param3, on.field_O, pf.field_i, true, 0, (byte) -102);
                  break L18;
                }
              }
            } else {
              break L18;
            }
          }
          L19: {
            if (0 == nh.field_a.field_L) {
              break L19;
            } else {
              sc.field_c = false;
              break L19;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, param3);
        if (param2 != 0) {
          return;
        } else {
          param0 = param0 + this.field_w;
          param1 = param1 + this.field_o;
          this.a(this.field_R, ej.field_M, (byte) 127, param1, param0);
          this.a(this.field_M, rl.field_f, (byte) 123, param1, param0);
          this.a(this.field_O, kk.field_f, (byte) -86, param1, param0);
          return;
        }
    }

    na(ub param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
            this.a(param5, param2, param3, (byte) -119, param4);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "na.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static byte a(int param0, char param1) {
        int var2;
        int var3;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (param1 > 0) {
          if (param1 >= 128) {
            if (param1 >= 160) {
              L0: {
                if (param1 <= 255) {
                  var2 = (byte)param1;
                  break L0;
                } else {
                  if (param1 == 8364) {
                    var2 = -128;
                    if (param0 == -8250) {
                      return (byte) var2;
                    } else {
                      return (byte) 9;
                    }
                  } else {
                    if (8218 != param1) {
                      if (param1 != 402) {
                        if (param1 == 8222) {
                          var2 = -124;
                          if (param0 == -8250) {
                            return (byte) var2;
                          } else {
                            return (byte) 9;
                          }
                        } else {
                          if (param1 != 8230) {
                            if (8224 != param1) {
                              if (8225 != param1) {
                                if (param1 == 710) {
                                  var2 = -120;
                                  if (param0 == -8250) {
                                    return (byte) var2;
                                  } else {
                                    return (byte) 9;
                                  }
                                } else {
                                  if (param1 != 8240) {
                                    if (param1 == 352) {
                                      var2 = -118;
                                      if (param0 == -8250) {
                                        return (byte) var2;
                                      } else {
                                        return (byte) 9;
                                      }
                                    } else {
                                      if (param1 != 8249) {
                                        if (param1 == 338) {
                                          var2 = -116;
                                          if (param0 == -8250) {
                                            return (byte) var2;
                                          } else {
                                            return (byte) 9;
                                          }
                                        } else {
                                          if (381 != param1) {
                                            if (param1 == 8216) {
                                              var2 = -111;
                                              if (param0 == -8250) {
                                                return (byte) var2;
                                              } else {
                                                return (byte) 9;
                                              }
                                            } else {
                                              if (param1 != 8217) {
                                                if (param1 != 8220) {
                                                  if (param1 != 8221) {
                                                    if (8226 != param1) {
                                                      if (8211 != param1) {
                                                        if (param1 != 8212) {
                                                          if (param1 != 732) {
                                                            if (param1 == 8482) {
                                                              var2 = -103;
                                                              if (param0 == -8250) {
                                                                return (byte) var2;
                                                              } else {
                                                                return (byte) 9;
                                                              }
                                                            } else {
                                                              if (param1 == 353) {
                                                                var2 = -102;
                                                                if (param0 == -8250) {
                                                                  return (byte) var2;
                                                                } else {
                                                                  return (byte) 9;
                                                                }
                                                              } else {
                                                                if (param1 == 8250) {
                                                                  var2 = -101;
                                                                  if (param0 == -8250) {
                                                                    return (byte) var2;
                                                                  } else {
                                                                    return (byte) 9;
                                                                  }
                                                                } else {
                                                                  if (param1 == 339) {
                                                                    var2 = -100;
                                                                    if (param0 == -8250) {
                                                                      return (byte) var2;
                                                                    } else {
                                                                      return (byte) 9;
                                                                    }
                                                                  } else {
                                                                    if (param1 != 382) {
                                                                      if (param1 == 376) {
                                                                        var2 = -97;
                                                                        if (param0 == -8250) {
                                                                          return (byte) var2;
                                                                        } else {
                                                                          return (byte) 9;
                                                                        }
                                                                      } else {
                                                                        var2 = 63;
                                                                        if (param0 == -8250) {
                                                                          return (byte) var2;
                                                                        } else {
                                                                          return (byte) 9;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      var2 = -98;
                                                                      if (param0 == -8250) {
                                                                        return (byte) var2;
                                                                      } else {
                                                                        return (byte) 9;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            var2 = -104;
                                                            if (param0 == -8250) {
                                                              return (byte) var2;
                                                            } else {
                                                              return (byte) 9;
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -105;
                                                          if (param0 == -8250) {
                                                            return (byte) var2;
                                                          } else {
                                                            return (byte) 9;
                                                          }
                                                        }
                                                      } else {
                                                        var2 = -106;
                                                        if (param0 == -8250) {
                                                          return (byte) var2;
                                                        } else {
                                                          return (byte) 9;
                                                        }
                                                      }
                                                    } else {
                                                      var2 = -107;
                                                      if (param0 == -8250) {
                                                        return (byte) var2;
                                                      } else {
                                                        return (byte) 9;
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -108;
                                                    if (param0 == -8250) {
                                                      return (byte) var2;
                                                    } else {
                                                      return (byte) 9;
                                                    }
                                                  }
                                                } else {
                                                  var2 = -109;
                                                  break L0;
                                                }
                                              } else {
                                                var2 = -110;
                                                break L0;
                                              }
                                            }
                                          } else {
                                            var2 = -114;
                                            break L0;
                                          }
                                        }
                                      } else {
                                        var2 = -117;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    var2 = -119;
                                    break L0;
                                  }
                                }
                              } else {
                                var2 = -121;
                                break L0;
                              }
                            } else {
                              var2 = -122;
                              break L0;
                            }
                          } else {
                            var2 = -123;
                            break L0;
                          }
                        }
                      } else {
                        var2 = -125;
                        break L0;
                      }
                    } else {
                      var2 = -126;
                      break L0;
                    }
                  }
                }
              }
              if (param0 == -8250) {
                return (byte) var2;
              } else {
                return (byte) 9;
              }
            } else {
              if (param1 == 8364) {
                var2 = -128;
                if (param0 == -8250) {
                  return (byte) var2;
                } else {
                  return (byte) 9;
                }
              } else {
                L1: {
                  if (8218 != param1) {
                    if (param1 != 402) {
                      if (param1 == 8222) {
                        var2 = -124;
                        if (param0 == -8250) {
                          return (byte) var2;
                        } else {
                          return (byte) 9;
                        }
                      } else {
                        if (param1 != 8230) {
                          if (8224 != param1) {
                            if (8225 != param1) {
                              if (param1 == 710) {
                                var2 = -120;
                                if (param0 == -8250) {
                                  return (byte) var2;
                                } else {
                                  return (byte) 9;
                                }
                              } else {
                                if (param1 != 8240) {
                                  if (param1 == 352) {
                                    var2 = -118;
                                    if (param0 == -8250) {
                                      return (byte) var2;
                                    } else {
                                      return (byte) 9;
                                    }
                                  } else {
                                    if (param1 != 8249) {
                                      if (param1 == 338) {
                                        var2 = -116;
                                        if (param0 == -8250) {
                                          return (byte) var2;
                                        } else {
                                          return (byte) 9;
                                        }
                                      } else {
                                        if (381 != param1) {
                                          if (param1 == 8216) {
                                            var2 = -111;
                                            if (param0 == -8250) {
                                              return (byte) var2;
                                            } else {
                                              return (byte) 9;
                                            }
                                          } else {
                                            if (param1 != 8217) {
                                              if (param1 != 8220) {
                                                if (param1 != 8221) {
                                                  if (8226 != param1) {
                                                    if (8211 != param1) {
                                                      if (param1 != 8212) {
                                                        if (param1 != 732) {
                                                          if (param1 == 8482) {
                                                            var2 = -103;
                                                            if (param0 == -8250) {
                                                              return (byte) var2;
                                                            } else {
                                                              return (byte) 9;
                                                            }
                                                          } else {
                                                            if (param1 == 353) {
                                                              var2 = -102;
                                                              if (param0 == -8250) {
                                                                return (byte) var2;
                                                              } else {
                                                                return (byte) 9;
                                                              }
                                                            } else {
                                                              if (param1 == 8250) {
                                                                var2 = -101;
                                                                if (param0 == -8250) {
                                                                  return (byte) var2;
                                                                } else {
                                                                  return (byte) 9;
                                                                }
                                                              } else {
                                                                if (param1 == 339) {
                                                                  var2 = -100;
                                                                  if (param0 == -8250) {
                                                                    return (byte) var2;
                                                                  } else {
                                                                    return (byte) 9;
                                                                  }
                                                                } else {
                                                                  if (param1 != 382) {
                                                                    if (param1 == 376) {
                                                                      var2 = -97;
                                                                      if (param0 == -8250) {
                                                                        return (byte) var2;
                                                                      } else {
                                                                        return (byte) 9;
                                                                      }
                                                                    } else {
                                                                      var2 = 63;
                                                                      if (param0 == -8250) {
                                                                        return (byte) var2;
                                                                      } else {
                                                                        return (byte) 9;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var2 = -98;
                                                                    break L1;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -104;
                                                          break L1;
                                                        }
                                                      } else {
                                                        var2 = -105;
                                                        break L1;
                                                      }
                                                    } else {
                                                      var2 = -106;
                                                      break L1;
                                                    }
                                                  } else {
                                                    var2 = -107;
                                                    break L1;
                                                  }
                                                } else {
                                                  var2 = -108;
                                                  break L1;
                                                }
                                              } else {
                                                var2 = -109;
                                                break L1;
                                              }
                                            } else {
                                              var2 = -110;
                                              break L1;
                                            }
                                          }
                                        } else {
                                          var2 = -114;
                                          break L1;
                                        }
                                      }
                                    } else {
                                      var2 = -117;
                                      break L1;
                                    }
                                  }
                                } else {
                                  var2 = -119;
                                  break L1;
                                }
                              }
                            } else {
                              var2 = -121;
                              break L1;
                            }
                          } else {
                            var2 = -122;
                            break L1;
                          }
                        } else {
                          var2 = -123;
                          break L1;
                        }
                      }
                    } else {
                      var2 = -125;
                      break L1;
                    }
                  } else {
                    var2 = -126;
                    break L1;
                  }
                }
                if (param0 == -8250) {
                  return (byte) var2;
                } else {
                  return (byte) 9;
                }
              }
            }
          } else {
            var2 = (byte)param1;
            if (param0 == -8250) {
              return (byte) var2;
            } else {
              return (byte) 9;
            }
          }
        } else {
          if (param1 >= 160) {
            L2: {
              if (param1 <= 255) {
                var2 = (byte)param1;
                break L2;
              } else {
                if (param1 == 8364) {
                  var2 = -128;
                  if (param0 == -8250) {
                    return (byte) var2;
                  } else {
                    return (byte) 9;
                  }
                } else {
                  if (8218 != param1) {
                    if (param1 != 402) {
                      if (param1 == 8222) {
                        var2 = -124;
                        if (param0 == -8250) {
                          return (byte) var2;
                        } else {
                          return (byte) 9;
                        }
                      } else {
                        if (param1 != 8230) {
                          if (8224 != param1) {
                            if (8225 != param1) {
                              if (param1 == 710) {
                                var2 = -120;
                                if (param0 == -8250) {
                                  return (byte) var2;
                                } else {
                                  return (byte) 9;
                                }
                              } else {
                                if (param1 != 8240) {
                                  if (param1 == 352) {
                                    var2 = -118;
                                    if (param0 == -8250) {
                                      return (byte) var2;
                                    } else {
                                      return (byte) 9;
                                    }
                                  } else {
                                    if (param1 != 8249) {
                                      if (param1 == 338) {
                                        var2 = -116;
                                        if (param0 == -8250) {
                                          return (byte) var2;
                                        } else {
                                          return (byte) 9;
                                        }
                                      } else {
                                        if (381 != param1) {
                                          if (param1 == 8216) {
                                            var2 = -111;
                                            if (param0 == -8250) {
                                              return (byte) var2;
                                            } else {
                                              return (byte) 9;
                                            }
                                          } else {
                                            if (param1 != 8217) {
                                              if (param1 != 8220) {
                                                if (param1 != 8221) {
                                                  if (8226 != param1) {
                                                    if (8211 != param1) {
                                                      if (param1 != 8212) {
                                                        if (param1 != 732) {
                                                          if (param1 == 8482) {
                                                            var2 = -103;
                                                            break L2;
                                                          } else {
                                                            if (param1 == 353) {
                                                              var2 = -102;
                                                              break L2;
                                                            } else {
                                                              if (param1 == 8250) {
                                                                var2 = -101;
                                                                break L2;
                                                              } else {
                                                                if (param1 == 339) {
                                                                  var2 = -100;
                                                                  break L2;
                                                                } else {
                                                                  if (param1 != 382) {
                                                                    if (param1 == 376) {
                                                                      var2 = -97;
                                                                      break L2;
                                                                    } else {
                                                                      var2 = 63;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    var2 = -98;
                                                                    break L2;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -104;
                                                          break L2;
                                                        }
                                                      } else {
                                                        var2 = -105;
                                                        break L2;
                                                      }
                                                    } else {
                                                      var2 = -106;
                                                      break L2;
                                                    }
                                                  } else {
                                                    var2 = -107;
                                                    break L2;
                                                  }
                                                } else {
                                                  var2 = -108;
                                                  break L2;
                                                }
                                              } else {
                                                var2 = -109;
                                                break L2;
                                              }
                                            } else {
                                              var2 = -110;
                                              break L2;
                                            }
                                          }
                                        } else {
                                          var2 = -114;
                                          break L2;
                                        }
                                      }
                                    } else {
                                      var2 = -117;
                                      break L2;
                                    }
                                  }
                                } else {
                                  var2 = -119;
                                  break L2;
                                }
                              }
                            } else {
                              var2 = -121;
                              break L2;
                            }
                          } else {
                            var2 = -122;
                            break L2;
                          }
                        } else {
                          var2 = -123;
                          break L2;
                        }
                      }
                    } else {
                      var2 = -125;
                      break L2;
                    }
                  } else {
                    var2 = -126;
                    break L2;
                  }
                }
              }
            }
            if (param0 == -8250) {
              return (byte) var2;
            } else {
              return (byte) 9;
            }
          } else {
            if (param1 == 8364) {
              var2 = -128;
              if (param0 != -8250) {
                return (byte) 9;
              } else {
                return (byte) var2;
              }
            } else {
              L3: {
                if (8218 != param1) {
                  if (param1 != 402) {
                    if (param1 == 8222) {
                      var2 = -124;
                      if (param0 != -8250) {
                        return (byte) 9;
                      } else {
                        return (byte) var2;
                      }
                    } else {
                      if (param1 != 8230) {
                        if (8224 != param1) {
                          if (8225 != param1) {
                            if (param1 == 710) {
                              var2 = -120;
                              if (param0 != -8250) {
                                return (byte) 9;
                              } else {
                                return (byte) var2;
                              }
                            } else {
                              if (param1 != 8240) {
                                if (param1 == 352) {
                                  var2 = -118;
                                  if (param0 != -8250) {
                                    return (byte) 9;
                                  } else {
                                    return (byte) var2;
                                  }
                                } else {
                                  if (param1 != 8249) {
                                    if (param1 == 338) {
                                      var2 = -116;
                                      if (param0 != -8250) {
                                        return (byte) 9;
                                      } else {
                                        return (byte) var2;
                                      }
                                    } else {
                                      if (381 != param1) {
                                        if (param1 == 8216) {
                                          var2 = -111;
                                          if (param0 != -8250) {
                                            return (byte) 9;
                                          } else {
                                            return (byte) var2;
                                          }
                                        } else {
                                          if (param1 != 8217) {
                                            if (param1 != 8220) {
                                              if (param1 != 8221) {
                                                if (8226 != param1) {
                                                  if (8211 != param1) {
                                                    if (param1 != 8212) {
                                                      if (param1 != 732) {
                                                        if (param1 == 8482) {
                                                          var2 = -103;
                                                          break L3;
                                                        } else {
                                                          if (param1 == 353) {
                                                            var2 = -102;
                                                            break L3;
                                                          } else {
                                                            if (param1 == 8250) {
                                                              var2 = -101;
                                                              break L3;
                                                            } else {
                                                              if (param1 == 339) {
                                                                var2 = -100;
                                                                break L3;
                                                              } else {
                                                                if (param1 != 382) {
                                                                  if (param1 == 376) {
                                                                    var2 = -97;
                                                                    break L3;
                                                                  } else {
                                                                    var2 = 63;
                                                                    break L3;
                                                                  }
                                                                } else {
                                                                  var2 = -98;
                                                                  break L3;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        var2 = -104;
                                                        break L3;
                                                      }
                                                    } else {
                                                      var2 = -105;
                                                      break L3;
                                                    }
                                                  } else {
                                                    var2 = -106;
                                                    break L3;
                                                  }
                                                } else {
                                                  var2 = -107;
                                                  break L3;
                                                }
                                              } else {
                                                var2 = -108;
                                                break L3;
                                              }
                                            } else {
                                              var2 = -109;
                                              break L3;
                                            }
                                          } else {
                                            var2 = -110;
                                            break L3;
                                          }
                                        }
                                      } else {
                                        var2 = -114;
                                        break L3;
                                      }
                                    }
                                  } else {
                                    var2 = -117;
                                    break L3;
                                  }
                                }
                              } else {
                                var2 = -119;
                                break L3;
                              }
                            }
                          } else {
                            var2 = -121;
                            break L3;
                          }
                        } else {
                          var2 = -122;
                          break L3;
                        }
                      } else {
                        var2 = -123;
                        break L3;
                      }
                    }
                  } else {
                    var2 = -125;
                    break L3;
                  }
                } else {
                  var2 = -126;
                  break L3;
                }
              }
              if (param0 != -8250) {
                return (byte) 9;
              } else {
                return (byte) var2;
              }
            }
          }
        }
    }

    public static void k(byte param0) {
        int var1 = 13 / ((-32 - param0) / 57);
        field_L = null;
        field_Q = null;
        field_N = null;
    }

    final int a(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 <= -79) {
            break L0;
          } else {
            this.field_P = true;
            break L0;
          }
        }
        try {
          L1: {
            stackIn_3_0 = Integer.parseInt(this.field_R.field_A);
            break L1;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_3_0;
    }

    final int i(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -117) {
                break L1;
              } else {
                field_N = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = Integer.parseInt(this.field_M.field_A) - 1;
            break L0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_3_0;
    }

    static {
        field_N = "Create a free account to start using this feature";
        field_Q = new vl();
    }
}
