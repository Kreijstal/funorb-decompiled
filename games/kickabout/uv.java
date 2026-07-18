/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uv {
    int field_c;
    gu field_j;
    private int[] field_h;
    static int field_e;
    static String[] field_d;
    static qb field_i;
    private long field_b;
    hd field_g;
    static boolean field_f;
    String field_k;
    private int field_l;
    private String field_a;
    static ut field_m;

    private final boolean c(int param0, int param1, int param2) {
        if (param2 != 17) {
          if (param0 != -8985) {
            field_f = false;
            return false;
          } else {
            return false;
          }
        } else {
          ck.field_b = new rb(((uv) this).field_g.field_F, ((uv) this).field_g.field_T, ((uv) this).field_g.field_q, ((uv) this).field_g.field_mb, param1, tv.field_e, ai.field_H, hl.field_f, dw.field_e, hs.field_d, ul.field_c, ((uv) this).field_k, ((uv) this).field_b);
          return true;
        }
    }

    final static int b(int param0, int param1, byte param2) {
        if (param2 == 2) {
          if (0 != param1) {
            if (param1 >= 0) {
              if (0 != param0) {
                if (param0 >= 0) {
                  return vd.a(param0, 11277, param1);
                } else {
                  return -vd.a(-param0, 11277, param1);
                }
              } else {
                return 0;
              }
            } else {
              if (param0 == 0) {
                return 4096;
              } else {
                if (param0 < 0) {
                  return vd.a(-param0, param2 ^ 11279, -param1) + -4096;
                } else {
                  return -vd.a(param0, 11277, -param1) + 4096;
                }
              }
            }
          } else {
            if (param0 != 0) {
              if (param0 >= 0) {
                return 2048;
              } else {
                return -2048;
              }
            } else {
              return 0;
            }
          }
        } else {
          field_i = null;
          if (0 != param1) {
            if (param1 >= 0) {
              if (0 != param0) {
                if (param0 >= 0) {
                  return vd.a(param0, 11277, param1);
                } else {
                  return -vd.a(-param0, 11277, param1);
                }
              } else {
                return 0;
              }
            } else {
              if (param0 == 0) {
                return 4096;
              } else {
                if (param0 < 0) {
                  return vd.a(-param0, param2 ^ 11279, -param1) + -4096;
                } else {
                  return -vd.a(param0, 11277, -param1) + 4096;
                }
              }
            }
          } else {
            if (param0 != 0) {
              if (param0 >= 0) {
                return 2048;
              } else {
                return -2048;
              }
            } else {
              return 0;
            }
          }
        }
    }

    final static int a(boolean param0, int param1, int param2) {
        if (!param0) {
          field_e = -64;
          return en.b(uv.b(param1, param2, (byte) 2), -25147);
        } else {
          return en.b(uv.b(param1, param2, (byte) 2), -25147);
        }
    }

    private final String a(int param0) {
        String var2 = null;
        if (param0 != -26719) {
            return null;
        }
        if (((uv) this).field_a != null) {
            var2 = ((uv) this).field_a;
        } else {
            var2 = ((uv) this).field_k;
        }
        return var2;
    }

    final void a(boolean param0, boolean param1) {
        ((uv) this).field_j.a(47, param0);
        if (param1) {
            ((uv) this).b(97);
        }
    }

    final void a(boolean param0, int param1) {
        he var4 = null;
        String var5 = null;
        int var6 = 0;
        he var7 = null;
        var6 = Kickabout.field_G;
        if (null != ((uv) this).field_k) {
          if (((uv) this).field_b != dd.field_c) {
            if (field_i != null) {
              if (np.a(param1 + 123)) {
                int discarded$1 = 0;
                var7 = lo.a(((uv) this).field_b);
                var4 = nk.a(param1 ^ 31253, ((uv) this).field_b);
                var5 = this.a(-26719);
                if (var4 == null) {
                  if (var7 != null) {
                    if (!field_i.field_ic) {
                      if (param1 == 0) {
                        return;
                      } else {
                        field_m = null;
                        return;
                      }
                    } else {
                      if (field_i.field_gc < field_i.field_bc) {
                        if (!var7.field_Gb) {
                          if (!param0) {
                            ((uv) this).field_j.a(0, 0, vo.a((byte) -18, va.field_F, new String[1]));
                            if (param1 == 0) {
                              return;
                            } else {
                              field_m = null;
                              return;
                            }
                          } else {
                            if (var7.field_Fb) {
                              ((uv) this).field_j.a(0, 0, vo.a((byte) -18, om.field_Ab, new String[1]));
                              ((uv) this).field_j.a(0, 1, vo.a((byte) -18, ji.field_Eb, new String[1]));
                              if (param1 == 0) {
                                return;
                              } else {
                                field_m = null;
                                return;
                              }
                            } else {
                              ((uv) this).field_j.a(0, 0, vo.a((byte) -18, va.field_F, new String[1]));
                              if (param1 == 0) {
                                return;
                              } else {
                                field_m = null;
                                return;
                              }
                            }
                          }
                        } else {
                          ((uv) this).field_j.a(0, 1, vo.a((byte) -18, vq.field_f, new String[1]));
                          if (param1 == 0) {
                            return;
                          } else {
                            field_m = null;
                            return;
                          }
                        }
                      } else {
                        if (param1 == 0) {
                          return;
                        } else {
                          field_m = null;
                          return;
                        }
                      }
                    }
                  } else {
                    if (param1 != 0) {
                      field_m = null;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (!field_i.field_Cb) {
                    ((uv) this).field_j.a(0, 1, vo.a((byte) -18, rn.field_e, new String[1]));
                    if (param1 != 0) {
                      field_m = null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (field_i.field_ac >= 0) {
                      ((uv) this).field_j.a(0, 1, vo.a((byte) -18, rn.field_e, new String[1]));
                      if (param1 != 0) {
                        field_m = null;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (param1 != 0) {
                        field_m = null;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              } else {
                if (param1 != 0) {
                  field_m = null;
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param1 != 0) {
                field_m = null;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param1 != 0) {
              field_m = null;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param1 != 0) {
            field_m = null;
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, byte param1, int param2) {
        int var3 = -112 % ((param1 - 14) / 60);
        c.a(31, param0, param2, 0);
    }

    final void b(int param0) {
        String var2 = null;
        String var3 = null;
        L0: {
          if (null == ((uv) this).field_k) {
            break L0;
          } else {
            if (~dd.field_c != ~((uv) this).field_b) {
              var3 = this.a(-26719);
              var2 = var3;
              ((uv) this).field_j.a(0, 17, vo.a((byte) -18, vp.field_m, new String[1]));
              break L0;
            } else {
              if (param0 <= -11) {
                return;
              } else {
                ((uv) this).field_l = -59;
                return;
              }
            }
          }
        }
        if (param0 > -11) {
          ((uv) this).field_l = -59;
          return;
        } else {
          return;
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        int var5 = Kickabout.field_G;
        int var4 = -30 % ((param1 - 2) / 48);
        if (param0 != 8) {
            if (param0 == 18) {
                rr.a(((uv) this).field_k, (byte) -70, ((uv) this).field_b);
                return true;
            }
            if (param0 == 11) {
                gd.a(-100, 0, ((uv) this).field_l, param2);
                return true;
            }
            if (param0 != 12) {
                if (param0 == 13) {
                    gd.a(63, 2, ((uv) this).field_l, param2);
                    return true;
                }
                if (param0 == 14) {
                    int discarded$0 = -122;
                    uq.a();
                    return true;
                }
                if (20 == param0) {
                    int discarded$1 = 0;
                    hp.b();
                    return true;
                }
                if (param0 != 19) {
                    return false;
                }
                boolean discarded$2 = mi.a(((uv) this).field_b, ((uv) this).field_k, (byte) 127, ((uv) this).field_l, ((uv) this).field_h);
                return true;
            }
            gd.a(11, 1, ((uv) this).field_l, param2);
            return true;
        }
        ig.a(((uv) this).field_b, ((uv) this).field_k, (byte) 88);
        return true;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, boolean param5, int param6, int param7, bu param8, int param9, long param10, int param11, int param12, String param13) {
        try {
            IOException var15 = null;
            RuntimeException var15_ref = null;
            Object var16 = null;
            int stackIn_3_0 = 0;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            try {
              L0: {
                un.field_e = new ml(param7);
                or.field_d = new ml(param12);
                fp.field_g = param9;
                if (!param2) {
                  stackOut_2_0 = 0;
                  stackIn_3_0 = stackOut_2_0;
                  break L0;
                } else {
                  stackOut_1_0 = 1;
                  stackIn_3_0 = stackOut_1_0;
                  break L0;
                }
              }
              L1: {
                fu.field_c = stackIn_3_0 != 0;
                s.field_E = param1;
                cm.field_J = param4;
                if (param0 > 119) {
                  break L1;
                } else {
                  var16 = null;
                  uv.a(39, 24, true, 46, 63, true, -76, 49, (bu) null, 107, -22L, -59, -43, (String) null);
                  break L1;
                }
              }
              it.field_n = param5;
              il.field_g = param6;
              rl.field_o = param3;
              il.field_f = param10;
              pn.field_y = param11;
              vl.field_c = param8;
              uc.field_E = param13;
              if (vl.field_c.field_q != null) {
                {
                  L2: {
                    pd.field_G = new ew(vl.field_c.field_q, 64, 0);
                    break L2;
                  }
                }
                return;
              } else {
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) var15_ref;
                stackOut_11_1 = new StringBuilder().append("uv.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param8 == null) {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L3;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L3;
                }
              }
              L4: {
                stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param13 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L4;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L4;
                }
              }
              throw nb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte param0) {
        if (param0 == -52) {
          if (null != ((uv) this).field_j) {
            if (!((uv) this).field_j.a(-2)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final boolean a(int param0, int param1) {
        String var5 = null;
        String var6 = null;
        String var7 = null;
        Object var4 = null;
        if (param0 != 4) {
            if (param0 == 5) {
                var5 = of.a(param1, (byte) 87, ((uv) this).field_k);
                if (var5 == null) {
                    return true;
                }
                wi.a((String) null, ((uv) this).field_k, 0, 2, var5, -128);
                return true;
            }
            if (param0 == 6) {
                int discarded$0 = 126;
                var6 = il.a(((uv) this).field_k, param1);
                if (!(var6 == null)) {
                    wi.a((String) null, ((uv) this).field_k, 0, 2, var6, -128);
                }
                return true;
            }
            if (7 != param0) {
                return false;
            }
            var7 = rn.a(((uv) this).field_a, 2, param1, ((uv) this).field_k);
            if (!(var7 == null)) {
                wi.a((String) null, ((uv) this).field_k, 0, 2, var7, -128);
            }
            return true;
        }
        String var8 = lh.a(param1, 100, ((uv) this).field_k);
        if (!(var8 == null)) {
            wi.a((String) null, ((uv) this).field_k, 0, 2, var8, -128);
        }
        return true;
    }

    public static void c() {
        field_d = null;
        field_m = null;
        field_i = null;
    }

    private final boolean b(int param0, int param1) {
        int var5 = Kickabout.field_G;
        if (0 == param0) {
            int discarded$0 = 122;
            uc.a(((uv) this).field_b, param1);
            return true;
        }
        if (1 == param0) {
            ko.a(80, param1, ((uv) this).field_b);
            return true;
        }
        if (param0 == 2) {
            wf.b(((uv) this).field_c, param1, (byte) -83);
            return true;
        }
        if (param0 == 3) {
            gu.a(((uv) this).field_c, (byte) -90, param1);
            return true;
        }
        if (10 != param0) {
            if (15 == param0) {
                ue.a(((uv) this).field_c, 83, param1);
                return true;
            }
            if (param0 == 16) {
                ue.a(0, -58, param1);
                return true;
            }
            return false;
        }
        tu.b(15848, param1, ((uv) this).field_c);
        return true;
    }

    final void d(int param0) {
        String var3 = null;
        int var4 = 0;
        qb var5 = null;
        var4 = Kickabout.field_G;
        if (field_i == null) {
          var5 = rm.b(((uv) this).field_c, (byte) -52);
          if (var5 != null) {
            var3 = var5.field_ec;
            if (var5.field_hc) {
              ((uv) this).field_j.a(0, 2, vo.a((byte) -18, tb.field_u, new String[1]));
              ((uv) this).field_j.a(param0 ^ 1, 3, vo.a((byte) -18, vc.field_z, new String[1]));
              if (param0 == 1) {
                return;
              } else {
                String discarded$15 = this.a(126);
                return;
              }
            } else {
              if (!var5.field_Xb) {
                if (!var5.field_Tb) {
                  if (var5.field_ic) {
                    if (!var5.field_Cb) {
                      ((uv) this).field_j.a(0, 2, vo.a((byte) -18, ne.field_H, new String[1]));
                      if (!var5.field_Tb) {
                        if (param0 == 1) {
                          return;
                        } else {
                          String discarded$16 = this.a(126);
                          return;
                        }
                      } else {
                        ((uv) this).field_j.a(param0 ^ 1, 3, vo.a((byte) -18, ff.field_c, new String[1]));
                        if (param0 == 1) {
                          return;
                        } else {
                          String discarded$17 = this.a(126);
                          return;
                        }
                      }
                    } else {
                      if (var5.field_Xb) {
                        ((uv) this).field_j.a(0, 2, vo.a((byte) -18, ne.field_H, new String[1]));
                        if (!var5.field_Tb) {
                          if (param0 == 1) {
                            return;
                          } else {
                            String discarded$18 = this.a(126);
                            return;
                          }
                        } else {
                          ((uv) this).field_j.a(param0 ^ 1, 3, vo.a((byte) -18, ff.field_c, new String[1]));
                          if (param0 == 1) {
                            return;
                          } else {
                            String discarded$19 = this.a(126);
                            return;
                          }
                        }
                      } else {
                        if (!var5.field_Tb) {
                          if (param0 != 1) {
                            String discarded$20 = this.a(126);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          ((uv) this).field_j.a(param0 ^ 1, 3, vo.a((byte) -18, ff.field_c, new String[1]));
                          if (param0 != 1) {
                            String discarded$21 = this.a(126);
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    if (!var5.field_Tb) {
                      if (param0 != 1) {
                        String discarded$22 = this.a(126);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((uv) this).field_j.a(param0 ^ 1, 3, vo.a((byte) -18, ff.field_c, new String[1]));
                      if (param0 != 1) {
                        String discarded$23 = this.a(126);
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if (!var5.field_Tb) {
                    if (param0 != 1) {
                      String discarded$24 = this.a(126);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((uv) this).field_j.a(param0 ^ 1, 3, vo.a((byte) -18, ff.field_c, new String[1]));
                    if (param0 != 1) {
                      String discarded$25 = this.a(126);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                ((uv) this).field_j.a(param0 ^ 1, 2, vo.a((byte) -18, gs.field_f, new String[1]));
                if (!var5.field_Tb) {
                  if (param0 == 1) {
                    return;
                  } else {
                    String discarded$26 = this.a(126);
                    return;
                  }
                } else {
                  ((uv) this).field_j.a(param0 ^ 1, 3, vo.a((byte) -18, ff.field_c, new String[1]));
                  if (param0 == 1) {
                    return;
                  } else {
                    String discarded$27 = this.a(126);
                    return;
                  }
                }
              }
            }
          } else {
            if (param0 != 1) {
              String discarded$28 = this.a(126);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != 1) {
            String discarded$29 = this.a(126);
            return;
          } else {
            return;
          }
        }
    }

    final static void a() {
        qd.b(38, 17);
    }

    final void a(int param0, int param1, int[] param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        gg var6 = null;
        int var7 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            L1: {
              var4_int = -124 % ((param1 - -43) / 36);
              if (null == ((uv) this).field_k) {
                break L1;
              } else {
                L2: {
                  if (((uv) this).field_b != dd.field_c) {
                    break L2;
                  } else {
                    if (param0 != 2) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (ts.field_d != 2) {
                  break L1;
                } else {
                  L3: {
                    var5 = this.a(-26719);
                    int discarded$1 = 40;
                    var6 = tr.a(((uv) this).field_k);
                    var7 = hi.a(0, ((uv) this).field_k) ? 1 : 0;
                    if (var6 != null) {
                      break L3;
                    } else {
                      if (var7 == 0) {
                        ((uv) this).field_j.a(0, 4, vo.a((byte) -18, am.field_m, new String[1]));
                        ((uv) this).field_j.a(0, 6, vo.a((byte) -18, ij.field_r, new String[1]));
                        if (param2 == null) {
                          break L3;
                        } else {
                          if (param0 == 2) {
                            break L3;
                          } else {
                            if (!iw.field_l) {
                              ((uv) this).field_h = param2;
                              ((uv) this).field_j.a(0, 19, vo.a((byte) -18, nj.field_a, new String[1]));
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var6 == null) {
                      break L4;
                    } else {
                      L5: {
                        if (ew.a(121, ((uv) this).field_k)) {
                          break L5;
                        } else {
                          if (!iw.field_l) {
                            L6: {
                              if (!kb.field_C) {
                                ((uv) this).field_j.a(0, 8, vo.a((byte) -18, wp.field_a, new String[1]));
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            ((uv) this).field_j.a(0, 18, vo.a((byte) -18, ee.field_c, new String[1]));
                            if (param2 == null) {
                              break L5;
                            } else {
                              ((uv) this).field_h = param2;
                              ((uv) this).field_j.a(0, 19, vo.a((byte) -18, nj.field_a, new String[1]));
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                      ((uv) this).field_j.a(0, 5, vo.a((byte) -18, fn.field_i, new String[1]));
                      break L4;
                    }
                  }
                  if (var7 == 0) {
                    break L1;
                  } else {
                    ((uv) this).field_j.a(0, 7, vo.a((byte) -18, wp.field_i, new String[1]));
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var4;
            stackOut_26_1 = new StringBuilder().append("uv.J(").append(param0).append(',').append(param1).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L7;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
    }

    final void a(tv param0, byte param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (!param0.field_m) {
              L1: {
                ((uv) this).field_l = param0.field_c;
                if (param0.field_c == 0) {
                  L2: {
                    if (ng.field_a == 0) {
                      ((uv) this).field_j.a(param1 + -11, 12, sd.field_c);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((uv) this).field_j.a(0, 13, fi.field_a);
                  break L1;
                } else {
                  break L1;
                }
              }
              L3: {
                if (param0.field_c != 1) {
                  break L3;
                } else {
                  L4: {
                    if (0 != q.field_b) {
                      break L4;
                    } else {
                      ((uv) this).field_j.a(param1 ^ 11, 12, mg.field_d);
                      break L4;
                    }
                  }
                  ((uv) this).field_j.a(param1 + -11, 13, rd.field_a);
                  break L3;
                }
              }
              L5: {
                if (param0.field_c == 2) {
                  L6: {
                    if (0 != fc.field_a) {
                      break L6;
                    } else {
                      ((uv) this).field_j.a(0, 12, lu.field_u);
                      break L6;
                    }
                  }
                  ((uv) this).field_j.a(0, 13, qv.field_g);
                  break L5;
                } else {
                  break L5;
                }
              }
              if (param1 == 11) {
                break L0;
              } else {
                var4 = null;
                uv.a(-113, 85, false, 126, -61, false, -59, 112, (bu) null, -96, 71L, 73, -56, (String) null);
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("uv.A(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ')');
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = ((uv) this).field_j.a((byte) -126, param0);
        if (!(param1 != var6)) {
            return false;
        }
        int discarded$0 = 2;
        boolean discarded$1 = this.b(var6, param3);
        int discarded$2 = -100;
        boolean discarded$3 = this.a(var6, param4);
        boolean discarded$4 = this.a(var6, param1 + 113, param4);
        boolean discarded$5 = this.c(param1 + -8983, param2, var6);
        return true;
    }

    uv(hd param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
            ((uv) this).field_j = new gu(su.field_b);
            ((uv) this).field_k = param2;
            ((uv) this).field_g = param0;
            ((uv) this).field_l = param5;
            ((uv) this).field_a = param3;
            ((uv) this).field_c = param4;
            param0.field_I = true;
            ((uv) this).field_b = param1;
            ((uv) this).field_h = param6;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "uv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"Exhibition Mode", "Facebook", "Tournament Mode", "Rewards"};
        field_f = false;
        field_e = 48;
    }
}
