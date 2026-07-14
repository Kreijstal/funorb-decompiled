/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fe extends dk {
    private int field_B;
    private boolean field_I;
    private int field_D;
    static hl field_H;
    private long field_E;
    private long field_F;
    private int field_A;
    private boolean field_G;
    private int field_C;
    static td[] field_J;

    private final void h(boolean param0) {
        Object var3 = null;
        if (!(((fe) this).field_g instanceof si)) {
          if (param0) {
            var3 = null;
            boolean discarded$4 = ((fe) this).a((uj) null, 'z', (byte) -18, -33);
            return;
          } else {
            return;
          }
        } else {
          ((si) (Object) ((fe) this).field_g).a(false, (fe) this);
          if (!param0) {
            return;
          } else {
            var3 = null;
            boolean discarded$5 = ((fe) this).a((uj) null, 'z', (byte) -18, -33);
            return;
          }
        }
    }

    private final void e(boolean param0) {
        if (param0) {
          ((fe) this).field_C = 3;
          this.g(true);
          this.e((byte) -113);
          return;
        } else {
          this.g(true);
          this.e((byte) -113);
          return;
        }
    }

    private final void e(int param0) {
        bd var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        lg var9 = null;
        var8 = StarCannon.field_A;
        if (!((fe) this).field_I) {
          ((fe) this).field_n = 0;
          ((fe) this).field_q = 0;
          return;
        } else {
          if (((fe) this).field_o instanceof lg) {
            var9 = (lg) (Object) ((fe) this).field_o;
            var3 = var9.a((uj) this, (byte) -106);
            var4 = var3.c(param0 + 101);
            var5 = var9.b(91, (uj) this);
            var6 = var9.a(param0 + param0) >> -1681125119;
            if (var5 + -var6 > var4) {
              ((fe) this).field_n = 0;
              ((fe) this).field_q = 0;
              return;
            } else {
              var7 = ((fe) this).field_n + var3.a((byte) -30, ((fe) this).field_B);
              if (var7 <= -var6 + var5) {
                if (var7 < var6) {
                  ((fe) this).field_n = -var7 + (var6 + ((fe) this).field_n);
                  if (((fe) this).field_n <= 0) {
                    if (var6 + -var5 <= ((fe) this).field_n) {
                      return;
                    } else {
                      ((fe) this).field_n = var6 + -var5;
                      return;
                    }
                  } else {
                    ((fe) this).field_n = 0;
                    return;
                  }
                } else {
                  if (((fe) this).field_n <= 0) {
                    if (var6 + -var5 <= ((fe) this).field_n) {
                      return;
                    } else {
                      ((fe) this).field_n = var6 + -var5;
                      return;
                    }
                  } else {
                    ((fe) this).field_n = 0;
                    return;
                  }
                }
              } else {
                ((fe) this).field_n = ((fe) this).field_n - var7 - (var6 + -var5);
                if (((fe) this).field_n <= 0) {
                  if (var6 + -var5 <= ((fe) this).field_n) {
                    return;
                  } else {
                    ((fe) this).field_n = var6 + -var5;
                    return;
                  }
                } else {
                  ((fe) this).field_n = 0;
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    private final int g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = StarCannon.field_A;
        if (-1 != (((fe) this).field_B ^ -1)) {
          var2 = -1 + ((fe) this).field_B;
          L0: while (true) {
            if (0 < var2) {
              if (32 != ((fe) this).field_k.charAt(var2 + -1)) {
                var2--;
                continue L0;
              } else {
                var3 = -16 / ((54 - param0) / 61);
                return var2;
              }
            } else {
              var3 = -16 / ((54 - param0) / 61);
              return var2;
            }
          }
        } else {
          return ((fe) this).field_B;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        long var6 = 0L;
        Object var8 = null;
        lg var9 = null;
        lg var11 = null;
        lg var12 = null;
        if (param2 == 49) {
          if (null != ((fe) this).field_o) {
            if (0 == param0) {
              ((fe) this).field_o.a(param1, ((fe) this).field_u, param2 ^ -102, param3, (uj) this);
              if (((fe) this).field_o instanceof lg) {
                var12 = (lg) (Object) ((fe) this).field_o;
                if (((fe) this).field_B == ((fe) this).field_D) {
                  var6 = dd.b(74);
                  if (500L <= (-((fe) this).field_F + var6) % 1000L) {
                    return;
                  } else {
                    var12.a(-3, (uj) this, param1, param3, ((fe) this).field_B);
                    return;
                  }
                } else {
                  L0: {
                    var12.a(param3, param1, ((fe) this).field_B, (uj) this, (byte) 104, ((fe) this).field_D);
                    var6 = dd.b(74);
                    if (500L > (-((fe) this).field_F + var6) % 1000L) {
                      var12.a(-3, (uj) this, param1, param3, ((fe) this).field_B);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
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
        } else {
          var8 = null;
          boolean discarded$1 = ((fe) this).a((uj) null, '￑', (byte) 109, -100);
          if (null != ((fe) this).field_o) {
            if (0 == param0) {
              ((fe) this).field_o.a(param1, ((fe) this).field_u, param2 ^ -102, param3, (uj) this);
              if (((fe) this).field_o instanceof lg) {
                var11 = (lg) (Object) ((fe) this).field_o;
                var9 = var11;
                if (((fe) this).field_B == ((fe) this).field_D) {
                  var6 = dd.b(74);
                  if (500L <= (-((fe) this).field_F + var6) % 1000L) {
                    return;
                  } else {
                    var11.a(-3, (uj) this, param1, param3, ((fe) this).field_B);
                    return;
                  }
                } else {
                  L1: {
                    var11.a(param3, param1, ((fe) this).field_B, (uj) this, (byte) 104, ((fe) this).field_D);
                    var6 = dd.b(74);
                    if (500L > (-((fe) this).field_F + var6) % 1000L) {
                      var11.a(-3, (uj) this, param1, param3, ((fe) this).field_B);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
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

    final boolean a(uj param0, char param1, byte param2, int param3) {
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        Object stackIn_93_0 = null;
        Object stackIn_94_0 = null;
        Object stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        Object stackIn_115_0 = null;
        Object stackIn_116_0 = null;
        Object stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        Object stackIn_137_0 = null;
        Object stackIn_138_0 = null;
        Object stackIn_139_0 = null;
        int stackIn_139_1 = 0;
        Object stackIn_168_0 = null;
        Object stackIn_169_0 = null;
        Object stackIn_170_0 = null;
        int stackIn_170_1 = 0;
        Object stackOut_167_0 = null;
        Object stackOut_169_0 = null;
        int stackOut_169_1 = 0;
        Object stackOut_168_0 = null;
        int stackOut_168_1 = 0;
        Object stackOut_136_0 = null;
        Object stackOut_138_0 = null;
        int stackOut_138_1 = 0;
        Object stackOut_137_0 = null;
        int stackOut_137_1 = 0;
        Object stackOut_114_0 = null;
        Object stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        Object stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        Object stackOut_92_0 = null;
        Object stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        Object stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        Object stackOut_59_0 = null;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_34_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        ((fe) this).field_F = dd.b(param2 ^ -2);
        if (param2 == -90) {
          if (param1 != 60) {
            if (param1 != 62) {
              if (param1 < 32) {
                if (-86 != (param3 ^ -1)) {
                  L0: {
                    if (101 == param3) {
                      if (((fe) this).field_D == ((fe) this).field_B) {
                        if (((fe) this).field_B >= ((fe) this).field_k.length()) {
                          break L0;
                        } else {
                          ((fe) this).field_D = 1 + ((fe) this).field_B;
                          this.e((byte) -109);
                          return true;
                        }
                      } else {
                        this.e((byte) -97);
                        return true;
                      }
                    } else {
                      if ((param3 ^ -1) == -14) {
                        ((fe) this).i(19293);
                        return true;
                      } else {
                        if ((param3 ^ -1) == -97) {
                          if (0 >= ((fe) this).field_B) {
                            break L0;
                          } else {
                            L1: {
                              stackOut_167_0 = this;
                              stackIn_169_0 = stackOut_167_0;
                              stackIn_168_0 = stackOut_167_0;
                              if (!wc.field_c[82]) {
                                stackOut_169_0 = this;
                                stackOut_169_1 = -1 + ((fe) this).field_B;
                                stackIn_170_0 = stackOut_169_0;
                                stackIn_170_1 = stackOut_169_1;
                                break L1;
                              } else {
                                stackOut_168_0 = this;
                                stackOut_168_1 = this.g((byte) 122);
                                stackIn_170_0 = stackOut_168_0;
                                stackIn_170_1 = stackOut_168_1;
                                break L1;
                              }
                            }
                            this.a(stackIn_170_1, 101);
                            return true;
                          }
                        } else {
                          if (param3 != 97) {
                            if (-103 != param3) {
                              if (-104 != param3) {
                                if (param3 == -85) {
                                  this.h(false);
                                  return true;
                                } else {
                                  if (!wc.field_c[82]) {
                                    L2: {
                                      if (!wc.field_c[82]) {
                                        break L2;
                                      } else {
                                        if (-67 != param3) {
                                          break L2;
                                        } else {
                                          this.g(true);
                                          return true;
                                        }
                                      }
                                    }
                                    if (!wc.field_c[82]) {
                                      break L0;
                                    } else {
                                      if (-68 != param3) {
                                        break L0;
                                      } else {
                                        this.g(param2 + 89);
                                        return true;
                                      }
                                    }
                                  } else {
                                    if (-66 == param3) {
                                      this.e(false);
                                      return true;
                                    } else {
                                      if (wc.field_c[82]) {
                                        if (-67 == param3) {
                                          this.g(true);
                                          return true;
                                        } else {
                                          L3: {
                                            if (!wc.field_c[82]) {
                                              break L3;
                                            } else {
                                              if (-68 != (param3 ^ -1)) {
                                                break L3;
                                              } else {
                                                this.g(param2 + 89);
                                                return true;
                                              }
                                            }
                                          }
                                          return false;
                                        }
                                      } else {
                                        L4: {
                                          if (!wc.field_c[82]) {
                                            break L4;
                                          } else {
                                            if (-68 != param3) {
                                              break L4;
                                            } else {
                                              this.g(param2 + 89);
                                              return true;
                                            }
                                          }
                                        }
                                        return false;
                                      }
                                    }
                                  }
                                }
                              } else {
                                this.a(((fe) this).field_k.length(), param2 + 191);
                                return true;
                              }
                            } else {
                              this.a(0, 101);
                              return true;
                            }
                          } else {
                            if (((fe) this).field_B < ((fe) this).field_k.length()) {
                              L5: {
                                stackOut_136_0 = this;
                                stackIn_138_0 = stackOut_136_0;
                                stackIn_137_0 = stackOut_136_0;
                                if (!wc.field_c[82]) {
                                  stackOut_138_0 = this;
                                  stackOut_138_1 = ((fe) this).field_B - -1;
                                  stackIn_139_0 = stackOut_138_0;
                                  stackIn_139_1 = stackOut_138_1;
                                  break L5;
                                } else {
                                  stackOut_137_0 = this;
                                  stackOut_137_1 = this.f(param2 ^ 89);
                                  stackIn_139_0 = stackOut_137_0;
                                  stackIn_139_1 = stackOut_137_1;
                                  break L5;
                                }
                              }
                              this.a(stackIn_139_1, 101);
                              return true;
                            } else {
                              return false;
                            }
                          }
                        }
                      }
                    }
                  }
                  return false;
                } else {
                  if (((fe) this).field_D == ((fe) this).field_B) {
                    if (((fe) this).field_B > 0) {
                      ((fe) this).field_D = ((fe) this).field_B - 1;
                      this.e((byte) -123);
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    this.e((byte) -94);
                    return true;
                  }
                }
              } else {
                if (param1 <= 126) {
                  if (((fe) this).field_B == ((fe) this).field_D) {
                    L6: {
                      if (0 == (((fe) this).field_A ^ -1)) {
                        break L6;
                      } else {
                        if (((fe) this).field_k.length() < ((fe) this).field_A) {
                          break L6;
                        } else {
                          return true;
                        }
                      }
                    }
                    if (((fe) this).field_B >= ((fe) this).field_k.length()) {
                      ((fe) this).field_k = ((fe) this).field_k + param1;
                      ((fe) this).field_B = ((fe) this).field_k.length();
                      ((fe) this).field_D = ((fe) this).field_k.length();
                      ((fe) this).f(true);
                      return true;
                    } else {
                      ((fe) this).field_k = ((fe) this).field_k.substring(0, ((fe) this).field_B) + param1 + ((fe) this).field_k.substring(((fe) this).field_B, ((fe) this).field_k.length());
                      ((fe) this).field_B = ((fe) this).field_B + 1;
                      ((fe) this).field_D = ((fe) this).field_B;
                      ((fe) this).f(true);
                      return true;
                    }
                  } else {
                    L7: {
                      this.e((byte) -106);
                      if (0 == (((fe) this).field_A ^ -1)) {
                        break L7;
                      } else {
                        if (((fe) this).field_k.length() < ((fe) this).field_A) {
                          break L7;
                        } else {
                          return true;
                        }
                      }
                    }
                    if (((fe) this).field_B >= ((fe) this).field_k.length()) {
                      ((fe) this).field_k = ((fe) this).field_k + param1;
                      ((fe) this).field_B = ((fe) this).field_k.length();
                      ((fe) this).field_D = ((fe) this).field_k.length();
                      ((fe) this).f(true);
                      return true;
                    } else {
                      ((fe) this).field_k = ((fe) this).field_k.substring(0, ((fe) this).field_B) + param1 + ((fe) this).field_k.substring(((fe) this).field_B, ((fe) this).field_k.length());
                      ((fe) this).field_B = ((fe) this).field_B + 1;
                      ((fe) this).field_D = ((fe) this).field_B;
                      ((fe) this).f(true);
                      return true;
                    }
                  }
                } else {
                  if (-86 != (param3 ^ -1)) {
                    L8: {
                      if (101 == param3) {
                        if (((fe) this).field_D == ((fe) this).field_B) {
                          if (((fe) this).field_B >= ((fe) this).field_k.length()) {
                            break L8;
                          } else {
                            ((fe) this).field_D = 1 + ((fe) this).field_B;
                            this.e((byte) -109);
                            return true;
                          }
                        } else {
                          this.e((byte) -97);
                          return true;
                        }
                      } else {
                        if ((param3 ^ -1) != -14) {
                          if ((param3 ^ -1) == -97) {
                            if (0 >= ((fe) this).field_B) {
                              break L8;
                            } else {
                              L9: {
                                stackOut_114_0 = this;
                                stackIn_116_0 = stackOut_114_0;
                                stackIn_115_0 = stackOut_114_0;
                                if (!wc.field_c[82]) {
                                  stackOut_116_0 = this;
                                  stackOut_116_1 = -1 + ((fe) this).field_B;
                                  stackIn_117_0 = stackOut_116_0;
                                  stackIn_117_1 = stackOut_116_1;
                                  break L9;
                                } else {
                                  stackOut_115_0 = this;
                                  stackOut_115_1 = this.g((byte) 122);
                                  stackIn_117_0 = stackOut_115_0;
                                  stackIn_117_1 = stackOut_115_1;
                                  break L9;
                                }
                              }
                              this.a(stackIn_117_1, 101);
                              return true;
                            }
                          } else {
                            if (param3 != 97) {
                              if (-103 != param3) {
                                if (-104 != param3) {
                                  if (param3 != -85) {
                                    L10: {
                                      if (!wc.field_c[82]) {
                                        break L10;
                                      } else {
                                        if (-66 == param3) {
                                          this.e(false);
                                          return true;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    L11: {
                                      if (!wc.field_c[82]) {
                                        break L11;
                                      } else {
                                        if (-67 != param3) {
                                          break L11;
                                        } else {
                                          this.g(true);
                                          return true;
                                        }
                                      }
                                    }
                                    if (!wc.field_c[82]) {
                                      break L8;
                                    } else {
                                      if (-68 != param3) {
                                        break L8;
                                      } else {
                                        this.g(param2 + 89);
                                        return true;
                                      }
                                    }
                                  } else {
                                    this.h(false);
                                    return true;
                                  }
                                } else {
                                  this.a(((fe) this).field_k.length(), param2 + 191);
                                  return true;
                                }
                              } else {
                                this.a(0, 101);
                                return true;
                              }
                            } else {
                              if (((fe) this).field_B < ((fe) this).field_k.length()) {
                                L12: {
                                  stackOut_92_0 = this;
                                  stackIn_94_0 = stackOut_92_0;
                                  stackIn_93_0 = stackOut_92_0;
                                  if (!wc.field_c[82]) {
                                    stackOut_94_0 = this;
                                    stackOut_94_1 = ((fe) this).field_B - -1;
                                    stackIn_95_0 = stackOut_94_0;
                                    stackIn_95_1 = stackOut_94_1;
                                    break L12;
                                  } else {
                                    stackOut_93_0 = this;
                                    stackOut_93_1 = this.f(param2 ^ 89);
                                    stackIn_95_0 = stackOut_93_0;
                                    stackIn_95_1 = stackOut_93_1;
                                    break L12;
                                  }
                                }
                                this.a(stackIn_95_1, 101);
                                return true;
                              } else {
                                return false;
                              }
                            }
                          }
                        } else {
                          ((fe) this).i(19293);
                          return true;
                        }
                      }
                    }
                    return false;
                  } else {
                    if (((fe) this).field_D == ((fe) this).field_B) {
                      if (((fe) this).field_B <= 0) {
                        return false;
                      } else {
                        ((fe) this).field_D = ((fe) this).field_B - 1;
                        this.e((byte) -123);
                        return true;
                      }
                    } else {
                      this.e((byte) -94);
                      return true;
                    }
                  }
                }
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          ((fe) this).f(true);
          if (param1 != 60) {
            if (param1 != 62) {
              L13: {
                if (param1 < 32) {
                  break L13;
                } else {
                  if (param1 > 126) {
                    break L13;
                  } else {
                    L14: {
                      if (((fe) this).field_B == ((fe) this).field_D) {
                        break L14;
                      } else {
                        this.e((byte) -106);
                        break L14;
                      }
                    }
                    L15: {
                      L16: {
                        if (0 == (((fe) this).field_A ^ -1)) {
                          break L16;
                        } else {
                          if (((fe) this).field_k.length() < ((fe) this).field_A) {
                            break L16;
                          } else {
                            break L15;
                          }
                        }
                      }
                      if (((fe) this).field_B >= ((fe) this).field_k.length()) {
                        ((fe) this).field_k = ((fe) this).field_k + param1;
                        ((fe) this).field_B = ((fe) this).field_k.length();
                        ((fe) this).field_D = ((fe) this).field_k.length();
                        ((fe) this).f(true);
                        break L15;
                      } else {
                        ((fe) this).field_k = ((fe) this).field_k.substring(0, ((fe) this).field_B) + param1 + ((fe) this).field_k.substring(((fe) this).field_B, ((fe) this).field_k.length());
                        ((fe) this).field_B = ((fe) this).field_B + 1;
                        ((fe) this).field_D = ((fe) this).field_B;
                        ((fe) this).f(true);
                        break L15;
                      }
                    }
                    return true;
                  }
                }
              }
              if (-86 != (param3 ^ -1)) {
                if (101 == param3) {
                  if (((fe) this).field_D == ((fe) this).field_B) {
                    if (((fe) this).field_B >= ((fe) this).field_k.length()) {
                      return false;
                    } else {
                      ((fe) this).field_D = 1 + ((fe) this).field_B;
                      this.e((byte) -109);
                      return true;
                    }
                  } else {
                    this.e((byte) -97);
                    return true;
                  }
                } else {
                  if ((param3 ^ -1) != -14) {
                    if ((param3 ^ -1) == -97) {
                      if (0 >= ((fe) this).field_B) {
                        return false;
                      } else {
                        L17: {
                          stackOut_59_0 = this;
                          stackIn_61_0 = stackOut_59_0;
                          stackIn_60_0 = stackOut_59_0;
                          if (!wc.field_c[82]) {
                            stackOut_61_0 = this;
                            stackOut_61_1 = -1 + ((fe) this).field_B;
                            stackIn_62_0 = stackOut_61_0;
                            stackIn_62_1 = stackOut_61_1;
                            break L17;
                          } else {
                            stackOut_60_0 = this;
                            stackOut_60_1 = this.g((byte) 122);
                            stackIn_62_0 = stackOut_60_0;
                            stackIn_62_1 = stackOut_60_1;
                            break L17;
                          }
                        }
                        this.a(stackIn_62_1, 101);
                        return true;
                      }
                    } else {
                      if (param3 != 97) {
                        if (-103 != param3) {
                          if (-104 != param3) {
                            if (param3 != -85) {
                              L18: {
                                if (!wc.field_c[82]) {
                                  break L18;
                                } else {
                                  if (-66 != param3) {
                                    break L18;
                                  } else {
                                    this.e(false);
                                    return true;
                                  }
                                }
                              }
                              L19: {
                                if (!wc.field_c[82]) {
                                  break L19;
                                } else {
                                  if (-67 != param3) {
                                    break L19;
                                  } else {
                                    this.g(true);
                                    return true;
                                  }
                                }
                              }
                              if (wc.field_c[82]) {
                                if (-68 != param3) {
                                  return false;
                                } else {
                                  this.g(param2 + 89);
                                  return true;
                                }
                              } else {
                                return false;
                              }
                            } else {
                              this.h(false);
                              return true;
                            }
                          } else {
                            this.a(((fe) this).field_k.length(), param2 + 191);
                            return true;
                          }
                        } else {
                          this.a(0, 101);
                          return true;
                        }
                      } else {
                        if (((fe) this).field_B < ((fe) this).field_k.length()) {
                          L20: {
                            stackOut_34_0 = this;
                            stackIn_36_0 = stackOut_34_0;
                            stackIn_35_0 = stackOut_34_0;
                            if (!wc.field_c[82]) {
                              stackOut_36_0 = this;
                              stackOut_36_1 = ((fe) this).field_B - -1;
                              stackIn_37_0 = stackOut_36_0;
                              stackIn_37_1 = stackOut_36_1;
                              break L20;
                            } else {
                              stackOut_35_0 = this;
                              stackOut_35_1 = this.f(param2 ^ 89);
                              stackIn_37_0 = stackOut_35_0;
                              stackIn_37_1 = stackOut_35_1;
                              break L20;
                            }
                          }
                          this.a(stackIn_37_1, 101);
                          return true;
                        } else {
                          return false;
                        }
                      }
                    }
                  } else {
                    ((fe) this).i(19293);
                    return true;
                  }
                }
              } else {
                if (((fe) this).field_D == ((fe) this).field_B) {
                  if (((fe) this).field_B > 0) {
                    ((fe) this).field_D = ((fe) this).field_B - 1;
                    this.e((byte) -123);
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  this.e((byte) -94);
                  return true;
                }
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    void f(boolean param0) {
        L0: {
          if (((fe) this).field_g instanceof si) {
            ((si) (Object) ((fe) this).field_g).a(-4312, (fe) this);
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          field_H = null;
          return;
        } else {
          return;
        }
    }

    private final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 >= -73) {
          L0: {
            ((fe) this).a(-88, 64, (byte) -102, 68);
            if (((fe) this).field_D == ((fe) this).field_B) {
              break L0;
            } else {
              L1: {
                if (((fe) this).field_B <= ((fe) this).field_D) {
                  stackOut_13_0 = ((fe) this).field_B;
                  stackIn_14_0 = stackOut_13_0;
                  break L1;
                } else {
                  stackOut_12_0 = ((fe) this).field_D;
                  stackIn_14_0 = stackOut_12_0;
                  break L1;
                }
              }
              L2: {
                var2 = stackIn_14_0;
                if (((fe) this).field_B > ((fe) this).field_D) {
                  stackOut_16_0 = ((fe) this).field_B;
                  stackIn_17_0 = stackOut_16_0;
                  break L2;
                } else {
                  stackOut_15_0 = ((fe) this).field_D;
                  stackIn_17_0 = stackOut_15_0;
                  break L2;
                }
              }
              var3 = stackIn_17_0;
              ((fe) this).field_D = var2;
              ((fe) this).field_B = var2;
              ((fe) this).field_k = ((fe) this).field_k.substring(0, var2) + ((fe) this).field_k.substring(var3, ((fe) this).field_k.length());
              ((fe) this).f(true);
              break L0;
            }
          }
          return;
        } else {
          L3: {
            if (((fe) this).field_D == ((fe) this).field_B) {
              break L3;
            } else {
              L4: {
                if (((fe) this).field_B <= ((fe) this).field_D) {
                  stackOut_4_0 = ((fe) this).field_B;
                  stackIn_5_0 = stackOut_4_0;
                  break L4;
                } else {
                  stackOut_3_0 = ((fe) this).field_D;
                  stackIn_5_0 = stackOut_3_0;
                  break L4;
                }
              }
              L5: {
                var2 = stackIn_5_0;
                if (((fe) this).field_B > ((fe) this).field_D) {
                  stackOut_7_0 = ((fe) this).field_B;
                  stackIn_8_0 = stackOut_7_0;
                  break L5;
                } else {
                  stackOut_6_0 = ((fe) this).field_D;
                  stackIn_8_0 = stackOut_6_0;
                  break L5;
                }
              }
              var3 = stackIn_8_0;
              ((fe) this).field_D = var2;
              ((fe) this).field_B = var2;
              ((fe) this).field_k = ((fe) this).field_k.substring(0, var2) + ((fe) this).field_k.substring(var3, ((fe) this).field_k.length());
              ((fe) this).f(true);
              break L3;
            }
          }
          return;
        }
    }

    final static void a(rf param0, rf param1, boolean param2) {
        L0: {
          if (param1.field_d != null) {
            param1.b(4);
            break L0;
          } else {
            break L0;
          }
        }
        param1.field_d = param0.field_d;
        param1.field_a = param0;
        if (param2) {
          field_J = null;
          param1.field_d.field_a = param1;
          param1.field_a.field_d = param1;
          return;
        } else {
          param1.field_d.field_a = param1;
          param1.field_a.field_d = param1;
          return;
        }
    }

    private final int f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = StarCannon.field_A;
        var2 = ((fe) this).field_k.length();
        if (var2 == ((fe) this).field_B) {
          return ((fe) this).field_B;
        } else {
          var3 = ((fe) this).field_B - param0;
          L0: while (true) {
            if (var2 > var3) {
              if (((fe) this).field_k.charAt(var3 - 1) != 32) {
                var3++;
                continue L0;
              } else {
                return var3;
              }
            } else {
              return var3;
            }
          }
        }
    }

    private final void g(boolean param0) {
        try {
            String var2 = null;
            if (!param0) {
              L0: {
                this.h(false);
                var2 = this.h(-107);
                if (0 < var2.length()) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.h(-110)), (java.awt.datatransfer.ClipboardOwner) null);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                var2 = this.h(-107);
                if (0 < var2.length()) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.h(-110)), (java.awt.datatransfer.ClipboardOwner) null);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    fe(String param0, qg param1, int param2) {
        super(param0, param1);
        ((fe) this).field_G = false;
        ((fe) this).field_E = 0L;
        ((fe) this).field_C = -1;
        ((fe) this).field_A = param2;
        ((fe) this).field_o = eh.field_j.field_c;
        ((fe) this).a((byte) -91, true, param0);
        ((fe) this).field_I = true;
        ((fe) this).field_F = dd.b(84);
    }

    final void i(int param0) {
        ((fe) this).field_B = 0;
        if (param0 != 19293) {
            return;
        }
        ((fe) this).field_D = 0;
        ((fe) this).field_k = "";
        ((fe) this).f(true);
    }

    private final String h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 > -102) {
          return null;
        } else {
          L0: {
            if (((fe) this).field_B > ((fe) this).field_D) {
              stackOut_3_0 = ((fe) this).field_D;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = ((fe) this).field_B;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_4_0;
            if (((fe) this).field_D < ((fe) this).field_B) {
              stackOut_6_0 = ((fe) this).field_B;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = ((fe) this).field_D;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          var3 = stackIn_7_0;
          return ((fe) this).field_k.substring(var2, var3);
        }
    }

    private final void a(int param0, int param1) {
        L0: {
          ((fe) this).field_B = param0;
          if (!wc.field_c[81]) {
            ((fe) this).field_D = ((fe) this).field_B;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != 101) {
          ((fe) this).field_C = -124;
          return;
        } else {
          return;
        }
    }

    private final void g(int param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
              this.e((byte) -106);
              if (param0 == -1) {
                this.a(var2, 4);
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2_ref = (Exception) (Object) decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(String param0, int param1) {
        int var3 = 0;
        L0: {
          if (0 == (((fe) this).field_A ^ -1)) {
            break L0;
          } else {
            var3 = ((fe) this).field_A + -((fe) this).field_k.length();
            if (var3 < 0) {
              param0 = param0.substring(0, var3);
              break L0;
            } else {
              return;
            }
          }
        }
        var3 = 67 % ((-58 - param1) / 50);
        if (((fe) this).field_B == ((fe) this).field_k.length()) {
          ((fe) this).field_k = ((fe) this).field_k + param0;
          ((fe) this).field_B = ((fe) this).field_B + param0.length();
          ((fe) this).field_D = ((fe) this).field_B;
          ((fe) this).f(true);
          return;
        } else {
          ((fe) this).field_k = ((fe) this).field_k.substring(0, ((fe) this).field_B) + param0 + ((fe) this).field_k.substring(((fe) this).field_B, ((fe) this).field_k.length());
          ((fe) this).field_B = ((fe) this).field_B + param0.length();
          ((fe) this).field_D = ((fe) this).field_B;
          ((fe) this).f(true);
          return;
        }
    }

    void a(int param0, int param1, uj param2, int param3) {
        int var6 = 0;
        lg var7 = null;
        super.a(60, param1, param2, param3);
        this.e(0);
        if (param0 >= 27) {
          if (((fe) this).field_l == 1) {
            if (((fe) this).field_o instanceof lg) {
              var7 = (lg) (Object) ((fe) this).field_o;
              var6 = var7.a(pe.field_d, la.field_c, (uj) this, param1, param3, true);
              if (0 != (var6 ^ -1)) {
                if (((fe) this).field_G) {
                  if (var6 < ((fe) this).field_C) {
                    if (((fe) this).field_D >= var6) {
                      ((fe) this).field_B = var6;
                      ((fe) this).field_F = dd.b(122);
                      return;
                    } else {
                      var6 = ((fe) this).field_C;
                      ((fe) this).field_B = var6;
                      ((fe) this).field_F = dd.b(122);
                      return;
                    }
                  } else {
                    ((fe) this).field_B = var6;
                    ((fe) this).field_F = dd.b(122);
                    return;
                  }
                } else {
                  ((fe) this).field_B = var6;
                  ((fe) this).field_F = dd.b(122);
                  return;
                }
              } else {
                ((fe) this).field_F = dd.b(122);
                return;
              }
            } else {
              ((fe) this).field_F = dd.b(122);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(uj param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          if (((fe) this).field_o instanceof lg) {
            L0: {
              var8_int = ((lg) (Object) ((fe) this).field_o).a(pe.field_d, la.field_c, (uj) this, param2, param3, true);
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (var8_int == -1) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L0;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = var8_int;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L0;
              }
            }
            L1: {
              this.a(stackIn_7_1, 101);
              var8 = dd.b(param4 + 137);
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (-251L >= (var8 + -((fe) this).field_E ^ -1L)) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L1;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L1;
              }
            }
            ((fe) this).field_G = stackIn_10_1 != 0;
            if (((fe) this).field_G) {
              ((fe) this).field_D = this.g((byte) 124);
              ((fe) this).field_B = this.f(-1);
              if (0 < ((fe) this).field_B) {
                if (((fe) this).field_k.charAt(-1 + ((fe) this).field_B) == 32) {
                  ((fe) this).field_B = ((fe) this).field_B - 1;
                  ((fe) this).field_C = ((fe) this).field_B;
                  ((fe) this).field_E = var8;
                  return true;
                } else {
                  ((fe) this).field_C = ((fe) this).field_B;
                  ((fe) this).field_E = var8;
                  return true;
                }
              } else {
                ((fe) this).field_C = ((fe) this).field_B;
                ((fe) this).field_E = var8;
                return true;
              }
            } else {
              ((fe) this).field_E = var8;
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final void a(byte param0, boolean param1, String param2) {
        int var4 = 0;
        Object var5 = null;
        L0: {
          if (param2 != null) {
            break L0;
          } else {
            param2 = "";
            break L0;
          }
        }
        ((fe) this).field_k = param2;
        var4 = param2.length();
        if (0 != (((fe) this).field_A ^ -1)) {
          if (((fe) this).field_A < var4) {
            ((fe) this).field_k = ((fe) this).field_k.substring(0, ((fe) this).field_A);
            if (param0 == -91) {
              ((fe) this).field_D = ((fe) this).field_k.length();
              ((fe) this).field_B = ((fe) this).field_k.length();
              if (!param1) {
                ((fe) this).f(true);
                return;
              } else {
                return;
              }
            } else {
              L1: {
                var5 = null;
                ((fe) this).a((byte) 3, true, (String) null);
                ((fe) this).field_D = ((fe) this).field_k.length();
                ((fe) this).field_B = ((fe) this).field_k.length();
                if (param1) {
                  break L1;
                } else {
                  ((fe) this).f(true);
                  break L1;
                }
              }
              return;
            }
          } else {
            if (param0 == -91) {
              ((fe) this).field_D = ((fe) this).field_k.length();
              ((fe) this).field_B = ((fe) this).field_k.length();
              if (!param1) {
                ((fe) this).f(true);
                return;
              } else {
                return;
              }
            } else {
              var5 = null;
              ((fe) this).a((byte) 3, true, (String) null);
              ((fe) this).field_D = ((fe) this).field_k.length();
              ((fe) this).field_B = ((fe) this).field_k.length();
              if (!param1) {
                ((fe) this).f(true);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (param0 == -91) {
            ((fe) this).field_D = ((fe) this).field_k.length();
            ((fe) this).field_B = ((fe) this).field_k.length();
            if (!param1) {
              ((fe) this).f(true);
              return;
            } else {
              return;
            }
          } else {
            var5 = null;
            ((fe) this).a((byte) 3, true, (String) null);
            ((fe) this).field_D = ((fe) this).field_k.length();
            ((fe) this).field_B = ((fe) this).field_k.length();
            if (!param1) {
              ((fe) this).f(true);
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void f(byte param0) {
        field_H = null;
        if (param0 != 73) {
            field_H = null;
            field_J = null;
            return;
        }
        field_J = null;
    }

    static {
    }
}
