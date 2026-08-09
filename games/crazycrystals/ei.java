/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei extends om {
    private vc field_B;
    static int field_E;
    static int field_F;
    private String field_I;
    private int field_C;
    private int field_H;
    private int field_z;
    static int field_A;
    private boolean field_y;
    static String field_G;

    final void a(int param0, byte param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int stackIn_6_0 = 0;
        vc stackIn_8_0;
        String stackIn_8_1;
        int stackIn_8_2;
        int stackIn_8_3;
        int stackIn_8_4;
        int stackIn_8_5;
        int stackIn_8_6;
        int stackIn_8_7;
        vc stackIn_9_0 = null;
        String stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        int stackIn_9_6 = 0;
        int stackIn_9_7 = 0;
        int stackIn_9_8 = 0;
        var5 = param2 + this.field_r;
        var6 = this.field_j + param0;
        super.a(param0, (byte) -128, param2, param3);
        if (0 != param3) {
          return;
        } else {
          L0: {
            if (!this.field_y) {
              stackIn_6_0 = 0;
              break L0;
            } else {
              stackIn_6_0 = this.field_g - (this.field_z - -(this.field_C * 2));
              break L0;
            }
          }
          L1: {
            var7 = stackIn_6_0;
            stackIn_8_0 = this.field_B;

            stackIn_8_1 = this.field_I;

            stackIn_8_2 = var7 + (var5 - -this.field_C);

            stackIn_8_3 = var6 + this.field_C;

            stackIn_8_4 = -this.field_C + this.field_z;

            stackIn_8_5 = this.field_f + -(2 * this.field_C);

            stackIn_8_6 = this.field_H;

            stackIn_8_7 = -1;

            if (!this.field_y) {
              stackIn_9_0 = (vc) ((Object) stackIn_8_0);
              stackIn_9_1 = (String) ((Object) stackIn_8_1);
              stackIn_9_2 = stackIn_8_2;
              stackIn_9_3 = stackIn_8_3;
              stackIn_9_4 = stackIn_8_4;
              stackIn_9_5 = stackIn_8_5;
              stackIn_9_6 = stackIn_8_6;
              stackIn_9_7 = stackIn_8_7;
              stackIn_9_8 = 2;
              break L1;
            } else {
              stackIn_9_0 = (vc) ((Object) stackIn_8_0);
              stackIn_9_1 = (String) ((Object) stackIn_8_1);
              stackIn_9_2 = stackIn_8_2;
              stackIn_9_3 = stackIn_8_3;
              stackIn_9_4 = stackIn_8_4;
              stackIn_9_5 = stackIn_8_5;
              stackIn_9_6 = stackIn_8_6;
              stackIn_9_7 = stackIn_8_7;
              stackIn_9_8 = 0;
              break L1;
            }
          }
          ((vc) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4, stackIn_9_5, stackIn_9_6, stackIn_9_7, stackIn_9_8, 1, this.field_B.field_o);
          if (param1 >= -12) {
            ei.a(-13, -55, true);
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        if (rc.field_b != null) {
          if (param0 > rc.field_b.length) {
            L0: {
              rc.field_b = new int[2 * param0];
              if (!param2) {
                break L0;
              } else {
                field_E = -34;
                break L0;
              }
            }
            L1: {
              L2: {
                if (null == mh.field_l) {
                  break L2;
                } else {
                  if (mh.field_l.length >= param0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              mh.field_l = new int[param0 * 2];
              break L1;
            }
            L3: {
              L4: {
                if (dk.field_l == null) {
                  break L4;
                } else {
                  if (param0 <= dk.field_l.length) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              dk.field_l = new int[2 * param0];
              break L3;
            }
            L5: {
              L6: {
                if (null == j.field_i) {
                  break L6;
                } else {
                  if (j.field_i.length >= param0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              j.field_i = new int[param0 * 2];
              break L5;
            }
            if (null == cd.field_u) {
              L7: {
                L8: {
                  cd.field_u = new int[2 * param0];
                  if (jk.field_g == null) {
                    break L8;
                  } else {
                    if (param0 > jk.field_g.length) {
                      break L8;
                    } else {
                      break L7;
                    }
                  }
                }
                jk.field_g = new int[2 * param0];
                break L7;
              }
              L9: {
                L10: {
                  if (wp.field_d == null) {
                    break L10;
                  } else {
                    if (wp.field_d.length >= param1 + param0) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                wp.field_d = new int[(param0 - -param1) * 2];
                break L9;
              }
              if (qj.field_c == null) {
                qj.field_c = new boolean[param0 * 2];
                ae.field_F = 2147483647;
                be.field_c = 0;
                em.field_i = -2147483648;
                uo.field_m = -2147483648;
                db.field_i = 2147483647;
                return;
              } else {
                if (param0 > qj.field_c.length) {
                  qj.field_c = new boolean[param0 * 2];
                  ae.field_F = 2147483647;
                  be.field_c = 0;
                  em.field_i = -2147483648;
                  uo.field_m = -2147483648;
                  db.field_i = 2147483647;
                  return;
                } else {
                  ae.field_F = 2147483647;
                  be.field_c = 0;
                  em.field_i = -2147483648;
                  uo.field_m = -2147483648;
                  db.field_i = 2147483647;
                  return;
                }
              }
            } else {
              if (cd.field_u.length < param0) {
                L11: {
                  L12: {
                    cd.field_u = new int[2 * param0];
                    if (jk.field_g == null) {
                      break L12;
                    } else {
                      if (param0 > jk.field_g.length) {
                        break L12;
                      } else {
                        break L11;
                      }
                    }
                  }
                  jk.field_g = new int[2 * param0];
                  break L11;
                }
                if (wp.field_d == null) {
                  L13: {
                    wp.field_d = new int[(param0 - -param1) * 2];
                    if (qj.field_c == null) {
                      break L13;
                    } else {
                      if (param0 <= qj.field_c.length) {
                        ae.field_F = 2147483647;
                        be.field_c = 0;
                        em.field_i = -2147483648;
                        uo.field_m = -2147483648;
                        db.field_i = 2147483647;
                        return;
                      } else {
                        break L13;
                      }
                    }
                  }
                  qj.field_c = new boolean[param0 * 2];
                  ae.field_F = 2147483647;
                  be.field_c = 0;
                  em.field_i = -2147483648;
                  uo.field_m = -2147483648;
                  db.field_i = 2147483647;
                  return;
                } else {
                  if (wp.field_d.length >= param1 + param0) {
                    if (qj.field_c == null) {
                      qj.field_c = new boolean[param0 * 2];
                      ae.field_F = 2147483647;
                      be.field_c = 0;
                      em.field_i = -2147483648;
                      uo.field_m = -2147483648;
                      db.field_i = 2147483647;
                      return;
                    } else {
                      if (param0 > qj.field_c.length) {
                        qj.field_c = new boolean[param0 * 2];
                        ae.field_F = 2147483647;
                        be.field_c = 0;
                        em.field_i = -2147483648;
                        uo.field_m = -2147483648;
                        db.field_i = 2147483647;
                        return;
                      } else {
                        ae.field_F = 2147483647;
                        be.field_c = 0;
                        em.field_i = -2147483648;
                        uo.field_m = -2147483648;
                        db.field_i = 2147483647;
                        return;
                      }
                    }
                  } else {
                    L14: {
                      wp.field_d = new int[(param0 - -param1) * 2];
                      if (qj.field_c == null) {
                        break L14;
                      } else {
                        if (param0 <= qj.field_c.length) {
                          ae.field_F = 2147483647;
                          be.field_c = 0;
                          em.field_i = -2147483648;
                          uo.field_m = -2147483648;
                          db.field_i = 2147483647;
                          return;
                        } else {
                          break L14;
                        }
                      }
                    }
                    qj.field_c = new boolean[param0 * 2];
                    ae.field_F = 2147483647;
                    be.field_c = 0;
                    em.field_i = -2147483648;
                    uo.field_m = -2147483648;
                    db.field_i = 2147483647;
                    return;
                  }
                }
              } else {
                L15: {
                  L16: {
                    if (jk.field_g == null) {
                      break L16;
                    } else {
                      if (param0 > jk.field_g.length) {
                        break L16;
                      } else {
                        break L15;
                      }
                    }
                  }
                  jk.field_g = new int[2 * param0];
                  break L15;
                }
                L17: {
                  L18: {
                    if (wp.field_d == null) {
                      break L18;
                    } else {
                      if (wp.field_d.length >= param1 + param0) {
                        break L17;
                      } else {
                        break L18;
                      }
                    }
                  }
                  wp.field_d = new int[(param0 - -param1) * 2];
                  break L17;
                }
                L19: {
                  if (qj.field_c == null) {
                    break L19;
                  } else {
                    if (param0 <= qj.field_c.length) {
                      ae.field_F = 2147483647;
                      be.field_c = 0;
                      em.field_i = -2147483648;
                      uo.field_m = -2147483648;
                      db.field_i = 2147483647;
                      return;
                    } else {
                      break L19;
                    }
                  }
                }
                qj.field_c = new boolean[param0 * 2];
                ae.field_F = 2147483647;
                be.field_c = 0;
                em.field_i = -2147483648;
                uo.field_m = -2147483648;
                db.field_i = 2147483647;
                return;
              }
            }
          } else {
            L20: {
              if (!param2) {
                break L20;
              } else {
                field_E = -34;
                break L20;
              }
            }
            L21: {
              L22: {
                if (null == mh.field_l) {
                  break L22;
                } else {
                  if (mh.field_l.length >= param0) {
                    break L21;
                  } else {
                    break L22;
                  }
                }
              }
              mh.field_l = new int[param0 * 2];
              break L21;
            }
            L23: {
              L24: {
                if (dk.field_l == null) {
                  break L24;
                } else {
                  if (param0 <= dk.field_l.length) {
                    break L23;
                  } else {
                    break L24;
                  }
                }
              }
              dk.field_l = new int[2 * param0];
              break L23;
            }
            L25: {
              L26: {
                if (null == j.field_i) {
                  break L26;
                } else {
                  if (j.field_i.length >= param0) {
                    break L25;
                  } else {
                    break L26;
                  }
                }
              }
              j.field_i = new int[param0 * 2];
              break L25;
            }
            if (null == cd.field_u) {
              L27: {
                L28: {
                  cd.field_u = new int[2 * param0];
                  if (jk.field_g == null) {
                    break L28;
                  } else {
                    if (param0 > jk.field_g.length) {
                      break L28;
                    } else {
                      break L27;
                    }
                  }
                }
                jk.field_g = new int[2 * param0];
                break L27;
              }
              L29: {
                L30: {
                  if (wp.field_d == null) {
                    break L30;
                  } else {
                    if (wp.field_d.length >= param1 + param0) {
                      break L29;
                    } else {
                      break L30;
                    }
                  }
                }
                wp.field_d = new int[(param0 - -param1) * 2];
                break L29;
              }
              L31: {
                if (qj.field_c == null) {
                  break L31;
                } else {
                  if (param0 <= qj.field_c.length) {
                    ae.field_F = 2147483647;
                    be.field_c = 0;
                    em.field_i = -2147483648;
                    uo.field_m = -2147483648;
                    db.field_i = 2147483647;
                    return;
                  } else {
                    break L31;
                  }
                }
              }
              qj.field_c = new boolean[param0 * 2];
              ae.field_F = 2147483647;
              be.field_c = 0;
              em.field_i = -2147483648;
              uo.field_m = -2147483648;
              db.field_i = 2147483647;
              return;
            } else {
              if (cd.field_u.length < param0) {
                L32: {
                  L33: {
                    cd.field_u = new int[2 * param0];
                    if (jk.field_g == null) {
                      break L33;
                    } else {
                      if (param0 > jk.field_g.length) {
                        break L33;
                      } else {
                        break L32;
                      }
                    }
                  }
                  jk.field_g = new int[2 * param0];
                  break L32;
                }
                L34: {
                  L35: {
                    if (wp.field_d == null) {
                      break L35;
                    } else {
                      if (wp.field_d.length >= param1 + param0) {
                        break L34;
                      } else {
                        break L35;
                      }
                    }
                  }
                  wp.field_d = new int[(param0 - -param1) * 2];
                  break L34;
                }
                L36: {
                  if (qj.field_c == null) {
                    break L36;
                  } else {
                    if (param0 <= qj.field_c.length) {
                      ae.field_F = 2147483647;
                      be.field_c = 0;
                      em.field_i = -2147483648;
                      uo.field_m = -2147483648;
                      db.field_i = 2147483647;
                      return;
                    } else {
                      break L36;
                    }
                  }
                }
                qj.field_c = new boolean[param0 * 2];
                ae.field_F = 2147483647;
                be.field_c = 0;
                em.field_i = -2147483648;
                uo.field_m = -2147483648;
                db.field_i = 2147483647;
                return;
              } else {
                L37: {
                  L38: {
                    if (jk.field_g == null) {
                      break L38;
                    } else {
                      if (param0 > jk.field_g.length) {
                        break L38;
                      } else {
                        break L37;
                      }
                    }
                  }
                  jk.field_g = new int[2 * param0];
                  break L37;
                }
                L39: {
                  L40: {
                    if (wp.field_d == null) {
                      break L40;
                    } else {
                      if (wp.field_d.length >= param1 + param0) {
                        break L39;
                      } else {
                        break L40;
                      }
                    }
                  }
                  wp.field_d = new int[(param0 - -param1) * 2];
                  break L39;
                }
                L41: {
                  if (qj.field_c == null) {
                    break L41;
                  } else {
                    if (param0 <= qj.field_c.length) {
                      ae.field_F = 2147483647;
                      be.field_c = 0;
                      em.field_i = -2147483648;
                      uo.field_m = -2147483648;
                      db.field_i = 2147483647;
                      return;
                    } else {
                      break L41;
                    }
                  }
                }
                qj.field_c = new boolean[param0 * 2];
                ae.field_F = 2147483647;
                be.field_c = 0;
                em.field_i = -2147483648;
                uo.field_m = -2147483648;
                db.field_i = 2147483647;
                return;
              }
            }
          }
        } else {
          L42: {
            rc.field_b = new int[2 * param0];
            if (!param2) {
              break L42;
            } else {
              field_E = -34;
              break L42;
            }
          }
          L43: {
            L44: {
              if (null == mh.field_l) {
                break L44;
              } else {
                if (mh.field_l.length >= param0) {
                  break L43;
                } else {
                  break L44;
                }
              }
            }
            mh.field_l = new int[param0 * 2];
            break L43;
          }
          L45: {
            L46: {
              if (dk.field_l == null) {
                break L46;
              } else {
                if (param0 <= dk.field_l.length) {
                  break L45;
                } else {
                  break L46;
                }
              }
            }
            dk.field_l = new int[2 * param0];
            break L45;
          }
          L47: {
            L48: {
              if (null == j.field_i) {
                break L48;
              } else {
                if (j.field_i.length >= param0) {
                  break L47;
                } else {
                  break L48;
                }
              }
            }
            j.field_i = new int[param0 * 2];
            break L47;
          }
          if (null == cd.field_u) {
            L49: {
              L50: {
                cd.field_u = new int[2 * param0];
                if (jk.field_g == null) {
                  break L50;
                } else {
                  if (param0 > jk.field_g.length) {
                    break L50;
                  } else {
                    break L49;
                  }
                }
              }
              jk.field_g = new int[2 * param0];
              break L49;
            }
            L51: {
              L52: {
                if (wp.field_d == null) {
                  break L52;
                } else {
                  if (wp.field_d.length >= param1 + param0) {
                    break L51;
                  } else {
                    break L52;
                  }
                }
              }
              wp.field_d = new int[(param0 - -param1) * 2];
              break L51;
            }
            L53: {
              if (qj.field_c == null) {
                break L53;
              } else {
                if (param0 <= qj.field_c.length) {
                  ae.field_F = 2147483647;
                  be.field_c = 0;
                  em.field_i = -2147483648;
                  uo.field_m = -2147483648;
                  db.field_i = 2147483647;
                  return;
                } else {
                  break L53;
                }
              }
            }
            qj.field_c = new boolean[param0 * 2];
            ae.field_F = 2147483647;
            be.field_c = 0;
            em.field_i = -2147483648;
            uo.field_m = -2147483648;
            db.field_i = 2147483647;
            return;
          } else {
            if (cd.field_u.length < param0) {
              L54: {
                L55: {
                  cd.field_u = new int[2 * param0];
                  if (jk.field_g == null) {
                    break L55;
                  } else {
                    if (param0 > jk.field_g.length) {
                      break L55;
                    } else {
                      break L54;
                    }
                  }
                }
                jk.field_g = new int[2 * param0];
                break L54;
              }
              L56: {
                L57: {
                  if (wp.field_d == null) {
                    break L57;
                  } else {
                    if (wp.field_d.length >= param1 + param0) {
                      break L56;
                    } else {
                      break L57;
                    }
                  }
                }
                wp.field_d = new int[(param0 - -param1) * 2];
                break L56;
              }
              L58: {
                if (qj.field_c == null) {
                  break L58;
                } else {
                  if (param0 <= qj.field_c.length) {
                    ae.field_F = 2147483647;
                    be.field_c = 0;
                    em.field_i = -2147483648;
                    uo.field_m = -2147483648;
                    db.field_i = 2147483647;
                    return;
                  } else {
                    break L58;
                  }
                }
              }
              qj.field_c = new boolean[param0 * 2];
              ae.field_F = 2147483647;
              be.field_c = 0;
              em.field_i = -2147483648;
              uo.field_m = -2147483648;
              db.field_i = 2147483647;
              return;
            } else {
              L59: {
                L60: {
                  if (jk.field_g == null) {
                    break L60;
                  } else {
                    if (param0 > jk.field_g.length) {
                      break L60;
                    } else {
                      break L59;
                    }
                  }
                }
                jk.field_g = new int[2 * param0];
                break L59;
              }
              L61: {
                L62: {
                  if (wp.field_d == null) {
                    break L62;
                  } else {
                    if (wp.field_d.length >= param1 + param0) {
                      break L61;
                    } else {
                      break L62;
                    }
                  }
                }
                wp.field_d = new int[(param0 - -param1) * 2];
                break L61;
              }
              L63: {
                if (qj.field_c == null) {
                  break L63;
                } else {
                  if (param0 <= qj.field_c.length) {
                    ae.field_F = 2147483647;
                    be.field_c = 0;
                    em.field_i = -2147483648;
                    uo.field_m = -2147483648;
                    db.field_i = 2147483647;
                    return;
                  } else {
                    break L63;
                  }
                }
              }
              qj.field_c = new boolean[param0 * 2];
              ae.field_F = 2147483647;
              be.field_c = 0;
              em.field_i = -2147483648;
              uo.field_m = -2147483648;
              db.field_i = 2147483647;
              return;
            }
          }
        }
    }

    public static void f(byte param0) {
        int var1 = -26 % ((4 - param0) / 38);
        field_G = null;
    }

    final String a(byte param0) {
        int var2;
        String var3;
        qm stackIn_3_0 = null;
        qm stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        if (param0 > -23) {
          return (String) null;
        } else {
          L0: {
            var2 = this.field_w.field_m ? 1 : 0;
            this.field_w.field_m = this.field_m;
            var3 = this.field_w.a((byte) -28);
            stackIn_3_0 = this.field_w;

            if (var2 == 0) {
              stackIn_4_0 = (qm) ((Object) stackIn_3_0);
              stackIn_4_1 = 0;
              break L0;
            } else {
              stackIn_4_0 = (qm) ((Object) stackIn_3_0);
              stackIn_4_1 = 1;
              break L0;
            }
          }
          stackIn_4_0.field_m = stackIn_4_1 != 0;
          return var3;
        }
    }

    ei(int param0, int param1, int param2, int param3, qm param4, boolean param5, int param6, int param7, vc param8, int param9, String param10) {
        super(param0, param1, param2, param3, (wo) null, (bi) null);
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          L0: {
            L1: {
              this.field_I = param10;
              this.field_w = param4;
              stackIn_3_0 = this;

              if (!param5) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((ei) (this)).field_y = stackIn_4_1 != 0;
              this.field_H = param9;
              this.field_B = param8;
              this.field_C = param7;
              this.field_z = param6;
              var12_int = -this.field_C + this.field_z;
              var13 = this.field_B.b(param10, var12_int, this.field_B.field_o) - -(this.field_C * 2);
              if (var13 <= param3) {
                var13 = param3;
                break L2;
              } else {
                this.a(var13, param0, param1, param2, (byte) -52);
                break L2;
              }
            }
            L3: {
              if (!this.field_y) {
                stackIn_10_0 = this.field_C * 2 + this.field_z;
                break L3;
              } else {
                stackIn_10_0 = 0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_w.a(-(this.field_C * 2) + param3, var14, (var13 + -param3 >> -1495820223) + this.field_C, -this.field_z + param2 + -(3 * this.field_C), (byte) -52);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("ei.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    static {
        field_F = 45;
        field_A = 0;
        field_G = "Crazy Crystals";
    }
}
