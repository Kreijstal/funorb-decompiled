/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    private int field_c;
    private int field_i;
    private int field_j;
    private int field_n;
    private int field_e;
    static ad field_m;
    private int field_g;
    private int field_o;
    private int field_d;
    private int field_s;
    private int field_q;
    private boolean field_a;
    private int field_h;
    private int field_f;
    private int field_r;
    private int field_b;
    private tn field_l;
    private int field_p;
    private float field_k;

    public static void b(boolean param0) {
        field_m = null;
    }

    final void a(int param0) {
        if (param0 != 0) {
            return;
        }
        ((pk) this).field_l.a(true, ((pk) this).field_r, ((pk) this).field_p);
    }

    final af a(boolean param0) {
        af var2 = null;
        ((pk) this).field_p = pd.field_b;
        if (param0) {
          ((pk) this).field_r = ad.field_d;
          ((pk) this).field_l.a(param0, ((pk) this).field_o, ((pk) this).field_j);
          n.field_i = false;
          var2 = al.a(((pk) this).field_j, -16493, g.field_r, ((pk) this).field_o, 0, 0);
          if (var2 == null) {
            ((pk) this).a(0);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((pk) this).b(12);
          ((pk) this).field_r = ad.field_d;
          ((pk) this).field_l.a(param0, ((pk) this).field_o, ((pk) this).field_j);
          n.field_i = false;
          var2 = al.a(((pk) this).field_j, -16493, g.field_r, ((pk) this).field_o, 0, 0);
          if (var2 != null) {
            return var2;
          } else {
            ((pk) this).a(0);
            return var2;
          }
        }
    }

    final boolean c(int param0) {
        int var2 = 0;
        var2 = 71 / ((-20 - param0) / 62);
        if (((pk) this).field_s <= ok.field_c) {
          if (s.field_x <= 0) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = EscapeVector.field_A;
        var2 = ((pk) this).field_h;
        var3 = ((pk) this).field_n;
        if (((pk) this).c(-109)) {
          L0: {
            if (((pk) this).field_c < var3) {
              var3 = ((pk) this).field_c;
              break L0;
            } else {
              if (((pk) this).field_g > var3) {
                var3 = ((pk) this).field_g;
                break L0;
              } else {
                if (((pk) this).field_e < var2) {
                  var2 = ((pk) this).field_e;
                  if (0.0f < ((pk) this).field_k) {
                    L1: {
                      var4 = (int)(0.5f + (float)var3 * ((pk) this).field_k);
                      if (var2 < var4) {
                        var3 = (int)((float)var2 / ((pk) this).field_k);
                        break L1;
                      } else {
                        if (var4 >= var2) {
                          break L1;
                        } else {
                          L2: {
                            var2 = var4;
                            if (pd.field_b != var2) {
                              ((pk) this).field_l.a(true, var3, var2);
                              break L2;
                            } else {
                              if (var3 != ad.field_d) {
                                ((pk) this).field_l.a(true, var3, var2);
                                break L2;
                              } else {
                                return;
                              }
                            }
                          }
                          L3: {
                            if (((pk) this).field_h <= 0) {
                              break L3;
                            } else {
                              pb.field_b = (((pk) this).field_h + -pd.field_b) / 2;
                              break L3;
                            }
                          }
                          return;
                        }
                      }
                    }
                    if (pd.field_b == var2) {
                      if (var3 == ad.field_d) {
                        return;
                      } else {
                        L4: {
                          ((pk) this).field_l.a(true, var3, var2);
                          if (((pk) this).field_h <= 0) {
                            break L4;
                          } else {
                            pb.field_b = (((pk) this).field_h + -pd.field_b) / 2;
                            break L4;
                          }
                        }
                        return;
                      }
                    } else {
                      L5: {
                        ((pk) this).field_l.a(true, var3, var2);
                        if (((pk) this).field_h <= 0) {
                          break L5;
                        } else {
                          pb.field_b = (((pk) this).field_h + -pd.field_b) / 2;
                          break L5;
                        }
                      }
                      return;
                    }
                  } else {
                    L6: {
                      if (pd.field_b != var2) {
                        ((pk) this).field_l.a(true, var3, var2);
                        break L6;
                      } else {
                        if (var3 != ad.field_d) {
                          ((pk) this).field_l.a(true, var3, var2);
                          break L6;
                        } else {
                          return;
                        }
                      }
                    }
                    L7: {
                      if (((pk) this).field_h <= 0) {
                        break L7;
                      } else {
                        pb.field_b = (((pk) this).field_h + -pd.field_b) / 2;
                        break L7;
                      }
                    }
                    return;
                  }
                } else {
                  if (((pk) this).field_f > var2) {
                    L8: {
                      var2 = ((pk) this).field_f;
                      if (0.0f < ((pk) this).field_k) {
                        var4 = (int)(0.5f + (float)var3 * ((pk) this).field_k);
                        if (var2 < var4) {
                          var3 = (int)((float)var2 / ((pk) this).field_k);
                          break L8;
                        } else {
                          if (var4 >= var2) {
                            break L8;
                          } else {
                            var2 = var4;
                            break L8;
                          }
                        }
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (pd.field_b != var2) {
                        ((pk) this).field_l.a(true, var3, var2);
                        break L9;
                      } else {
                        if (var3 != ad.field_d) {
                          ((pk) this).field_l.a(true, var3, var2);
                          break L9;
                        } else {
                          return;
                        }
                      }
                    }
                    L10: {
                      if (((pk) this).field_h <= 0) {
                        break L10;
                      } else {
                        pb.field_b = (((pk) this).field_h + -pd.field_b) / 2;
                        break L10;
                      }
                    }
                    return;
                  } else {
                    L11: {
                      if (0.0f < ((pk) this).field_k) {
                        var4 = (int)(0.5f + (float)var3 * ((pk) this).field_k);
                        if (var2 < var4) {
                          var3 = (int)((float)var2 / ((pk) this).field_k);
                          break L11;
                        } else {
                          if (var4 >= var2) {
                            break L11;
                          } else {
                            var2 = var4;
                            break L11;
                          }
                        }
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (pd.field_b != var2) {
                        ((pk) this).field_l.a(true, var3, var2);
                        break L12;
                      } else {
                        if (var3 != ad.field_d) {
                          ((pk) this).field_l.a(true, var3, var2);
                          break L12;
                        } else {
                          return;
                        }
                      }
                    }
                    L13: {
                      if (((pk) this).field_h <= 0) {
                        break L13;
                      } else {
                        pb.field_b = (((pk) this).field_h + -pd.field_b) / 2;
                        break L13;
                      }
                    }
                    return;
                  }
                }
              }
            }
          }
          if (((pk) this).field_e < var2) {
            var2 = ((pk) this).field_e;
            if (0.0f < ((pk) this).field_k) {
              L14: {
                var4 = (int)(0.5f + (float)var3 * ((pk) this).field_k);
                if (var2 < var4) {
                  var3 = (int)((float)var2 / ((pk) this).field_k);
                  break L14;
                } else {
                  if (var4 >= var2) {
                    break L14;
                  } else {
                    var2 = var4;
                    if (pd.field_b == var2) {
                      if (var3 == ad.field_d) {
                        return;
                      } else {
                        L15: {
                          ((pk) this).field_l.a(true, var3, var2);
                          if (((pk) this).field_h <= 0) {
                            break L15;
                          } else {
                            pb.field_b = (((pk) this).field_h + -pd.field_b) / 2;
                            break L15;
                          }
                        }
                        return;
                      }
                    } else {
                      L16: {
                        ((pk) this).field_l.a(true, var3, var2);
                        if (((pk) this).field_h <= 0) {
                          break L16;
                        } else {
                          pb.field_b = (((pk) this).field_h + -pd.field_b) / 2;
                          break L16;
                        }
                      }
                      return;
                    }
                  }
                }
              }
              if (pd.field_b == var2) {
                if (var3 != ad.field_d) {
                  L17: {
                    ((pk) this).field_l.a(true, var3, var2);
                    if (((pk) this).field_h <= 0) {
                      break L17;
                    } else {
                      pb.field_b = (((pk) this).field_h + -pd.field_b) / 2;
                      break L17;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                L18: {
                  ((pk) this).field_l.a(true, var3, var2);
                  if (((pk) this).field_h <= 0) {
                    break L18;
                  } else {
                    pb.field_b = (((pk) this).field_h + -pd.field_b) / 2;
                    break L18;
                  }
                }
                return;
              }
            } else {
              if (pd.field_b == var2) {
                if (var3 == ad.field_d) {
                  return;
                } else {
                  L19: {
                    ((pk) this).field_l.a(true, var3, var2);
                    if (((pk) this).field_h <= 0) {
                      break L19;
                    } else {
                      pb.field_b = (((pk) this).field_h + -pd.field_b) / 2;
                      break L19;
                    }
                  }
                  return;
                }
              } else {
                L20: {
                  ((pk) this).field_l.a(true, var3, var2);
                  if (((pk) this).field_h <= 0) {
                    break L20;
                  } else {
                    pb.field_b = (((pk) this).field_h + -pd.field_b) / 2;
                    break L20;
                  }
                }
                return;
              }
            }
          } else {
            if (((pk) this).field_f > var2) {
              L21: {
                var2 = ((pk) this).field_f;
                if (0.0f < ((pk) this).field_k) {
                  var4 = (int)(0.5f + (float)var3 * ((pk) this).field_k);
                  if (var2 < var4) {
                    var3 = (int)((float)var2 / ((pk) this).field_k);
                    break L21;
                  } else {
                    if (var4 >= var2) {
                      break L21;
                    } else {
                      var2 = var4;
                      break L21;
                    }
                  }
                } else {
                  break L21;
                }
              }
              if (pd.field_b == var2) {
                if (var3 == ad.field_d) {
                  return;
                } else {
                  L22: {
                    ((pk) this).field_l.a(true, var3, var2);
                    if (((pk) this).field_h <= 0) {
                      break L22;
                    } else {
                      pb.field_b = (((pk) this).field_h + -pd.field_b) / 2;
                      break L22;
                    }
                  }
                  return;
                }
              } else {
                L23: {
                  ((pk) this).field_l.a(true, var3, var2);
                  if (((pk) this).field_h <= 0) {
                    break L23;
                  } else {
                    pb.field_b = (((pk) this).field_h + -pd.field_b) / 2;
                    break L23;
                  }
                }
                return;
              }
            } else {
              L24: {
                if (0.0f < ((pk) this).field_k) {
                  var4 = (int)(0.5f + (float)var3 * ((pk) this).field_k);
                  if (var2 < var4) {
                    var3 = (int)((float)var2 / ((pk) this).field_k);
                    break L24;
                  } else {
                    if (var4 < var2) {
                      var2 = var4;
                      break L24;
                    } else {
                      L25: {
                        if (pd.field_b != var2) {
                          ((pk) this).field_l.a(true, var3, var2);
                          break L25;
                        } else {
                          if (var3 != ad.field_d) {
                            ((pk) this).field_l.a(true, var3, var2);
                            break L25;
                          } else {
                            return;
                          }
                        }
                      }
                      L26: {
                        if (((pk) this).field_h <= 0) {
                          break L26;
                        } else {
                          pb.field_b = (((pk) this).field_h + -pd.field_b) / 2;
                          break L26;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  break L24;
                }
              }
              L27: {
                if (pd.field_b != var2) {
                  ((pk) this).field_l.a(true, var3, var2);
                  break L27;
                } else {
                  if (var3 != ad.field_d) {
                    ((pk) this).field_l.a(true, var3, var2);
                    break L27;
                  } else {
                    return;
                  }
                }
              }
              L28: {
                if (((pk) this).field_h <= 0) {
                  break L28;
                } else {
                  pb.field_b = (((pk) this).field_h + -pd.field_b) / 2;
                  break L28;
                }
              }
              return;
            }
          }
        } else {
          ((pk) this).field_a = false;
          return;
        }
    }

    final void b(int param0) {
        if (null == df.field_d) {
          L0: {
            if (s.field_x <= 0) {
              ((pk) this).field_a = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (!((pk) this).field_a) {
            if (pd.field_b >= ((pk) this).field_h) {
              if (0 >= ((pk) this).field_h) {
                if (((pk) this).field_q == pd.field_b) {
                  if (((pk) this).field_i == ad.field_d) {
                    return;
                  } else {
                    ((pk) this).field_l.a(true, ((pk) this).field_i, ((pk) this).field_q);
                    return;
                  }
                } else {
                  ((pk) this).field_l.a(true, ((pk) this).field_i, ((pk) this).field_q);
                  return;
                }
              } else {
                pb.field_b = 0;
                if (((pk) this).field_q == pd.field_b) {
                  if (((pk) this).field_i == ad.field_d) {
                    return;
                  } else {
                    ((pk) this).field_l.a(true, ((pk) this).field_i, ((pk) this).field_q);
                    return;
                  }
                } else {
                  ((pk) this).field_l.a(true, ((pk) this).field_i, ((pk) this).field_q);
                  return;
                }
              }
            } else {
              pb.field_b = (-pd.field_b + ((pk) this).field_h) / 2;
              if (((pk) this).field_q == pd.field_b) {
                if (((pk) this).field_i == ad.field_d) {
                  return;
                } else {
                  ((pk) this).field_l.a(true, ((pk) this).field_i, ((pk) this).field_q);
                  return;
                }
              } else {
                ((pk) this).field_l.a(true, ((pk) this).field_i, ((pk) this).field_q);
                return;
              }
            }
          } else {
            if (param0 == 9477) {
              int fieldTemp$1 = ((pk) this).field_d - 1;
              ((pk) this).field_d = ((pk) this).field_d - 1;
              if (fieldTemp$1 > 0) {
                return;
              } else {
                ((pk) this).field_d = ((pk) this).field_b;
                if (ok.field_c < ((pk) this).field_s) {
                  ((pk) this).field_a = false;
                  return;
                } else {
                  this.a((byte) 13);
                  return;
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        ((pk) this).field_n = param0;
        if (param2 != 18705) {
            return;
        }
        ((pk) this).field_h = param1;
    }

    private pk() throws Throwable {
        throw new Error();
    }

    static {
    }
}
