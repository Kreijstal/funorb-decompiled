/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    private String field_m;
    gb field_h;
    private int[] field_j;
    static volatile int field_g;
    w field_l;
    private int field_a;
    String field_b;
    static String[] field_k;
    private long field_e;
    static String field_c;
    static int[] field_i;
    static byte[] field_d;
    int field_f;

    final void a(int param0) {
        String var2 = null;
        String var3 = null;
        L0: {
          if (((pf) this).field_b == null) {
            break L0;
          } else {
            if (((pf) this).field_e != uc.field_g) {
              var3 = this.d(-116);
              var2 = var3;
              ((pf) this).field_h.a(cm.a((byte) 104, li.field_f, new String[1]), 17, param0 ^ 89);
              break L0;
            } else {
              if (param0 == 17) {
                return;
              } else {
                field_k = null;
                return;
              }
            }
          }
        }
        if (param0 != 17) {
          field_k = null;
          return;
        } else {
          return;
        }
    }

    final boolean c(int param0) {
        Object var3 = null;
        if (param0 == -3) {
          if (null != ((pf) this).field_h) {
            if (!((pf) this).field_h.f(30)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          var3 = null;
          pf.a((java.applet.Applet) null, (String) null, 28L, (byte) 102, (String) null);
          if (null != ((pf) this).field_h) {
            if (!((pf) this).field_h.f(30)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        if (param0 != ~param1) {
          return false;
        } else {
          pd.field_f = new mg(((pf) this).field_l.field_E, ((pf) this).field_l.field_pb, ((pf) this).field_l.field_mb, ((pf) this).field_l.field_N, param2, ui.field_x, tg.field_h, ib.field_nb, ua.field_H, al.field_h, df.field_ab, ((pf) this).field_b, ((pf) this).field_e);
          return true;
        }
    }

    final void a(byte param0, boolean param1) {
        if (param0 < 25) {
          ((pf) this).a((byte) 114, true);
          ((pf) this).field_h.a(1141039778, param1);
          return;
        } else {
          ((pf) this).field_h.a(1141039778, param1);
          return;
        }
    }

    private final boolean a(int param0, boolean param1, int param2) {
        int var5 = client.field_A ? 1 : 0;
        if (0 == param2) {
            int discarded$1 = -84;
            bn.a(((pf) this).field_e, param0);
        } else {
            if (1 != param2) {
                if (param2 == 2) {
                    cg.a(((pf) this).field_f, (byte) -9, param0);
                    return true;
                }
                if (param2 == 3) {
                    md.a(9, param0, ((pf) this).field_f);
                    return true;
                }
                if (param2 != 10) {
                    if (param2 != 15) {
                        if (param2 == 16) {
                            vg.a(-20974, param0, 0);
                            return true;
                        }
                        return false;
                    }
                    vg.a(-20974, param0, ((pf) this).field_f);
                    return true;
                }
                ga.a(false, ((pf) this).field_f, param0);
                return true;
            }
            mn.a(true, ((pf) this).field_e, param0);
            return true;
        }
        return true;
    }

    final void a(boolean param0, int param1) {
        tj var4 = null;
        String var5 = null;
        int var6 = 0;
        tj var7 = null;
        var6 = client.field_A ? 1 : 0;
        if (param1 != 29072) {
          pf.a(false);
          if (null != ((pf) this).field_b) {
            L0: {
              if (((pf) this).field_e == uc.field_g) {
                break L0;
              } else {
                if (cd.field_m == null) {
                  break L0;
                } else {
                  int discarded$2 = 1;
                  if (!ig.b()) {
                    break L0;
                  } else {
                    var7 = ma.a(-105, ((pf) this).field_e);
                    var4 = bj.a(((pf) this).field_e, (byte) 58);
                    var5 = this.d(-124);
                    if (var4 != null) {
                      if (!cd.field_m.field_lc) {
                        ((pf) this).field_h.a(cm.a((byte) 106, un.field_c, new String[1]), 1, -20);
                        return;
                      } else {
                        if (0 > cd.field_m.field_Nb) {
                          break L0;
                        } else {
                          ((pf) this).field_h.a(cm.a((byte) 106, un.field_c, new String[1]), 1, -20);
                          return;
                        }
                      }
                    } else {
                      if (var7 == null) {
                        break L0;
                      } else {
                        if (!cd.field_m.field_wc) {
                          break L0;
                        } else {
                          if (cd.field_m.field_rc >= cd.field_m.field_mc) {
                            break L0;
                          } else {
                            if (!var7.field_bc) {
                              if (!param0) {
                                ((pf) this).field_h.a(cm.a((byte) 92, lj.field_b, new String[1]), 0, -30);
                                return;
                              } else {
                                if (var7.field_fc) {
                                  ((pf) this).field_h.a(cm.a((byte) 101, jh.field_g, new String[1]), 0, -124);
                                  ((pf) this).field_h.a(cm.a((byte) 108, df.field_T, new String[1]), 1, param1 ^ -29114);
                                  return;
                                } else {
                                  ((pf) this).field_h.a(cm.a((byte) 92, lj.field_b, new String[1]), 0, -30);
                                  return;
                                }
                              }
                            } else {
                              ((pf) this).field_h.a(cm.a((byte) 93, vm.field_p, new String[1]), 1, 64);
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            return;
          } else {
            return;
          }
        } else {
          if (null != ((pf) this).field_b) {
            if (((pf) this).field_e != uc.field_g) {
              if (cd.field_m != null) {
                int discarded$3 = 1;
                if (ig.b()) {
                  L1: {
                    var7 = ma.a(-105, ((pf) this).field_e);
                    var4 = bj.a(((pf) this).field_e, (byte) 58);
                    var5 = this.d(-124);
                    if (var4 != null) {
                      if (!cd.field_m.field_lc) {
                        ((pf) this).field_h.a(cm.a((byte) 106, un.field_c, new String[1]), 1, -20);
                        return;
                      } else {
                        if (0 > cd.field_m.field_Nb) {
                          break L1;
                        } else {
                          ((pf) this).field_h.a(cm.a((byte) 106, un.field_c, new String[1]), 1, -20);
                          return;
                        }
                      }
                    } else {
                      if (var7 != null) {
                        if (cd.field_m.field_wc) {
                          if (cd.field_m.field_rc >= cd.field_m.field_mc) {
                            break L1;
                          } else {
                            if (!var7.field_bc) {
                              if (!param0) {
                                ((pf) this).field_h.a(cm.a((byte) 92, lj.field_b, new String[1]), 0, -30);
                                return;
                              } else {
                                if (var7.field_fc) {
                                  ((pf) this).field_h.a(cm.a((byte) 101, jh.field_g, new String[1]), 0, -124);
                                  ((pf) this).field_h.a(cm.a((byte) 108, df.field_T, new String[1]), 1, param1 ^ -29114);
                                  return;
                                } else {
                                  ((pf) this).field_h.a(cm.a((byte) 92, lj.field_b, new String[1]), 0, -30);
                                  return;
                                }
                              }
                            } else {
                              ((pf) this).field_h.a(cm.a((byte) 93, vm.field_p, new String[1]), 1, 64);
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  return;
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
    }

    final void b(int param0) {
        String var3 = null;
        int var4 = 0;
        ve var5 = null;
        var4 = client.field_A ? 1 : 0;
        if (cd.field_m == null) {
          var5 = ob.a(((pf) this).field_f, 8);
          if (var5 != null) {
            var3 = var5.field_Vb;
            if (var5.field_Zb) {
              ((pf) this).field_h.a(cm.a((byte) 124, di.field_C, new String[1]), 2, 73);
              ((pf) this).field_h.a(cm.a((byte) 89, hl.field_b, new String[1]), 3, 126);
              if (param0 <= -71) {
                return;
              } else {
                ((pf) this).field_f = -11;
                return;
              }
            } else {
              if (!var5.field_gc) {
                if (!var5.field_Ob) {
                  if (var5.field_wc) {
                    if (!var5.field_lc) {
                      ((pf) this).field_h.a(cm.a((byte) 114, u.field_d, new String[1]), 2, -93);
                      if (var5.field_Ob) {
                        ((pf) this).field_h.a(cm.a((byte) 120, fj.field_j, new String[1]), 3, -110);
                        if (param0 <= -71) {
                          return;
                        } else {
                          ((pf) this).field_f = -11;
                          return;
                        }
                      } else {
                        if (param0 <= -71) {
                          return;
                        } else {
                          ((pf) this).field_f = -11;
                          return;
                        }
                      }
                    } else {
                      if (var5.field_gc) {
                        ((pf) this).field_h.a(cm.a((byte) 114, u.field_d, new String[1]), 2, -93);
                        if (var5.field_Ob) {
                          ((pf) this).field_h.a(cm.a((byte) 120, fj.field_j, new String[1]), 3, -110);
                          if (param0 <= -71) {
                            return;
                          } else {
                            ((pf) this).field_f = -11;
                            return;
                          }
                        } else {
                          if (param0 <= -71) {
                            return;
                          } else {
                            ((pf) this).field_f = -11;
                            return;
                          }
                        }
                      } else {
                        if (var5.field_Ob) {
                          ((pf) this).field_h.a(cm.a((byte) 120, fj.field_j, new String[1]), 3, -110);
                          if (param0 <= -71) {
                            return;
                          } else {
                            ((pf) this).field_f = -11;
                            return;
                          }
                        } else {
                          if (param0 <= -71) {
                            return;
                          } else {
                            ((pf) this).field_f = -11;
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    if (var5.field_Ob) {
                      ((pf) this).field_h.a(cm.a((byte) 120, fj.field_j, new String[1]), 3, -110);
                      if (param0 <= -71) {
                        return;
                      } else {
                        ((pf) this).field_f = -11;
                        return;
                      }
                    } else {
                      if (param0 > -71) {
                        ((pf) this).field_f = -11;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if (var5.field_Ob) {
                    ((pf) this).field_h.a(cm.a((byte) 120, fj.field_j, new String[1]), 3, -110);
                    if (param0 > -71) {
                      ((pf) this).field_f = -11;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (param0 > -71) {
                      ((pf) this).field_f = -11;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                ((pf) this).field_h.a(cm.a((byte) 119, fl.field_c, new String[1]), 2, -98);
                if (var5.field_Ob) {
                  ((pf) this).field_h.a(cm.a((byte) 120, fj.field_j, new String[1]), 3, -110);
                  if (param0 <= -71) {
                    return;
                  } else {
                    ((pf) this).field_f = -11;
                    return;
                  }
                } else {
                  if (param0 <= -71) {
                    return;
                  } else {
                    ((pf) this).field_f = -11;
                    return;
                  }
                }
              }
            }
          } else {
            if (param0 <= -71) {
              return;
            } else {
              ((pf) this).field_f = -11;
              return;
            }
          }
        } else {
          if (param0 > -71) {
            ((pf) this).field_f = -11;
            return;
          } else {
            return;
          }
        }
    }

    private final boolean a(int param0, int param1) {
        int var5 = 0;
        var5 = client.field_A ? 1 : 0;
        if (param0 != 8) {
          if (param0 != 18) {
            if (param0 != 11) {
              if (param0 != 12) {
                if (param0 != 13) {
                  if (14 != param0) {
                    if (param0 != -21) {
                      if (-20 == param0) {
                        boolean discarded$3 = vm.a(((pf) this).field_j, ((pf) this).field_e, ((pf) this).field_b, -120, ((pf) this).field_a);
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      int discarded$4 = -1045;
                      aj.a();
                      return true;
                    }
                  } else {
                    int discarded$5 = 0;
                    ke.o();
                    return true;
                  }
                } else {
                  eg.a(((pf) this).field_a, param1, 2, (byte) 91);
                  return true;
                }
              } else {
                eg.a(((pf) this).field_a, param1, 1, (byte) 91);
                return true;
              }
            } else {
              eg.a(((pf) this).field_a, param1, 0, (byte) 73);
              return true;
            }
          } else {
            pn.a(38, ((pf) this).field_e, ((pf) this).field_b);
            return true;
          }
        } else {
          u.a((byte) 115, ((pf) this).field_b, ((pf) this).field_e);
          return true;
        }
    }

    final static void a(java.applet.Applet param0, String param1, long param2, byte param3, String param4) {
        try {
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            try {
              try {
                var8 = param0.getParameter("cookiehost");
                var7 = var8;
                var7 = var8;
                var9 = param1 + "=" + param4 + "; version=1; path=/; domain=" + var8;
                var7 = var9;
                var7 = var9;
                if (param3 > 87) {
                  L0: {
                    if (param2 >= 0L) {
                      var7 = var9 + "; Expires=" + uf.a((byte) 60, param2 * 1000L + ik.a(4)) + "; Max-Age=" + param2;
                      break L0;
                    } else {
                      var7 = var9 + "; Discard;";
                      break L0;
                    }
                  }
                  nc.a((byte) -51, param0, "document.cookie=\"" + var7 + "\"");
                  return;
                } else {
                  return;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = decompiledCaughtException;
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) var6_ref;
                stackOut_9_1 = new StringBuilder().append("pf.K(");
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param0 == null) {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L1;
                } else {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L1;
                }
              }
              L2: {
                stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param1 == null) {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L2;
                } else {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L2;
                }
              }
              L3: {
                stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param2).append(44).append(param3).append(44);
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param4 == null) {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L3;
                } else {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "{...}";
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L3;
                }
              }
              throw dh.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final String d(int param0) {
        String var2 = null;
        L0: {
          if (((pf) this).field_m == null) {
            var2 = ((pf) this).field_b;
            break L0;
          } else {
            var2 = ((pf) this).field_m;
            break L0;
          }
        }
        if (param0 > -65) {
          field_i = null;
          return var2;
        } else {
          return var2;
        }
    }

    final static String a(char param0) {
        return String.valueOf(param0);
    }

    public static void a() {
        field_k = null;
        field_d = null;
        field_c = null;
        int var1 = 3;
        field_i = null;
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = ((pf) this).field_h.b(-56, param0);
        if (!(var6 != -2)) {
            return false;
        }
        boolean discarded$0 = this.a(param1, true, var6);
        boolean discarded$1 = this.b(param4, var6, param3);
        int discarded$2 = -92;
        boolean discarded$3 = this.a(var6, param4);
        boolean discarded$4 = this.a(param3 ^ -18, var6, param2);
        return true;
    }

    final void a(byte param0, hl param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (!param1.field_j) {
              L1: {
                ((pf) this).field_a = param1.field_m;
                if (param1.field_m != 0) {
                  break L1;
                } else {
                  L2: {
                    if (qk.field_i != 0) {
                      break L2;
                    } else {
                      ((pf) this).field_h.a(vg.field_p, 12, 95);
                      break L2;
                    }
                  }
                  ((pf) this).field_h.a(gf.field_h, 13, -65);
                  break L1;
                }
              }
              L3: {
                if (1 == param1.field_m) {
                  L4: {
                    if (wh.field_d != 0) {
                      break L4;
                    } else {
                      ((pf) this).field_h.a(ai.field_L, 12, param0 + 126);
                      break L4;
                    }
                  }
                  ((pf) this).field_h.a(dk.field_d, 13, param0 + 153);
                  break L3;
                } else {
                  break L3;
                }
              }
              L5: {
                if (2 != param1.field_m) {
                  break L5;
                } else {
                  L6: {
                    if (wl.field_o == 0) {
                      ((pf) this).field_h.a(ec.field_j, 12, param0 ^ -10);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  ((pf) this).field_h.a(ci.field_g, 13, -77);
                  break L5;
                }
              }
              if (param0 == -51) {
                break L0;
              } else {
                field_c = null;
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
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("pf.N(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    final void a(int param0, byte param1, int[] param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        wb var5 = null;
        int var6 = 0;
        Object var7 = null;
        String var8 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -43) {
                break L1;
              } else {
                var7 = null;
                ((pf) this).a(85, (byte) 40, (int[]) null);
                break L1;
              }
            }
            L2: {
              if (((pf) this).field_b == null) {
                break L2;
              } else {
                L3: {
                  if (uc.field_g != ((pf) this).field_e) {
                    break L3;
                  } else {
                    if (param0 != 2) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (jj.field_b == 2) {
                  L4: {
                    var8 = this.d(-66);
                    var4_ref = var8;
                    var5 = ed.a(((pf) this).field_b, (byte) -125);
                    int discarded$1 = -118;
                    var6 = ik.a(((pf) this).field_b) ? 1 : 0;
                    if (var5 != null) {
                      break L4;
                    } else {
                      if (var6 == 0) {
                        ((pf) this).field_h.a(cm.a((byte) 93, pl.field_e, new String[1]), 4, param1 + -60);
                        ((pf) this).field_h.a(cm.a((byte) 122, pj.field_G, new String[1]), 6, param1 ^ 12);
                        if (param2 == null) {
                          break L4;
                        } else {
                          if (param0 == 2) {
                            break L4;
                          } else {
                            if (wc.field_n) {
                              break L4;
                            } else {
                              ((pf) this).field_j = param2;
                              ((pf) this).field_h.a(cm.a((byte) 94, ta.field_h, new String[1]), 19, param1 + -85);
                              break L4;
                            }
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (var5 != null) {
                      L6: {
                        if (wi.a(-119, ((pf) this).field_b)) {
                          break L6;
                        } else {
                          if (!wc.field_n) {
                            L7: {
                              if (wl.field_p) {
                                break L7;
                              } else {
                                ((pf) this).field_h.a(cm.a((byte) 125, ai.field_M, new String[1]), 8, 89);
                                break L7;
                              }
                            }
                            ((pf) this).field_h.a(cm.a((byte) 124, wa.field_e, new String[1]), 18, 80);
                            if (param2 == null) {
                              break L6;
                            } else {
                              ((pf) this).field_j = param2;
                              ((pf) this).field_h.a(cm.a((byte) 99, ta.field_h, new String[1]), 19, param1 + 140);
                              break L6;
                            }
                          } else {
                            break L6;
                          }
                        }
                      }
                      ((pf) this).field_h.a(cm.a((byte) 118, cn.field_ab, new String[1]), 5, param1 ^ 102);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (var6 == 0) {
                    break L2;
                  } else {
                    ((pf) this).field_h.a(cm.a((byte) 116, oj.field_a, new String[1]), 7, -12);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var4;
            stackOut_28_1 = new StringBuilder().append("pf.P(").append(param0).append(44).append(param1).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 41);
        }
    }

    final static void a(boolean param0) {
        jh.field_h = false;
        if (null != mg.field_bc) {
          L0: {
            mg.field_bc.e(0);
            if (pk.field_r != 0) {
              int discarded$4 = 94;
              qk.a();
              break L0;
            } else {
              break L0;
            }
          }
          l.field_f = 0;
          return;
        } else {
          L1: {
            if (pk.field_r != 0) {
              int discarded$5 = 94;
              qk.a();
              break L1;
            } else {
              break L1;
            }
          }
          l.field_f = 0;
          return;
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        Object var4 = null;
        String var4_ref = null;
        if (param2 == 0) {
          var4 = null;
          if (4 != param1) {
            if (param1 == 5) {
              int discarded$9 = 0;
              var4_ref = md.a(param0, ((pf) this).field_b);
              if (var4_ref != null) {
                int discarded$10 = 0;
                int discarded$11 = 2;
                ca.a(((pf) this).field_b, (String) null, var4_ref, (byte) -79);
                return true;
              } else {
                return true;
              }
            } else {
              if (param1 != 6) {
                if (7 == param1) {
                  var4_ref = sg.a(((pf) this).field_b, ((pf) this).field_m, param0, (byte) 126);
                  if (var4_ref != null) {
                    int discarded$12 = 0;
                    int discarded$13 = 2;
                    ca.a(((pf) this).field_b, (String) null, var4_ref, (byte) -79);
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                var4_ref = dd.b(((pf) this).field_b, 127, param0);
                if (var4_ref == null) {
                  return true;
                } else {
                  int discarded$14 = 0;
                  int discarded$15 = 2;
                  ca.a(((pf) this).field_b, (String) null, var4_ref, (byte) -79);
                  return true;
                }
              }
            }
          } else {
            var4_ref = rb.a(param0, 0, ((pf) this).field_b);
            if (var4_ref == null) {
              return true;
            } else {
              int discarded$16 = 0;
              int discarded$17 = 2;
              ca.a(((pf) this).field_b, (String) null, var4_ref, (byte) -79);
              return true;
            }
          }
        } else {
          return false;
        }
    }

    pf(w param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
            ((pf) this).field_h = new gb(ik.field_e);
            ((pf) this).field_f = param4;
            ((pf) this).field_l = param0;
            ((pf) this).field_m = param3;
            ((pf) this).field_a = param5;
            param0.field_ab = true;
            ((pf) this).field_b = param2;
            ((pf) this).field_j = param6;
            ((pf) this).field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "pf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_i = new int[128];
        field_c = "Year";
        field_d = new byte[]{(byte) 0, (byte) 0, (byte) 2, (byte) 1, (byte) 1};
    }
}
