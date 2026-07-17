/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ej implements Runnable {
    private le field_f;
    private sj field_b;
    private java.net.URL field_i;
    private int field_e;
    static oq field_j;
    private le field_a;
    private ge field_d;
    static String field_c;
    private DataInputStream field_h;
    static int field_g;
    private le field_k;
    static boolean field_l;

    final synchronized boolean a(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        IOException var3 = null;
        java.net.Socket var3_ref = null;
        OutputStream var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_54_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_53_0 = 0;
        try {
          L0: {
            if (((ej) this).field_e >= 2) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (((ej) this).field_e != 0) {
                  break L1;
                } else {
                  L2: {
                    if (((ej) this).field_a != null) {
                      break L2;
                    } else {
                      ((ej) this).field_a = ((ej) this).field_b.a(((ej) this).field_i, 1);
                      break L2;
                    }
                  }
                  if (((ej) this).field_a.field_f != 0) {
                    if (((ej) this).field_a.field_f != 1) {
                      ((ej) this).field_a = null;
                      ((ej) this).field_e = ((ej) this).field_e + 1;
                      stackOut_17_0 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0 != 0;
                    } else {
                      break L1;
                    }
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  }
                }
              }
              L3: {
                if (((ej) this).field_e != 1) {
                  break L3;
                } else {
                  L4: {
                    if (null != ((ej) this).field_k) {
                      break L4;
                    } else {
                      ((ej) this).field_k = ((ej) this).field_b.a(((ej) this).field_i.getHost(), 443, 0);
                      break L4;
                    }
                  }
                  if (((ej) this).field_k.field_f != 0) {
                    if (((ej) this).field_k.field_f == 1) {
                      break L3;
                    } else {
                      ((ej) this).field_e = ((ej) this).field_e + 1;
                      ((ej) this).field_k = null;
                      stackOut_29_0 = 0;
                      stackIn_30_0 = stackOut_29_0;
                      return stackIn_30_0 != 0;
                    }
                  } else {
                    stackOut_26_0 = 0;
                    stackIn_27_0 = stackOut_26_0;
                    return stackIn_27_0 != 0;
                  }
                }
              }
              L5: {
                var2_int = 25 % ((-61 - param0) / 46);
                if (null != ((ej) this).field_h) {
                  break L5;
                } else {
                  try {
                    L6: {
                      L7: {
                        if (0 == ((ej) this).field_e) {
                          ((ej) this).field_h = (DataInputStream) ((ej) this).field_a.field_e;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (1 != ((ej) this).field_e) {
                          break L8;
                        } else {
                          var3_ref = (java.net.Socket) ((ej) this).field_k.field_e;
                          var3_ref.setSoTimeout(10000);
                          var4 = var3_ref.getOutputStream();
                          var4.write(17);
                          var4.write(hi.a(-98, (CharSequence) (Object) ("JAGGRAB " + ((ej) this).field_i.getFile() + "\n\n")));
                          ((ej) this).field_h = new DataInputStream(var3_ref.getInputStream());
                          break L8;
                        }
                      }
                      ((ej) this).field_d.field_v = 0;
                      break L6;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L9: {
                      var3 = (IOException) (Object) decompiledCaughtException;
                      ((ej) this).finalize();
                      ((ej) this).field_e = ((ej) this).field_e + 1;
                      break L9;
                    }
                  }
                  break L5;
                }
              }
              L10: {
                if (null != ((ej) this).field_f) {
                  break L10;
                } else {
                  ((ej) this).field_f = ((ej) this).field_b.a(45, 5, (Runnable) this);
                  break L10;
                }
              }
              if (0 == ((ej) this).field_f.field_f) {
                stackOut_47_0 = 0;
                stackIn_48_0 = stackOut_47_0;
                return stackIn_48_0 != 0;
              } else {
                L11: {
                  if (((ej) this).field_f.field_f != 1) {
                    ((ej) this).finalize();
                    ((ej) this).field_e = ((ej) this).field_e + 1;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                stackOut_53_0 = 0;
                stackIn_54_0 = stackOut_53_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "ej.D(" + param0 + 41);
        }
        return stackIn_54_0 != 0;
    }

    final static void a(int param0, eg param1, int param2, boolean param3, int param4, int param5, int param6, int param7, eg param8, eg param9) {
        RuntimeException var10 = null;
        eg var10_ref = null;
        eg var11 = null;
        eg var12_ref_eg = null;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_189_0 = null;
        StringBuilder stackIn_189_1 = null;
        RuntimeException stackIn_191_0 = null;
        StringBuilder stackIn_191_1 = null;
        RuntimeException stackIn_192_0 = null;
        StringBuilder stackIn_192_1 = null;
        String stackIn_192_2 = null;
        RuntimeException stackIn_193_0 = null;
        StringBuilder stackIn_193_1 = null;
        RuntimeException stackIn_195_0 = null;
        StringBuilder stackIn_195_1 = null;
        RuntimeException stackIn_196_0 = null;
        StringBuilder stackIn_196_1 = null;
        String stackIn_196_2 = null;
        RuntimeException stackIn_197_0 = null;
        StringBuilder stackIn_197_1 = null;
        RuntimeException stackIn_199_0 = null;
        StringBuilder stackIn_199_1 = null;
        RuntimeException stackIn_200_0 = null;
        StringBuilder stackIn_200_1 = null;
        String stackIn_200_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_188_0 = null;
        StringBuilder stackOut_188_1 = null;
        RuntimeException stackOut_191_0 = null;
        StringBuilder stackOut_191_1 = null;
        String stackOut_191_2 = null;
        RuntimeException stackOut_189_0 = null;
        StringBuilder stackOut_189_1 = null;
        String stackOut_189_2 = null;
        RuntimeException stackOut_192_0 = null;
        StringBuilder stackOut_192_1 = null;
        RuntimeException stackOut_195_0 = null;
        StringBuilder stackOut_195_1 = null;
        String stackOut_195_2 = null;
        RuntimeException stackOut_193_0 = null;
        StringBuilder stackOut_193_1 = null;
        String stackOut_193_2 = null;
        RuntimeException stackOut_196_0 = null;
        StringBuilder stackOut_196_1 = null;
        RuntimeException stackOut_199_0 = null;
        StringBuilder stackOut_199_1 = null;
        String stackOut_199_2 = null;
        RuntimeException stackOut_197_0 = null;
        StringBuilder stackOut_197_1 = null;
        String stackOut_197_2 = null;
        var13 = Pool.field_O;
        try {
          L0: {
            L1: {
              L2: {
                mj.field_a = param1.field_Y;
                hi.field_k = param8.field_N;
                vn.field_h = param8.field_v;
                kp.field_h = param1;
                nr.field_P = param8.field_X;
                ro.field_d = param8.field_q;
                sa.field_r = param8.field_Y;
                eh.field_w = param1.field_g;
                gn.field_e = param8;
                nk.field_b = param1.field_X;
                wn.field_d = param1.field_N;
                qp.field_Yb = param8.field_g;
                sa.field_w = param1.field_q;
                f.field_b = param1.field_v;
                u.a(param0, param4, param6, true, (int[]) null, (int[]) null, param9.field_g, param9.field_N, param5, (int[]) null, param9.field_q, param2, param9.field_K, param9.field_Y, param9.field_Q, param9.field_X, (int[]) null, param7, param9.field_v, param9.field_l, (int[]) null, param9, param9.field_B, (int[]) null);
                var10_ref = param8;
                param1.field_J = null;
                var10_ref.field_J = null;
                var11 = param8;
                param1.field_Z = null;
                param8.field_X = nr.field_P;
                param8.field_g = qp.field_Yb;
                param8.field_B = nk.field_a;
                param8.field_Y = sa.field_r;
                param8.field_q = ro.field_d;
                param8.field_l = ld.field_g;
                param8.field_M = nj.field_d;
                param8.field_K = uf.field_W;
                var11.field_Z = null;
                param8.field_v = vn.field_h;
                param8.field_N = hi.field_k;
                param1.field_N = wn.field_d;
                param1.field_q = sa.field_w;
                param1.field_v = f.field_b;
                param1.field_Y = mj.field_a;
                param1.field_g = eh.field_w;
                param1.field_M = vk.field_bb;
                param1.field_B = de.field_a;
                param1.field_K = eq.field_R;
                param1.field_X = nk.field_b;
                param1.field_l = ja.field_a;
                if (param9.field_Q == null) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (null == param8.field_Q) {
                        break L4;
                      } else {
                        if (~param8.field_Q.length <= ~param8.field_K) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    param8.field_Q = new byte[param8.field_K - -100];
                    break L3;
                  }
                  L5: {
                    L6: {
                      if (param1.field_Q == null) {
                        break L6;
                      } else {
                        if (~param1.field_Q.length <= ~param1.field_K) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    param1.field_Q = new byte[100 + param1.field_K];
                    break L5;
                  }
                  var12 = 0;
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (param8.field_K <= var12) {
                          break L9;
                        } else {
                          param8.field_Q[var12] = param9.field_Q[hr.field_n[var12]];
                          var12++;
                          if (var13 != 0) {
                            break L8;
                          } else {
                            if (var13 == 0) {
                              continue L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      var12 = 0;
                      break L8;
                    }
                    L10: while (true) {
                      L11: {
                        if (~var12 <= ~param1.field_K) {
                          break L11;
                        } else {
                          param1.field_Q[var12] = param9.field_Q[gr.field_B[var12]];
                          var12++;
                          if (var13 != 0) {
                            break L1;
                          } else {
                            if (var13 == 0) {
                              continue L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      if (var13 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              param1.field_Q = null;
              var12_ref_eg = param8;
              var12_ref_eg.field_Q = null;
              break L1;
            }
            L12: {
              if (!param3) {
                break L12;
              } else {
                field_j = null;
                break L12;
              }
            }
            L13: {
              L14: {
                L15: {
                  L16: {
                    L17: {
                      L18: {
                        if (param9.field_P != null) {
                          break L18;
                        } else {
                          param1.field_P = null;
                          var12_ref_eg = param8;
                          byte fieldTemp$1 = param9.field_t;
                          param1.field_t = param9.field_t;
                          param8.field_t = fieldTemp$1;
                          var12_ref_eg.field_P = null;
                          if (var13 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      L19: {
                        L20: {
                          if (param8.field_P == null) {
                            break L20;
                          } else {
                            if (~param8.field_P.length <= ~param8.field_K) {
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        param8.field_P = new byte[param8.field_K + 100];
                        break L19;
                      }
                      L21: {
                        L22: {
                          if (null == param1.field_P) {
                            break L22;
                          } else {
                            if (~param1.field_K >= ~param1.field_P.length) {
                              break L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        param1.field_P = new byte[100 + param1.field_K];
                        break L21;
                      }
                      var12 = 0;
                      L23: while (true) {
                        L24: {
                          L25: {
                            if (~var12 <= ~param8.field_K) {
                              break L25;
                            } else {
                              param8.field_P[var12] = param9.field_P[hr.field_n[var12]];
                              var12++;
                              if (var13 != 0) {
                                break L24;
                              } else {
                                if (var13 == 0) {
                                  continue L23;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                          var12 = 0;
                          break L24;
                        }
                        L26: while (true) {
                          if (~param1.field_K >= ~var12) {
                            break L17;
                          } else {
                            param1.field_P[var12] = param9.field_P[gr.field_B[var12]];
                            var12++;
                            if (var13 != 0) {
                              break L16;
                            } else {
                              if (var13 == 0) {
                                continue L26;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (null != param9.field_f) {
                      break L16;
                    } else {
                      var12_ref_eg = param8;
                      param1.field_f = null;
                      var12_ref_eg.field_f = null;
                      if (var13 == 0) {
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                  }
                  L27: {
                    L28: {
                      if (null == param8.field_f) {
                        break L28;
                      } else {
                        if (param8.field_K <= param8.field_f.length) {
                          break L27;
                        } else {
                          break L28;
                        }
                      }
                    }
                    param8.field_f = new byte[param8.field_K + 100];
                    break L27;
                  }
                  L29: {
                    L30: {
                      if (null == param1.field_f) {
                        break L30;
                      } else {
                        if (param1.field_f.length >= param1.field_K) {
                          break L29;
                        } else {
                          break L30;
                        }
                      }
                    }
                    param1.field_f = new byte[param1.field_K + 100];
                    break L29;
                  }
                  var12 = 0;
                  L31: while (true) {
                    L32: {
                      L33: {
                        if (param8.field_K <= var12) {
                          break L33;
                        } else {
                          param8.field_f[var12] = param9.field_f[hr.field_n[var12]];
                          var12++;
                          if (var13 != 0) {
                            break L32;
                          } else {
                            if (var13 == 0) {
                              continue L31;
                            } else {
                              break L33;
                            }
                          }
                        }
                      }
                      var12 = 0;
                      break L32;
                    }
                    L34: while (true) {
                      if (~var12 <= ~param1.field_K) {
                        break L15;
                      } else {
                        param1.field_f[var12] = param9.field_f[gr.field_B[var12]];
                        var12++;
                        if (var13 != 0) {
                          break L14;
                        } else {
                          if (var13 == 0) {
                            continue L34;
                          } else {
                            break L15;
                          }
                        }
                      }
                    }
                  }
                }
                if (null == param9.field_k) {
                  break L14;
                } else {
                  L35: {
                    L36: {
                      if (null == param8.field_k) {
                        break L36;
                      } else {
                        if (~param8.field_K >= ~param8.field_k.length) {
                          break L35;
                        } else {
                          break L36;
                        }
                      }
                    }
                    param8.field_k = new byte[100 + param8.field_K];
                    break L35;
                  }
                  L37: {
                    L38: {
                      if (null == param1.field_k) {
                        break L38;
                      } else {
                        if (param1.field_k.length >= param1.field_K) {
                          break L37;
                        } else {
                          break L38;
                        }
                      }
                    }
                    param1.field_k = new byte[100 + param1.field_K];
                    break L37;
                  }
                  var12 = 0;
                  L39: while (true) {
                    L40: {
                      L41: {
                        if (~param8.field_K >= ~var12) {
                          break L41;
                        } else {
                          param8.field_k[var12] = param9.field_k[hr.field_n[var12]];
                          var12++;
                          if (var13 != 0) {
                            break L40;
                          } else {
                            if (var13 == 0) {
                              continue L39;
                            } else {
                              break L41;
                            }
                          }
                        }
                      }
                      var12 = 0;
                      break L40;
                    }
                    L42: while (true) {
                      L43: {
                        if (~param1.field_K >= ~var12) {
                          break L43;
                        } else {
                          param1.field_k[var12] = param9.field_k[gr.field_B[var12]];
                          var12++;
                          if (var13 != 0) {
                            break L13;
                          } else {
                            if (var13 == 0) {
                              continue L42;
                            } else {
                              break L43;
                            }
                          }
                        }
                      }
                      if (var13 == 0) {
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                }
              }
              var12_ref_eg = param8;
              param1.field_k = null;
              var12_ref_eg.field_k = null;
              break L13;
            }
            L44: {
              L45: {
                if (param9.field_n == null) {
                  break L45;
                } else {
                  L46: {
                    L47: {
                      if (param8.field_n == null) {
                        break L47;
                      } else {
                        if (param8.field_K > param8.field_n.length) {
                          break L47;
                        } else {
                          break L46;
                        }
                      }
                    }
                    param8.field_n = new short[100 + param8.field_K];
                    break L46;
                  }
                  L48: {
                    L49: {
                      if (param1.field_n == null) {
                        break L49;
                      } else {
                        if (~param1.field_K >= ~param1.field_n.length) {
                          break L48;
                        } else {
                          break L49;
                        }
                      }
                    }
                    param1.field_n = new short[param1.field_K + 100];
                    break L48;
                  }
                  var12 = 0;
                  L50: while (true) {
                    L51: {
                      L52: {
                        if (var12 >= param8.field_K) {
                          break L52;
                        } else {
                          param8.field_n[var12] = param9.field_n[hr.field_n[var12]];
                          var12++;
                          if (var13 != 0) {
                            break L51;
                          } else {
                            if (var13 == 0) {
                              continue L50;
                            } else {
                              break L52;
                            }
                          }
                        }
                      }
                      var12 = 0;
                      break L51;
                    }
                    L53: while (true) {
                      L54: {
                        if (~param1.field_K >= ~var12) {
                          break L54;
                        } else {
                          param1.field_n[var12] = param9.field_n[gr.field_B[var12]];
                          var12++;
                          if (var13 != 0) {
                            break L44;
                          } else {
                            if (var13 == 0) {
                              continue L53;
                            } else {
                              break L54;
                            }
                          }
                        }
                      }
                      if (var13 == 0) {
                        break L44;
                      } else {
                        break L45;
                      }
                    }
                  }
                }
              }
              param1.field_n = null;
              var12_ref_eg = param8;
              var12_ref_eg.field_n = null;
              break L44;
            }
            L55: {
              L56: {
                L57: {
                  if (param9.field_L != null) {
                    break L57;
                  } else {
                    var12_ref_eg = param8;
                    param1.field_L = null;
                    var12_ref_eg.field_L = null;
                    if (var13 == 0) {
                      break L56;
                    } else {
                      break L57;
                    }
                  }
                }
                L58: {
                  L59: {
                    if (param8.field_L == null) {
                      break L59;
                    } else {
                      if (~param8.field_L.length <= ~param8.field_K) {
                        break L58;
                      } else {
                        break L59;
                      }
                    }
                  }
                  param8.field_L = new short[100 + param8.field_K];
                  break L58;
                }
                L60: {
                  L61: {
                    if (null == param1.field_L) {
                      break L61;
                    } else {
                      if (~param1.field_L.length > ~param1.field_K) {
                        break L61;
                      } else {
                        break L60;
                      }
                    }
                  }
                  param1.field_L = new short[100 + param1.field_K];
                  break L60;
                }
                var12 = 0;
                L62: while (true) {
                  L63: {
                    L64: {
                      if (var12 >= param8.field_K) {
                        break L64;
                      } else {
                        param8.field_L[var12] = param9.field_L[hr.field_n[var12]];
                        var12++;
                        if (var13 != 0) {
                          break L63;
                        } else {
                          if (var13 == 0) {
                            continue L62;
                          } else {
                            break L64;
                          }
                        }
                      }
                    }
                    var12 = 0;
                    break L63;
                  }
                  L65: while (true) {
                    if (~param1.field_K >= ~var12) {
                      break L56;
                    } else {
                      param1.field_L[var12] = param9.field_L[gr.field_B[var12]];
                      var12++;
                      if (var13 != 0) {
                        break L55;
                      } else {
                        if (var13 == 0) {
                          continue L65;
                        } else {
                          break L56;
                        }
                      }
                    }
                  }
                }
              }
              break L55;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L66: {
            var10 = decompiledCaughtException;
            stackOut_188_0 = (RuntimeException) var10;
            stackOut_188_1 = new StringBuilder().append("ej.C(").append(param0).append(44);
            stackIn_191_0 = stackOut_188_0;
            stackIn_191_1 = stackOut_188_1;
            stackIn_189_0 = stackOut_188_0;
            stackIn_189_1 = stackOut_188_1;
            if (param1 == null) {
              stackOut_191_0 = (RuntimeException) (Object) stackIn_191_0;
              stackOut_191_1 = (StringBuilder) (Object) stackIn_191_1;
              stackOut_191_2 = "null";
              stackIn_192_0 = stackOut_191_0;
              stackIn_192_1 = stackOut_191_1;
              stackIn_192_2 = stackOut_191_2;
              break L66;
            } else {
              stackOut_189_0 = (RuntimeException) (Object) stackIn_189_0;
              stackOut_189_1 = (StringBuilder) (Object) stackIn_189_1;
              stackOut_189_2 = "{...}";
              stackIn_192_0 = stackOut_189_0;
              stackIn_192_1 = stackOut_189_1;
              stackIn_192_2 = stackOut_189_2;
              break L66;
            }
          }
          L67: {
            stackOut_192_0 = (RuntimeException) (Object) stackIn_192_0;
            stackOut_192_1 = ((StringBuilder) (Object) stackIn_192_1).append(stackIn_192_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_195_0 = stackOut_192_0;
            stackIn_195_1 = stackOut_192_1;
            stackIn_193_0 = stackOut_192_0;
            stackIn_193_1 = stackOut_192_1;
            if (param8 == null) {
              stackOut_195_0 = (RuntimeException) (Object) stackIn_195_0;
              stackOut_195_1 = (StringBuilder) (Object) stackIn_195_1;
              stackOut_195_2 = "null";
              stackIn_196_0 = stackOut_195_0;
              stackIn_196_1 = stackOut_195_1;
              stackIn_196_2 = stackOut_195_2;
              break L67;
            } else {
              stackOut_193_0 = (RuntimeException) (Object) stackIn_193_0;
              stackOut_193_1 = (StringBuilder) (Object) stackIn_193_1;
              stackOut_193_2 = "{...}";
              stackIn_196_0 = stackOut_193_0;
              stackIn_196_1 = stackOut_193_1;
              stackIn_196_2 = stackOut_193_2;
              break L67;
            }
          }
          L68: {
            stackOut_196_0 = (RuntimeException) (Object) stackIn_196_0;
            stackOut_196_1 = ((StringBuilder) (Object) stackIn_196_1).append(stackIn_196_2).append(44);
            stackIn_199_0 = stackOut_196_0;
            stackIn_199_1 = stackOut_196_1;
            stackIn_197_0 = stackOut_196_0;
            stackIn_197_1 = stackOut_196_1;
            if (param9 == null) {
              stackOut_199_0 = (RuntimeException) (Object) stackIn_199_0;
              stackOut_199_1 = (StringBuilder) (Object) stackIn_199_1;
              stackOut_199_2 = "null";
              stackIn_200_0 = stackOut_199_0;
              stackIn_200_1 = stackOut_199_1;
              stackIn_200_2 = stackOut_199_2;
              break L68;
            } else {
              stackOut_197_0 = (RuntimeException) (Object) stackIn_197_0;
              stackOut_197_1 = (StringBuilder) (Object) stackIn_197_1;
              stackOut_197_2 = "{...}";
              stackIn_200_0 = stackOut_197_0;
              stackIn_200_1 = stackOut_197_1;
              stackIn_200_2 = stackOut_197_2;
              break L68;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_200_0, stackIn_200_2 + 41);
        }
    }

    final ge a(int param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        ge stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        ge stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == -25955) {
              if (((ej) this).field_e != 3) {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = ((ej) this).field_d;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ge) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "ej.E(" + param0 + 41);
        }
        return (ge) (Object) stackIn_7_0;
    }

    public final void run() {
        try {
            Exception var1 = null;
            RuntimeException var1_ref = null;
            int var1_int = 0;
            Object var1_ref2 = null;
            Throwable var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            int stackIn_3_0 = 0;
            int stackIn_3_1 = 0;
            int stackIn_13_0 = 0;
            int stackIn_13_1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_2_1 = 0;
            int stackOut_12_0 = 0;
            int stackOut_12_1 = 0;
            var4 = Pool.field_O;
            try {
              L0: {
                try {
                  L1: {
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (~((ej) this).field_d.field_t.length >= ~((ej) this).field_d.field_v) {
                            break L4;
                          } else {
                            var1_int = ((ej) this).field_h.read(((ej) this).field_d.field_t, ((ej) this).field_d.field_v, ((ej) this).field_d.field_t.length + -((ej) this).field_d.field_v);
                            stackOut_2_0 = -1;
                            stackOut_2_1 = ~var1_int;
                            stackIn_13_0 = stackOut_2_0;
                            stackIn_13_1 = stackOut_2_1;
                            stackIn_3_0 = stackOut_2_0;
                            stackIn_3_1 = stackOut_2_1;
                            if (var4 != 0) {
                              break L3;
                            } else {
                              L5: {
                                if (stackIn_3_0 >= stackIn_3_1) {
                                  break L5;
                                } else {
                                  if (var4 == 0) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              ((ej) this).field_d.field_v = ((ej) this).field_d.field_v + var1_int;
                              if (var4 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        stackOut_12_0 = ~((ej) this).field_d.field_t.length;
                        stackOut_12_1 = ~((ej) this).field_d.field_v;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        break L3;
                      }
                      if (stackIn_13_0 != stackIn_13_1) {
                        var1_ref2 = this;
                        synchronized (var1_ref2) {
                          L6: {
                            ((ej) this).finalize();
                            ((ej) this).field_e = 3;
                            break L6;
                          }
                        }
                        break L1;
                      } else {
                        throw ej.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((ej) this).field_d.field_t.length + " " + ((ej) this).field_i));
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var1 = (Exception) (Object) decompiledCaughtException;
                    var2_ref = this;
                    synchronized (var2_ref) {
                      L8: {
                        ((ej) this).finalize();
                        ((ej) this).field_e = ((ej) this).field_e + 1;
                        break L8;
                      }
                    }
                    break L7;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw wm.a((Throwable) (Object) var1_ref, "ej.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, int param1, int param2, byte param3, oc param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        try {
          L0: {
            L1: {
              var7 = 101 / ((-47 - param3) / 46);
              var5_int = gi.a(3 * (-param2 + param1), 0);
              var6 = param2 * 3;
              var8 = -10 + var5_int;
              ar.a((byte) 48);
              if (0 >= param4.field_I) {
                break L1;
              } else {
                if (param4.field_K == null) {
                  break L1;
                } else {
                  ka.h(0);
                  break L1;
                }
              }
            }
            eh.field_x = 0;
            var9 = 0;
            L2: while (true) {
              if (param4.field_d <= var9) {
                L3: {
                  if (0 >= param4.field_I) {
                    break L3;
                  } else {
                    if (param4.field_K != null) {
                      var9 = 0;
                      var10 = 0;
                      L4: while (true) {
                        if (wa.field_ib.length <= var10) {
                          break L3;
                        } else {
                          var11 = wa.field_ib[var10];
                          wa.field_ib[var10] = var9;
                          var9 = var9 + var11;
                          var10++;
                          continue L4;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                break L0;
              } else {
                L5: {
                  L6: {
                    var10 = param4.field_y[var9];
                    var11 = param4.field_r[var9];
                    var12 = param4.field_u[var9];
                    if (param0) {
                      var13 = ch.field_M[var10];
                      var14 = li.field_h[var10];
                      var15 = ch.field_M[var11] - var13;
                      var16 = -var13 + ch.field_M[var12];
                      var17 = -var14 + li.field_h[var11];
                      var18 = li.field_h[var12] - var14;
                      if (var15 * var18 + -(var16 * var17) < 0) {
                        break L6;
                      } else {
                        break L5;
                      }
                    } else {
                      break L6;
                    }
                  }
                  var13 = fe.field_L[var10];
                  if (-2147483648 != var13) {
                    var14 = fe.field_L[var11];
                    if (var14 == -2147483648) {
                      break L5;
                    } else {
                      var15 = fe.field_L[var12];
                      if (var15 != -2147483648) {
                        L7: {
                          var16 = -var6 + (var14 + var13 + var15);
                          if (0 > var8) {
                            stackOut_24_0 = var16 << -var8;
                            stackIn_25_0 = stackOut_24_0;
                            break L7;
                          } else {
                            stackOut_22_0 = var16 >> var8;
                            stackIn_25_0 = stackOut_22_0;
                            break L7;
                          }
                        }
                        var17 = -stackIn_25_0 + (lq.field_T.length - 1);
                        var18 = lq.field_T[var17];
                        L8: while (true) {
                          if (var18 >> 4 == 0) {
                            L9: {
                              var19 = var18 + (var17 << 4);
                              tl.field_I[var19] = var9;
                              lq.field_T[var17] = 1 + var18;
                              if (param4.field_I <= 0) {
                                break L9;
                              } else {
                                if (null == param4.field_K) {
                                  break L9;
                                } else {
                                  wa.field_ib[param4.field_K[var9]] = wa.field_ib[param4.field_K[var9]] + 1;
                                  break L9;
                                }
                              }
                            }
                            eh.field_x = eh.field_x + 1;
                            break L5;
                          } else {
                            var17--;
                            if (var17 < 0) {
                              System.err.println("Out of range!");
                              break L5;
                            } else {
                              var18 = lq.field_T[var17];
                              continue L8;
                            }
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var5;
            stackOut_52_1 = new StringBuilder().append("ej.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_55_0 = stackOut_52_0;
            stackIn_55_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param4 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L10;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_56_0 = stackOut_53_0;
              stackIn_56_1 = stackOut_53_1;
              stackIn_56_2 = stackOut_53_2;
              break L10;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + 41);
        }
    }

    protected final void finalize() {
        Exception exception = null;
        RuntimeException var1 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((ej) this).field_a != null) {
                L2: {
                  if (((ej) this).field_a.field_e != null) {
                    try {
                      L3: {
                        ((DataInputStream) ((ej) this).field_a.field_e).close();
                        break L3;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        exception = (Exception) (Object) decompiledCaughtException;
                        break L4;
                      }
                    }
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((ej) this).field_a = null;
                break L1;
              } else {
                break L1;
              }
            }
            L5: {
              if (null == ((ej) this).field_k) {
                break L5;
              } else {
                L6: {
                  if (((ej) this).field_k.field_e == null) {
                    break L6;
                  } else {
                    try {
                      L7: {
                        ((java.net.Socket) ((ej) this).field_k.field_e).close();
                        break L7;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L8: {
                        exception = (Exception) (Object) decompiledCaughtException;
                        break L8;
                      }
                    }
                    break L6;
                  }
                }
                ((ej) this).field_k = null;
                break L5;
              }
            }
            L9: {
              if (null == ((ej) this).field_h) {
                break L9;
              } else {
                try {
                  L10: {
                    ((ej) this).field_h.close();
                    break L10;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L11: {
                    exception = (Exception) (Object) decompiledCaughtException;
                    break L11;
                  }
                }
                ((ej) this).field_h = null;
                break L9;
              }
            }
            ((ej) this).field_f = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          var1 = (RuntimeException) (Object) decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "ej.finalize()");
        }
    }

    ej(sj param0, java.net.URL param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            ((ej) this).field_i = param1;
            ((ej) this).field_b = param0;
            ((ej) this).field_d = new ge(param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ej.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 41);
        }
    }

    public static void a(boolean param0) {
        try {
            field_c = null;
            field_j = null;
            if (!param0) {
                field_l = false;
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "ej.B(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Please enter a year between <%0> and <%1>";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
