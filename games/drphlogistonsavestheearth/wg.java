/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    private int field_l;
    static he field_c;
    private int field_m;
    private int field_t;
    private int field_p;
    private int field_s;
    private int field_e;
    private wf field_b;
    static String[] field_r;
    static qb field_u;
    private int field_f;
    private int field_n;
    private int field_g;
    private int field_o;
    static boolean field_d;
    private boolean field_q;
    private float field_j;
    private int field_a;
    private int field_i;
    private int field_v;
    static String[] field_h;
    static ql field_k;

    final void a(int param0, int param1, int param2) {
        ((wg) this).field_i = param1;
        ((wg) this).field_s = param0;
        if (param2 != 2) {
            wg.b(99);
        }
    }

    public static void b(int param0) {
        if (param0 != 2) {
          field_h = null;
          field_c = null;
          field_r = null;
          field_h = null;
          field_k = null;
          field_u = null;
          return;
        } else {
          field_c = null;
          field_r = null;
          field_h = null;
          field_k = null;
          field_u = null;
          return;
        }
    }

    final void a(byte param0) {
        if (df.field_l != null) {
          return;
        } else {
          L0: {
            if (0 >= hb.field_g) {
              ((wg) this).field_q = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (((wg) this).field_q) {
            if (param0 >= 120) {
              ((wg) this).field_m = ((wg) this).field_m - 1;
              if (-1 > (((wg) this).field_m - 1 ^ -1)) {
                return;
              } else {
                ((wg) this).field_m = ((wg) this).field_l;
                if (((wg) this).field_v > pe.field_g) {
                  ((wg) this).field_q = false;
                  return;
                } else {
                  this.a(false);
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            if (fg.field_h >= ((wg) this).field_i) {
              if (0 < ((wg) this).field_i) {
                tg.field_b = 0;
                if (((wg) this).field_p == fg.field_h) {
                  if (bh.field_a == ((wg) this).field_t) {
                    return;
                  } else {
                    ((wg) this).field_b.a(((wg) this).field_t, ((wg) this).field_p, -64);
                    return;
                  }
                } else {
                  ((wg) this).field_b.a(((wg) this).field_t, ((wg) this).field_p, -64);
                  return;
                }
              } else {
                if (((wg) this).field_p == fg.field_h) {
                  if (bh.field_a == ((wg) this).field_t) {
                    return;
                  } else {
                    ((wg) this).field_b.a(((wg) this).field_t, ((wg) this).field_p, -64);
                    return;
                  }
                } else {
                  ((wg) this).field_b.a(((wg) this).field_t, ((wg) this).field_p, -64);
                  return;
                }
              }
            } else {
              tg.field_b = (-fg.field_h + ((wg) this).field_i) / 2;
              if (((wg) this).field_p == fg.field_h) {
                if (bh.field_a == ((wg) this).field_t) {
                  return;
                } else {
                  ((wg) this).field_b.a(((wg) this).field_t, ((wg) this).field_p, -64);
                  return;
                }
              } else {
                ((wg) this).field_b.a(((wg) this).field_t, ((wg) this).field_p, -64);
                return;
              }
            }
          }
        }
    }

    final void b(byte param0) {
        if (param0 != -7) {
            return;
        }
        ((wg) this).field_b.a(((wg) this).field_o, ((wg) this).field_e, -64);
    }

    final boolean a(int param0) {
        if (param0 == -30292) {
          if (pe.field_g >= ((wg) this).field_v) {
            if (hb.field_g <= 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((wg) this).field_e = -23;
          if (pe.field_g >= ((wg) this).field_v) {
            if (hb.field_g <= 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static byte[] a(String param0, int param1) {
        if (param1 != 0) {
            field_u = null;
            return fk.field_h.a("", param0, 24874);
        }
        return fk.field_h.a("", param0, 24874);
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0) {
          ((wg) this).field_l = 50;
          var2 = ((wg) this).field_i;
          var3 = ((wg) this).field_s;
          if (((wg) this).a(-30292)) {
            L0: {
              if (var3 > ((wg) this).field_n) {
                var3 = ((wg) this).field_n;
                break L0;
              } else {
                if (((wg) this).field_f > var3) {
                  var3 = ((wg) this).field_f;
                  break L0;
                } else {
                  L1: {
                    if (((wg) this).field_g < var2) {
                      var2 = ((wg) this).field_g;
                      break L1;
                    } else {
                      if (var2 < ((wg) this).field_a) {
                        L2: {
                          var2 = ((wg) this).field_a;
                          if (0.0f < ((wg) this).field_j) {
                            var4 = (int)(0.5f + ((wg) this).field_j * (float)var3);
                            if (var4 <= var2) {
                              if (var4 >= var2) {
                                break L2;
                              } else {
                                var2 = var4;
                                break L2;
                              }
                            } else {
                              var3 = (int)((float)var2 / ((wg) this).field_j);
                              break L2;
                            }
                          } else {
                            break L2;
                          }
                        }
                        L3: {
                          if (fg.field_h != var2) {
                            ((wg) this).field_b.a(var3, var2, -64);
                            break L3;
                          } else {
                            if (var3 != bh.field_a) {
                              ((wg) this).field_b.a(var3, var2, -64);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L4: {
                          if (0 < ((wg) this).field_i) {
                            tg.field_b = (((wg) this).field_i + -fg.field_h) / 2;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        return;
                      } else {
                        break L1;
                      }
                    }
                  }
                  if (0.0f < ((wg) this).field_j) {
                    var4 = (int)(0.5f + ((wg) this).field_j * (float)var3);
                    if (var4 <= var2) {
                      L5: {
                        if (var4 >= var2) {
                          break L5;
                        } else {
                          var2 = var4;
                          break L5;
                        }
                      }
                      if (fg.field_h == var2) {
                        if (var3 == bh.field_a) {
                          L6: {
                            if (0 < ((wg) this).field_i) {
                              tg.field_b = (((wg) this).field_i + -fg.field_h) / 2;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          return;
                        } else {
                          L7: {
                            ((wg) this).field_b.a(var3, var2, -64);
                            if (0 < ((wg) this).field_i) {
                              tg.field_b = (((wg) this).field_i + -fg.field_h) / 2;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          return;
                        }
                      } else {
                        L8: {
                          ((wg) this).field_b.a(var3, var2, -64);
                          if (0 < ((wg) this).field_i) {
                            tg.field_b = (((wg) this).field_i + -fg.field_h) / 2;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        return;
                      }
                    } else {
                      L9: {
                        var3 = (int)((float)var2 / ((wg) this).field_j);
                        if (fg.field_h != var2) {
                          ((wg) this).field_b.a(var3, var2, -64);
                          break L9;
                        } else {
                          if (var3 != bh.field_a) {
                            ((wg) this).field_b.a(var3, var2, -64);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (0 < ((wg) this).field_i) {
                          tg.field_b = (((wg) this).field_i + -fg.field_h) / 2;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      return;
                    }
                  } else {
                    L11: {
                      if (fg.field_h != var2) {
                        ((wg) this).field_b.a(var3, var2, -64);
                        break L11;
                      } else {
                        if (var3 != bh.field_a) {
                          ((wg) this).field_b.a(var3, var2, -64);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (0 < ((wg) this).field_i) {
                        tg.field_b = (((wg) this).field_i + -fg.field_h) / 2;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    return;
                  }
                }
              }
            }
            L13: {
              if (((wg) this).field_g < var2) {
                var2 = ((wg) this).field_g;
                break L13;
              } else {
                if (var2 < ((wg) this).field_a) {
                  L14: {
                    var2 = ((wg) this).field_a;
                    if (0.0f < ((wg) this).field_j) {
                      var4 = (int)(0.5f + ((wg) this).field_j * (float)var3);
                      if (var4 <= var2) {
                        if (var4 >= var2) {
                          break L14;
                        } else {
                          var2 = var4;
                          break L14;
                        }
                      } else {
                        var3 = (int)((float)var2 / ((wg) this).field_j);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (fg.field_h != var2) {
                      ((wg) this).field_b.a(var3, var2, -64);
                      break L15;
                    } else {
                      if (var3 != bh.field_a) {
                        ((wg) this).field_b.a(var3, var2, -64);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  }
                  L16: {
                    if (0 < ((wg) this).field_i) {
                      tg.field_b = (((wg) this).field_i + -fg.field_h) / 2;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  return;
                } else {
                  break L13;
                }
              }
            }
            if (0.0f < ((wg) this).field_j) {
              var4 = (int)(0.5f + ((wg) this).field_j * (float)var3);
              if (var4 <= var2) {
                L17: {
                  if (var4 >= var2) {
                    break L17;
                  } else {
                    var2 = var4;
                    break L17;
                  }
                }
                if (fg.field_h == var2) {
                  if (var3 != bh.field_a) {
                    L18: {
                      ((wg) this).field_b.a(var3, var2, -64);
                      if (0 < ((wg) this).field_i) {
                        tg.field_b = (((wg) this).field_i + -fg.field_h) / 2;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    return;
                  } else {
                    L19: {
                      if (0 < ((wg) this).field_i) {
                        tg.field_b = (((wg) this).field_i + -fg.field_h) / 2;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    return;
                  }
                } else {
                  L20: {
                    ((wg) this).field_b.a(var3, var2, -64);
                    if (0 < ((wg) this).field_i) {
                      tg.field_b = (((wg) this).field_i + -fg.field_h) / 2;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  return;
                }
              } else {
                var3 = (int)((float)var2 / ((wg) this).field_j);
                if (fg.field_h == var2) {
                  if (var3 == bh.field_a) {
                    L21: {
                      if (0 < ((wg) this).field_i) {
                        tg.field_b = (((wg) this).field_i + -fg.field_h) / 2;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    return;
                  } else {
                    L22: {
                      ((wg) this).field_b.a(var3, var2, -64);
                      if (0 < ((wg) this).field_i) {
                        tg.field_b = (((wg) this).field_i + -fg.field_h) / 2;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    return;
                  }
                } else {
                  L23: {
                    ((wg) this).field_b.a(var3, var2, -64);
                    if (0 < ((wg) this).field_i) {
                      tg.field_b = (((wg) this).field_i + -fg.field_h) / 2;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  return;
                }
              }
            } else {
              if (fg.field_h == var2) {
                if (var3 == bh.field_a) {
                  L24: {
                    if (0 < ((wg) this).field_i) {
                      tg.field_b = (((wg) this).field_i + -fg.field_h) / 2;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  return;
                } else {
                  L25: {
                    ((wg) this).field_b.a(var3, var2, -64);
                    if (0 < ((wg) this).field_i) {
                      tg.field_b = (((wg) this).field_i + -fg.field_h) / 2;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  return;
                }
              } else {
                L26: {
                  ((wg) this).field_b.a(var3, var2, -64);
                  if (0 < ((wg) this).field_i) {
                    tg.field_b = (((wg) this).field_i + -fg.field_h) / 2;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                return;
              }
            }
          } else {
            ((wg) this).field_q = false;
            return;
          }
        } else {
          var2 = ((wg) this).field_i;
          var3 = ((wg) this).field_s;
          if (((wg) this).a(-30292)) {
            L27: {
              if (var3 > ((wg) this).field_n) {
                var3 = ((wg) this).field_n;
                break L27;
              } else {
                if (((wg) this).field_f <= var3) {
                  break L27;
                } else {
                  var3 = ((wg) this).field_f;
                  break L27;
                }
              }
            }
            L28: {
              if (((wg) this).field_g < var2) {
                var2 = ((wg) this).field_g;
                break L28;
              } else {
                if (var2 < ((wg) this).field_a) {
                  L29: {
                    var2 = ((wg) this).field_a;
                    if (0.0f < ((wg) this).field_j) {
                      var4 = (int)(0.5f + ((wg) this).field_j * (float)var3);
                      if (var4 <= var2) {
                        if (var4 >= var2) {
                          break L29;
                        } else {
                          var2 = var4;
                          break L29;
                        }
                      } else {
                        var3 = (int)((float)var2 / ((wg) this).field_j);
                        break L29;
                      }
                    } else {
                      break L29;
                    }
                  }
                  L30: {
                    if (fg.field_h != var2) {
                      ((wg) this).field_b.a(var3, var2, -64);
                      break L30;
                    } else {
                      if (var3 != bh.field_a) {
                        ((wg) this).field_b.a(var3, var2, -64);
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                  }
                  L31: {
                    if (0 < ((wg) this).field_i) {
                      tg.field_b = (((wg) this).field_i + -fg.field_h) / 2;
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                  return;
                } else {
                  break L28;
                }
              }
            }
            if (0.0f < ((wg) this).field_j) {
              var4 = (int)(0.5f + ((wg) this).field_j * (float)var3);
              if (var4 <= var2) {
                L32: {
                  if (var4 >= var2) {
                    break L32;
                  } else {
                    var2 = var4;
                    break L32;
                  }
                }
                if (fg.field_h == var2) {
                  if (var3 == bh.field_a) {
                    L33: {
                      if (0 < ((wg) this).field_i) {
                        tg.field_b = (((wg) this).field_i + -fg.field_h) / 2;
                        break L33;
                      } else {
                        break L33;
                      }
                    }
                    return;
                  } else {
                    L34: {
                      ((wg) this).field_b.a(var3, var2, -64);
                      if (0 < ((wg) this).field_i) {
                        tg.field_b = (((wg) this).field_i + -fg.field_h) / 2;
                        break L34;
                      } else {
                        break L34;
                      }
                    }
                    return;
                  }
                } else {
                  L35: {
                    ((wg) this).field_b.a(var3, var2, -64);
                    if (0 < ((wg) this).field_i) {
                      tg.field_b = (((wg) this).field_i + -fg.field_h) / 2;
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                  return;
                }
              } else {
                L36: {
                  var3 = (int)((float)var2 / ((wg) this).field_j);
                  if (fg.field_h != var2) {
                    ((wg) this).field_b.a(var3, var2, -64);
                    break L36;
                  } else {
                    if (var3 != bh.field_a) {
                      ((wg) this).field_b.a(var3, var2, -64);
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                }
                L37: {
                  if (0 < ((wg) this).field_i) {
                    tg.field_b = (((wg) this).field_i + -fg.field_h) / 2;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                return;
              }
            } else {
              L38: {
                if (fg.field_h != var2) {
                  ((wg) this).field_b.a(var3, var2, -64);
                  break L38;
                } else {
                  if (var3 != bh.field_a) {
                    ((wg) this).field_b.a(var3, var2, -64);
                    break L38;
                  } else {
                    break L38;
                  }
                }
              }
              L39: {
                if (0 < ((wg) this).field_i) {
                  tg.field_b = (((wg) this).field_i + -fg.field_h) / 2;
                  break L39;
                } else {
                  break L39;
                }
              }
              return;
            }
          } else {
            ((wg) this).field_q = false;
            return;
          }
        }
    }

    private wg() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_u = new qb();
        field_k = new ql(1);
    }
}
