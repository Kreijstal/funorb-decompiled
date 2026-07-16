/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    private int field_e;
    static boolean field_m;
    private boolean field_r;
    private int field_h;
    private int field_d;
    private int field_x;
    private int field_q;
    private int field_i;
    static dd field_g;
    private int field_l;
    static String field_k;
    static int field_u;
    private int field_a;
    static String field_s;
    private int field_b;
    private int field_n;
    static int[] field_t;
    private int field_w;
    private int field_c;
    private int field_j;
    private int field_f;
    private int field_o;
    private le field_p;
    private float field_v;

    final void a(int param0) {
        ((va) this).field_p.a(((va) this).field_b, -1062, ((va) this).field_c);
        if (param0 > -113) {
            field_m = true;
        }
    }

    private final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = fleas.field_A ? 1 : 0;
        var2 = ((va) this).field_o;
        var3 = ((va) this).field_l;
        if (((va) this).c((byte) -114)) {
          L0: {
            if (var2 <= ((va) this).field_w) {
              if (var2 >= ((va) this).field_e) {
                break L0;
              } else {
                var2 = ((va) this).field_e;
                break L0;
              }
            } else {
              var2 = ((va) this).field_w;
              break L0;
            }
          }
          L1: {
            if (var3 <= ((va) this).field_q) {
              if (((va) this).field_a > var3) {
                var3 = ((va) this).field_a;
                break L1;
              } else {
                if (((va) this).field_v > 0.0f) {
                  var4 = (int)((float)var3 * ((va) this).field_v + 0.5f);
                  if (var4 > var2) {
                    var3 = (int)((float)var2 / ((va) this).field_v);
                    if (var2 != ki.field_a) {
                      L2: {
                        ((va) this).field_p.a(var3, param0 + -1001, var2);
                        if (((va) this).field_o > 0) {
                          field_u = (-ki.field_a + ((va) this).field_o) / 2;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      if (param0 != -61) {
                        ((va) this).field_q = 84;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (gm.field_nb == var3) {
                        L3: {
                          if (((va) this).field_o > 0) {
                            field_u = (-ki.field_a + ((va) this).field_o) / 2;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        if (param0 != -61) {
                          ((va) this).field_q = 84;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        L4: {
                          ((va) this).field_p.a(var3, param0 + -1001, var2);
                          if (((va) this).field_o > 0) {
                            field_u = (-ki.field_a + ((va) this).field_o) / 2;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        if (param0 != -61) {
                          ((va) this).field_q = 84;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    if (var2 > var4) {
                      var2 = var4;
                      if (var2 != ki.field_a) {
                        L5: {
                          ((va) this).field_p.a(var3, param0 + -1001, var2);
                          if (((va) this).field_o > 0) {
                            field_u = (-ki.field_a + ((va) this).field_o) / 2;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        if (param0 != -61) {
                          ((va) this).field_q = 84;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (gm.field_nb == var3) {
                          L6: {
                            if (((va) this).field_o > 0) {
                              field_u = (-ki.field_a + ((va) this).field_o) / 2;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          if (param0 != -61) {
                            ((va) this).field_q = 84;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          L7: {
                            ((va) this).field_p.a(var3, param0 + -1001, var2);
                            if (((va) this).field_o > 0) {
                              field_u = (-ki.field_a + ((va) this).field_o) / 2;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          if (param0 == -61) {
                            return;
                          } else {
                            ((va) this).field_q = 84;
                            return;
                          }
                        }
                      }
                    } else {
                      L8: {
                        L9: {
                          if (var2 != ki.field_a) {
                            break L9;
                          } else {
                            if (gm.field_nb == var3) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        ((va) this).field_p.a(var3, param0 + -1001, var2);
                        break L8;
                      }
                      L10: {
                        if (((va) this).field_o > 0) {
                          field_u = (-ki.field_a + ((va) this).field_o) / 2;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      if (param0 != -61) {
                        ((va) this).field_q = 84;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if (var2 == ki.field_a) {
                    if (gm.field_nb == var3) {
                      L11: {
                        if (((va) this).field_o > 0) {
                          field_u = (-ki.field_a + ((va) this).field_o) / 2;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (param0 == -61) {
                          break L12;
                        } else {
                          ((va) this).field_q = 84;
                          break L12;
                        }
                      }
                      return;
                    } else {
                      L13: {
                        ((va) this).field_p.a(var3, param0 + -1001, var2);
                        if (((va) this).field_o > 0) {
                          field_u = (-ki.field_a + ((va) this).field_o) / 2;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        if (param0 == -61) {
                          break L14;
                        } else {
                          ((va) this).field_q = 84;
                          break L14;
                        }
                      }
                      return;
                    }
                  } else {
                    L15: {
                      ((va) this).field_p.a(var3, param0 + -1001, var2);
                      if (((va) this).field_o > 0) {
                        field_u = (-ki.field_a + ((va) this).field_o) / 2;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    L16: {
                      if (param0 == -61) {
                        break L16;
                      } else {
                        ((va) this).field_q = 84;
                        break L16;
                      }
                    }
                    return;
                  }
                }
              }
            } else {
              var3 = ((va) this).field_q;
              break L1;
            }
          }
          if (((va) this).field_v > 0.0f) {
            var4 = (int)((float)var3 * ((va) this).field_v + 0.5f);
            if (var4 > var2) {
              var3 = (int)((float)var2 / ((va) this).field_v);
              if (var2 != ki.field_a) {
                L17: {
                  ((va) this).field_p.a(var3, param0 + -1001, var2);
                  if (((va) this).field_o > 0) {
                    field_u = (-ki.field_a + ((va) this).field_o) / 2;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                if (param0 == -61) {
                  return;
                } else {
                  ((va) this).field_q = 84;
                  return;
                }
              } else {
                if (gm.field_nb == var3) {
                  L18: {
                    if (((va) this).field_o > 0) {
                      field_u = (-ki.field_a + ((va) this).field_o) / 2;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  if (param0 == -61) {
                    return;
                  } else {
                    ((va) this).field_q = 84;
                    return;
                  }
                } else {
                  L19: {
                    ((va) this).field_p.a(var3, param0 + -1001, var2);
                    if (((va) this).field_o > 0) {
                      field_u = (-ki.field_a + ((va) this).field_o) / 2;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  if (param0 == -61) {
                    return;
                  } else {
                    ((va) this).field_q = 84;
                    return;
                  }
                }
              }
            } else {
              if (var2 > var4) {
                var2 = var4;
                if (var2 != ki.field_a) {
                  L20: {
                    ((va) this).field_p.a(var3, param0 + -1001, var2);
                    if (((va) this).field_o > 0) {
                      field_u = (-ki.field_a + ((va) this).field_o) / 2;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  if (param0 == -61) {
                    return;
                  } else {
                    ((va) this).field_q = 84;
                    return;
                  }
                } else {
                  if (gm.field_nb == var3) {
                    L21: {
                      if (((va) this).field_o > 0) {
                        field_u = (-ki.field_a + ((va) this).field_o) / 2;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    if (param0 == -61) {
                      return;
                    } else {
                      ((va) this).field_q = 84;
                      return;
                    }
                  } else {
                    L22: {
                      ((va) this).field_p.a(var3, param0 + -1001, var2);
                      if (((va) this).field_o > 0) {
                        field_u = (-ki.field_a + ((va) this).field_o) / 2;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    if (param0 != -61) {
                      ((va) this).field_q = 84;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                if (var2 != ki.field_a) {
                  L23: {
                    ((va) this).field_p.a(var3, param0 + -1001, var2);
                    if (((va) this).field_o > 0) {
                      field_u = (-ki.field_a + ((va) this).field_o) / 2;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  if (param0 == -61) {
                    return;
                  } else {
                    ((va) this).field_q = 84;
                    return;
                  }
                } else {
                  if (gm.field_nb == var3) {
                    L24: {
                      if (((va) this).field_o > 0) {
                        field_u = (-ki.field_a + ((va) this).field_o) / 2;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    if (param0 == -61) {
                      return;
                    } else {
                      ((va) this).field_q = 84;
                      return;
                    }
                  } else {
                    L25: {
                      ((va) this).field_p.a(var3, param0 + -1001, var2);
                      if (((va) this).field_o > 0) {
                        field_u = (-ki.field_a + ((va) this).field_o) / 2;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    if (param0 == -61) {
                      return;
                    } else {
                      ((va) this).field_q = 84;
                      return;
                    }
                  }
                }
              }
            }
          } else {
            if (var2 == ki.field_a) {
              if (gm.field_nb != var3) {
                L26: {
                  ((va) this).field_p.a(var3, param0 + -1001, var2);
                  if (((va) this).field_o > 0) {
                    field_u = (-ki.field_a + ((va) this).field_o) / 2;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                if (param0 == -61) {
                  return;
                } else {
                  ((va) this).field_q = 84;
                  return;
                }
              } else {
                L27: {
                  if (((va) this).field_o > 0) {
                    field_u = (-ki.field_a + ((va) this).field_o) / 2;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                if (param0 == -61) {
                  return;
                } else {
                  ((va) this).field_q = 84;
                  return;
                }
              }
            } else {
              L28: {
                ((va) this).field_p.a(var3, param0 + -1001, var2);
                if (((va) this).field_o > 0) {
                  field_u = (-ki.field_a + ((va) this).field_o) / 2;
                  break L28;
                } else {
                  break L28;
                }
              }
              if (param0 == -61) {
                return;
              } else {
                ((va) this).field_q = 84;
                return;
              }
            }
          }
        } else {
          ((va) this).field_r = false;
          return;
        }
    }

    final vb b(int param0) {
        vb var2 = null;
        ((va) this).field_c = ki.field_a;
        ((va) this).field_b = gm.field_nb;
        ((va) this).field_p.a(((va) this).field_h, param0 + 6874, ((va) this).field_f);
        if (param0 == -7936) {
          h.field_h = false;
          var2 = wf.a(0, ((va) this).field_f, 0, fg.field_q, 0, ((va) this).field_h);
          if (var2 == null) {
            ((va) this).a(-121);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((va) this).field_n = -70;
          h.field_h = false;
          var2 = wf.a(0, ((va) this).field_f, 0, fg.field_q, 0, ((va) this).field_h);
          if (var2 != null) {
            return var2;
          } else {
            ((va) this).a(-121);
            return var2;
          }
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        if (null != rh.field_p) {
          return;
        } else {
          L0: {
            if (-1 <= (wc.field_q ^ -1)) {
              ((va) this).field_r = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (((va) this).field_r) {
            int fieldTemp$1 = ((va) this).field_n - 1;
            ((va) this).field_n = ((va) this).field_n - 1;
            if (-1 > (fieldTemp$1 ^ -1)) {
              return;
            } else {
              ((va) this).field_n = ((va) this).field_d;
              if ((((va) this).field_j ^ -1) >= (kf.field_k ^ -1)) {
                this.d((byte) -61);
                var2 = -56 / ((param0 - 24) / 47);
                return;
              } else {
                ((va) this).field_r = false;
                return;
              }
            }
          } else {
            if (ki.field_a < ((va) this).field_o) {
              field_u = (-ki.field_a + ((va) this).field_o) / 2;
              if (ki.field_a != ((va) this).field_x) {
                ((va) this).field_p.a(((va) this).field_i, -1062, ((va) this).field_x);
                return;
              } else {
                if ((((va) this).field_i ^ -1) != (gm.field_nb ^ -1)) {
                  ((va) this).field_p.a(((va) this).field_i, -1062, ((va) this).field_x);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (-1 <= (((va) this).field_o ^ -1)) {
                if (ki.field_a != ((va) this).field_x) {
                  ((va) this).field_p.a(((va) this).field_i, -1062, ((va) this).field_x);
                  return;
                } else {
                  if ((((va) this).field_i ^ -1) == (gm.field_nb ^ -1)) {
                    return;
                  } else {
                    ((va) this).field_p.a(((va) this).field_i, -1062, ((va) this).field_x);
                    return;
                  }
                }
              } else {
                field_u = 0;
                if (ki.field_a != ((va) this).field_x) {
                  ((va) this).field_p.a(((va) this).field_i, -1062, ((va) this).field_x);
                  return;
                } else {
                  if ((((va) this).field_i ^ -1) != (gm.field_nb ^ -1)) {
                    ((va) this).field_p.a(((va) this).field_i, -1062, ((va) this).field_x);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final static bh a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int[] param7, int param8) {
        int var10 = -124 % ((param5 - 37) / 55);
        bh var9 = new bh(param1, param3, param4, param2, param0, param8, param7);
        wi.field_j.a(false, (lh) (Object) var9);
        s.a(-4471, param6, var9);
        return var9;
    }

    final void a(int param0, int param1, int param2) {
        ((va) this).field_o = param0;
        if (param1 != 0) {
            ((va) this).field_d = -117;
            ((va) this).field_l = param2;
            return;
        }
        ((va) this).field_l = param2;
    }

    final boolean c(byte param0) {
        int var2 = 0;
        var2 = -30 / ((-74 - param0) / 38);
        if (kf.field_k >= ((va) this).field_j) {
          if ((wc.field_q ^ -1) >= -1) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void b(byte param0) {
        field_t = null;
        field_k = null;
        field_g = null;
        field_s = null;
        if (param0 != 126) {
            Object var2 = null;
            bh discarded$0 = va.a(-115, -85, -112, -17, 89, (byte) -77, -98, (int[]) null, 75);
        }
    }

    private va() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Type your age in years";
        field_s = "Rescued: <%0>/<%1>";
        field_t = new int[40];
        field_u = 0;
    }
}
