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
          var2 = this.field_h;
          var3 = this.field_f;
          if (this.b(true)) {
            L0: {
              if (this.field_d >= var3) {
                if (this.field_j > var3) {
                  var3 = this.field_j;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var3 = this.field_d;
                break L0;
              }
            }
            L1: {
              if (var2 <= this.field_p) {
                if (var2 < this.field_k) {
                  var2 = this.field_k;
                  break L1;
                } else {
                  if (0.0f >= this.field_n) {
                    L2: {
                      if (ap.field_r != var2) {
                        this.field_q.a(118, var3, var2);
                        break L2;
                      } else {
                        if (var3 != rh.field_f) {
                          this.field_q.a(118, var3, var2);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L3: {
                      if (this.field_h > 0) {
                        ui.field_a = (this.field_h - ap.field_r) / 2;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    return;
                  } else {
                    L4: {
                      var4 = (int)(0.5f + this.field_n * (float)var3);
                      if (var2 >= var4) {
                        if (var4 < var2) {
                          var2 = var4;
                          break L4;
                        } else {
                          break L4;
                        }
                      } else {
                        var3 = (int)((float)var2 / this.field_n);
                        break L4;
                      }
                    }
                    L5: {
                      if (ap.field_r != var2) {
                        this.field_q.a(118, var3, var2);
                        break L5;
                      } else {
                        if (var3 != rh.field_f) {
                          this.field_q.a(118, var3, var2);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (this.field_h > 0) {
                        ui.field_a = (this.field_h - ap.field_r) / 2;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    return;
                  }
                }
              } else {
                var2 = this.field_p;
                break L1;
              }
            }
            L7: {
              if (0.0f >= this.field_n) {
                break L7;
              } else {
                var4 = (int)(0.5f + this.field_n * (float)var3);
                if (var2 >= var4) {
                  if (var4 < var2) {
                    var2 = var4;
                    break L7;
                  } else {
                    if (ap.field_r == var2) {
                      if (var3 == rh.field_f) {
                        L8: {
                          if (this.field_h > 0) {
                            ui.field_a = (this.field_h - ap.field_r) / 2;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        return;
                      } else {
                        L9: {
                          this.field_q.a(118, var3, var2);
                          if (this.field_h > 0) {
                            ui.field_a = (this.field_h - ap.field_r) / 2;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        return;
                      }
                    } else {
                      L10: {
                        this.field_q.a(118, var3, var2);
                        if (this.field_h > 0) {
                          ui.field_a = (this.field_h - ap.field_r) / 2;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  var3 = (int)((float)var2 / this.field_n);
                  if (ap.field_r == var2) {
                    if (var3 == rh.field_f) {
                      L11: {
                        if (this.field_h > 0) {
                          ui.field_a = (this.field_h - ap.field_r) / 2;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      return;
                    } else {
                      L12: {
                        this.field_q.a(118, var3, var2);
                        if (this.field_h > 0) {
                          ui.field_a = (this.field_h - ap.field_r) / 2;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      return;
                    }
                  } else {
                    L13: {
                      this.field_q.a(118, var3, var2);
                      if (this.field_h > 0) {
                        ui.field_a = (this.field_h - ap.field_r) / 2;
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
                  this.field_q.a(118, var3, var2);
                  if (this.field_h > 0) {
                    ui.field_a = (this.field_h - ap.field_r) / 2;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                return;
              } else {
                L15: {
                  if (this.field_h > 0) {
                    ui.field_a = (this.field_h - ap.field_r) / 2;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                return;
              }
            } else {
              L16: {
                this.field_q.a(118, var3, var2);
                if (this.field_h > 0) {
                  ui.field_a = (this.field_h - ap.field_r) / 2;
                  break L16;
                } else {
                  break L16;
                }
              }
              return;
            }
          } else {
            this.field_c = false;
            return;
          }
        } else {
          var2 = this.field_h;
          var3 = this.field_f;
          if (this.b(true)) {
            L17: {
              if (this.field_d >= var3) {
                if (this.field_j > var3) {
                  var3 = this.field_j;
                  break L17;
                } else {
                  break L17;
                }
              } else {
                var3 = this.field_d;
                break L17;
              }
            }
            L18: {
              if (var2 <= this.field_p) {
                if (var2 < this.field_k) {
                  var2 = this.field_k;
                  break L18;
                } else {
                  L19: {
                    if (0.0f >= this.field_n) {
                      break L19;
                    } else {
                      var4 = (int)(0.5f + this.field_n * (float)var3);
                      if (var2 >= var4) {
                        if (var4 < var2) {
                          var2 = var4;
                          break L19;
                        } else {
                          break L19;
                        }
                      } else {
                        var3 = (int)((float)var2 / this.field_n);
                        break L19;
                      }
                    }
                  }
                  L20: {
                    if (ap.field_r != var2) {
                      this.field_q.a(118, var3, var2);
                      break L20;
                    } else {
                      if (var3 != rh.field_f) {
                        this.field_q.a(118, var3, var2);
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                  }
                  L21: {
                    if (this.field_h > 0) {
                      ui.field_a = (this.field_h - ap.field_r) / 2;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  return;
                }
              } else {
                var2 = this.field_p;
                break L18;
              }
            }
            L22: {
              if (0.0f >= this.field_n) {
                break L22;
              } else {
                var4 = (int)(0.5f + this.field_n * (float)var3);
                if (var2 >= var4) {
                  if (var4 < var2) {
                    var2 = var4;
                    break L22;
                  } else {
                    L23: {
                      if (ap.field_r != var2) {
                        this.field_q.a(118, var3, var2);
                        break L23;
                      } else {
                        if (var3 != rh.field_f) {
                          this.field_q.a(118, var3, var2);
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (this.field_h > 0) {
                        ui.field_a = (this.field_h - ap.field_r) / 2;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    return;
                  }
                } else {
                  L25: {
                    var3 = (int)((float)var2 / this.field_n);
                    if (ap.field_r != var2) {
                      this.field_q.a(118, var3, var2);
                      break L25;
                    } else {
                      if (var3 != rh.field_f) {
                        this.field_q.a(118, var3, var2);
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                  }
                  L26: {
                    if (this.field_h > 0) {
                      ui.field_a = (this.field_h - ap.field_r) / 2;
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
                  if (this.field_h > 0) {
                    ui.field_a = (this.field_h - ap.field_r) / 2;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                return;
              } else {
                L28: {
                  this.field_q.a(118, var3, var2);
                  if (this.field_h > 0) {
                    ui.field_a = (this.field_h - ap.field_r) / 2;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                return;
              }
            } else {
              L29: {
                this.field_q.a(118, var3, var2);
                if (this.field_h > 0) {
                  ui.field_a = (this.field_h - ap.field_r) / 2;
                  break L29;
                } else {
                  break L29;
                }
              }
              return;
            }
          } else {
            this.field_c = false;
            return;
          }
        }
    }

    final boolean b(boolean param0) {
        if (param0) {
          if (this.field_l <= jk.field_f) {
            if ((mo.field_l ^ -1) >= -1) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          this.a(true);
          if (this.field_l <= jk.field_f) {
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
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (ph.field_E != null) {
          return;
        } else {
          if (param0) {
            if (mo.field_l > 0) {
              if (!this.field_c) {
                if (ap.field_r < this.field_h) {
                  ui.field_a = (-ap.field_r + this.field_h) / 2;
                  if (this.field_r == ap.field_r) {
                    if (rh.field_f != this.field_g) {
                      this.field_q.a(126, this.field_g, this.field_r);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.field_q.a(126, this.field_g, this.field_r);
                    return;
                  }
                } else {
                  if (0 < this.field_h) {
                    ui.field_a = 0;
                    if (this.field_r == ap.field_r) {
                      if (rh.field_f != this.field_g) {
                        this.field_q.a(126, this.field_g, this.field_r);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      this.field_q.a(126, this.field_g, this.field_r);
                      return;
                    }
                  } else {
                    if (this.field_r == ap.field_r) {
                      if (rh.field_f == this.field_g) {
                        return;
                      } else {
                        this.field_q.a(126, this.field_g, this.field_r);
                        return;
                      }
                    } else {
                      this.field_q.a(126, this.field_g, this.field_r);
                      return;
                    }
                  }
                }
              } else {
                fieldTemp$2 = this.field_i - 1;
                this.field_i = this.field_i - 1;
                if (-1 <= (fieldTemp$2 ^ -1)) {
                  this.field_i = this.field_o;
                  if (jk.field_f < this.field_l) {
                    this.field_c = false;
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
              this.field_c = false;
              if (!this.field_c) {
                L0: {
                  if (ap.field_r < this.field_h) {
                    ui.field_a = (-ap.field_r + this.field_h) / 2;
                    break L0;
                  } else {
                    if (0 < this.field_h) {
                      ui.field_a = 0;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                }
                if (this.field_r == ap.field_r) {
                  if (rh.field_f == this.field_g) {
                    return;
                  } else {
                    this.field_q.a(126, this.field_g, this.field_r);
                    return;
                  }
                } else {
                  this.field_q.a(126, this.field_g, this.field_r);
                  return;
                }
              } else {
                fieldTemp$3 = this.field_i - 1;
                this.field_i = this.field_i - 1;
                if (-1 <= (fieldTemp$3 ^ -1)) {
                  this.field_i = this.field_o;
                  if (jk.field_f < this.field_l) {
                    this.field_c = false;
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
          this.field_q.a(117, this.field_m, this.field_a);
          return;
        } else {
          this.field_q.a(117, this.field_m, this.field_a);
          return;
        }
    }

    public static void b(int param0) {
        field_e = null;
        int var1 = -115 / ((-37 - param0) / 57);
    }

    final void a(int param0, byte param1, int param2) {
        this.field_h = param2;
        this.field_f = param0;
        if (param1 < 18) {
            field_e = (ko) null;
        }
    }

    private oa() throws Throwable {
        throw new Error();
    }

    static {
    }
}
