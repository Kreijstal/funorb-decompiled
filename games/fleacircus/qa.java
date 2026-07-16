/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class qa extends lh {
    boolean field_x;
    static int field_k;
    kd field_s;
    int field_u;
    int field_v;
    ch field_p;
    int field_r;
    static bi field_l;
    ne field_w;
    int field_n;
    static String field_o;
    int field_z;
    int field_j;
    int field_y;
    String field_i;
    String field_m;
    static String field_q;
    static String field_t;

    void a(int param0, int param1, int param2, int param3, int param4) {
        ((qa) this).field_z = param2;
        ((qa) this).field_j = param3;
        if (param4 != 80) {
          field_k = 51;
          ((qa) this).field_u = param1;
          ((qa) this).field_y = param0;
          return;
        } else {
          ((qa) this).field_u = param1;
          ((qa) this).field_y = param0;
          return;
        }
    }

    final boolean a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        int var5 = 0;
        var5 = 122 % ((8 - param1) / 54);
        if (param0.containsKey(this)) {
          StringBuilder discarded$4 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
          return false;
        } else {
          Object discarded$5 = param0.put(this, this);
          return true;
        }
    }

    public static void d(int param0) {
        field_o = null;
        field_t = null;
        field_q = null;
        field_l = null;
        if (param0 != 0) {
            field_q = null;
        }
    }

    public final String toString() {
        return ((qa) this).a(new StringBuilder(), new Hashtable(), 0, -83).toString();
    }

    StringBuilder a(StringBuilder param0, Hashtable param1, int param2, int param3) {
        if (param3 >= -47) {
          return null;
        } else {
          L0: {
            if (((qa) this).a(param1, 108, param0, param2)) {
              ((qa) this).a(param2, 95, param0, param1);
              break L0;
            } else {
              break L0;
            }
          }
          return param0;
        }
    }

    boolean a(qa param0, int param1) {
        if (param1 > -26) {
            return false;
        }
        return false;
    }

    void a(int param0, int param1, qa param2, byte param3) {
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        if (param3 < -85) {
          L0: {
            var5 = ((qa) this).b(param0, param1, 0, ag.field_f, kc.field_b) ? 1 : 0;
            if (var5 != 0) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            stackOut_5_0 = stackIn_5_0;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (((qa) this).field_x) {
              stackOut_7_0 = stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L1;
            } else {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L1;
            }
          }
          if (stackIn_8_0 != stackIn_8_1) {
            L2: {
              stackOut_10_0 = this;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (var5 == 0) {
                stackOut_12_0 = this;
                stackOut_12_1 = 0;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L2;
              } else {
                stackOut_11_0 = this;
                stackOut_11_1 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L2;
              }
            }
            ((qa) this).field_x = stackIn_13_1 != 0;
            if (null != ((qa) this).field_s) {
              if (!(((qa) this).field_s instanceof mb)) {
                return;
              } else {
                ((mb) (Object) ((qa) this).field_s).a(-12999, var5 != 0, (qa) this);
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

    boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        L0: {
          if (((qa) this).b(param0, param6, 0, param4, param2)) {
            ((qa) this).field_v = param5;
            break L0;
          } else {
            break L0;
          }
        }
        if (!param1) {
          ((qa) this).field_p = null;
          return false;
        } else {
          return false;
        }
    }

    final static void a(byte param0, int param1) {
        try {
            try {
                Object discarded$0 = eb.a("resizing", new Object[1], -11745, rl.a((byte) -116));
            } catch (Throwable throwable) {
            }
            int var2 = -46 % ((43 - param0) / 61);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        pk var6 = null;
        int var7 = 0;
        var7 = fleas.field_A ? 1 : 0;
        ((qa) this).a(param0, param3, (qa) this, (byte) -111);
        var5 = ((qa) this).e(1) ? 1 : 0;
        if (!param2) {
          L0: {
            if (var5 == 0) {
              break L0;
            } else {
              if (-1 == (jk.field_r ^ -1)) {
                break L0;
              } else {
                ((qa) this).f(-1);
                ta.field_u = kc.field_f;
                if (param1 >= 38) {
                  df.a(0, ((qa) this).g(4));
                  return param2;
                } else {
                  return false;
                }
              }
            }
          }
          ta.field_u = kc.field_f;
          if (param1 >= 38) {
            df.a(0, ((qa) this).g(4));
            return param2;
          } else {
            return false;
          }
        } else {
          if (-1 != (al.field_f ^ -1)) {
            if (var5 != 0) {
              L1: {
                boolean discarded$1 = ((qa) this).a(param0, (qa) this, kc.field_b, -31628, ag.field_f, param3, al.field_f);
                if (jk.field_r == 0) {
                  break L1;
                } else {
                  if (((qa) this).a(param0, true, ob.field_e, (qa) this, pb.field_d, jk.field_r, param3)) {
                    param2 = false;
                    break L1;
                  } else {
                    if (var5 == 0) {
                      break L1;
                    } else {
                      ((qa) this).f(-1);
                      if (var7 == 0) {
                        break L1;
                      } else {
                        L2: {
                          param2 = false;
                          if (0 != kc.field_f) {
                            break L2;
                          } else {
                            if (ta.field_u != 0) {
                              L3: {
                                ((qa) this).a((byte) 5, (qa) this, param3, ag.field_f, kc.field_b, param0);
                                var6 = wi.field_e;
                                if (var6 != null) {
                                  L4: {
                                    if (var6.field_s instanceof vd) {
                                      ((vd) (Object) var6.field_s).a(var6, (qj) null, (byte) -46);
                                      break L4;
                                    } else {
                                      break L4;
                                    }
                                  }
                                  wi.field_e = null;
                                  break L3;
                                } else {
                                  break L3;
                                }
                              }
                              if (var7 == 0) {
                                break L2;
                              } else {
                                if (-1 == (jk.field_r ^ -1)) {
                                  break L2;
                                } else {
                                  ((qa) this).f(-1);
                                  break L2;
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        ta.field_u = kc.field_f;
                        if (param1 >= 38) {
                          df.a(0, ((qa) this).g(4));
                          return param2;
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                }
              }
              if (0 == kc.field_f) {
                if (ta.field_u != 0) {
                  L5: {
                    ((qa) this).a((byte) 5, (qa) this, param3, ag.field_f, kc.field_b, param0);
                    var6 = wi.field_e;
                    if (var6 != null) {
                      L6: {
                        if (var6.field_s instanceof vd) {
                          ((vd) (Object) var6.field_s).a(var6, (qj) null, (byte) -46);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      wi.field_e = null;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L7: {
                    if (var7 == 0) {
                      break L7;
                    } else {
                      if (var5 == 0) {
                        break L7;
                      } else {
                        if (-1 == (jk.field_r ^ -1)) {
                          break L7;
                        } else {
                          ((qa) this).f(-1);
                          ta.field_u = kc.field_f;
                          if (param1 >= 38) {
                            df.a(0, ((qa) this).g(4));
                            return param2;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  }
                  ta.field_u = kc.field_f;
                  if (param1 >= 38) {
                    df.a(0, ((qa) this).g(4));
                    return param2;
                  } else {
                    return false;
                  }
                } else {
                  ta.field_u = kc.field_f;
                  if (param1 >= 38) {
                    df.a(0, ((qa) this).g(4));
                    return param2;
                  } else {
                    return false;
                  }
                }
              } else {
                ta.field_u = kc.field_f;
                if (param1 >= 38) {
                  df.a(0, ((qa) this).g(4));
                  return param2;
                } else {
                  return false;
                }
              }
            } else {
              L8: {
                if (jk.field_r == 0) {
                  break L8;
                } else {
                  if (((qa) this).a(param0, true, ob.field_e, (qa) this, pb.field_d, jk.field_r, param3)) {
                    param2 = false;
                    break L8;
                  } else {
                    if (var5 == 0) {
                      break L8;
                    } else {
                      ((qa) this).f(-1);
                      if (var7 == 0) {
                        break L8;
                      } else {
                        L9: {
                          param2 = false;
                          if (0 != kc.field_f) {
                            break L9;
                          } else {
                            if (ta.field_u != 0) {
                              L10: {
                                ((qa) this).a((byte) 5, (qa) this, param3, ag.field_f, kc.field_b, param0);
                                var6 = wi.field_e;
                                if (var6 != null) {
                                  L11: {
                                    if (var6.field_s instanceof vd) {
                                      ((vd) (Object) var6.field_s).a(var6, (qj) null, (byte) -46);
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  wi.field_e = null;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              if (var7 == 0) {
                                break L9;
                              } else {
                                if (-1 == (jk.field_r ^ -1)) {
                                  break L9;
                                } else {
                                  ((qa) this).f(-1);
                                  ta.field_u = kc.field_f;
                                  if (param1 < 38) {
                                    return false;
                                  } else {
                                    df.a(0, ((qa) this).g(4));
                                    return param2;
                                  }
                                }
                              }
                            } else {
                              ta.field_u = kc.field_f;
                              if (param1 < 38) {
                                return false;
                              } else {
                                df.a(0, ((qa) this).g(4));
                                return param2;
                              }
                            }
                          }
                        }
                        ta.field_u = kc.field_f;
                        if (param1 < 38) {
                          return false;
                        } else {
                          df.a(0, ((qa) this).g(4));
                          return param2;
                        }
                      }
                    }
                  }
                }
              }
              L12: {
                if (0 != kc.field_f) {
                  break L12;
                } else {
                  if (ta.field_u != 0) {
                    L13: {
                      ((qa) this).a((byte) 5, (qa) this, param3, ag.field_f, kc.field_b, param0);
                      var6 = wi.field_e;
                      if (var6 != null) {
                        L14: {
                          if (var6.field_s instanceof vd) {
                            ((vd) (Object) var6.field_s).a(var6, (qj) null, (byte) -46);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        wi.field_e = null;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    if (var7 == 0) {
                      break L12;
                    } else {
                      if (var5 == 0) {
                        break L12;
                      } else {
                        if (-1 == (jk.field_r ^ -1)) {
                          break L12;
                        } else {
                          ((qa) this).f(-1);
                          ta.field_u = kc.field_f;
                          if (param1 >= 38) {
                            df.a(0, ((qa) this).g(4));
                            return param2;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  } else {
                    ta.field_u = kc.field_f;
                    if (param1 < 38) {
                      return false;
                    } else {
                      df.a(0, ((qa) this).g(4));
                      return param2;
                    }
                  }
                }
              }
              ta.field_u = kc.field_f;
              if (param1 >= 38) {
                df.a(0, ((qa) this).g(4));
                return param2;
              } else {
                return false;
              }
            }
          } else {
            L15: {
              if (jk.field_r == 0) {
                break L15;
              } else {
                if (((qa) this).a(param0, true, ob.field_e, (qa) this, pb.field_d, jk.field_r, param3)) {
                  param2 = false;
                  break L15;
                } else {
                  if (var5 == 0) {
                    break L15;
                  } else {
                    ((qa) this).f(-1);
                    if (var7 == 0) {
                      break L15;
                    } else {
                      L16: {
                        param2 = false;
                        if (0 != kc.field_f) {
                          break L16;
                        } else {
                          if (ta.field_u != 0) {
                            L17: {
                              ((qa) this).a((byte) 5, (qa) this, param3, ag.field_f, kc.field_b, param0);
                              var6 = wi.field_e;
                              if (var6 != null) {
                                L18: {
                                  if (var6.field_s instanceof vd) {
                                    ((vd) (Object) var6.field_s).a(var6, (qj) null, (byte) -46);
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                                wi.field_e = null;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            if (var7 == 0) {
                              break L16;
                            } else {
                              if (-1 == (jk.field_r ^ -1)) {
                                break L16;
                              } else {
                                ((qa) this).f(-1);
                                break L16;
                              }
                            }
                          } else {
                            break L16;
                          }
                        }
                      }
                      ta.field_u = kc.field_f;
                      if (param1 < 38) {
                        return false;
                      } else {
                        df.a(0, ((qa) this).g(4));
                        return param2;
                      }
                    }
                  }
                }
              }
            }
            L19: {
              if (0 != kc.field_f) {
                break L19;
              } else {
                if (ta.field_u != 0) {
                  L20: {
                    ((qa) this).a((byte) 5, (qa) this, param3, ag.field_f, kc.field_b, param0);
                    var6 = wi.field_e;
                    if (var6 != null) {
                      L21: {
                        if (var6.field_s instanceof vd) {
                          ((vd) (Object) var6.field_s).a(var6, (qj) null, (byte) -46);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      wi.field_e = null;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  if (var7 == 0) {
                    break L19;
                  } else {
                    if (var5 == 0) {
                      break L19;
                    } else {
                      if (-1 == (jk.field_r ^ -1)) {
                        break L19;
                      } else {
                        ((qa) this).f(-1);
                        ta.field_u = kc.field_f;
                        if (param1 < 38) {
                          return false;
                        } else {
                          df.a(0, ((qa) this).g(4));
                          return param2;
                        }
                      }
                    }
                  }
                } else {
                  ta.field_u = kc.field_f;
                  if (param1 < 38) {
                    return false;
                  } else {
                    df.a(0, ((qa) this).g(4));
                    return param2;
                  }
                }
              }
            }
            ta.field_u = kc.field_f;
            if (param1 < 38) {
              return false;
            } else {
              df.a(0, ((qa) this).g(4));
              return param2;
            }
          }
        }
    }

    void f(int param0) {
        if (param0 != -1) {
            ((qa) this).field_m = null;
        }
    }

    final static dd h(int param0) {
        int var1 = 0;
        byte[] var2 = null;
        int[] var3 = null;
        int var4_int = 0;
        dd var4 = null;
        int var5 = 0;
        var5 = fleas.field_A ? 1 : 0;
        var1 = ob.field_a[0] * ij.field_H[0];
        var2 = of.field_d[0];
        var3 = new int[var1];
        var4_int = 0;
        L0: while (true) {
          L1: {
            if (var1 <= var4_int) {
              break L1;
            } else {
              var3[var4_int] = rd.field_d[sc.a((int) var2[var4_int], 255)];
              var4_int++;
              if (var5 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var4 = new dd(e.field_e, uf.field_k, vg.field_I[0], b.field_b[0], ij.field_H[0], ob.field_a[0], var3);
          c.o(-28210);
          if (param0 <= 75) {
            field_t = null;
            return var4;
          } else {
            return var4;
          }
        }
    }

    String g(int param0) {
        if (param0 == 4) {
          if (!((qa) this).field_x) {
            return null;
          } else {
            return ((qa) this).field_m;
          }
        } else {
          boolean discarded$9 = ((qa) this).a('P', (byte) 48, 41);
          if (!((qa) this).field_x) {
            return null;
          } else {
            return ((qa) this).field_m;
          }
        }
    }

    qa(String param0, kd param1) {
        this(param0, nf.field_M.field_i, param1);
    }

    final void a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = fleas.field_A ? 1 : 0;
        StringBuilder discarded$26 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((qa) this).field_y).append(",").append(((qa) this).field_z).append(" ").append(((qa) this).field_u).append("x").append(((qa) this).field_j);
        if (null == ((qa) this).field_i) {
          L0: {
            if (((qa) this).field_x) {
              StringBuilder discarded$27 = param2.append(" mouseover");
              break L0;
            } else {
              break L0;
            }
          }
          if (!((qa) this).e(1)) {
            L1: {
              if (((qa) this).field_p == null) {
                break L1;
              } else {
                L2: {
                  StringBuilder discarded$28 = param2.append(" renderer=");
                  if (!(((qa) this).field_p instanceof qa)) {
                    break L2;
                  } else {
                    param2 = ((qa) this).a(param2, param3, param0 - -1, -71);
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  StringBuilder discarded$29 = param2.append(((qa) this).field_p);
                  var5 = 27 / ((param1 - 36) / 46);
                  if (null != ((qa) this).field_s) {
                    StringBuilder discarded$30 = param2.append(" listener=");
                    if (((qa) this).field_s instanceof qa) {
                      param2 = ((qa) this).a(param2, param3, 1 + param0, -110);
                      break L3;
                    } else {
                      StringBuilder discarded$31 = param2.append(((qa) this).field_s);
                      param2 = ((qa) this).a(param2, param3, 1 + param0, -110);
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                return;
              }
            }
            var5 = 27 / ((param1 - 36) / 46);
            if (null != ((qa) this).field_s) {
              StringBuilder discarded$32 = param2.append(" listener=");
              if (!(((qa) this).field_s instanceof qa)) {
                StringBuilder discarded$33 = param2.append(((qa) this).field_s);
                if (var6 != 0) {
                  param2 = ((qa) this).a(param2, param3, 1 + param0, -110);
                  return;
                } else {
                  return;
                }
              } else {
                param2 = ((qa) this).a(param2, param3, 1 + param0, -110);
                return;
              }
            } else {
              return;
            }
          } else {
            L4: {
              StringBuilder discarded$34 = param2.append(" focused");
              if (((qa) this).field_p == null) {
                break L4;
              } else {
                L5: {
                  StringBuilder discarded$35 = param2.append(" renderer=");
                  if (!(((qa) this).field_p instanceof qa)) {
                    break L5;
                  } else {
                    param2 = ((qa) this).a(param2, param3, param0 - -1, -71);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                StringBuilder discarded$36 = param2.append(((qa) this).field_p);
                break L4;
              }
            }
            L6: {
              var5 = 27 / ((param1 - 36) / 46);
              if (null != ((qa) this).field_s) {
                StringBuilder discarded$37 = param2.append(" listener=");
                if (((qa) this).field_s instanceof qa) {
                  param2 = ((qa) this).a(param2, param3, 1 + param0, -110);
                  break L6;
                } else {
                  StringBuilder discarded$38 = param2.append(((qa) this).field_s);
                  if (var6 == 0) {
                    break L6;
                  } else {
                    param2 = ((qa) this).a(param2, param3, 1 + param0, -110);
                    break L6;
                  }
                }
              } else {
                break L6;
              }
            }
            return;
          }
        } else {
          L7: {
            StringBuilder discarded$39 = param2.append(" text=\"").append(((qa) this).field_i).append(34);
            if (((qa) this).field_x) {
              StringBuilder discarded$40 = param2.append(" mouseover");
              break L7;
            } else {
              break L7;
            }
          }
          if (((qa) this).e(1)) {
            StringBuilder discarded$41 = param2.append(" focused");
            if (((qa) this).field_p == null) {
              L8: {
                var5 = 27 / ((param1 - 36) / 46);
                if (null != ((qa) this).field_s) {
                  StringBuilder discarded$42 = param2.append(" listener=");
                  if (((qa) this).field_s instanceof qa) {
                    param2 = ((qa) this).a(param2, param3, 1 + param0, -110);
                    break L8;
                  } else {
                    StringBuilder discarded$43 = param2.append(((qa) this).field_s);
                    if (var6 == 0) {
                      break L8;
                    } else {
                      param2 = ((qa) this).a(param2, param3, 1 + param0, -110);
                      break L8;
                    }
                  }
                } else {
                  break L8;
                }
              }
              return;
            } else {
              L9: {
                L10: {
                  StringBuilder discarded$44 = param2.append(" renderer=");
                  if (!(((qa) this).field_p instanceof qa)) {
                    break L10;
                  } else {
                    param2 = ((qa) this).a(param2, param3, param0 - -1, -71);
                    if (var6 == 0) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                StringBuilder discarded$45 = param2.append(((qa) this).field_p);
                break L9;
              }
              L11: {
                var5 = 27 / ((param1 - 36) / 46);
                if (null != ((qa) this).field_s) {
                  StringBuilder discarded$46 = param2.append(" listener=");
                  if (((qa) this).field_s instanceof qa) {
                    param2 = ((qa) this).a(param2, param3, 1 + param0, -110);
                    break L11;
                  } else {
                    StringBuilder discarded$47 = param2.append(((qa) this).field_s);
                    if (var6 == 0) {
                      break L11;
                    } else {
                      param2 = ((qa) this).a(param2, param3, 1 + param0, -110);
                      break L11;
                    }
                  }
                } else {
                  break L11;
                }
              }
              return;
            }
          } else {
            L12: {
              if (((qa) this).field_p == null) {
                break L12;
              } else {
                L13: {
                  StringBuilder discarded$48 = param2.append(" renderer=");
                  if (!(((qa) this).field_p instanceof qa)) {
                    break L13;
                  } else {
                    param2 = ((qa) this).a(param2, param3, param0 - -1, -71);
                    if (var6 == 0) {
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                StringBuilder discarded$49 = param2.append(((qa) this).field_p);
                break L12;
              }
            }
            L14: {
              var5 = 27 / ((param1 - 36) / 46);
              if (null != ((qa) this).field_s) {
                StringBuilder discarded$50 = param2.append(" listener=");
                if (((qa) this).field_s instanceof qa) {
                  param2 = ((qa) this).a(param2, param3, 1 + param0, -110);
                  break L14;
                } else {
                  StringBuilder discarded$51 = param2.append(((qa) this).field_s);
                  if (var6 == 0) {
                    break L14;
                  } else {
                    param2 = ((qa) this).a(param2, param3, 1 + param0, -110);
                    break L14;
                  }
                }
              } else {
                break L14;
              }
            }
            return;
          }
        }
    }

    final void b(boolean param0) {
        ((qa) this).a(((qa) this).field_y, ((qa) this).field_u, ((qa) this).field_z, ((qa) this).field_j, 80);
        if (param0) {
            String discarded$0 = ((qa) this).g(-71);
        }
    }

    void b(int param0, int param1, boolean param2, int param3) {
        if (param2) {
          if (0 == param3) {
            if (null == ((qa) this).field_p) {
              return;
            } else {
              ((qa) this).field_p.a(-96, param1, true, (qa) this, param0);
              return;
            }
          } else {
            return;
          }
        } else {
          field_o = null;
          if (0 != param3) {
            return;
          } else {
            L0: {
              if (null != ((qa) this).field_p) {
                ((qa) this).field_p.a(-96, param1, true, (qa) this, param0);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    int c(byte param0) {
        if (param0 != 8) {
            field_o = null;
            return 0;
        }
        return 0;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = fleas.field_A ? 1 : 0;
        var4 = ((qa) this).c((byte) 8);
        var5_int = param0;
        L0: while (true) {
          L1: {
            if (var4 < var5_int) {
              break L1;
            } else {
              ((qa) this).b(param1, param2, true, var5_int);
              var5_int++;
              if (var6 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            var5 = oe.a(param0 ^ 19007);
            if (var5 != null) {
              nf.field_M.a(param0 + 13421772, aa.field_t, var5, gg.field_f);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    boolean a(int param0, int param1, qa param2, char param3) {
        if (param0 != -2) {
            ((qa) this).a(46, -115, (StringBuilder) null, (Hashtable) null);
            return false;
        }
        return false;
    }

    void a(byte param0, qa param1, int param2, int param3, int param4, int param5) {
        ((qa) this).field_v = 0;
        if (param0 != 5) {
            qa.d(-24);
        }
    }

    final boolean a(char param0, byte param1, int param2) {
        int var4 = 0;
        if (param1 <= -15) {
          if (((qa) this).e(1)) {
            if (!((qa) this).a(-2, param2, (qa) this, param0)) {
              var4 = param2;
              if (80 == var4) {
                return ((qa) this).a((qa) this, -124);
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            var4 = param2;
            if (80 == var4) {
              return ((qa) this).a((qa) this, -124);
            } else {
              return false;
            }
          }
        } else {
          dd discarded$5 = qa.h(111);
          if (((qa) this).e(1)) {
            if (!((qa) this).a(-2, param2, (qa) this, param0)) {
              var4 = param2;
              if (80 == var4) {
                return ((qa) this).a((qa) this, -124);
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            var4 = param2;
            if (80 == var4) {
              return ((qa) this).a((qa) this, -124);
            } else {
              return false;
            }
          }
        }
    }

    boolean a(int param0, qa param1, int param2, int param3, int param4, int param5, int param6) {
        if (param3 != -31628) {
            return false;
        }
        return false;
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        if (param2 == 0) {
          if (param1 - -((qa) this).field_y <= param3) {
            if (param4 >= param0 + ((qa) this).field_z) {
              if (((qa) this).field_u + param1 - -((qa) this).field_y > param3) {
                if (((qa) this).field_j + param0 + ((qa) this).field_z <= param4) {
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
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    protected qa() {
        ((qa) this).field_n = 0;
        ((qa) this).field_r = 0;
    }

    qa(String param0, ch param1, kd param2) {
        eg var4 = null;
        ((qa) this).field_n = 0;
        ((qa) this).field_r = 0;
        ((qa) this).field_s = param2;
        ((qa) this).field_i = param0;
        ((qa) this).field_p = param1;
        if (((qa) this).field_p instanceof eg) {
            var4 = (eg) (Object) ((qa) this).field_p;
            ((qa) this).field_u = var4.a(-110, (qa) this);
            ((qa) this).field_j = var4.b(-101, (qa) this);
        }
    }

    qa(int param0, int param1, int param2, int param3, ch param4, kd param5) {
        ((qa) this).field_n = 0;
        ((qa) this).field_r = 0;
        ((qa) this).field_j = param3;
        ((qa) this).field_y = param0;
        ((qa) this).field_p = param4;
        ((qa) this).field_s = param5;
        ((qa) this).field_u = param2;
        ((qa) this).field_z = param1;
    }

    boolean e(int param0) {
        if (param0 != 1) {
            boolean discarded$0 = ((qa) this).a(-97, -125, (qa) null, 'ﾹ');
            return false;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "<%0>Slopes:<%1> Fleas can climb these.";
        field_k = 4;
        field_q = "They can only be placed on empty squares.";
        field_t = "Passwords can only contain letters and numbers";
    }
}
