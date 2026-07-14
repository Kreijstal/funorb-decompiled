/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    private int[] field_i;
    static String field_c;
    private String field_h;
    qr field_e;
    private int field_l;
    static boolean field_a;
    int field_f;
    private long field_b;
    static int[] field_g;
    ul field_j;
    static String field_d;
    String field_k;

    final void a(boolean param0, int param1) {
        mj var4 = null;
        String var5 = null;
        int var6 = 0;
        mj var7 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null != ((fc) this).field_k) {
          if (((fc) this).field_b != ec.field_p) {
            if (np.field_a != null) {
              if (ip.a((byte) -123)) {
                var7 = ta.a(-77, ((fc) this).field_b);
                var4 = ik.a(-115, ((fc) this).field_b);
                var5 = this.a(param1 ^ 16744);
                if (var4 == null) {
                  if (var7 != null) {
                    if (np.field_a.field_mc) {
                      if (np.field_a.field_Lb < np.field_a.field_Eb) {
                        if (!var7.field_Tb) {
                          if (!param0) {
                            ((fc) this).field_j.a(1, 0, re.a(ol.field_f, 4371, new String[1]));
                            if (param1 == -16661) {
                              return;
                            } else {
                              ((fc) this).field_b = 56L;
                              return;
                            }
                          } else {
                            if (var7.field_Vb) {
                              ((fc) this).field_j.a(param1 ^ -16662, 0, re.a(ad.field_g, 4371, new String[1]));
                              ((fc) this).field_j.a(1, 1, re.a(ej.field_f, 4371, new String[1]));
                              if (param1 == -16661) {
                                return;
                              } else {
                                ((fc) this).field_b = 56L;
                                return;
                              }
                            } else {
                              ((fc) this).field_j.a(1, 0, re.a(ol.field_f, 4371, new String[1]));
                              if (param1 == -16661) {
                                return;
                              } else {
                                ((fc) this).field_b = 56L;
                                return;
                              }
                            }
                          }
                        } else {
                          ((fc) this).field_j.a(1, 1, re.a(field_c, 4371, new String[1]));
                          if (param1 == -16661) {
                            return;
                          } else {
                            ((fc) this).field_b = 56L;
                            return;
                          }
                        }
                      } else {
                        if (param1 == -16661) {
                          return;
                        } else {
                          ((fc) this).field_b = 56L;
                          return;
                        }
                      }
                    } else {
                      if (param1 != -16661) {
                        ((fc) this).field_b = 56L;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (param1 != -16661) {
                      ((fc) this).field_b = 56L;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  L0: {
                    if (!np.field_a.field_Ab) {
                      break L0;
                    } else {
                      if (np.field_a.field_lc >= 0) {
                        break L0;
                      } else {
                        if (param1 != -16661) {
                          ((fc) this).field_b = 56L;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  ((fc) this).field_j.a(1, 1, re.a(il.field_fb, 4371, new String[1]));
                  if (param1 != -16661) {
                    ((fc) this).field_b = 56L;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (param1 != -16661) {
                  ((fc) this).field_b = 56L;
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param1 != -16661) {
                ((fc) this).field_b = 56L;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param1 != -16661) {
              ((fc) this).field_b = 56L;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param1 != -16661) {
            ((fc) this).field_b = 56L;
            return;
          } else {
            return;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        var6 = ((fc) this).field_j.b(param4, (byte) 93);
        if (-2 == var6) {
          return false;
        } else {
          boolean discarded$9 = this.c(param3, 4, var6);
          boolean discarded$10 = this.a(var6, param0, (byte) 3);
          boolean discarded$11 = this.b(var6, 2, param0);
          if (param2 != -16) {
            return false;
          } else {
            boolean discarded$12 = this.a(param1, var6, 125);
            return true;
          }
        }
    }

    final boolean b(boolean param0) {
        if (param0) {
          if (null != ((fc) this).field_j) {
            if (!((fc) this).field_j.f((byte) 31)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_c = null;
          if (null != ((fc) this).field_j) {
            if (!((fc) this).field_j.f((byte) 31)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        field_g = null;
        int var1 = 124 / ((27 - param0) / 51);
    }

    private final boolean a(int param0, int param1, int param2) {
        if (param2 > 44) {
          if (param1 == 17) {
            tc.field_G = new kh(((fc) this).field_e.field_B, ((fc) this).field_e.field_N, ((fc) this).field_e.field_K, ((fc) this).field_e.field_mb, param0, ho.field_j, un.field_g, po.field_d, ii.field_u, fk.field_i, gn.field_w, ((fc) this).field_k, ((fc) this).field_b);
            return true;
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (8 != param0) {
          if (param0 != -19) {
            if (-12 != param0) {
              if (12 == param0) {
                gb.a((byte) -96, param2, 1, ((fc) this).field_l);
                if (param1 != 2) {
                  return false;
                } else {
                  return true;
                }
              } else {
                if (param0 != 13) {
                  if (-15 == (param0 ^ -1)) {
                    po.a(54);
                    if (param1 != 2) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    if (20 == param0) {
                      rg.a(true);
                      if (param1 != 2) {
                        return false;
                      } else {
                        return true;
                      }
                    } else {
                      if ((param0 ^ -1) == -20) {
                        boolean discarded$1 = tk.a(((fc) this).field_b, ((fc) this).field_k, false, ((fc) this).field_i, ((fc) this).field_l);
                        if (param1 != 2) {
                          return false;
                        } else {
                          return true;
                        }
                      } else {
                        return false;
                      }
                    }
                  }
                } else {
                  gb.a((byte) -96, param2, 2, ((fc) this).field_l);
                  if (param1 != 2) {
                    return false;
                  } else {
                    return true;
                  }
                }
              }
            } else {
              gb.a((byte) 49, param2, 0, ((fc) this).field_l);
              if (param1 != 2) {
                return false;
              } else {
                return true;
              }
            }
          } else {
            i.a((byte) 49, ((fc) this).field_k, ((fc) this).field_b);
            if (param1 != 2) {
              return false;
            } else {
              return true;
            }
          }
        } else {
          kg.a(-125, ((fc) this).field_b, ((fc) this).field_k);
          if (param1 != 2) {
            return false;
          } else {
            return true;
          }
        }
    }

    private final boolean a(int param0, int param1, byte param2) {
        Object var4 = null;
        Object var5 = null;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        var4 = null;
        if (param2 == 3) {
          if (-5 != param0) {
            if (-6 != param0) {
              if (6 != param0) {
                if (7 == param0) {
                  L0: {
                    var7 = os.a((byte) 117, param1, ((fc) this).field_h, ((fc) this).field_k);
                    if (var7 != null) {
                      var5 = null;
                      md.a(2, var7, 0, ((fc) this).field_k, (String) null, -16169);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return true;
                } else {
                  return false;
                }
              } else {
                L1: {
                  var8 = vq.a(2, ((fc) this).field_k, param1);
                  if (var8 != null) {
                    var5 = null;
                    md.a(2, var8, 0, ((fc) this).field_k, (String) null, -16169);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return true;
              }
            } else {
              var6 = o.a((byte) -107, param1, ((fc) this).field_k);
              if (var6 == null) {
                return true;
              } else {
                var5 = null;
                md.a(2, var6, 0, ((fc) this).field_k, (String) null, -16169);
                return true;
              }
            }
          } else {
            L2: {
              var9 = nj.a(((fc) this).field_k, param1, (byte) -119);
              if (var9 != null) {
                var5 = null;
                md.a(2, var9, 0, ((fc) this).field_k, (String) null, -16169);
                break L2;
              } else {
                break L2;
              }
            }
            return true;
          }
        } else {
          return true;
        }
    }

    final void a(int[] param0, int param1, byte param2) {
        String var4 = null;
        ve var5 = null;
        int var6 = 0;
        String var7 = null;
        if (((fc) this).field_k != null) {
          if ((((fc) this).field_b ^ -1L) == (ec.field_p ^ -1L)) {
            if (-3 == param1) {
              if (-3 == po.field_b) {
                L0: {
                  var7 = this.a(-121);
                  var4 = var7;
                  var5 = hb.a((byte) -90, ((fc) this).field_k);
                  var6 = ti.a(((fc) this).field_k, true) ? 1 : 0;
                  if (var5 != null) {
                    break L0;
                  } else {
                    if (var6 == 0) {
                      ((fc) this).field_j.a(1, 4, re.a(ti.field_j, 4371, new String[1]));
                      ((fc) this).field_j.a(1, 6, re.a(ts.field_F, 4371, new String[1]));
                      if (param0 == null) {
                        break L0;
                      } else {
                        if (param1 == 2) {
                          break L0;
                        } else {
                          if (bg.field_g) {
                            break L0;
                          } else {
                            ((fc) this).field_i = param0;
                            ((fc) this).field_j.a(1, 19, re.a(ri.field_G, 4371, new String[1]));
                            break L0;
                          }
                        }
                      }
                    } else {
                      break L0;
                    }
                  }
                }
                if (var5 == null) {
                  if (var6 != 0) {
                    ((fc) this).field_j.a(1, 7, re.a(fk.field_m, 4371, new String[1]));
                    if (param2 < -13) {
                      return;
                    } else {
                      ((fc) this).a(false, -97);
                      return;
                    }
                  } else {
                    if (param2 < -13) {
                      return;
                    } else {
                      ((fc) this).a(false, -97);
                      return;
                    }
                  }
                } else {
                  if (fs.a(-68, ((fc) this).field_k)) {
                    L1: {
                      ((fc) this).field_j.a(1, 5, re.a(kg.field_C, 4371, new String[1]));
                      if (var6 != 0) {
                        ((fc) this).field_j.a(1, 7, re.a(fk.field_m, 4371, new String[1]));
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    if (param2 >= -13) {
                      ((fc) this).a(false, -97);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (!bg.field_g) {
                      if (ae.field_b) {
                        ((fc) this).field_j.a(1, 18, re.a(se.field_e, 4371, new String[1]));
                        if (param0 == null) {
                          L2: {
                            ((fc) this).field_j.a(1, 5, re.a(kg.field_C, 4371, new String[1]));
                            if (var6 != 0) {
                              ((fc) this).field_j.a(1, 7, re.a(fk.field_m, 4371, new String[1]));
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                          if (param2 >= -13) {
                            ((fc) this).a(false, -97);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          ((fc) this).field_i = param0;
                          ((fc) this).field_j.a(1, 19, re.a(ri.field_G, 4371, new String[1]));
                          L3: {
                            ((fc) this).field_j.a(1, 5, re.a(kg.field_C, 4371, new String[1]));
                            if (var6 != 0) {
                              ((fc) this).field_j.a(1, 7, re.a(fk.field_m, 4371, new String[1]));
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          if (param2 >= -13) {
                            ((fc) this).a(false, -97);
                            return;
                          } else {
                            return;
                          }
                        }
                      } else {
                        ((fc) this).field_j.a(1, 8, re.a(tk.field_B, 4371, new String[1]));
                        ((fc) this).field_j.a(1, 18, re.a(se.field_e, 4371, new String[1]));
                        if (param0 == null) {
                          L4: {
                            ((fc) this).field_j.a(1, 5, re.a(kg.field_C, 4371, new String[1]));
                            if (var6 != 0) {
                              ((fc) this).field_j.a(1, 7, re.a(fk.field_m, 4371, new String[1]));
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          L5: {
                            if (param2 < -13) {
                              break L5;
                            } else {
                              ((fc) this).a(false, -97);
                              break L5;
                            }
                          }
                          return;
                        } else {
                          ((fc) this).field_i = param0;
                          ((fc) this).field_j.a(1, 19, re.a(ri.field_G, 4371, new String[1]));
                          L6: {
                            ((fc) this).field_j.a(1, 5, re.a(kg.field_C, 4371, new String[1]));
                            if (var6 != 0) {
                              ((fc) this).field_j.a(1, 7, re.a(fk.field_m, 4371, new String[1]));
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          L7: {
                            if (param2 < -13) {
                              break L7;
                            } else {
                              ((fc) this).a(false, -97);
                              break L7;
                            }
                          }
                          return;
                        }
                      }
                    } else {
                      L8: {
                        ((fc) this).field_j.a(1, 5, re.a(kg.field_C, 4371, new String[1]));
                        if (var6 != 0) {
                          ((fc) this).field_j.a(1, 7, re.a(fk.field_m, 4371, new String[1]));
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      if (param2 >= -13) {
                        ((fc) this).a(false, -97);
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              } else {
                if (param2 >= -13) {
                  ((fc) this).a(false, -97);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param2 >= -13) {
                ((fc) this).a(false, -97);
                return;
              } else {
                return;
              }
            }
          } else {
            L9: {
              if (-3 != (po.field_b ^ -1)) {
                break L9;
              } else {
                L10: {
                  var7 = this.a(-121);
                  var4 = var7;
                  var5 = hb.a((byte) -90, ((fc) this).field_k);
                  var6 = ti.a(((fc) this).field_k, true) ? 1 : 0;
                  if (var5 != null) {
                    break L10;
                  } else {
                    if (var6 == 0) {
                      ((fc) this).field_j.a(1, 4, re.a(ti.field_j, 4371, new String[1]));
                      ((fc) this).field_j.a(1, 6, re.a(ts.field_F, 4371, new String[1]));
                      if (param0 == null) {
                        break L10;
                      } else {
                        if (param1 == 2) {
                          break L10;
                        } else {
                          if (bg.field_g) {
                            break L10;
                          } else {
                            ((fc) this).field_i = param0;
                            ((fc) this).field_j.a(1, 19, re.a(ri.field_G, 4371, new String[1]));
                            break L10;
                          }
                        }
                      }
                    } else {
                      break L10;
                    }
                  }
                }
                if (var5 == null) {
                  if (var6 != 0) {
                    ((fc) this).field_j.a(1, 7, re.a(fk.field_m, 4371, new String[1]));
                    break L9;
                  } else {
                    L11: {
                      if (param2 < -13) {
                        break L11;
                      } else {
                        ((fc) this).a(false, -97);
                        break L11;
                      }
                    }
                    return;
                  }
                } else {
                  if (!fs.a(-68, ((fc) this).field_k)) {
                    if (!bg.field_g) {
                      L12: {
                        if (ae.field_b) {
                          break L12;
                        } else {
                          ((fc) this).field_j.a(1, 8, re.a(tk.field_B, 4371, new String[1]));
                          break L12;
                        }
                      }
                      ((fc) this).field_j.a(1, 18, re.a(se.field_e, 4371, new String[1]));
                      if (param0 != null) {
                        ((fc) this).field_i = param0;
                        ((fc) this).field_j.a(1, 19, re.a(ri.field_G, 4371, new String[1]));
                        L13: {
                          ((fc) this).field_j.a(1, 5, re.a(kg.field_C, 4371, new String[1]));
                          if (var6 != 0) {
                            ((fc) this).field_j.a(1, 7, re.a(fk.field_m, 4371, new String[1]));
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        L14: {
                          if (param2 < -13) {
                            break L14;
                          } else {
                            ((fc) this).a(false, -97);
                            break L14;
                          }
                        }
                        return;
                      } else {
                        L15: {
                          ((fc) this).field_j.a(1, 5, re.a(kg.field_C, 4371, new String[1]));
                          if (var6 != 0) {
                            ((fc) this).field_j.a(1, 7, re.a(fk.field_m, 4371, new String[1]));
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        L16: {
                          if (param2 < -13) {
                            break L16;
                          } else {
                            ((fc) this).a(false, -97);
                            break L16;
                          }
                        }
                        return;
                      }
                    } else {
                      L17: {
                        ((fc) this).field_j.a(1, 5, re.a(kg.field_C, 4371, new String[1]));
                        if (var6 != 0) {
                          ((fc) this).field_j.a(1, 7, re.a(fk.field_m, 4371, new String[1]));
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      L18: {
                        if (param2 < -13) {
                          break L18;
                        } else {
                          ((fc) this).a(false, -97);
                          break L18;
                        }
                      }
                      return;
                    }
                  } else {
                    L19: {
                      ((fc) this).field_j.a(1, 5, re.a(kg.field_C, 4371, new String[1]));
                      if (var6 != 0) {
                        ((fc) this).field_j.a(1, 7, re.a(fk.field_m, 4371, new String[1]));
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      if (param2 < -13) {
                        break L20;
                      } else {
                        ((fc) this).a(false, -97);
                        break L20;
                      }
                    }
                    return;
                  }
                }
              }
            }
            if (param2 >= -13) {
              ((fc) this).a(false, -97);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param2 >= -13) {
            ((fc) this).a(false, -97);
            return;
          } else {
            return;
          }
        }
    }

    private final String a(int param0) {
        String var2 = null;
        L0: {
          if (null == ((fc) this).field_h) {
            var2 = ((fc) this).field_k;
            break L0;
          } else {
            var2 = ((fc) this).field_h;
            break L0;
          }
        }
        if (param0 >= -117) {
          return null;
        } else {
          return var2;
        }
    }

    final void b(int param0) {
        String var2 = null;
        String var3 = null;
        if (param0 == 17) {
          if (((fc) this).field_k != null) {
            if ((ec.field_p ^ -1L) == (((fc) this).field_b ^ -1L)) {
              return;
            } else {
              var3 = this.a(-127);
              var2 = var3;
              ((fc) this).field_j.a(1, 17, re.a(ml.field_m, 4371, new String[1]));
              return;
            }
          } else {
            return;
          }
        } else {
          ((fc) this).field_i = null;
          if (((fc) this).field_k == null) {
            return;
          } else {
            L0: {
              if ((ec.field_p ^ -1L) != (((fc) this).field_b ^ -1L)) {
                var3 = this.a(-127);
                var2 = var3;
                ((fc) this).field_j.a(1, 17, re.a(ml.field_m, 4371, new String[1]));
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    final static int a(int param0, CharSequence param1, byte param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 >= 2) {
          if (36 >= param0) {
            var5 = 75 / ((param2 - -37) / 58);
            var4 = 0;
            var6 = 0;
            var7 = 0;
            var8 = param1.length();
            var9 = 0;
            L0: while (true) {
              if (var8 <= var9) {
                if (var6 == 0) {
                  throw new NumberFormatException();
                } else {
                  return var7;
                }
              } else {
                L1: {
                  var10 = param1.charAt(var9);
                  if (0 == var9) {
                    if (45 == var10) {
                      var4 = 1;
                      var9++;
                      continue L0;
                    } else {
                      if (var10 != 43) {
                        break L1;
                      } else {
                        if (!param3) {
                          break L1;
                        } else {
                          var9++;
                          continue L0;
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    if (48 > var10) {
                      break L3;
                    } else {
                      if (var10 <= 57) {
                        var10 -= 48;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var10 < 65) {
                      break L4;
                    } else {
                      if (var10 > 90) {
                        break L4;
                      } else {
                        var10 -= 55;
                        break L2;
                      }
                    }
                  }
                  L5: {
                    if (var10 < 97) {
                      break L5;
                    } else {
                      if (var10 <= 122) {
                        var10 -= 87;
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  throw new NumberFormatException();
                }
                if (var10 >= param0) {
                  throw new NumberFormatException();
                } else {
                  L6: {
                    if (var4 != 0) {
                      var10 = -var10;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var11 = var7 * param0 - -var10;
                  if (var11 / param0 == var7) {
                    var6 = 1;
                    var7 = var11;
                    var9++;
                    continue L0;
                  } else {
                    throw new NumberFormatException();
                  }
                }
              }
            }
          } else {
            throw new IllegalArgumentException("" + param0);
          }
        } else {
          throw new IllegalArgumentException("" + param0);
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 != 13505) {
          ((fc) this).field_e = null;
          ((fc) this).field_j.b(param1, 122);
          return;
        } else {
          ((fc) this).field_j.b(param1, 122);
          return;
        }
    }

    final void a(nf param0, byte param1) {
        if (!param0.field_h) {
          ((fc) this).field_l = param0.field_n;
          if (-1 == (param0.field_n ^ -1)) {
            if (vm.field_Bb != 0) {
              L0: {
                ((fc) this).field_j.a(1, 13, ah.field_O);
                if ((param0.field_n ^ -1) != -2) {
                  break L0;
                } else {
                  L1: {
                    if (sq.field_a == 0) {
                      ((fc) this).field_j.a(1, 12, he.field_m);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  ((fc) this).field_j.a(1, 13, gn.field_A);
                  break L0;
                }
              }
              if (param1 >= -67) {
                ((fc) this).b(-9);
                if (2 == param0.field_n) {
                  if (0 != ul.field_Hb) {
                    ((fc) this).field_j.a(1, 13, up.field_c);
                    return;
                  } else {
                    ((fc) this).field_j.a(1, 12, hj.field_m);
                    ((fc) this).field_j.a(1, 13, up.field_c);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (2 == param0.field_n) {
                  if (0 != ul.field_Hb) {
                    ((fc) this).field_j.a(1, 13, up.field_c);
                    return;
                  } else {
                    ((fc) this).field_j.a(1, 12, hj.field_m);
                    ((fc) this).field_j.a(1, 13, up.field_c);
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              ((fc) this).field_j.a(1, 12, wg.field_c);
              L2: {
                ((fc) this).field_j.a(1, 13, ah.field_O);
                if ((param0.field_n ^ -1) != -2) {
                  break L2;
                } else {
                  L3: {
                    if (sq.field_a == 0) {
                      ((fc) this).field_j.a(1, 12, he.field_m);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ((fc) this).field_j.a(1, 13, gn.field_A);
                  break L2;
                }
              }
              if (param1 < -67) {
                if (2 == param0.field_n) {
                  if (0 != ul.field_Hb) {
                    ((fc) this).field_j.a(1, 13, up.field_c);
                    return;
                  } else {
                    ((fc) this).field_j.a(1, 12, hj.field_m);
                    ((fc) this).field_j.a(1, 13, up.field_c);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ((fc) this).b(-9);
                if (2 == param0.field_n) {
                  if (0 != ul.field_Hb) {
                    ((fc) this).field_j.a(1, 13, up.field_c);
                    return;
                  } else {
                    ((fc) this).field_j.a(1, 12, hj.field_m);
                    ((fc) this).field_j.a(1, 13, up.field_c);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            L4: {
              if ((param0.field_n ^ -1) != -2) {
                break L4;
              } else {
                L5: {
                  if (sq.field_a == 0) {
                    ((fc) this).field_j.a(1, 12, he.field_m);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((fc) this).field_j.a(1, 13, gn.field_A);
                break L4;
              }
            }
            if (param1 >= -67) {
              ((fc) this).b(-9);
              if (2 == param0.field_n) {
                if (0 != ul.field_Hb) {
                  ((fc) this).field_j.a(1, 13, up.field_c);
                  return;
                } else {
                  ((fc) this).field_j.a(1, 12, hj.field_m);
                  ((fc) this).field_j.a(1, 13, up.field_c);
                  return;
                }
              } else {
                return;
              }
            } else {
              if (2 == param0.field_n) {
                if (0 != ul.field_Hb) {
                  ((fc) this).field_j.a(1, 13, up.field_c);
                  return;
                } else {
                  ((fc) this).field_j.a(1, 12, hj.field_m);
                  ((fc) this).field_j.a(1, 13, up.field_c);
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(boolean param0) {
        String var3 = null;
        int var4 = 0;
        fb var6 = null;
        fb var7 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0) {
          ((fc) this).field_e = null;
          if (null == np.field_a) {
            var7 = eg.a(((fc) this).field_f, 30888);
            if (var7 != null) {
              var3 = var7.field_Xb;
              if (!var7.field_Jb) {
                if (!var7.field_cc) {
                  L0: {
                    if (var7.field_Yb) {
                      break L0;
                    } else {
                      if (!var7.field_mc) {
                        break L0;
                      } else {
                        if (!var7.field_Ab) {
                          ((fc) this).field_j.a(1, 2, re.a(co.field_r, 4371, new String[1]));
                          if (!var7.field_Yb) {
                            return;
                          } else {
                            ((fc) this).field_j.a(1, 3, re.a(im.field_a, 4371, new String[1]));
                            return;
                          }
                        } else {
                          if (var7.field_cc) {
                            ((fc) this).field_j.a(1, 2, re.a(co.field_r, 4371, new String[1]));
                            if (!var7.field_Yb) {
                              return;
                            } else {
                              ((fc) this).field_j.a(1, 3, re.a(im.field_a, 4371, new String[1]));
                              return;
                            }
                          } else {
                            if (var7.field_Yb) {
                              ((fc) this).field_j.a(1, 3, re.a(im.field_a, 4371, new String[1]));
                              return;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (!var7.field_Yb) {
                    return;
                  } else {
                    ((fc) this).field_j.a(1, 3, re.a(im.field_a, 4371, new String[1]));
                    return;
                  }
                } else {
                  ((fc) this).field_j.a(1, 2, re.a(ta.field_c, 4371, new String[1]));
                  if (var7.field_Yb) {
                    ((fc) this).field_j.a(1, 3, re.a(im.field_a, 4371, new String[1]));
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                ((fc) this).field_j.a(1, 2, re.a(bc.field_i, 4371, new String[1]));
                ((fc) this).field_j.a(1, 3, re.a(sq.field_i, 4371, new String[1]));
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          if (null == np.field_a) {
            var6 = eg.a(((fc) this).field_f, 30888);
            if (var6 != null) {
              var3 = var6.field_Xb;
              if (!var6.field_Jb) {
                if (!var6.field_cc) {
                  L1: {
                    if (var6.field_Yb) {
                      break L1;
                    } else {
                      if (!var6.field_mc) {
                        break L1;
                      } else {
                        if (var6.field_Ab) {
                          if (var6.field_cc) {
                            ((fc) this).field_j.a(1, 2, re.a(co.field_r, 4371, new String[1]));
                            if (var6.field_Yb) {
                              ((fc) this).field_j.a(1, 3, re.a(im.field_a, 4371, new String[1]));
                              return;
                            } else {
                              return;
                            }
                          } else {
                            L2: {
                              if (!var6.field_Yb) {
                                break L2;
                              } else {
                                ((fc) this).field_j.a(1, 3, re.a(im.field_a, 4371, new String[1]));
                                break L2;
                              }
                            }
                            return;
                          }
                        } else {
                          L3: {
                            ((fc) this).field_j.a(1, 2, re.a(co.field_r, 4371, new String[1]));
                            if (!var6.field_Yb) {
                              break L3;
                            } else {
                              ((fc) this).field_j.a(1, 3, re.a(im.field_a, 4371, new String[1]));
                              break L3;
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                  if (var6.field_Yb) {
                    ((fc) this).field_j.a(1, 3, re.a(im.field_a, 4371, new String[1]));
                    return;
                  } else {
                    return;
                  }
                } else {
                  L4: {
                    ((fc) this).field_j.a(1, 2, re.a(ta.field_c, 4371, new String[1]));
                    if (!var6.field_Yb) {
                      break L4;
                    } else {
                      ((fc) this).field_j.a(1, 3, re.a(im.field_a, 4371, new String[1]));
                      break L4;
                    }
                  }
                  return;
                }
              } else {
                ((fc) this).field_j.a(1, 2, re.a(bc.field_i, 4371, new String[1]));
                ((fc) this).field_j.a(1, 3, re.a(sq.field_i, 4371, new String[1]));
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

    private final boolean c(int param0, int param1, int param2) {
        int var5 = 0;
        Object var6 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 != 4) {
          var6 = null;
          int discarded$1 = fc.a(-97, (CharSequence) null, (byte) 99, true);
          if (0 != param2) {
            if (-2 != param2) {
              if (-3 != param2) {
                if ((param2 ^ -1) != -4) {
                  if ((param2 ^ -1) != -11) {
                    if ((param2 ^ -1) != -16) {
                      if (16 == param2) {
                        dd.a(0, param0, 71);
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      dd.a(((fc) this).field_f, param0, param1 + 93);
                      return true;
                    }
                  } else {
                    os.a(((fc) this).field_f, param0, true);
                    return true;
                  }
                } else {
                  tk.a(param0, ((fc) this).field_f, (byte) -2);
                  return true;
                }
              } else {
                sq.a(-25, param0, ((fc) this).field_f);
                return true;
              }
            } else {
              bc.a(param0, (byte) 2, ((fc) this).field_b);
              return true;
            }
          } else {
            tj.a((byte) 92, param0, ((fc) this).field_b);
            return true;
          }
        } else {
          if (0 != param2) {
            if (-2 != param2) {
              if (-3 != param2) {
                if ((param2 ^ -1) != -4) {
                  if ((param2 ^ -1) != -11) {
                    if ((param2 ^ -1) != -16) {
                      if (16 == param2) {
                        dd.a(0, param0, 71);
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      dd.a(((fc) this).field_f, param0, param1 + 93);
                      return true;
                    }
                  } else {
                    os.a(((fc) this).field_f, param0, true);
                    return true;
                  }
                } else {
                  tk.a(param0, ((fc) this).field_f, (byte) -2);
                  return true;
                }
              } else {
                sq.a(-25, param0, ((fc) this).field_f);
                return true;
              }
            } else {
              bc.a(param0, (byte) 2, ((fc) this).field_b);
              return true;
            }
          } else {
            tj.a((byte) 92, param0, ((fc) this).field_b);
            return true;
          }
        }
    }

    fc(qr param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        ((fc) this).field_j = new ul(hd.field_t);
        ((fc) this).field_i = param6;
        ((fc) this).field_b = param1;
        ((fc) this).field_l = param5;
        param0.field_bb = true;
        ((fc) this).field_k = param2;
        ((fc) this).field_f = param4;
        ((fc) this).field_e = param0;
        ((fc) this).field_h = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Withdraw invitation to <%0> to join this game";
        field_a = false;
        field_d = "You must play 1 more rated game before playing with the current options.";
        field_g = new int[4];
    }
}
