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
        String var2;
        String var3;
        L0: {
          if (this.field_b == null) {
            break L0;
          } else {
            if (this.field_e != uc.field_g) {
              var3 = this.d(-116);
              var2 = var3;
              this.field_h.a(cm.a((byte) 104, li.field_f, new String[]{var3}), 17, param0 ^ 89);
              break L0;
            } else {
              if (param0 == 17) {
                return;
              } else {
                field_k = (String[]) null;
                return;
              }
            }
          }
        }
        if (param0 != 17) {
          field_k = (String[]) null;
          return;
        } else {
          return;
        }
    }

    final boolean c(int param0) {
        String var3;
        if (param0 == -3) {
          if (null != this.field_h) {
            if (!this.field_h.f(30)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          var3 = (String) null;
          pf.a((java.applet.Applet) null, (String) null, 28L, (byte) 102, (String) null);
          if (null != this.field_h) {
            if (!this.field_h.f(30)) {
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
        if (param0 != (param1 ^ -1)) {
          return false;
        } else {
          pd.field_f = new mg(this.field_l.field_E, this.field_l.field_pb, this.field_l.field_mb, this.field_l.field_N, param2, ui.field_x, tg.field_h, ib.field_nb, ua.field_H, al.field_h, df.field_ab, this.field_b, this.field_e);
          return true;
        }
    }

    final void a(byte param0, boolean param1) {
        if (param0 < 25) {
          this.a((byte) 114, true);
          this.field_h.a(1141039778, param1);
          return;
        } else {
          this.field_h.a(1141039778, param1);
          return;
        }
    }

    private final boolean a(int param0, boolean param1, int param2) {
        int var5 = client.field_A ? 1 : 0;
        if (!param1) {
            return true;
        }
        if (0 == param2) {
            bn.a(this.field_e, param0, (byte) -84);
        } else {
            if (1 == param2) {
                mn.a(param1, this.field_e, param0);
                return true;
            }
            if ((param2 ^ -1) == -3) {
                cg.a(this.field_f, (byte) -9, param0);
                return true;
            }
            if (-4 == (param2 ^ -1)) {
                md.a(9, param0, this.field_f);
                return true;
            }
            if (param2 == 10) {
                ga.a(false, this.field_f, param0);
                return true;
            }
            if (param2 == 15) {
                vg.a(-20974, param0, this.field_f);
                return true;
            }
            if (param2 != 16) {
                return false;
            }
            vg.a(-20974, param0, 0);
            return true;
        }
        return true;
    }

    final void a(boolean param0, int param1) {
        tj var4;
        String var5;
        int var6;
        tj var7;
        var6 = client.field_A ? 1 : 0;
        if (param1 != 29072) {
          pf.a(false);
          if (null != this.field_b) {
            L0: {
              if (this.field_e == uc.field_g) {
                break L0;
              } else {
                if (cd.field_m == null) {
                  break L0;
                } else {
                  if (!ig.b(true)) {
                    break L0;
                  } else {
                    var7 = ma.a(-105, this.field_e);
                    var4 = bj.a(this.field_e, (byte) 58);
                    var5 = this.d(-124);
                    if (var4 != null) {
                      if (!cd.field_m.field_lc) {
                        this.field_h.a(cm.a((byte) 106, un.field_c, new String[]{var5}), 1, -20);
                        return;
                      } else {
                        if (0 > cd.field_m.field_Nb) {
                          break L0;
                        } else {
                          this.field_h.a(cm.a((byte) 106, un.field_c, new String[]{var5}), 1, -20);
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
                                this.field_h.a(cm.a((byte) 92, lj.field_b, new String[]{var5}), 0, -30);
                                return;
                              } else {
                                if (var7.field_fc) {
                                  this.field_h.a(cm.a((byte) 101, jh.field_g, new String[]{var5}), 0, -124);
                                  this.field_h.a(cm.a((byte) 108, df.field_T, new String[]{var5}), 1, param1 ^ -29114);
                                  return;
                                } else {
                                  this.field_h.a(cm.a((byte) 92, lj.field_b, new String[]{var5}), 0, -30);
                                  return;
                                }
                              }
                            } else {
                              this.field_h.a(cm.a((byte) 93, vm.field_p, new String[]{var5}), 1, 64);
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
          if (null != this.field_b) {
            if (this.field_e != uc.field_g) {
              if (cd.field_m != null) {
                if (ig.b(true)) {
                  L1: {
                    var7 = ma.a(-105, this.field_e);
                    var4 = bj.a(this.field_e, (byte) 58);
                    var5 = this.d(-124);
                    if (var4 != null) {
                      if (!cd.field_m.field_lc) {
                        this.field_h.a(cm.a((byte) 106, un.field_c, new String[]{var5}), 1, -20);
                        return;
                      } else {
                        if (0 > cd.field_m.field_Nb) {
                          break L1;
                        } else {
                          this.field_h.a(cm.a((byte) 106, un.field_c, new String[]{var5}), 1, -20);
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
                                this.field_h.a(cm.a((byte) 92, lj.field_b, new String[]{var5}), 0, -30);
                                return;
                              } else {
                                if (var7.field_fc) {
                                  this.field_h.a(cm.a((byte) 101, jh.field_g, new String[]{var5}), 0, -124);
                                  this.field_h.a(cm.a((byte) 108, df.field_T, new String[]{var5}), 1, param1 ^ -29114);
                                  return;
                                } else {
                                  this.field_h.a(cm.a((byte) 92, lj.field_b, new String[]{var5}), 0, -30);
                                  return;
                                }
                              }
                            } else {
                              this.field_h.a(cm.a((byte) 93, vm.field_p, new String[]{var5}), 1, 64);
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
        String var3;
        int var4;
        ve var5;
        var4 = client.field_A ? 1 : 0;
        if (cd.field_m == null) {
          var5 = ob.a(this.field_f, 8);
          if (var5 != null) {
            var3 = var5.field_Vb;
            if (var5.field_Zb) {
              this.field_h.a(cm.a((byte) 124, di.field_C, new String[]{var3}), 2, 73);
              this.field_h.a(cm.a((byte) 89, hl.field_b, new String[]{var3}), 3, 126);
              if (param0 <= -71) {
                return;
              } else {
                this.field_f = -11;
                return;
              }
            } else {
              if (!var5.field_gc) {
                if (!var5.field_Ob) {
                  if (var5.field_wc) {
                    if (!var5.field_lc) {
                      this.field_h.a(cm.a((byte) 114, u.field_d, new String[]{var3}), 2, -93);
                      if (var5.field_Ob) {
                        this.field_h.a(cm.a((byte) 120, fj.field_j, new String[]{var3}), 3, -110);
                        if (param0 <= -71) {
                          return;
                        } else {
                          this.field_f = -11;
                          return;
                        }
                      } else {
                        if (param0 <= -71) {
                          return;
                        } else {
                          this.field_f = -11;
                          return;
                        }
                      }
                    } else {
                      if (var5.field_gc) {
                        this.field_h.a(cm.a((byte) 114, u.field_d, new String[]{var3}), 2, -93);
                        if (var5.field_Ob) {
                          this.field_h.a(cm.a((byte) 120, fj.field_j, new String[]{var3}), 3, -110);
                          if (param0 <= -71) {
                            return;
                          } else {
                            this.field_f = -11;
                            return;
                          }
                        } else {
                          if (param0 <= -71) {
                            return;
                          } else {
                            this.field_f = -11;
                            return;
                          }
                        }
                      } else {
                        if (var5.field_Ob) {
                          this.field_h.a(cm.a((byte) 120, fj.field_j, new String[]{var3}), 3, -110);
                          if (param0 <= -71) {
                            return;
                          } else {
                            this.field_f = -11;
                            return;
                          }
                        } else {
                          if (param0 <= -71) {
                            return;
                          } else {
                            this.field_f = -11;
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    if (var5.field_Ob) {
                      this.field_h.a(cm.a((byte) 120, fj.field_j, new String[]{var3}), 3, -110);
                      if (param0 <= -71) {
                        return;
                      } else {
                        this.field_f = -11;
                        return;
                      }
                    } else {
                      if (param0 > -71) {
                        this.field_f = -11;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if (var5.field_Ob) {
                    this.field_h.a(cm.a((byte) 120, fj.field_j, new String[]{var3}), 3, -110);
                    if (param0 > -71) {
                      this.field_f = -11;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (param0 > -71) {
                      this.field_f = -11;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                this.field_h.a(cm.a((byte) 119, fl.field_c, new String[]{var3}), 2, -98);
                if (var5.field_Ob) {
                  this.field_h.a(cm.a((byte) 120, fj.field_j, new String[]{var3}), 3, -110);
                  if (param0 <= -71) {
                    return;
                  } else {
                    this.field_f = -11;
                    return;
                  }
                } else {
                  if (param0 <= -71) {
                    return;
                  } else {
                    this.field_f = -11;
                    return;
                  }
                }
              }
            }
          } else {
            if (param0 <= -71) {
              return;
            } else {
              this.field_f = -11;
              return;
            }
          }
        } else {
          if (param0 > -71) {
            this.field_f = -11;
            return;
          } else {
            return;
          }
        }
    }

    private final boolean a(int param0, int param1, byte param2) {
        int var5;
        var5 = client.field_A ? 1 : 0;
        if (param2 != -92) {
          this.field_h = (gb) null;
          if (-9 != (param0 ^ -1)) {
            if (param0 != 18) {
              if (param0 != 11) {
                if (-13 != (param0 ^ -1)) {
                  if ((param0 ^ -1) != -14) {
                    if (14 != param0) {
                      if ((param0 ^ -1) != -21) {
                        if (-20 != (param0 ^ -1)) {
                          return false;
                        } else {
                          vm.a(this.field_j, this.field_e, this.field_b, param2 + -28, this.field_a);
                          return true;
                        }
                      } else {
                        aj.a(-1045);
                        return true;
                      }
                    } else {
                      ke.o(0);
                      return true;
                    }
                  } else {
                    eg.a(this.field_a, param1, 2, (byte) 91);
                    return true;
                  }
                } else {
                  eg.a(this.field_a, param1, 1, (byte) 91);
                  return true;
                }
              } else {
                eg.a(this.field_a, param1, 0, (byte) 73);
                return true;
              }
            } else {
              pn.a(38, this.field_e, this.field_b);
              return true;
            }
          } else {
            u.a((byte) 115, this.field_b, this.field_e);
            return true;
          }
        } else {
          if (-9 != (param0 ^ -1)) {
            if (param0 != 18) {
              if (param0 != 11) {
                if (-13 != (param0 ^ -1)) {
                  if ((param0 ^ -1) != -14) {
                    if (14 != param0) {
                      if ((param0 ^ -1) != -21) {
                        if (-20 == (param0 ^ -1)) {
                          vm.a(this.field_j, this.field_e, this.field_b, param2 + -28, this.field_a);
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        aj.a(-1045);
                        return true;
                      }
                    } else {
                      ke.o(0);
                      return true;
                    }
                  } else {
                    eg.a(this.field_a, param1, 2, (byte) 91);
                    return true;
                  }
                } else {
                  eg.a(this.field_a, param1, 1, (byte) 91);
                  return true;
                }
              } else {
                eg.a(this.field_a, param1, 0, (byte) 73);
                return true;
              }
            } else {
              pn.a(38, this.field_e, this.field_b);
              return true;
            }
          } else {
            u.a((byte) 115, this.field_b, this.field_e);
            return true;
          }
        }
    }

    final static void a(java.applet.Applet param0, String param1, long param2, byte param3, String param4) {
        try {
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            StringBuilder stackIn_17_1 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            try {
              L0: {
                try {
                  L1: {
                    var8 = param0.getParameter("cookiehost");
                    var7 = var8;
                    var7 = var8;
                    var9 = param1 + "=" + param4 + "; version=1; path=/; domain=" + var8;
                    var7 = var9;
                    var7 = var9;
                    if (param3 > 87) {
                      L2: {
                        if (-1L >= (param2 ^ -1L)) {
                          var7 = var9 + "; Expires=" + uf.a((byte) 60, param2 * 1000L + ik.a(4)) + "; Max-Age=" + param2;
                          break L2;
                        } else {
                          var7 = var9 + "; Discard;";
                          break L2;
                        }
                      }
                      nc.a((byte) -51, param0, "document.cookie=\"" + var7 + "\"");
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = decompiledCaughtException;
                  return;
                }
                if (decompiledRegionSelector0 == 0) {
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var6_ref);

                stackIn_11_1 = new StringBuilder().append("pf.K(");

                if (param0 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L3;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L3;
                }
              }
              L4: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

                if (param1 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L4;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L5;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L5;
                }
              }
              throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final String d(int param0) {
        String var2;
        L0: {
          if (this.field_m == null) {
            var2 = this.field_b;
            break L0;
          } else {
            var2 = this.field_m;
            break L0;
          }
        }
        if (param0 > -65) {
          field_i = (int[]) null;
          return var2;
        } else {
          return var2;
        }
    }

    final static String a(char param0, byte param1) {
        if (param1 != -9) {
            field_k = (String[]) null;
            return String.valueOf(param0);
        }
        return String.valueOf(param0);
    }

    public static void a(byte param0) {
        field_k = null;
        field_d = null;
        field_c = null;
        int var1 = 3 / ((-2 - param0) / 52);
        field_i = null;
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = this.field_h.b(-56, param0);
        if (!(var6 != -2)) {
            return false;
        }
        boolean discarded$0 = this.a(param1, true, var6);
        boolean discarded$1 = this.b(param4, var6, param3);
        boolean discarded$2 = this.a(var6, param4, (byte) -92);
        boolean discarded$3 = this.a(param3 ^ -18, var6, param2);
        return true;
    }

    final void a(byte param0, hl param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1.field_j) {
              L1: {
                this.field_a = param1.field_m;
                if (param1.field_m != 0) {
                  break L1;
                } else {
                  L2: {
                    if (qk.field_i != 0) {
                      break L2;
                    } else {
                      this.field_h.a(vg.field_p, 12, 95);
                      break L2;
                    }
                  }
                  this.field_h.a(gf.field_h, 13, -65);
                  break L1;
                }
              }
              L3: {
                if (1 == param1.field_m) {
                  L4: {
                    if (wh.field_d != 0) {
                      break L4;
                    } else {
                      this.field_h.a(ai.field_L, 12, param0 + 126);
                      break L4;
                    }
                  }
                  this.field_h.a(dk.field_d, 13, param0 + 153);
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
                    if (-1 == (wl.field_o ^ -1)) {
                      this.field_h.a(ec.field_j, 12, param0 ^ -10);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  this.field_h.a(ci.field_g, 13, -77);
                  break L5;
                }
              }
              if (param0 == -51) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                field_c = (String) null;
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("pf.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, byte param1, int[] param2) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        wb var5 = null;
        int var6 = 0;
        int[] var7 = null;
        String var8 = null;
        try {
          L0: {
            L1: {
              if (param1 == -43) {
                break L1;
              } else {
                var7 = (int[]) null;
                this.a(85, (byte) 40, (int[]) null);
                break L1;
              }
            }
            L2: {
              if (this.field_b == null) {
                break L2;
              } else {
                L3: {
                  if (uc.field_g != this.field_e) {
                    break L3;
                  } else {
                    if ((param0 ^ -1) != -3) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (jj.field_b == 2) {
                  L4: {
                    var8 = this.d(-66);
                    var4 = var8;
                    var5 = ed.a(this.field_b, (byte) -125);
                    var6 = ik.a(this.field_b, (byte) -118) ? 1 : 0;
                    if (var5 != null) {
                      break L4;
                    } else {
                      if (var6 == 0) {
                        this.field_h.a(cm.a((byte) 93, pl.field_e, new String[]{var8}), 4, param1 + -60);
                        this.field_h.a(cm.a((byte) 122, pj.field_G, new String[]{var8}), 6, param1 ^ 12);
                        if (param2 == null) {
                          break L4;
                        } else {
                          if ((param0 ^ -1) == -3) {
                            break L4;
                          } else {
                            if (wc.field_n) {
                              break L4;
                            } else {
                              this.field_j = param2;
                              this.field_h.a(cm.a((byte) 94, ta.field_h, new String[]{var8}), 19, param1 + -85);
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
                        if (wi.a(-119, this.field_b)) {
                          break L6;
                        } else {
                          if (!wc.field_n) {
                            L7: {
                              if (wl.field_p) {
                                break L7;
                              } else {
                                this.field_h.a(cm.a((byte) 125, ai.field_M, new String[]{var8}), 8, 89);
                                break L7;
                              }
                            }
                            this.field_h.a(cm.a((byte) 124, wa.field_e, new String[]{var8}), 18, 80);
                            if (param2 == null) {
                              break L6;
                            } else {
                              this.field_j = param2;
                              this.field_h.a(cm.a((byte) 99, ta.field_h, new String[]{var8}), 19, param1 + 140);
                              break L6;
                            }
                          } else {
                            break L6;
                          }
                        }
                      }
                      this.field_h.a(cm.a((byte) 118, cn.field_ab, new String[]{var8}), 5, param1 ^ 102);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (var6 == 0) {
                    break L2;
                  } else {
                    this.field_h.a(cm.a((byte) 116, oj.field_a, new String[]{var8}), 7, -12);
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
            var4_ref = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var4_ref);

            stackIn_30_1 = new StringBuilder().append("pf.P(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
    }

    final static void a(boolean param0) {
        int stackIn_3_0 = 0;
        L0: {
          if (!param0) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        jh.field_h = stackIn_3_0 != 0;
        if (null != mg.field_bc) {
          L1: {
            mg.field_bc.e(0);
            if (pk.field_r != 0) {
              qk.a((byte) 94);
              break L1;
            } else {
              break L1;
            }
          }
          l.field_f = 0;
          return;
        } else {
          L2: {
            if (pk.field_r != 0) {
              qk.a((byte) 94);
              break L2;
            } else {
              break L2;
            }
          }
          l.field_f = 0;
          return;
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        Object var4;
        String var4_ref;
        String var5;
        if (param2 == 0) {
          var4 = null;
          if (4 != param1) {
            if ((param1 ^ -1) == -6) {
              var4_ref = md.a(param0, this.field_b, false);
              if (var4_ref != null) {
                var5 = (String) null;
                ca.a(this.field_b, (String) null, var4_ref, (byte) -79, 2, 0);
                return true;
              } else {
                return true;
              }
            } else {
              if ((param1 ^ -1) != -7) {
                if (7 == param1) {
                  var4_ref = sg.a(this.field_b, this.field_m, param0, (byte) 126);
                  if (var4_ref != null) {
                    var5 = (String) null;
                    ca.a(this.field_b, (String) null, var4_ref, (byte) -79, 2, 0);
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                var4_ref = dd.b(this.field_b, 127, param0);
                if (var4_ref == null) {
                  return true;
                } else {
                  var5 = (String) null;
                  ca.a(this.field_b, (String) null, var4_ref, (byte) -79, 2, 0);
                  return true;
                }
              }
            }
          } else {
            var4_ref = rb.a(param0, 0, this.field_b);
            if (var4_ref == null) {
              return true;
            } else {
              var5 = (String) null;
              ca.a(this.field_b, (String) null, var4_ref, (byte) -79, 2, 0);
              return true;
            }
          }
        } else {
          return false;
        }
    }

    pf(w param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
            this.field_h = new gb(ik.field_e);
            this.field_f = param4;
            this.field_l = param0;
            this.field_m = param3;
            this.field_a = param5;
            param0.field_ab = true;
            this.field_b = param2;
            this.field_j = param6;
            this.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "pf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = 0;
        field_i = new int[128];
        field_c = "Year";
        field_d = new byte[]{(byte) 0, (byte) 0, (byte)2, (byte) 1, (byte) 1};
    }
}
