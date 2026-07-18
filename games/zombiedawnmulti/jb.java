/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb {
    sn field_j;
    String field_f;
    static String field_a;
    private long field_i;
    private int field_h;
    int field_b;
    private String field_d;
    static cj field_c;
    cj field_e;
    private int[] field_g;
    static String field_k;

    final void b(boolean param0, byte param1) {
        if (param1 < 38) {
          ((jb) this).field_f = null;
          ((jb) this).field_j.c(param0, -1);
          return;
        } else {
          ((jb) this).field_j.c(param0, -1);
          return;
        }
    }

    public static void a() {
        field_k = null;
        field_a = null;
        field_c = null;
    }

    private final boolean a(byte param0, int param1, int param2) {
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 != 8) {
            if (param1 != 18) {
                if (11 != param1) {
                    if (param1 == 12) {
                        kp.a(((jb) this).field_h, param2, 1, true);
                        return true;
                    }
                    if (param1 != 13) {
                        if (param1 != 14) {
                            if (param1 == 20) {
                                q.a(13151);
                                return true;
                            }
                            if (param1 == 19) {
                                boolean discarded$0 = na.a(((jb) this).field_g, (byte) -50, ((jb) this).field_f, ((jb) this).field_i, ((jb) this).field_h);
                                return true;
                            }
                            return false;
                        }
                        int discarded$1 = 0;
                        mg.b();
                        return true;
                    }
                    kp.a(((jb) this).field_h, param2, 2, true);
                    return true;
                }
                kp.a(((jb) this).field_h, param2, 0, true);
                return true;
            }
            fg.a(-16745, ((jb) this).field_i, ((jb) this).field_f);
            return true;
        }
        int discarded$2 = -1;
        gm.a(((jb) this).field_i, ((jb) this).field_f);
        return true;
    }

    final void a(boolean param0, byte param1) {
        dm var4 = null;
        String var5 = null;
        int var6 = 0;
        dm var7 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null != ((jb) this).field_f) {
          if (((jb) this).field_i != ie.field_sb) {
            if (mh.field_c != null) {
              if (hl.b(0)) {
                var7 = en.a((byte) 50, ((jb) this).field_i);
                var4 = vm.a(((jb) this).field_i, (byte) -104);
                var5 = this.b(-20516);
                if (var4 == null) {
                  if (var7 != null) {
                    if (mh.field_c.field_Wb) {
                      if (mh.field_c.field_cc >= mh.field_c.field_mc) {
                        if (param1 < -80) {
                          return;
                        } else {
                          ((jb) this).c(-88);
                          return;
                        }
                      } else {
                        if (var7.field_Pb) {
                          ((jb) this).field_j.a((byte) -118, vl.a(bl.field_f, new String[1], 2), 1);
                          if (param1 < -80) {
                            return;
                          } else {
                            ((jb) this).c(-88);
                            return;
                          }
                        } else {
                          if (!param0) {
                            ((jb) this).field_j.a((byte) -118, vl.a(ge.field_qb, new String[1], 2), 0);
                            if (param1 < -80) {
                              return;
                            } else {
                              ((jb) this).c(-88);
                              return;
                            }
                          } else {
                            if (var7.field_Ob) {
                              ((jb) this).field_j.a((byte) -118, vl.a(mq.field_p, new String[1], 2), 0);
                              ((jb) this).field_j.a((byte) -118, vl.a(r.field_g, new String[1], 2), 1);
                              if (param1 < -80) {
                                return;
                              } else {
                                ((jb) this).c(-88);
                                return;
                              }
                            } else {
                              ((jb) this).field_j.a((byte) -118, vl.a(ge.field_qb, new String[1], 2), 0);
                              if (param1 < -80) {
                                return;
                              } else {
                                ((jb) this).c(-88);
                                return;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (param1 < -80) {
                        return;
                      } else {
                        ((jb) this).c(-88);
                        return;
                      }
                    }
                  } else {
                    if (param1 >= -80) {
                      ((jb) this).c(-88);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (mh.field_c.field_Fb) {
                    if (mh.field_c.field_Sb >= 0) {
                      ((jb) this).field_j.a((byte) -118, vl.a(lk.field_I, new String[1], 2), 1);
                      if (param1 >= -80) {
                        ((jb) this).c(-88);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (param1 >= -80) {
                        ((jb) this).c(-88);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    ((jb) this).field_j.a((byte) -118, vl.a(lk.field_I, new String[1], 2), 1);
                    if (param1 >= -80) {
                      ((jb) this).c(-88);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                if (param1 >= -80) {
                  ((jb) this).c(-88);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param1 >= -80) {
                ((jb) this).c(-88);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param1 >= -80) {
              ((jb) this).c(-88);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param1 >= -80) {
            ((jb) this).c(-88);
            return;
          } else {
            return;
          }
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param2 != 0) {
          if (param2 != 1) {
            if (2 != param2) {
              if (param2 != 3) {
                if (10 != param2) {
                  if (param2 != 15) {
                    if (param2 == 16) {
                      jm.a(0, param0, -88);
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    jm.a(((jb) this).field_b, param0, -105);
                    return true;
                  }
                } else {
                  kk.a(13, ((jb) this).field_b, param0);
                  return true;
                }
              } else {
                ml.a(((jb) this).field_b, param0, -76);
                return true;
              }
            } else {
              pl.a(param0, (byte) 111, ((jb) this).field_b);
              return true;
            }
          } else {
            cg.a(param0, -27404, ((jb) this).field_i);
            return true;
          }
        } else {
          so.a(-21148, ((jb) this).field_i, param0);
          return true;
        }
    }

    final void a(byte param0) {
        String var3 = null;
        int var4 = 0;
        jh var5 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (mh.field_c == null) {
          var5 = on.c(false, ((jb) this).field_b);
          if (var5 != null) {
            var3 = var5.field_Nb;
            if (!var5.field_lc) {
              if (var5.field_Ob) {
                L0: {
                  ((jb) this).field_j.a((byte) -118, vl.a(jo.field_c, new String[1], 2), 2);
                  if (var5.field_rc) {
                    ((jb) this).field_j.a((byte) -118, vl.a(b.field_e, new String[1], 2), 3);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                if (param0 <= -8) {
                  return;
                } else {
                  ((jb) this).field_i = -51L;
                  return;
                }
              } else {
                if (!var5.field_rc) {
                  if (var5.field_Wb) {
                    if (var5.field_Fb) {
                      if (!var5.field_Ob) {
                        L1: {
                          if (var5.field_rc) {
                            ((jb) this).field_j.a((byte) -118, vl.a(b.field_e, new String[1], 2), 3);
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                        if (param0 <= -8) {
                          return;
                        } else {
                          ((jb) this).field_i = -51L;
                          return;
                        }
                      } else {
                        L2: {
                          ((jb) this).field_j.a((byte) -118, vl.a(hp.field_o, new String[1], 2), 2);
                          if (var5.field_rc) {
                            ((jb) this).field_j.a((byte) -118, vl.a(b.field_e, new String[1], 2), 3);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        if (param0 <= -8) {
                          return;
                        } else {
                          ((jb) this).field_i = -51L;
                          return;
                        }
                      }
                    } else {
                      L3: {
                        ((jb) this).field_j.a((byte) -118, vl.a(hp.field_o, new String[1], 2), 2);
                        if (var5.field_rc) {
                          ((jb) this).field_j.a((byte) -118, vl.a(b.field_e, new String[1], 2), 3);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      if (param0 > -8) {
                        ((jb) this).field_i = -51L;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (var5.field_rc) {
                      ((jb) this).field_j.a((byte) -118, vl.a(b.field_e, new String[1], 2), 3);
                      if (param0 > -8) {
                        ((jb) this).field_i = -51L;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (param0 > -8) {
                        ((jb) this).field_i = -51L;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if (var5.field_rc) {
                    ((jb) this).field_j.a((byte) -118, vl.a(b.field_e, new String[1], 2), 3);
                    if (param0 > -8) {
                      ((jb) this).field_i = -51L;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (param0 > -8) {
                      ((jb) this).field_i = -51L;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            } else {
              ((jb) this).field_j.a((byte) -118, vl.a(ke.field_d, new String[1], 2), 2);
              ((jb) this).field_j.a((byte) -118, vl.a(gg.field_e, new String[1], 2), 3);
              if (param0 > -8) {
                ((jb) this).field_i = -51L;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 > -8) {
              ((jb) this).field_i = -51L;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 > -8) {
            ((jb) this).field_i = -51L;
            return;
          } else {
            return;
          }
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
          if (((jb) this).field_j != null) {
            if (!((jb) this).field_j.d((byte) 90)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          String discarded$3 = this.b(95);
          if (((jb) this).field_j != null) {
            if (!((jb) this).field_j.d((byte) 90)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final boolean a(int param0, int param1, byte param2, boolean param3, int param4) {
        int var6 = 0;
        var6 = ((jb) this).field_j.e(param3, param2 ^ 1839469049);
        if (-2 != var6) {
          if (param2 != -8) {
            ((jb) this).field_b = -116;
            boolean discarded$10 = this.b(param0, 19, var6);
            int discarded$11 = 57;
            boolean discarded$12 = this.a(param4, var6);
            boolean discarded$13 = this.a((byte) 98, var6, param4);
            boolean discarded$14 = this.a(17, var6, param1);
            return true;
          } else {
            boolean discarded$15 = this.b(param0, 19, var6);
            int discarded$16 = 57;
            boolean discarded$17 = this.a(param4, var6);
            boolean discarded$18 = this.a((byte) 98, var6, param4);
            boolean discarded$19 = this.a(17, var6, param1);
            return true;
          }
        } else {
          return false;
        }
    }

    final void a(ka param0, int param1) {
        RuntimeException var3 = null;
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
            if (param0.field_k) {
              return;
            } else {
              L1: {
                if (param1 == 2) {
                  break L1;
                } else {
                  ((jb) this).field_g = null;
                  break L1;
                }
              }
              L2: {
                ((jb) this).field_h = param0.field_l;
                if (param0.field_l != 0) {
                  break L2;
                } else {
                  L3: {
                    if (0 != li.field_C) {
                      break L3;
                    } else {
                      ((jb) this).field_j.a((byte) -118, ha.field_k, 12);
                      break L3;
                    }
                  }
                  ((jb) this).field_j.a((byte) -118, rq.field_g, 13);
                  break L2;
                }
              }
              L4: {
                if (param0.field_l != 1) {
                  break L4;
                } else {
                  L5: {
                    if (0 != qe.field_g) {
                      break L5;
                    } else {
                      ((jb) this).field_j.a((byte) -118, bg.field_n, 12);
                      break L5;
                    }
                  }
                  ((jb) this).field_j.a((byte) -118, jk.field_c, 13);
                  break L4;
                }
              }
              if (param0.field_l == 2) {
                L6: {
                  if (0 == ba.field_q) {
                    ((jb) this).field_j.a((byte) -118, aj.field_i, 12);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                ((jb) this).field_j.a((byte) -118, gg.field_n, 13);
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("jb.H(");
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
          throw fa.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ')');
        }
    }

    private final boolean a(int param0, int param1) {
        Object var4 = null;
        int var5 = 0;
        Object var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        var4 = null;
        if (param1 != 4) {
          if (5 != param1) {
            if (param1 != 6) {
              if (7 == param1) {
                L0: {
                  var10 = ng.a(((jb) this).field_f, ((jb) this).field_d, -69, param0);
                  if (var10 != null) {
                    var6 = null;
                    vm.a(((jb) this).field_f, 0, (String) null, var10, 2, 0);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var5 = 0;
                return true;
              } else {
                return false;
              }
            } else {
              L1: {
                var9 = sf.a(-107, param0, ((jb) this).field_f);
                if (var9 != null) {
                  var6 = null;
                  vm.a(((jb) this).field_f, 0, (String) null, var9, 2, 0);
                  break L1;
                } else {
                  break L1;
                }
              }
              var5 = 0;
              return true;
            }
          } else {
            L2: {
              var8 = gn.a(((jb) this).field_f, 113, param0);
              if (var8 != null) {
                var6 = null;
                vm.a(((jb) this).field_f, 0, (String) null, var8, 2, 0);
                break L2;
              } else {
                break L2;
              }
            }
            var5 = 0;
            return true;
          }
        } else {
          L3: {
            var7 = ii.a(((jb) this).field_f, (byte) 116, param0);
            if (var7 != null) {
              var6 = null;
              vm.a(((jb) this).field_f, 0, (String) null, var7, 2, 0);
              break L3;
            } else {
              break L3;
            }
          }
          var5 = 0;
          return true;
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        if (17 == param1) {
          bk.field_i = new fa(((jb) this).field_e.field_w, ((jb) this).field_e.field_qb, ((jb) this).field_e.field_zb, ((jb) this).field_e.field_z, param2, wa.field_a, kc.field_c, jf.field_a, vo.field_m, jk.field_h, cm.field_b, ((jb) this).field_f, ((jb) this).field_i);
          return true;
        } else {
          return false;
        }
    }

    private final String b(int param0) {
        String var2 = null;
        if (param0 != -20516) {
          L0: {
            field_k = null;
            if (null == ((jb) this).field_d) {
              var2 = ((jb) this).field_f;
              break L0;
            } else {
              var2 = ((jb) this).field_d;
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            if (null == ((jb) this).field_d) {
              var2 = ((jb) this).field_f;
              break L1;
            } else {
              var2 = ((jb) this).field_d;
              break L1;
            }
          }
          return var2;
        }
    }

    final void c(int param0) {
        String var2 = null;
        String var3 = null;
        if (param0 >= -45) {
          L0: {
            field_c = null;
            if (null == ((jb) this).field_f) {
              break L0;
            } else {
              if (~ie.field_sb == ~((jb) this).field_i) {
                break L0;
              } else {
                var3 = this.b(-20516);
                var2 = var3;
                ((jb) this).field_j.a((byte) -118, vl.a(mi.field_Jb, new String[1], 2), 17);
                break L0;
              }
            }
          }
          return;
        } else {
          L1: {
            if (null == ((jb) this).field_f) {
              break L1;
            } else {
              if (~ie.field_sb == ~((jb) this).field_i) {
                break L1;
              } else {
                var3 = this.b(-20516);
                var2 = var3;
                ((jb) this).field_j.a((byte) -118, vl.a(mi.field_Jb, new String[1], 2), 17);
                break L1;
              }
            }
          }
          return;
        }
    }

    final void a(int param0, int[] param1, byte param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        ml var5 = null;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              if (((jb) this).field_f == null) {
                break L1;
              } else {
                L2: {
                  if (ie.field_sb != ((jb) this).field_i) {
                    break L2;
                  } else {
                    if (2 != param0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (ge.field_zb == 2) {
                  L3: {
                    var7 = this.b(-20516);
                    var4_ref = var7;
                    int discarded$1 = 0;
                    var5 = dn.a(((jb) this).field_f);
                    var6 = hp.a(((jb) this).field_f, param2 ^ 1009) ? 1 : 0;
                    if (var5 != null) {
                      break L3;
                    } else {
                      if (var6 == 0) {
                        ((jb) this).field_j.a((byte) -118, vl.a(th.field_e, new String[1], param2 + -11), 4);
                        ((jb) this).field_j.a((byte) -118, vl.a(sb.field_g, new String[1], 2), 6);
                        if (param1 == null) {
                          break L3;
                        } else {
                          if (param0 == 2) {
                            break L3;
                          } else {
                            if (!nh.field_m) {
                              ((jb) this).field_g = param1;
                              ((jb) this).field_j.a((byte) -118, vl.a(ff.field_u, new String[1], 2), 19);
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
                    if (var5 != null) {
                      L5: {
                        if (cq.a(((jb) this).field_f, -118)) {
                          break L5;
                        } else {
                          if (nh.field_m) {
                            break L5;
                          } else {
                            L6: {
                              if (sh.field_L) {
                                break L6;
                              } else {
                                ((jb) this).field_j.a((byte) -118, vl.a(jk.field_i, new String[1], 2), 8);
                                break L6;
                              }
                            }
                            ((jb) this).field_j.a((byte) -118, vl.a(mp.field_c, new String[1], 2), 18);
                            if (param1 != null) {
                              ((jb) this).field_g = param1;
                              ((jb) this).field_j.a((byte) -118, vl.a(ff.field_u, new String[1], 2), 19);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      ((jb) this).field_j.a((byte) -118, vl.a(nk.field_j, new String[1], 2), 5);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (var6 == 0) {
                    break L1;
                  } else {
                    ((jb) this).field_j.a((byte) -118, vl.a(we.field_l, new String[1], 2), 7);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            if (param2 == 13) {
              break L0;
            } else {
              field_a = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var4;
            stackOut_29_1 = new StringBuilder().append("jb.K(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L7;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param2 + ')');
        }
    }

    jb(cj param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
            ((jb) this).field_j = new sn(ql.field_d);
            ((jb) this).field_f = param2;
            ((jb) this).field_d = param3;
            ((jb) this).field_g = param6;
            ((jb) this).field_h = param5;
            ((jb) this).field_b = param4;
            ((jb) this).field_i = param1;
            ((jb) this).field_e = param0;
            param0.field_Ab = true;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "jb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Playing";
        field_k = "Passwords must be between 5 and 20 characters long";
    }
}
