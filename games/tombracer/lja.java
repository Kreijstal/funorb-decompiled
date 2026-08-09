/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lja {
    private String field_d;
    private int field_b;
    private long field_g;
    private int[] field_e;
    ola field_f;
    jea field_h;
    int field_k;
    static fp field_j;
    static volatile boolean field_c;
    String field_i;
    static String field_a;

    public static void b(byte param0) {
        int var1 = 37 % ((7 - param0) / 44);
        field_j = null;
        field_a = null;
    }

    final boolean a(int param0) {
        gqa var3;
        if (param0 == 13) {
          if (this.field_f != null) {
            if (!this.field_f.f(param0 ^ -13)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          var3 = (gqa) null;
          this.a((gqa) null, -72);
          if (this.field_f != null) {
            if (!this.field_f.f(param0 ^ -13)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private final String b(int param0) {
        String var2 = null;
        if (param0 != -13) {
            return (String) null;
        }
        if (this.field_d == null) {
            var2 = this.field_i;
        } else {
            var2 = this.field_d;
        }
        return var2;
    }

    final void a(boolean param0, boolean param1) {
        if (!param0) {
            this.field_g = -102L;
            this.field_f.b(44, param1);
            return;
        }
        this.field_f.b(44, param1);
    }

    final void a(byte param0) {
        String var3;
        int var4;
        ht var5;
        var4 = TombRacer.field_G ? 1 : 0;
        if (null == uu.field_a) {
          var5 = av.a(this.field_k, 0);
          if (var5 != null) {
            var3 = var5.field_tb;
            if (var5.field_gc) {
              this.field_f.a((byte) -102, 2, gl.a((byte) 114, pba.field_d, new String[]{var3}));
              this.field_f.a((byte) -104, 3, gl.a((byte) 123, cp.field_i, new String[]{var3}));
              if (param0 <= -10) {
                return;
              } else {
                this.field_e = (int[]) null;
                return;
              }
            } else {
              if (var5.field_Bb) {
                this.field_f.a((byte) -76, 2, gl.a((byte) 106, mna.field_b, new String[]{var3}));
                if (var5.field_Sb) {
                  this.field_f.a((byte) -102, 3, gl.a((byte) 86, kna.field_B, new String[]{var3}));
                  if (param0 <= -10) {
                    return;
                  } else {
                    this.field_e = (int[]) null;
                    return;
                  }
                } else {
                  if (param0 <= -10) {
                    return;
                  } else {
                    this.field_e = (int[]) null;
                    return;
                  }
                }
              } else {
                if (!var5.field_Sb) {
                  if (var5.field_Yb) {
                    if (var5.field_ec) {
                      if (!var5.field_Bb) {
                        if (var5.field_Sb) {
                          this.field_f.a((byte) -102, 3, gl.a((byte) 86, kna.field_B, new String[]{var3}));
                          if (param0 <= -10) {
                            return;
                          } else {
                            this.field_e = (int[]) null;
                            return;
                          }
                        } else {
                          if (param0 <= -10) {
                            return;
                          } else {
                            this.field_e = (int[]) null;
                            return;
                          }
                        }
                      } else {
                        this.field_f.a((byte) -125, 2, gl.a((byte) 91, di.field_h, new String[]{var3}));
                        if (var5.field_Sb) {
                          this.field_f.a((byte) -102, 3, gl.a((byte) 86, kna.field_B, new String[]{var3}));
                          if (param0 <= -10) {
                            return;
                          } else {
                            this.field_e = (int[]) null;
                            return;
                          }
                        } else {
                          if (param0 <= -10) {
                            return;
                          } else {
                            this.field_e = (int[]) null;
                            return;
                          }
                        }
                      }
                    } else {
                      this.field_f.a((byte) -125, 2, gl.a((byte) 91, di.field_h, new String[]{var3}));
                      if (var5.field_Sb) {
                        this.field_f.a((byte) -102, 3, gl.a((byte) 86, kna.field_B, new String[]{var3}));
                        if (param0 > -10) {
                          this.field_e = (int[]) null;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (param0 > -10) {
                          this.field_e = (int[]) null;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    if (var5.field_Sb) {
                      this.field_f.a((byte) -102, 3, gl.a((byte) 86, kna.field_B, new String[]{var3}));
                      if (param0 > -10) {
                        this.field_e = (int[]) null;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (param0 > -10) {
                        this.field_e = (int[]) null;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if (var5.field_Sb) {
                    this.field_f.a((byte) -102, 3, gl.a((byte) 86, kna.field_B, new String[]{var3}));
                    if (param0 > -10) {
                      this.field_e = (int[]) null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (param0 > -10) {
                      this.field_e = (int[]) null;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          } else {
            if (param0 > -10) {
              this.field_e = (int[]) null;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 > -10) {
            this.field_e = (int[]) null;
            return;
          } else {
            return;
          }
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = this.field_f.d(0, param0);
        if (!(param3 != var6)) {
            return false;
        }
        boolean discarded$0 = this.a(param3 + -16, var6, param2);
        boolean discarded$1 = this.b(var6, (byte) -121, param4);
        boolean discarded$2 = this.a(var6, (byte) -39, param4);
        boolean discarded$3 = this.b(param1, var6, 114);
        return true;
    }

    private final boolean b(int param0, byte param1, int param2) {
        Object var4;
        String var4_ref;
        String var5;
        var4 = null;
        if (4 == param0) {
          var4_ref = rf.a(true, this.field_i, param2);
          if (var4_ref == null) {
            if (param1 != -121) {
              return false;
            } else {
              return true;
            }
          } else {
            var5 = (String) null;
            gu.a(0, true, this.field_i, var4_ref, (String) null, 2);
            if (param1 != -121) {
              return false;
            } else {
              return true;
            }
          }
        } else {
          if (param0 == 5) {
            var4_ref = uca.a(this.field_i, (byte) 102, param2);
            if (var4_ref == null) {
              if (param1 != -121) {
                return false;
              } else {
                return true;
              }
            } else {
              var5 = (String) null;
              gu.a(0, true, this.field_i, var4_ref, (String) null, 2);
              if (param1 != -121) {
                return false;
              } else {
                return true;
              }
            }
          } else {
            if (param0 == 6) {
              var4_ref = nna.a(-3, this.field_i, param2);
              if (var4_ref != null) {
                var5 = (String) null;
                gu.a(0, true, this.field_i, var4_ref, (String) null, 2);
                if (param1 != -121) {
                  return false;
                } else {
                  return true;
                }
              } else {
                if (param1 != -121) {
                  return false;
                } else {
                  return true;
                }
              }
            } else {
              if (7 == param0) {
                var4_ref = kc.a(this.field_i, param2, false, this.field_d);
                if (var4_ref != null) {
                  var5 = (String) null;
                  gu.a(0, true, this.field_i, var4_ref, (String) null, 2);
                  if (param1 != -121) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  if (param1 != -121) {
                    return false;
                  } else {
                    return true;
                  }
                }
              } else {
                return false;
              }
            }
          }
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        if (-1 != (param1 ^ -1)) {
          if ((param1 ^ -1) == -2) {
            fn.a(param2, this.field_g, -120);
            if (param0 != -18) {
              field_j = (fp) null;
              return true;
            } else {
              return true;
            }
          } else {
            if (-3 != (param1 ^ -1)) {
              if ((param1 ^ -1) != -4) {
                if (-11 != (param1 ^ -1)) {
                  if (param1 != 15) {
                    if ((param1 ^ -1) == -17) {
                      cua.a(0, 3, param2);
                      if (param0 != -18) {
                        field_j = (fp) null;
                        return true;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    cua.a(this.field_k, param0 + 21, param2);
                    if (param0 != -18) {
                      field_j = (fp) null;
                      return true;
                    } else {
                      return true;
                    }
                  }
                } else {
                  kw.a(param2, false, this.field_k);
                  if (param0 == -18) {
                    return true;
                  } else {
                    field_j = (fp) null;
                    return true;
                  }
                }
              } else {
                et.a(param2, 30, this.field_k);
                if (param0 == -18) {
                  return true;
                } else {
                  field_j = (fp) null;
                  return true;
                }
              }
            } else {
              q.a((byte) -123, param2, this.field_k);
              if (param0 != -18) {
                field_j = (fp) null;
                return true;
              } else {
                return true;
              }
            }
          }
        } else {
          fv.a((byte) -38, param2, this.field_g);
          if (param0 != -18) {
            field_j = (fp) null;
            return true;
          } else {
            return true;
          }
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param1 != -39) {
          lja.b((byte) 36);
          if ((param0 ^ -1) != -9) {
            if (-19 != (param0 ^ -1)) {
              if (-12 != (param0 ^ -1)) {
                if ((param0 ^ -1) != -13) {
                  if ((param0 ^ -1) != -14) {
                    if (-15 != (param0 ^ -1)) {
                      if (-21 != (param0 ^ -1)) {
                        if (19 == param0) {
                          eca.a((byte) 84, this.field_b, this.field_g, this.field_e, this.field_i);
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        ola.e((byte) 123);
                        return true;
                      }
                    } else {
                      kaa.a((byte) 118);
                      return true;
                    }
                  } else {
                    loa.a(this.field_b, param2, (byte) 108, 2);
                    return true;
                  }
                } else {
                  loa.a(this.field_b, param2, (byte) 108, 1);
                  return true;
                }
              } else {
                loa.a(this.field_b, param2, (byte) 108, 0);
                return true;
              }
            } else {
              fs.a((byte) 123, this.field_g, this.field_i);
              return true;
            }
          } else {
            no.a(this.field_i, this.field_g, (byte) 120);
            return true;
          }
        } else {
          if ((param0 ^ -1) != -9) {
            if (-19 != (param0 ^ -1)) {
              if (-12 != (param0 ^ -1)) {
                if ((param0 ^ -1) != -13) {
                  if ((param0 ^ -1) != -14) {
                    if (-15 != (param0 ^ -1)) {
                      if (-21 != (param0 ^ -1)) {
                        if (19 != param0) {
                          return false;
                        } else {
                          eca.a((byte) 84, this.field_b, this.field_g, this.field_e, this.field_i);
                          return true;
                        }
                      } else {
                        ola.e((byte) 123);
                        return true;
                      }
                    } else {
                      kaa.a((byte) 118);
                      return true;
                    }
                  } else {
                    loa.a(this.field_b, param2, (byte) 108, 2);
                    return true;
                  }
                } else {
                  loa.a(this.field_b, param2, (byte) 108, 1);
                  return true;
                }
              } else {
                loa.a(this.field_b, param2, (byte) 108, 0);
                return true;
              }
            } else {
              fs.a((byte) 123, this.field_g, this.field_i);
              return true;
            }
          } else {
            no.a(this.field_i, this.field_g, (byte) 120);
            return true;
          }
        }
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        mu var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          L0: {
            L1: {
              if (param2 == 19) {
                break L1;
              } else {
                this.field_f = (ola) null;
                break L1;
              }
            }
            L2: {
              if (this.field_i == null) {
                break L2;
              } else {
                L3: {
                  if (rb.field_r != this.field_g) {
                    break L3;
                  } else {
                    if (-3 != (param1 ^ -1)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (ae.field_g == 2) {
                  L4: {
                    var7 = this.b(-13);
                    var4 = var7;
                    var5 = wp.a(127, this.field_i);
                    var6 = qaa.a(2180, this.field_i) ? 1 : 0;
                    if (var5 != null) {
                      break L4;
                    } else {
                      if (var6 == 0) {
                        this.field_f.a((byte) -64, 4, gl.a((byte) 92, ao.field_m, new String[]{var7}));
                        this.field_f.a((byte) -70, 6, gl.a((byte) 127, mp.field_b, new String[]{var7}));
                        if (param0 == null) {
                          break L4;
                        } else {
                          if (2 == param1) {
                            break L4;
                          } else {
                            if (!fua.field_g) {
                              this.field_e = param0;
                              this.field_f.a((byte) -90, 19, gl.a((byte) 119, gja.field_k, new String[]{var7}));
                              break L4;
                            } else {
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
                        if (ab.a(this.field_i, (byte) -50)) {
                          break L6;
                        } else {
                          if (fua.field_g) {
                            break L6;
                          } else {
                            L7: {
                              if (!ok.field_s) {
                                this.field_f.a((byte) -77, 8, gl.a((byte) 114, fj.field_b, new String[]{var7}));
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            this.field_f.a((byte) -118, 18, gl.a((byte) 108, ob.field_f, new String[]{var7}));
                            if (param0 == null) {
                              break L6;
                            } else {
                              this.field_e = param0;
                              this.field_f.a((byte) -71, 19, gl.a((byte) 96, gja.field_k, new String[]{var7}));
                              break L6;
                            }
                          }
                        }
                      }
                      this.field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[]{var7}));
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (var6 != 0) {
                    this.field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[]{var7}));
                    break L2;
                  } else {
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
            stackIn_32_0 = (RuntimeException) (var4_ref);

            stackIn_32_1 = new StringBuilder().append("lja.L(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L8;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(gqa param0, int param1) {
        String discarded$1 = null;
        RuntimeException var3 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0.field_m) {
              L1: {
                this.field_b = param0.field_d;
                if (-1 != (param0.field_d ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    if (-1 != (k.field_A ^ -1)) {
                      break L2;
                    } else {
                      this.field_f.a((byte) -66, 12, qe.field_b);
                      break L2;
                    }
                  }
                  this.field_f.a((byte) -86, 13, pea.field_f);
                  break L1;
                }
              }
              L3: {
                if (1 == param0.field_d) {
                  L4: {
                    if (0 != nba.field_b) {
                      break L4;
                    } else {
                      this.field_f.a((byte) -77, 12, jl.field_a);
                      break L4;
                    }
                  }
                  this.field_f.a((byte) -82, 13, ot.field_w);
                  break L3;
                } else {
                  break L3;
                }
              }
              L5: {
                if (-3 != (param0.field_d ^ -1)) {
                  break L5;
                } else {
                  L6: {
                    if (caa.field_i != 0) {
                      break L6;
                    } else {
                      this.field_f.a((byte) -93, 12, cva.field_e);
                      break L6;
                    }
                  }
                  this.field_f.a((byte) -85, 13, tva.field_c);
                  break L5;
                }
              }
              if (param1 == 13) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                discarded$1 = this.b(-106);
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
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("lja.B(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, boolean param1) {
        pha var4;
        String var5;
        int var6;
        pha var13;
        pha var14;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0 != -22) {
          field_c = false;
          if (this.field_i != null) {
            L0: {
              if (this.field_g == rb.field_r) {
                break L0;
              } else {
                if (null == uu.field_a) {
                  break L0;
                } else {
                  if (mka.b(8192)) {
                    var14 = nl.a(true, this.field_g);
                    var4 = vba.a((byte) -40, this.field_g);
                    var5 = this.b(-13);
                    if (var4 != null) {
                      if (!uu.field_a.field_ec) {
                        this.field_f.a((byte) -74, 1, gl.a((byte) 108, lf.field_a, new String[]{var5}));
                        return;
                      } else {
                        if (uu.field_a.field_Kb < 0) {
                          break L0;
                        } else {
                          this.field_f.a((byte) -74, 1, gl.a((byte) 108, lf.field_a, new String[]{var5}));
                          return;
                        }
                      }
                    } else {
                      if (var14 == null) {
                        break L0;
                      } else {
                        if (!uu.field_a.field_Yb) {
                          break L0;
                        } else {
                          if (uu.field_a.field_Jb <= uu.field_a.field_Mb) {
                            break L0;
                          } else {
                            if (!var14.field_Hb) {
                              L1: {
                                if (!param1) {
                                  break L1;
                                } else {
                                  if (!var14.field_Fb) {
                                    break L1;
                                  } else {
                                    this.field_f.a((byte) -123, 0, gl.a((byte) 127, sb.field_c, new String[]{var5}));
                                    this.field_f.a((byte) -98, 1, gl.a((byte) 116, aja.field_G, new String[]{var5}));
                                    return;
                                  }
                                }
                              }
                              this.field_f.a((byte) -112, 0, gl.a((byte) 98, uh.field_i, new String[]{var5}));
                              return;
                            } else {
                              this.field_f.a((byte) -79, 1, gl.a((byte) 126, oea.field_g, new String[]{var5}));
                              return;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            return;
          } else {
            return;
          }
        } else {
          if (this.field_i != null) {
            if (this.field_g != rb.field_r) {
              if (null != uu.field_a) {
                if (mka.b(8192)) {
                  L2: {
                    var13 = nl.a(true, this.field_g);
                    var4 = vba.a((byte) -40, this.field_g);
                    var5 = this.b(-13);
                    if (var4 != null) {
                      if (!uu.field_a.field_ec) {
                        this.field_f.a((byte) -74, 1, gl.a((byte) 108, lf.field_a, new String[]{var5}));
                        return;
                      } else {
                        if (uu.field_a.field_Kb < 0) {
                          break L2;
                        } else {
                          this.field_f.a((byte) -74, 1, gl.a((byte) 108, lf.field_a, new String[]{var5}));
                          return;
                        }
                      }
                    } else {
                      if (var13 != null) {
                        if (!uu.field_a.field_Yb) {
                          break L2;
                        } else {
                          if (uu.field_a.field_Jb <= uu.field_a.field_Mb) {
                            break L2;
                          } else {
                            if (!var13.field_Hb) {
                              L3: {
                                if (!param1) {
                                  break L3;
                                } else {
                                  if (!var13.field_Fb) {
                                    break L3;
                                  } else {
                                    this.field_f.a((byte) -123, 0, gl.a((byte) 127, sb.field_c, new String[]{var5}));
                                    this.field_f.a((byte) -98, 1, gl.a((byte) 116, aja.field_G, new String[]{var5}));
                                    return;
                                  }
                                }
                              }
                              this.field_f.a((byte) -112, 0, gl.a((byte) 98, uh.field_i, new String[]{var5}));
                              return;
                            } else {
                              this.field_f.a((byte) -79, 1, gl.a((byte) 126, oea.field_g, new String[]{var5}));
                              return;
                            }
                          }
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

    final void c(int param0) {
        String var2;
        gqa var3;
        String var4;
        L0: {
          if (this.field_i == null) {
            break L0;
          } else {
            if (this.field_g == rb.field_r) {
              break L0;
            } else {
              var4 = this.b(-13);
              var2 = var4;
              this.field_f.a((byte) -81, 17, gl.a((byte) 122, vj.field_c, new String[]{var4}));
              break L0;
            }
          }
        }
        if (param0 != 0) {
          var3 = (gqa) null;
          this.a((gqa) null, -104);
          return;
        } else {
          return;
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        if (param2 >= 93) {
          if (-18 == (param1 ^ -1)) {
            fj.field_c = new wla(this.field_h.field_q, this.field_h.field_A, this.field_h.field_G, this.field_h.field_t, param0, lma.field_r, oba.field_f, cga.field_g, kua.field_i, kt.field_F, dja.field_p, this.field_i, this.field_g);
            return true;
          } else {
            return false;
          }
        } else {
          field_a = (String) null;
          if (-18 == (param1 ^ -1)) {
            fj.field_c = new wla(this.field_h.field_q, this.field_h.field_A, this.field_h.field_G, this.field_h.field_t, param0, lma.field_r, oba.field_f, cga.field_g, kua.field_i, kt.field_F, dja.field_p, this.field_i, this.field_g);
            return true;
          } else {
            return false;
          }
        }
    }

    lja(jea param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
            this.field_f = new ola(eq.field_n);
            this.field_i = param2;
            this.field_h = param0;
            this.field_b = param5;
            param0.field_cb = true;
            this.field_e = param6;
            this.field_g = param1;
            this.field_k = param4;
            this.field_d = param3;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = false;
        field_j = new fp();
        field_a = "That treasure's valuable, but heavy, so it'll slow you down. Drop it using <img=8><img=9> if you need to.";
    }
}
