/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa {
    static int field_b;
    static ko field_e;
    private int field_h;
    private int field_a;
    private int field_m;
    private int field_k;
    private int field_j;
    private int field_l;
    private int field_p;
    private int field_r;
    private int field_g;
    private int field_d;
    private float field_n;
    private op field_q;
    private int field_i;
    private boolean field_c;
    private int field_f;
    private int field_o;

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = CrazyCrystals.field_B;
        if (param0 != 2) {
          this.a(-86);
          var2 = ((oa) this).field_h;
          var3 = ((oa) this).field_f;
          if (((oa) this).b(true)) {
            L0: {
              if (((oa) this).field_d >= var3) {
                if (((oa) this).field_j > var3) {
                  var3 = ((oa) this).field_j;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var3 = ((oa) this).field_d;
                break L0;
              }
            }
            L1: {
              if (var2 <= ((oa) this).field_p) {
                if (var2 < ((oa) this).field_k) {
                  var2 = ((oa) this).field_k;
                  break L1;
                } else {
                  if (0.0f >= ((oa) this).field_n) {
                    L2: {
                      if (ap.field_r != var2) {
                        ((oa) this).field_q.a(118, var3, var2);
                        break L2;
                      } else {
                        if (var3 != rh.field_f) {
                          ((oa) this).field_q.a(118, var3, var2);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L3: {
                      if (((oa) this).field_h > 0) {
                        ui.field_a = (((oa) this).field_h - ap.field_r) / 2;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    return;
                  } else {
                    L4: {
                      var4 = (int)(0.5f + ((oa) this).field_n * (float)var3);
                      if (var2 >= var4) {
                        if (var4 < var2) {
                          var2 = var4;
                          break L4;
                        } else {
                          break L4;
                        }
                      } else {
                        var3 = (int)((float)var2 / ((oa) this).field_n);
                        break L4;
                      }
                    }
                    L5: {
                      if (ap.field_r != var2) {
                        ((oa) this).field_q.a(118, var3, var2);
                        break L5;
                      } else {
                        if (var3 != rh.field_f) {
                          ((oa) this).field_q.a(118, var3, var2);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (((oa) this).field_h > 0) {
                        ui.field_a = (((oa) this).field_h - ap.field_r) / 2;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    return;
                  }
                }
              } else {
                var2 = ((oa) this).field_p;
                break L1;
              }
            }
            L7: {
              if (0.0f >= ((oa) this).field_n) {
                break L7;
              } else {
                var4 = (int)(0.5f + ((oa) this).field_n * (float)var3);
                if (var2 >= var4) {
                  if (var4 < var2) {
                    var2 = var4;
                    break L7;
                  } else {
                    if (ap.field_r == var2) {
                      if (var3 == rh.field_f) {
                        L8: {
                          if (((oa) this).field_h > 0) {
                            ui.field_a = (((oa) this).field_h - ap.field_r) / 2;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        return;
                      } else {
                        L9: {
                          ((oa) this).field_q.a(118, var3, var2);
                          if (((oa) this).field_h > 0) {
                            ui.field_a = (((oa) this).field_h - ap.field_r) / 2;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        return;
                      }
                    } else {
                      L10: {
                        ((oa) this).field_q.a(118, var3, var2);
                        if (((oa) this).field_h > 0) {
                          ui.field_a = (((oa) this).field_h - ap.field_r) / 2;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  var3 = (int)((float)var2 / ((oa) this).field_n);
                  if (ap.field_r == var2) {
                    if (var3 == rh.field_f) {
                      L11: {
                        if (((oa) this).field_h > 0) {
                          ui.field_a = (((oa) this).field_h - ap.field_r) / 2;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      return;
                    } else {
                      L12: {
                        ((oa) this).field_q.a(118, var3, var2);
                        if (((oa) this).field_h > 0) {
                          ui.field_a = (((oa) this).field_h - ap.field_r) / 2;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      return;
                    }
                  } else {
                    L13: {
                      ((oa) this).field_q.a(118, var3, var2);
                      if (((oa) this).field_h > 0) {
                        ui.field_a = (((oa) this).field_h - ap.field_r) / 2;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    return;
                  }
                }
              }
            }
            if (ap.field_r == var2) {
              if (var3 != rh.field_f) {
                L14: {
                  ((oa) this).field_q.a(118, var3, var2);
                  if (((oa) this).field_h > 0) {
                    ui.field_a = (((oa) this).field_h - ap.field_r) / 2;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                return;
              } else {
                L15: {
                  if (((oa) this).field_h > 0) {
                    ui.field_a = (((oa) this).field_h - ap.field_r) / 2;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                return;
              }
            } else {
              L16: {
                ((oa) this).field_q.a(118, var3, var2);
                if (((oa) this).field_h > 0) {
                  ui.field_a = (((oa) this).field_h - ap.field_r) / 2;
                  break L16;
                } else {
                  break L16;
                }
              }
              return;
            }
          } else {
            ((oa) this).field_c = false;
            return;
          }
        } else {
          var2 = ((oa) this).field_h;
          var3 = ((oa) this).field_f;
          if (((oa) this).b(true)) {
            L17: {
              if (((oa) this).field_d >= var3) {
                if (((oa) this).field_j > var3) {
                  var3 = ((oa) this).field_j;
                  break L17;
                } else {
                  break L17;
                }
              } else {
                var3 = ((oa) this).field_d;
                break L17;
              }
            }
            L18: {
              if (var2 <= ((oa) this).field_p) {
                if (var2 < ((oa) this).field_k) {
                  var2 = ((oa) this).field_k;
                  break L18;
                } else {
                  L19: {
                    if (0.0f >= ((oa) this).field_n) {
                      break L19;
                    } else {
                      var4 = (int)(0.5f + ((oa) this).field_n * (float)var3);
                      if (var2 >= var4) {
                        if (var4 < var2) {
                          var2 = var4;
                          break L19;
                        } else {
                          break L19;
                        }
                      } else {
                        var3 = (int)((float)var2 / ((oa) this).field_n);
                        break L19;
                      }
                    }
                  }
                  L20: {
                    if (ap.field_r != var2) {
                      ((oa) this).field_q.a(118, var3, var2);
                      break L20;
                    } else {
                      if (var3 != rh.field_f) {
                        ((oa) this).field_q.a(118, var3, var2);
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                  }
                  L21: {
                    if (((oa) this).field_h > 0) {
                      ui.field_a = (((oa) this).field_h - ap.field_r) / 2;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  return;
                }
              } else {
                var2 = ((oa) this).field_p;
                break L18;
              }
            }
            L22: {
              if (0.0f >= ((oa) this).field_n) {
                break L22;
              } else {
                var4 = (int)(0.5f + ((oa) this).field_n * (float)var3);
                if (var2 >= var4) {
                  if (var4 < var2) {
                    var2 = var4;
                    break L22;
                  } else {
                    L23: {
                      if (ap.field_r != var2) {
                        ((oa) this).field_q.a(118, var3, var2);
                        break L23;
                      } else {
                        if (var3 != rh.field_f) {
                          ((oa) this).field_q.a(118, var3, var2);
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (((oa) this).field_h > 0) {
                        ui.field_a = (((oa) this).field_h - ap.field_r) / 2;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    return;
                  }
                } else {
                  L25: {
                    var3 = (int)((float)var2 / ((oa) this).field_n);
                    if (ap.field_r != var2) {
                      ((oa) this).field_q.a(118, var3, var2);
                      break L25;
                    } else {
                      if (var3 != rh.field_f) {
                        ((oa) this).field_q.a(118, var3, var2);
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                  }
                  L26: {
                    if (((oa) this).field_h > 0) {
                      ui.field_a = (((oa) this).field_h - ap.field_r) / 2;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  return;
                }
              }
            }
            if (ap.field_r == var2) {
              if (var3 == rh.field_f) {
                L27: {
                  if (((oa) this).field_h > 0) {
                    ui.field_a = (((oa) this).field_h - ap.field_r) / 2;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                return;
              } else {
                L28: {
                  ((oa) this).field_q.a(118, var3, var2);
                  if (((oa) this).field_h > 0) {
                    ui.field_a = (((oa) this).field_h - ap.field_r) / 2;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                return;
              }
            } else {
              L29: {
                ((oa) this).field_q.a(118, var3, var2);
                if (((oa) this).field_h > 0) {
                  ui.field_a = (((oa) this).field_h - ap.field_r) / 2;
                  break L29;
                } else {
                  break L29;
                }
              }
              return;
            }
          } else {
            ((oa) this).field_c = false;
            return;
          }
        }
    }

    final boolean b(boolean param0) {
        if (param0) {
          if (((oa) this).field_l <= jk.field_f) {
            if ((mo.field_l ^ -1) >= -1) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((oa) this).a(true);
          if (((oa) this).field_l <= jk.field_f) {
            if ((mo.field_l ^ -1) >= -1) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void a(boolean param0) {
        if (ph.field_E != null) {
          return;
        } else {
          if (param0) {
            if (mo.field_l > 0) {
              if (!((oa) this).field_c) {
                if (ap.field_r < ((oa) this).field_h) {
                  ui.field_a = (-ap.field_r + ((oa) this).field_h) / 2;
                  if (((oa) this).field_r == ap.field_r) {
                    if (rh.field_f != ((oa) this).field_g) {
                      ((oa) this).field_q.a(126, ((oa) this).field_g, ((oa) this).field_r);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((oa) this).field_q.a(126, ((oa) this).field_g, ((oa) this).field_r);
                    return;
                  }
                } else {
                  if (0 < ((oa) this).field_h) {
                    ui.field_a = 0;
                    if (((oa) this).field_r == ap.field_r) {
                      if (rh.field_f != ((oa) this).field_g) {
                        ((oa) this).field_q.a(126, ((oa) this).field_g, ((oa) this).field_r);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((oa) this).field_q.a(126, ((oa) this).field_g, ((oa) this).field_r);
                      return;
                    }
                  } else {
                    if (((oa) this).field_r == ap.field_r) {
                      if (rh.field_f == ((oa) this).field_g) {
                        return;
                      } else {
                        ((oa) this).field_q.a(126, ((oa) this).field_g, ((oa) this).field_r);
                        return;
                      }
                    } else {
                      ((oa) this).field_q.a(126, ((oa) this).field_g, ((oa) this).field_r);
                      return;
                    }
                  }
                }
              } else {
                ((oa) this).field_i = ((oa) this).field_i - 1;
                if (-1 <= (((oa) this).field_i - 1 ^ -1)) {
                  ((oa) this).field_i = ((oa) this).field_o;
                  if (jk.field_f < ((oa) this).field_l) {
                    ((oa) this).field_c = false;
                    return;
                  } else {
                    this.a(2);
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              ((oa) this).field_c = false;
              if (!((oa) this).field_c) {
                L0: {
                  if (ap.field_r < ((oa) this).field_h) {
                    ui.field_a = (-ap.field_r + ((oa) this).field_h) / 2;
                    break L0;
                  } else {
                    if (0 < ((oa) this).field_h) {
                      ui.field_a = 0;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                }
                if (((oa) this).field_r == ap.field_r) {
                  if (rh.field_f == ((oa) this).field_g) {
                    return;
                  } else {
                    ((oa) this).field_q.a(126, ((oa) this).field_g, ((oa) this).field_r);
                    return;
                  }
                } else {
                  ((oa) this).field_q.a(126, ((oa) this).field_g, ((oa) this).field_r);
                  return;
                }
              } else {
                ((oa) this).field_i = ((oa) this).field_i - 1;
                if (-1 <= (((oa) this).field_i - 1 ^ -1)) {
                  ((oa) this).field_i = ((oa) this).field_o;
                  if (jk.field_f < ((oa) this).field_l) {
                    ((oa) this).field_c = false;
                    return;
                  } else {
                    this.a(2);
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
    }

    final void a(byte param0) {
        if (param0 != 96) {
          oa.b(-71);
          ((oa) this).field_q.a(117, ((oa) this).field_m, ((oa) this).field_a);
          return;
        } else {
          ((oa) this).field_q.a(117, ((oa) this).field_m, ((oa) this).field_a);
          return;
        }
    }

    public static void b(int param0) {
        field_e = null;
        int var1 = -115 / ((-37 - param0) / 57);
    }

    final void a(int param0, byte param1, int param2) {
        ((oa) this).field_h = param2;
        ((oa) this).field_f = param0;
        if (param1 < 18) {
            field_e = null;
        }
    }

    private oa() throws Throwable {
        throw new Error();
    }

    static {
    }
}
