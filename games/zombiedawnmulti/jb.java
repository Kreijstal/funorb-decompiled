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
          this.field_f = (String) null;
          this.field_j.c(param0, -1);
          return;
        } else {
          this.field_j.c(param0, -1);
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -2) {
            return;
        }
        field_k = null;
        field_a = null;
        field_c = null;
    }

    private final boolean a(byte param0, int param1, int param2) {
        int var5;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != 98) {
          this.c(123);
          if (-9 != (param1 ^ -1)) {
            if ((param1 ^ -1) != -19) {
              if (11 != param1) {
                if (-13 != (param1 ^ -1)) {
                  if ((param1 ^ -1) != -14) {
                    if ((param1 ^ -1) != -15) {
                      if (param1 != 20) {
                        if (param1 != 19) {
                          return false;
                        } else {
                          na.a(this.field_g, (byte) -50, this.field_f, this.field_i, this.field_h);
                          return true;
                        }
                      } else {
                        q.a(13151);
                        return true;
                      }
                    } else {
                      mg.b(false);
                      return true;
                    }
                  } else {
                    kp.a(this.field_h, param2, 2, true);
                    return true;
                  }
                } else {
                  kp.a(this.field_h, param2, 1, true);
                  return true;
                }
              } else {
                kp.a(this.field_h, param2, 0, true);
                return true;
              }
            } else {
              fg.a(-16745, this.field_i, this.field_f);
              return true;
            }
          } else {
            gm.a(this.field_i, this.field_f, -1);
            return true;
          }
        } else {
          if (-9 != (param1 ^ -1)) {
            if ((param1 ^ -1) != -19) {
              if (11 != param1) {
                if (-13 != (param1 ^ -1)) {
                  if ((param1 ^ -1) != -14) {
                    if ((param1 ^ -1) != -15) {
                      if (param1 != 20) {
                        if (param1 == 19) {
                          na.a(this.field_g, (byte) -50, this.field_f, this.field_i, this.field_h);
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        q.a(13151);
                        return true;
                      }
                    } else {
                      mg.b(false);
                      return true;
                    }
                  } else {
                    kp.a(this.field_h, param2, 2, true);
                    return true;
                  }
                } else {
                  kp.a(this.field_h, param2, 1, true);
                  return true;
                }
              } else {
                kp.a(this.field_h, param2, 0, true);
                return true;
              }
            } else {
              fg.a(-16745, this.field_i, this.field_f);
              return true;
            }
          } else {
            gm.a(this.field_i, this.field_f, -1);
            return true;
          }
        }
    }

    final void a(boolean param0, byte param1) {
        dm var4;
        String var5;
        int var6;
        dm var7;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null != this.field_f) {
          if (this.field_i != ie.field_sb) {
            if (mh.field_c != null) {
              if (hl.b(0)) {
                var7 = en.a((byte) 50, this.field_i);
                var4 = vm.a(this.field_i, (byte) -104);
                var5 = this.b(-20516);
                if (var4 == null) {
                  if (var7 != null) {
                    if (mh.field_c.field_Wb) {
                      if (mh.field_c.field_cc >= mh.field_c.field_mc) {
                        if (param1 < -80) {
                          return;
                        } else {
                          this.c(-88);
                          return;
                        }
                      } else {
                        if (var7.field_Pb) {
                          this.field_j.a((byte) -118, vl.a(bl.field_f, new String[]{var5}, 2), 1);
                          if (param1 < -80) {
                            return;
                          } else {
                            this.c(-88);
                            return;
                          }
                        } else {
                          if (!param0) {
                            this.field_j.a((byte) -118, vl.a(ge.field_qb, new String[]{var5}, 2), 0);
                            if (param1 < -80) {
                              return;
                            } else {
                              this.c(-88);
                              return;
                            }
                          } else {
                            if (var7.field_Ob) {
                              this.field_j.a((byte) -118, vl.a(mq.field_p, new String[]{var5}, 2), 0);
                              this.field_j.a((byte) -118, vl.a(r.field_g, new String[]{var5}, 2), 1);
                              if (param1 < -80) {
                                return;
                              } else {
                                this.c(-88);
                                return;
                              }
                            } else {
                              this.field_j.a((byte) -118, vl.a(ge.field_qb, new String[]{var5}, 2), 0);
                              if (param1 < -80) {
                                return;
                              } else {
                                this.c(-88);
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
                        this.c(-88);
                        return;
                      }
                    }
                  } else {
                    if (param1 >= -80) {
                      this.c(-88);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (mh.field_c.field_Fb) {
                    if (-1 >= (mh.field_c.field_Sb ^ -1)) {
                      this.field_j.a((byte) -118, vl.a(lk.field_I, new String[]{var5}, 2), 1);
                      if (param1 >= -80) {
                        this.c(-88);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (param1 >= -80) {
                        this.c(-88);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    this.field_j.a((byte) -118, vl.a(lk.field_I, new String[]{var5}, 2), 1);
                    if (param1 >= -80) {
                      this.c(-88);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                if (param1 >= -80) {
                  this.c(-88);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param1 >= -80) {
                this.c(-88);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param1 >= -80) {
              this.c(-88);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param1 >= -80) {
            this.c(-88);
            return;
          } else {
            return;
          }
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        int var5;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 == 19) {
          if (param2 != 0) {
            if ((param2 ^ -1) != -2) {
              if (2 != param2) {
                if ((param2 ^ -1) != -4) {
                  if (10 != param2) {
                    if (-16 != (param2 ^ -1)) {
                      if ((param2 ^ -1) == -17) {
                        jm.a(0, param0, param1 + -107);
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      jm.a(this.field_b, param0, -105);
                      return true;
                    }
                  } else {
                    kk.a(param1 + -6, this.field_b, param0);
                    return true;
                  }
                } else {
                  ml.a(this.field_b, param0, -76);
                  return true;
                }
              } else {
                pl.a(param0, (byte) 111, this.field_b);
                return true;
              }
            } else {
              cg.a(param0, -27404, this.field_i);
              return true;
            }
          } else {
            so.a(-21148, this.field_i, param0);
            return true;
          }
        } else {
          return false;
        }
    }

    final void a(byte param0) {
        String var3;
        int var4;
        jh var5;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (mh.field_c == null) {
          var5 = on.c(false, this.field_b);
          if (var5 != null) {
            var3 = var5.field_Nb;
            if (!var5.field_lc) {
              if (var5.field_Ob) {
                L0: {
                  this.field_j.a((byte) -118, vl.a(jo.field_c, new String[]{var3}, 2), 2);
                  if (var5.field_rc) {
                    this.field_j.a((byte) -118, vl.a(b.field_e, new String[]{var3}, 2), 3);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                if (param0 <= -8) {
                  return;
                } else {
                  this.field_i = -51L;
                  return;
                }
              } else {
                if (!var5.field_rc) {
                  if (var5.field_Wb) {
                    if (var5.field_Fb) {
                      if (!var5.field_Ob) {
                        L1: {
                          if (var5.field_rc) {
                            this.field_j.a((byte) -118, vl.a(b.field_e, new String[]{var3}, 2), 3);
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                        if (param0 <= -8) {
                          return;
                        } else {
                          this.field_i = -51L;
                          return;
                        }
                      } else {
                        L2: {
                          this.field_j.a((byte) -118, vl.a(hp.field_o, new String[]{var3}, 2), 2);
                          if (var5.field_rc) {
                            this.field_j.a((byte) -118, vl.a(b.field_e, new String[]{var3}, 2), 3);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        if (param0 <= -8) {
                          return;
                        } else {
                          this.field_i = -51L;
                          return;
                        }
                      }
                    } else {
                      L3: {
                        this.field_j.a((byte) -118, vl.a(hp.field_o, new String[]{var3}, 2), 2);
                        if (var5.field_rc) {
                          this.field_j.a((byte) -118, vl.a(b.field_e, new String[]{var3}, 2), 3);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      if (param0 > -8) {
                        this.field_i = -51L;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (var5.field_rc) {
                      this.field_j.a((byte) -118, vl.a(b.field_e, new String[]{var3}, 2), 3);
                      if (param0 > -8) {
                        this.field_i = -51L;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (param0 > -8) {
                        this.field_i = -51L;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if (var5.field_rc) {
                    this.field_j.a((byte) -118, vl.a(b.field_e, new String[]{var3}, 2), 3);
                    if (param0 > -8) {
                      this.field_i = -51L;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (param0 > -8) {
                      this.field_i = -51L;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            } else {
              this.field_j.a((byte) -118, vl.a(ke.field_d, new String[]{var3}, 2), 2);
              this.field_j.a((byte) -118, vl.a(gg.field_e, new String[]{var3}, 2), 3);
              if (param0 > -8) {
                this.field_i = -51L;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 > -8) {
              this.field_i = -51L;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 > -8) {
            this.field_i = -51L;
            return;
          } else {
            return;
          }
        }
    }

    final boolean a(boolean param0) {
        String discarded$3 = null;
        if (!param0) {
          if (this.field_j != null) {
            if (!this.field_j.d((byte) 90)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          discarded$3 = this.b(95);
          if (this.field_j != null) {
            if (!this.field_j.d((byte) 90)) {
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
        boolean discarded$8 = false;
        boolean discarded$9 = false;
        boolean discarded$10 = false;
        boolean discarded$11 = false;
        boolean discarded$12 = false;
        boolean discarded$13 = false;
        boolean discarded$14 = false;
        boolean discarded$15 = false;
        int var6;
        var6 = this.field_j.e(param3, param2 ^ 1839469049);
        if (-2 != var6) {
          if (param2 != -8) {
            this.field_b = -116;
            discarded$8 = this.b(param0, 19, var6);
            discarded$9 = this.a(param4, var6, (byte) 57);
            discarded$10 = this.a((byte) 98, var6, param4);
            discarded$11 = this.a(17, var6, param1);
            return true;
          } else {
            discarded$12 = this.b(param0, 19, var6);
            discarded$13 = this.a(param4, var6, (byte) 57);
            discarded$14 = this.a((byte) 98, var6, param4);
            discarded$15 = this.a(17, var6, param1);
            return true;
          }
        } else {
          return false;
        }
    }

    final void a(ka param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0.field_k) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 2) {
                  break L1;
                } else {
                  this.field_g = (int[]) null;
                  break L1;
                }
              }
              L2: {
                this.field_h = param0.field_l;
                if (-1 != (param0.field_l ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    if (0 != li.field_C) {
                      break L3;
                    } else {
                      this.field_j.a((byte) -118, ha.field_k, 12);
                      break L3;
                    }
                  }
                  this.field_j.a((byte) -118, rq.field_g, 13);
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
                      this.field_j.a((byte) -118, bg.field_n, 12);
                      break L5;
                    }
                  }
                  this.field_j.a((byte) -118, jk.field_c, 13);
                  break L4;
                }
              }
              if (-3 == (param0.field_l ^ -1)) {
                L6: {
                  if (0 == ba.field_q) {
                    this.field_j.a((byte) -118, aj.field_i, 12);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                this.field_j.a((byte) -118, gg.field_n, 13);
                decompiledRegionSelector0 = 1;
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
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("jb.H(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final boolean a(int param0, int param1, byte param2) {
        Object var4;
        int var5;
        String var6;
        String var7;
        String var8;
        String var9;
        String var10;
        var4 = null;
        if ((param1 ^ -1) != -5) {
          if (5 != param1) {
            if ((param1 ^ -1) != -7) {
              if (7 == param1) {
                L0: {
                  var10 = ng.a(this.field_f, this.field_d, -69, param0);
                  if (var10 != null) {
                    var6 = (String) null;
                    vm.a(this.field_f, 0, (String) null, var10, 2, 0);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var5 = -84 % ((-56 - param2) / 51);
                return true;
              } else {
                return false;
              }
            } else {
              L1: {
                var9 = sf.a(-107, param0, this.field_f);
                if (var9 != null) {
                  var6 = (String) null;
                  vm.a(this.field_f, 0, (String) null, var9, 2, 0);
                  break L1;
                } else {
                  break L1;
                }
              }
              var5 = -84 % ((-56 - param2) / 51);
              return true;
            }
          } else {
            L2: {
              var8 = gn.a(this.field_f, 113, param0);
              if (var8 != null) {
                var6 = (String) null;
                vm.a(this.field_f, 0, (String) null, var8, 2, 0);
                break L2;
              } else {
                break L2;
              }
            }
            var5 = -84 % ((-56 - param2) / 51);
            return true;
          }
        } else {
          L3: {
            var7 = ii.a(this.field_f, (byte) 116, param0);
            if (var7 != null) {
              var6 = (String) null;
              vm.a(this.field_f, 0, (String) null, var7, 2, 0);
              break L3;
            } else {
              break L3;
            }
          }
          var5 = -84 % ((-56 - param2) / 51);
          return true;
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        if (param0 == param1) {
          bk.field_i = new fa(this.field_e.field_w, this.field_e.field_qb, this.field_e.field_zb, this.field_e.field_z, param2, wa.field_a, kc.field_c, jf.field_a, vo.field_m, jk.field_h, cm.field_b, this.field_f, this.field_i);
          return true;
        } else {
          return false;
        }
    }

    private final String b(int param0) {
        String var2;
        if (param0 != -20516) {
          L0: {
            field_k = (String) null;
            if (null == this.field_d) {
              var2 = this.field_f;
              break L0;
            } else {
              var2 = this.field_d;
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            if (null == this.field_d) {
              var2 = this.field_f;
              break L1;
            } else {
              var2 = this.field_d;
              break L1;
            }
          }
          return var2;
        }
    }

    final void c(int param0) {
        String var2;
        String var3;
        if (param0 >= -45) {
          L0: {
            field_c = (cj) null;
            if (null == this.field_f) {
              break L0;
            } else {
              if ((ie.field_sb ^ -1L) == (this.field_i ^ -1L)) {
                break L0;
              } else {
                var3 = this.b(-20516);
                var2 = var3;
                this.field_j.a((byte) -118, vl.a(mi.field_Jb, new String[]{var3}, 2), 17);
                break L0;
              }
            }
          }
          return;
        } else {
          L1: {
            if (null == this.field_f) {
              break L1;
            } else {
              if ((ie.field_sb ^ -1L) == (this.field_i ^ -1L)) {
                break L1;
              } else {
                var3 = this.b(-20516);
                var2 = var3;
                this.field_j.a((byte) -118, vl.a(mi.field_Jb, new String[]{var3}, 2), 17);
                break L1;
              }
            }
          }
          return;
        }
    }

    final void a(int param0, int[] param1, byte param2) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        ml var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          L0: {
            L1: {
              if (this.field_f == null) {
                break L1;
              } else {
                L2: {
                  if (ie.field_sb != this.field_i) {
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
                    var4 = var7;
                    var5 = dn.a(this.field_f, false);
                    var6 = hp.a(this.field_f, param2 ^ 1009) ? 1 : 0;
                    if (var5 != null) {
                      break L3;
                    } else {
                      if (var6 == 0) {
                        this.field_j.a((byte) -118, vl.a(th.field_e, new String[]{var7}, param2 + -11), 4);
                        this.field_j.a((byte) -118, vl.a(sb.field_g, new String[]{var7}, 2), 6);
                        if (param1 == null) {
                          break L3;
                        } else {
                          if (-3 == (param0 ^ -1)) {
                            break L3;
                          } else {
                            if (!nh.field_m) {
                              this.field_g = param1;
                              this.field_j.a((byte) -118, vl.a(ff.field_u, new String[]{var7}, 2), 19);
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
                        if (cq.a(this.field_f, -118)) {
                          break L5;
                        } else {
                          if (nh.field_m) {
                            break L5;
                          } else {
                            L6: {
                              if (sh.field_L) {
                                break L6;
                              } else {
                                this.field_j.a((byte) -118, vl.a(jk.field_i, new String[]{var7}, 2), 8);
                                break L6;
                              }
                            }
                            this.field_j.a((byte) -118, vl.a(mp.field_c, new String[]{var7}, 2), 18);
                            if (param1 != null) {
                              this.field_g = param1;
                              this.field_j.a((byte) -118, vl.a(ff.field_u, new String[]{var7}, 2), 19);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      this.field_j.a((byte) -118, vl.a(nk.field_j, new String[]{var7}, 2), 5);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (var6 == 0) {
                    break L1;
                  } else {
                    this.field_j.a((byte) -118, vl.a(we.field_l, new String[]{var7}, 2), 7);
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
              field_a = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var4_ref);

            stackIn_31_1 = new StringBuilder().append("jb.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L7;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param2 + ')');
        }
    }

    jb(cj param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
            this.field_j = new sn(ql.field_d);
            this.field_f = param2;
            this.field_d = param3;
            this.field_g = param6;
            this.field_h = param5;
            this.field_b = param4;
            this.field_i = param1;
            this.field_e = param0;
            param0.field_Ab = true;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "jb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Playing";
        field_k = "Passwords must be between 5 and 20 characters long";
    }
}
