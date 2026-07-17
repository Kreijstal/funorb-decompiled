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
        Object var3 = null;
        if (param0 == 13) {
          if (((lja) this).field_f != null) {
            if (!((lja) this).field_f.f(param0 ^ -13)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          var3 = null;
          ((lja) this).a((gqa) null, -72);
          if (((lja) this).field_f != null) {
            if (!((lja) this).field_f.f(param0 ^ -13)) {
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
            return null;
        }
        if (((lja) this).field_d == null) {
            var2 = ((lja) this).field_i;
        } else {
            var2 = ((lja) this).field_d;
        }
        return var2;
    }

    final void a(boolean param0, boolean param1) {
        if (!param0) {
            ((lja) this).field_g = -102L;
            ((lja) this).field_f.b(44, param1);
            return;
        }
        ((lja) this).field_f.b(44, param1);
    }

    final void a(byte param0) {
        String var3 = null;
        int var4 = 0;
        ht var5 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        if (null == uu.field_a) {
          var5 = av.a(((lja) this).field_k, 0);
          if (var5 != null) {
            var3 = var5.field_tb;
            if (var5.field_gc) {
              ((lja) this).field_f.a((byte) -102, 2, gl.a((byte) 114, pba.field_d, new String[1]));
              ((lja) this).field_f.a((byte) -104, 3, gl.a((byte) 123, cp.field_i, new String[1]));
              if (param0 <= -10) {
                return;
              } else {
                ((lja) this).field_e = null;
                return;
              }
            } else {
              if (var5.field_Bb) {
                ((lja) this).field_f.a((byte) -76, 2, gl.a((byte) 106, mna.field_b, new String[1]));
                if (var5.field_Sb) {
                  ((lja) this).field_f.a((byte) -102, 3, gl.a((byte) 86, kna.field_B, new String[1]));
                  if (param0 <= -10) {
                    return;
                  } else {
                    ((lja) this).field_e = null;
                    return;
                  }
                } else {
                  if (param0 <= -10) {
                    return;
                  } else {
                    ((lja) this).field_e = null;
                    return;
                  }
                }
              } else {
                if (!var5.field_Sb) {
                  if (var5.field_Yb) {
                    if (var5.field_ec) {
                      if (!var5.field_Bb) {
                        if (var5.field_Sb) {
                          ((lja) this).field_f.a((byte) -102, 3, gl.a((byte) 86, kna.field_B, new String[1]));
                          if (param0 <= -10) {
                            return;
                          } else {
                            ((lja) this).field_e = null;
                            return;
                          }
                        } else {
                          if (param0 <= -10) {
                            return;
                          } else {
                            ((lja) this).field_e = null;
                            return;
                          }
                        }
                      } else {
                        ((lja) this).field_f.a((byte) -125, 2, gl.a((byte) 91, di.field_h, new String[1]));
                        if (var5.field_Sb) {
                          ((lja) this).field_f.a((byte) -102, 3, gl.a((byte) 86, kna.field_B, new String[1]));
                          if (param0 <= -10) {
                            return;
                          } else {
                            ((lja) this).field_e = null;
                            return;
                          }
                        } else {
                          if (param0 <= -10) {
                            return;
                          } else {
                            ((lja) this).field_e = null;
                            return;
                          }
                        }
                      }
                    } else {
                      ((lja) this).field_f.a((byte) -125, 2, gl.a((byte) 91, di.field_h, new String[1]));
                      if (var5.field_Sb) {
                        ((lja) this).field_f.a((byte) -102, 3, gl.a((byte) 86, kna.field_B, new String[1]));
                        if (param0 > -10) {
                          ((lja) this).field_e = null;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (param0 > -10) {
                          ((lja) this).field_e = null;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    if (var5.field_Sb) {
                      ((lja) this).field_f.a((byte) -102, 3, gl.a((byte) 86, kna.field_B, new String[1]));
                      if (param0 > -10) {
                        ((lja) this).field_e = null;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (param0 > -10) {
                        ((lja) this).field_e = null;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if (var5.field_Sb) {
                    ((lja) this).field_f.a((byte) -102, 3, gl.a((byte) 86, kna.field_B, new String[1]));
                    if (param0 > -10) {
                      ((lja) this).field_e = null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (param0 > -10) {
                      ((lja) this).field_e = null;
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
              ((lja) this).field_e = null;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 > -10) {
            ((lja) this).field_e = null;
            return;
          } else {
            return;
          }
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = ((lja) this).field_f.d(0, param0);
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
        Object var4 = null;
        String var4_ref = null;
        Object var5 = null;
        var4 = null;
        if (4 == param0) {
          var4_ref = rf.a(true, ((lja) this).field_i, param2);
          if (var4_ref == null) {
            if (param1 != -121) {
              return false;
            } else {
              return true;
            }
          } else {
            var5 = null;
            gu.a(0, true, ((lja) this).field_i, var4_ref, (String) null, 2);
            if (param1 != -121) {
              return false;
            } else {
              return true;
            }
          }
        } else {
          if (param0 == 5) {
            var4_ref = uca.a(((lja) this).field_i, (byte) 102, param2);
            if (var4_ref == null) {
              if (param1 != -121) {
                return false;
              } else {
                return true;
              }
            } else {
              var5 = null;
              gu.a(0, true, ((lja) this).field_i, var4_ref, (String) null, 2);
              if (param1 != -121) {
                return false;
              } else {
                return true;
              }
            }
          } else {
            if (param0 == 6) {
              var4_ref = nna.a(-3, ((lja) this).field_i, param2);
              if (var4_ref != null) {
                var5 = null;
                gu.a(0, true, ((lja) this).field_i, var4_ref, (String) null, 2);
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
                var4_ref = kc.a(((lja) this).field_i, param2, false, ((lja) this).field_d);
                if (var4_ref != null) {
                  var5 = null;
                  gu.a(0, true, ((lja) this).field_i, var4_ref, (String) null, 2);
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
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param1 != 0) {
          if (param1 == 1) {
            fn.a(param2, ((lja) this).field_g, -120);
            if (param0 == -18) {
              return true;
            } else {
              field_j = null;
              return true;
            }
          } else {
            if (param1 != 2) {
              if (param1 != 3) {
                if (param1 != 10) {
                  if (param1 != 15) {
                    if (param1 == 16) {
                      cua.a(0, 3, param2);
                      if (param0 == -18) {
                        return true;
                      } else {
                        field_j = null;
                        return true;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    cua.a(((lja) this).field_k, param0 + 21, param2);
                    if (param0 == -18) {
                      return true;
                    } else {
                      field_j = null;
                      return true;
                    }
                  }
                } else {
                  kw.a(param2, false, ((lja) this).field_k);
                  if (param0 != -18) {
                    field_j = null;
                    return true;
                  } else {
                    return true;
                  }
                }
              } else {
                et.a(param2, 30, ((lja) this).field_k);
                if (param0 != -18) {
                  field_j = null;
                  return true;
                } else {
                  return true;
                }
              }
            } else {
              q.a((byte) -123, param2, ((lja) this).field_k);
              if (param0 == -18) {
                return true;
              } else {
                field_j = null;
                return true;
              }
            }
          }
        } else {
          fv.a((byte) -38, param2, ((lja) this).field_g);
          if (param0 == -18) {
            return true;
          } else {
            field_j = null;
            return true;
          }
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param1 != -39) {
          lja.b((byte) 36);
          if (param0 == 8) {
            no.a(((lja) this).field_i, ((lja) this).field_g, (byte) 120);
            return true;
          } else {
            if (param0 == 18) {
              fs.a((byte) 123, ((lja) this).field_g, ((lja) this).field_i);
              return true;
            } else {
              if (param0 == 11) {
                loa.a(((lja) this).field_b, param2, (byte) 108, 0);
                return true;
              } else {
                if (param0 == 12) {
                  loa.a(((lja) this).field_b, param2, (byte) 108, 1);
                  return true;
                } else {
                  if (param0 != 13) {
                    if (param0 != 14) {
                      if (param0 != 20) {
                        if (19 == param0) {
                          boolean discarded$2 = eca.a((byte) 84, ((lja) this).field_b, ((lja) this).field_g, ((lja) this).field_e, ((lja) this).field_i);
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
                    loa.a(((lja) this).field_b, param2, (byte) 108, 2);
                    return true;
                  }
                }
              }
            }
          }
        } else {
          if (param0 == 8) {
            no.a(((lja) this).field_i, ((lja) this).field_g, (byte) 120);
            return true;
          } else {
            if (param0 == 18) {
              fs.a((byte) 123, ((lja) this).field_g, ((lja) this).field_i);
              return true;
            } else {
              if (param0 == 11) {
                loa.a(((lja) this).field_b, param2, (byte) 108, 0);
                return true;
              } else {
                if (param0 == 12) {
                  loa.a(((lja) this).field_b, param2, (byte) 108, 1);
                  return true;
                } else {
                  if (param0 != 13) {
                    if (param0 != 14) {
                      if (param0 != 20) {
                        if (19 == param0) {
                          boolean discarded$3 = eca.a((byte) 84, ((lja) this).field_b, ((lja) this).field_g, ((lja) this).field_e, ((lja) this).field_i);
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
                    loa.a(((lja) this).field_b, param2, (byte) 108, 2);
                    return true;
                  }
                }
              }
            }
          }
        }
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        mu var5 = null;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 19) {
                break L1;
              } else {
                ((lja) this).field_f = null;
                break L1;
              }
            }
            L2: {
              if (((lja) this).field_i == null) {
                break L2;
              } else {
                L3: {
                  if (rb.field_r != ((lja) this).field_g) {
                    break L3;
                  } else {
                    if (param1 != 2) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (ae.field_g == 2) {
                  L4: {
                    var7 = this.b(-13);
                    var4_ref = var7;
                    var5 = wp.a(127, ((lja) this).field_i);
                    var6 = qaa.a(2180, ((lja) this).field_i) ? 1 : 0;
                    if (var5 != null) {
                      break L4;
                    } else {
                      if (var6 == 0) {
                        ((lja) this).field_f.a((byte) -64, 4, gl.a((byte) 92, ao.field_m, new String[1]));
                        ((lja) this).field_f.a((byte) -70, 6, gl.a((byte) 127, mp.field_b, new String[1]));
                        if (param0 == null) {
                          break L4;
                        } else {
                          if (2 == param1) {
                            break L4;
                          } else {
                            if (!fua.field_g) {
                              ((lja) this).field_e = param0;
                              ((lja) this).field_f.a((byte) -90, 19, gl.a((byte) 119, gja.field_k, new String[1]));
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
                        if (ab.a(((lja) this).field_i, (byte) -50)) {
                          break L6;
                        } else {
                          if (fua.field_g) {
                            break L6;
                          } else {
                            L7: {
                              if (!ok.field_s) {
                                ((lja) this).field_f.a((byte) -77, 8, gl.a((byte) 114, fj.field_b, new String[1]));
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            ((lja) this).field_f.a((byte) -118, 18, gl.a((byte) 108, ob.field_f, new String[1]));
                            if (param0 == null) {
                              break L6;
                            } else {
                              ((lja) this).field_e = param0;
                              ((lja) this).field_f.a((byte) -71, 19, gl.a((byte) 96, gja.field_k, new String[1]));
                              break L6;
                            }
                          }
                        }
                      }
                      ((lja) this).field_f.a((byte) -104, 5, gl.a((byte) 90, dca.field_q, new String[1]));
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (var6 != 0) {
                    ((lja) this).field_f.a((byte) -87, 7, gl.a((byte) 120, vta.field_f, new String[1]));
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
            var4 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var4;
            stackOut_30_1 = new StringBuilder().append("lja.L(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(gqa param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (!param0.field_m) {
              L1: {
                ((lja) this).field_b = param0.field_d;
                if (param0.field_d != 0) {
                  break L1;
                } else {
                  L2: {
                    if (k.field_A != 0) {
                      break L2;
                    } else {
                      ((lja) this).field_f.a((byte) -66, 12, qe.field_b);
                      break L2;
                    }
                  }
                  ((lja) this).field_f.a((byte) -86, 13, pea.field_f);
                  break L1;
                }
              }
              L3: {
                if (1 == param0.field_d) {
                  L4: {
                    if (0 != nba.field_b) {
                      break L4;
                    } else {
                      ((lja) this).field_f.a((byte) -77, 12, jl.field_a);
                      break L4;
                    }
                  }
                  ((lja) this).field_f.a((byte) -82, 13, ot.field_w);
                  break L3;
                } else {
                  break L3;
                }
              }
              L5: {
                if (param0.field_d != 2) {
                  break L5;
                } else {
                  L6: {
                    if (caa.field_i != 0) {
                      break L6;
                    } else {
                      ((lja) this).field_f.a((byte) -93, 12, cva.field_e);
                      break L6;
                    }
                  }
                  ((lja) this).field_f.a((byte) -85, 13, tva.field_c);
                  break L5;
                }
              }
              if (param1 == 13) {
                break L0;
              } else {
                String discarded$2 = this.b(-106);
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
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("lja.B(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 41);
        }
    }

    final void a(byte param0, boolean param1) {
        pha var4 = null;
        String var5 = null;
        int var6 = 0;
        pha var13 = null;
        pha var14 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0 != -22) {
          field_c = false;
          if (((lja) this).field_i != null) {
            L0: {
              if (((lja) this).field_g == rb.field_r) {
                break L0;
              } else {
                if (null == uu.field_a) {
                  break L0;
                } else {
                  if (mka.b(8192)) {
                    var14 = nl.a(true, ((lja) this).field_g);
                    var4 = vba.a((byte) -40, ((lja) this).field_g);
                    var5 = this.b(-13);
                    if (var4 != null) {
                      if (!uu.field_a.field_ec) {
                        ((lja) this).field_f.a((byte) -74, 1, gl.a((byte) 108, lf.field_a, new String[1]));
                        return;
                      } else {
                        if (uu.field_a.field_Kb < 0) {
                          break L0;
                        } else {
                          ((lja) this).field_f.a((byte) -74, 1, gl.a((byte) 108, lf.field_a, new String[1]));
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
                                    ((lja) this).field_f.a((byte) -123, 0, gl.a((byte) 127, sb.field_c, new String[1]));
                                    ((lja) this).field_f.a((byte) -98, 1, gl.a((byte) 116, aja.field_G, new String[1]));
                                    return;
                                  }
                                }
                              }
                              ((lja) this).field_f.a((byte) -112, 0, gl.a((byte) 98, uh.field_i, new String[1]));
                              return;
                            } else {
                              ((lja) this).field_f.a((byte) -79, 1, gl.a((byte) 126, oea.field_g, new String[1]));
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
          if (((lja) this).field_i != null) {
            if (((lja) this).field_g != rb.field_r) {
              if (null != uu.field_a) {
                if (mka.b(8192)) {
                  L2: {
                    var13 = nl.a(true, ((lja) this).field_g);
                    var4 = vba.a((byte) -40, ((lja) this).field_g);
                    var5 = this.b(-13);
                    if (var4 != null) {
                      if (!uu.field_a.field_ec) {
                        ((lja) this).field_f.a((byte) -74, 1, gl.a((byte) 108, lf.field_a, new String[1]));
                        return;
                      } else {
                        if (uu.field_a.field_Kb < 0) {
                          break L2;
                        } else {
                          ((lja) this).field_f.a((byte) -74, 1, gl.a((byte) 108, lf.field_a, new String[1]));
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
                                    ((lja) this).field_f.a((byte) -123, 0, gl.a((byte) 127, sb.field_c, new String[1]));
                                    ((lja) this).field_f.a((byte) -98, 1, gl.a((byte) 116, aja.field_G, new String[1]));
                                    return;
                                  }
                                }
                              }
                              ((lja) this).field_f.a((byte) -112, 0, gl.a((byte) 98, uh.field_i, new String[1]));
                              return;
                            } else {
                              ((lja) this).field_f.a((byte) -79, 1, gl.a((byte) 126, oea.field_g, new String[1]));
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
        String var2 = null;
        Object var3 = null;
        String var4 = null;
        L0: {
          if (((lja) this).field_i == null) {
            break L0;
          } else {
            if (((lja) this).field_g == rb.field_r) {
              break L0;
            } else {
              var4 = this.b(-13);
              var2 = var4;
              ((lja) this).field_f.a((byte) -81, 17, gl.a((byte) 122, vj.field_c, new String[1]));
              break L0;
            }
          }
        }
        if (param0 != 0) {
          var3 = null;
          ((lja) this).a((gqa) null, -104);
          return;
        } else {
          return;
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        if (param1 == 17) {
          fj.field_c = new wla(((lja) this).field_h.field_q, ((lja) this).field_h.field_A, ((lja) this).field_h.field_G, ((lja) this).field_h.field_t, param0, lma.field_r, oba.field_f, cga.field_g, kua.field_i, kt.field_F, dja.field_p, ((lja) this).field_i, ((lja) this).field_g);
          return true;
        } else {
          return false;
        }
    }

    lja(jea param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
            ((lja) this).field_f = new ola(eq.field_n);
            ((lja) this).field_i = param2;
            ((lja) this).field_h = param0;
            ((lja) this).field_b = param5;
            param0.field_cb = true;
            ((lja) this).field_e = param6;
            ((lja) this).field_g = param1;
            ((lja) this).field_k = param4;
            ((lja) this).field_d = param3;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "lja.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_j = new fp();
        field_a = "That treasure's valuable, but heavy, so it'll slow you down. Drop it using <img=8><img=9> if you need to.";
    }
}
