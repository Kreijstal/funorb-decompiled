/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bob implements wwa, at {
    private int field_j;
    int field_f;
    int field_a;
    no field_d;
    int field_h;
    private boolean field_g;
    int field_i;
    static dja field_e;
    int field_b;
    static String field_l;
    int field_k;
    int field_o;
    int field_m;
    int field_c;
    int field_n;

    private final void c(shb param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = VoidHunters.field_G;
          if (null == param0.field_d) {
            param0.field_d = (ar) (Object) new re();
            break L0;
          } else {
            break L0;
          }
        }
        var3 = ((bob) this).b(param0, (byte) 110);
        var4 = this.a((byte) 96, param0);
        var6 = ((bob) this).field_n;
        if (var6 != -1) {
          if (var6 != -3) {
            L1: {
              if (-4 != var6) {
                if (-2 == var6) {
                  break L1;
                } else {
                  L2: {
                    var5 = ((bob) this).field_d.field_k + (-((bob) this).field_d.field_A + (-((bob) this).field_d.field_k + var4) >> 340287457);
                    if (param1 > 58) {
                      break L2;
                    } else {
                      var8 = null;
                      int discarded$4 = this.a(-103, (shb) null, -65, (byte) 74);
                      break L2;
                    }
                  }
                  var6 = ((bob) this).field_c;
                  if (var6 != 0) {
                    if (var6 == 3) {
                      if (!(param0.field_d instanceof re)) {
                        return;
                      } else {
                        ((re) (Object) param0.field_d).a(var5, ((bob) this).field_d, -3, ((bob) this).b((byte) -98, param0), 0);
                        return;
                      }
                    } else {
                      if (var6 == 1) {
                        if (param0.field_d instanceof re) {
                          ((re) (Object) param0.field_d).a(-2661, var3 >> -342781407, ((bob) this).b((byte) -97, param0), var5, ((bob) this).field_d);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if ((var6 ^ -1) == -3) {
                          if (param0.field_d instanceof re) {
                            ((re) (Object) param0.field_d).a(var5, ((bob) this).field_d, 49, var3, ((bob) this).b((byte) -56, param0));
                            return;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    L3: {
                      if (param0.field_d instanceof re) {
                        ((re) (Object) param0.field_d).a(var5, ((bob) this).field_d, -3, ((bob) this).b((byte) -98, param0), 0);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    return;
                  }
                }
              } else {
                break L1;
              }
            }
            var5 = ((bob) this).field_d.field_k + (-((bob) this).field_d.field_A + (-((bob) this).field_d.field_k + var4) >> 340287457);
            if (param1 <= 58) {
              var8 = null;
              int discarded$5 = this.a(-103, (shb) null, -65, (byte) 74);
              var6 = ((bob) this).field_c;
              if (var6 != 0) {
                if (var6 == 3) {
                  if (param0.field_d instanceof re) {
                    ((re) (Object) param0.field_d).a(var5, ((bob) this).field_d, -3, ((bob) this).b((byte) -98, param0), 0);
                    return;
                  } else {
                    return;
                  }
                } else {
                  L4: {
                    if (var6 == 1) {
                      if (!(param0.field_d instanceof re)) {
                        break L4;
                      } else {
                        ((re) (Object) param0.field_d).a(-2661, var3 >> -342781407, ((bob) this).b((byte) -97, param0), var5, ((bob) this).field_d);
                        return;
                      }
                    } else {
                      if ((var6 ^ -1) == -3) {
                        if (!(param0.field_d instanceof re)) {
                          break L4;
                        } else {
                          ((re) (Object) param0.field_d).a(var5, ((bob) this).field_d, 49, var3, ((bob) this).b((byte) -56, param0));
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                }
              } else {
                if (param0.field_d instanceof re) {
                  ((re) (Object) param0.field_d).a(var5, ((bob) this).field_d, -3, ((bob) this).b((byte) -98, param0), 0);
                  return;
                } else {
                  return;
                }
              }
            } else {
              var6 = ((bob) this).field_c;
              if (var6 != 0) {
                if (var6 == 3) {
                  if (param0.field_d instanceof re) {
                    ((re) (Object) param0.field_d).a(var5, ((bob) this).field_d, -3, ((bob) this).b((byte) -98, param0), 0);
                    return;
                  } else {
                    return;
                  }
                } else {
                  L5: {
                    if (var6 == 1) {
                      if (!(param0.field_d instanceof re)) {
                        break L5;
                      } else {
                        ((re) (Object) param0.field_d).a(-2661, var3 >> -342781407, ((bob) this).b((byte) -97, param0), var5, ((bob) this).field_d);
                        return;
                      }
                    } else {
                      if ((var6 ^ -1) == -3) {
                        if (!(param0.field_d instanceof re)) {
                          break L5;
                        } else {
                          ((re) (Object) param0.field_d).a(var5, ((bob) this).field_d, 49, var3, ((bob) this).b((byte) -56, param0));
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                }
              } else {
                if (param0.field_d instanceof re) {
                  ((re) (Object) param0.field_d).a(var5, ((bob) this).field_d, -3, ((bob) this).b((byte) -98, param0), 0);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            var5 = var4 - ((bob) this).field_d.field_A;
            if (param1 <= 58) {
              var8 = null;
              int discarded$6 = this.a(-103, (shb) null, -65, (byte) 74);
              var6 = ((bob) this).field_c;
              if (var6 != 0) {
                if (var6 == 3) {
                  if (param0.field_d instanceof re) {
                    ((re) (Object) param0.field_d).a(var5, ((bob) this).field_d, -3, ((bob) this).b((byte) -98, param0), 0);
                    return;
                  } else {
                    return;
                  }
                } else {
                  L6: {
                    if (var6 == 1) {
                      if (!(param0.field_d instanceof re)) {
                        break L6;
                      } else {
                        ((re) (Object) param0.field_d).a(-2661, var3 >> -342781407, ((bob) this).b((byte) -97, param0), var5, ((bob) this).field_d);
                        return;
                      }
                    } else {
                      if ((var6 ^ -1) == -3) {
                        if (!(param0.field_d instanceof re)) {
                          break L6;
                        } else {
                          ((re) (Object) param0.field_d).a(var5, ((bob) this).field_d, 49, var3, ((bob) this).b((byte) -56, param0));
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                }
              } else {
                L7: {
                  if (param0.field_d instanceof re) {
                    ((re) (Object) param0.field_d).a(var5, ((bob) this).field_d, -3, ((bob) this).b((byte) -98, param0), 0);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                return;
              }
            } else {
              var6 = ((bob) this).field_c;
              if (var6 != 0) {
                if (var6 == 3) {
                  if (param0.field_d instanceof re) {
                    ((re) (Object) param0.field_d).a(var5, ((bob) this).field_d, -3, ((bob) this).b((byte) -98, param0), 0);
                    return;
                  } else {
                    return;
                  }
                } else {
                  L8: {
                    if (var6 == 1) {
                      if (!(param0.field_d instanceof re)) {
                        break L8;
                      } else {
                        ((re) (Object) param0.field_d).a(-2661, var3 >> -342781407, ((bob) this).b((byte) -97, param0), var5, ((bob) this).field_d);
                        return;
                      }
                    } else {
                      if ((var6 ^ -1) == -3) {
                        if (!(param0.field_d instanceof re)) {
                          break L8;
                        } else {
                          ((re) (Object) param0.field_d).a(var5, ((bob) this).field_d, 49, var3, ((bob) this).b((byte) -56, param0));
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                }
              } else {
                L9: {
                  if (param0.field_d instanceof re) {
                    ((re) (Object) param0.field_d).a(var5, ((bob) this).field_d, -3, ((bob) this).b((byte) -98, param0), 0);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                return;
              }
            }
          }
        } else {
          var5 = ((bob) this).field_d.field_k;
          if (param1 <= 58) {
            var8 = null;
            int discarded$7 = this.a(-103, (shb) null, -65, (byte) 74);
            var6 = ((bob) this).field_c;
            if (var6 != 0) {
              if (var6 == 3) {
                if (!(param0.field_d instanceof re)) {
                  return;
                } else {
                  ((re) (Object) param0.field_d).a(var5, ((bob) this).field_d, -3, ((bob) this).b((byte) -98, param0), 0);
                  return;
                }
              } else {
                if (var6 == 1) {
                  if (param0.field_d instanceof re) {
                    ((re) (Object) param0.field_d).a(-2661, var3 >> -342781407, ((bob) this).b((byte) -97, param0), var5, ((bob) this).field_d);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if ((var6 ^ -1) == -3) {
                    if (!(param0.field_d instanceof re)) {
                      return;
                    } else {
                      ((re) (Object) param0.field_d).a(var5, ((bob) this).field_d, 49, var3, ((bob) this).b((byte) -56, param0));
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            } else {
              L10: {
                if (param0.field_d instanceof re) {
                  ((re) (Object) param0.field_d).a(var5, ((bob) this).field_d, -3, ((bob) this).b((byte) -98, param0), 0);
                  break L10;
                } else {
                  break L10;
                }
              }
              return;
            }
          } else {
            var6 = ((bob) this).field_c;
            if (var6 != 0) {
              if (var6 == 3) {
                if (!(param0.field_d instanceof re)) {
                  return;
                } else {
                  ((re) (Object) param0.field_d).a(var5, ((bob) this).field_d, -3, ((bob) this).b((byte) -98, param0), 0);
                  return;
                }
              } else {
                if (var6 == 1) {
                  if (param0.field_d instanceof re) {
                    ((re) (Object) param0.field_d).a(-2661, var3 >> -342781407, ((bob) this).b((byte) -97, param0), var5, ((bob) this).field_d);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if ((var6 ^ -1) == -3) {
                    if (param0.field_d instanceof re) {
                      ((re) (Object) param0.field_d).a(var5, ((bob) this).field_d, 49, var3, ((bob) this).b((byte) -56, param0));
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            } else {
              L11: {
                if (param0.field_d instanceof re) {
                  ((re) (Object) param0.field_d).a(var5, ((bob) this).field_d, -3, ((bob) this).b((byte) -98, param0), 0);
                  break L11;
                } else {
                  break L11;
                }
              }
              return;
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, shb param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = VoidHunters.field_G;
        qca.a(param5.field_h + param5.field_g + param6, param5.field_f + (param7 + param5.field_r), param5.field_g + param6, true, param5.field_r + param7);
        var9 = ((bob) this).b(param5, (byte) 81);
        var10 = this.a((byte) 56, param5);
        if (param3 == -13997) {
          if (!((bob) this).field_g) {
            var12 = ((bob) this).field_n;
            if (-1 != var12) {
              if (-3 == var12) {
                var11 = var10 + -((bob) this).field_d.field_A;
                var12 = ((bob) this).field_c;
                if (0 != var12) {
                  if (-4 == (var12 ^ -1)) {
                    ((bob) this).field_d.c(((bob) this).b((byte) -68, param5), this.a(param6, param5, param0, (byte) -13), this.a(param7, param3 ^ 14041, param5, param2) - -var11, param4, param1);
                    bia.a((byte) 124);
                    return;
                  } else {
                    if (var12 != -2) {
                      if (-3 == var12) {
                        ((bob) this).field_d.b(((bob) this).b((byte) -72, param5), var9 + this.a(param6, param5, param0, (byte) -13), var11 + this.a(param7, -124, param5, param2), param4, param1);
                        bia.a((byte) 124);
                        return;
                      } else {
                        bia.a((byte) 124);
                        return;
                      }
                    } else {
                      ((bob) this).field_d.a(((bob) this).b((byte) -109, param5), (var9 >> 522853505) + this.a(param6, param5, param0, (byte) -13), this.a(param7, -117, param5, param2) + var11, param4, param1);
                      bia.a((byte) 124);
                      return;
                    }
                  }
                } else {
                  ((bob) this).field_d.c(((bob) this).b((byte) -68, param5), this.a(param6, param5, param0, (byte) -13), this.a(param7, param3 ^ 14041, param5, param2) - -var11, param4, param1);
                  bia.a((byte) 124);
                  return;
                }
              } else {
                if (3 != var12) {
                  if ((var12 ^ -1) != -2) {
                    var11 = ((bob) this).field_d.field_k + (-((bob) this).field_d.field_A + var10 - ((bob) this).field_d.field_k >> 237200001);
                    var12 = ((bob) this).field_c;
                    if (0 != var12) {
                      if (-4 == (var12 ^ -1)) {
                        ((bob) this).field_d.c(((bob) this).b((byte) -68, param5), this.a(param6, param5, param0, (byte) -13), this.a(param7, param3 ^ 14041, param5, param2) - -var11, param4, param1);
                        bia.a((byte) 124);
                        return;
                      } else {
                        if (var12 != -2) {
                          if (-3 == var12) {
                            ((bob) this).field_d.b(((bob) this).b((byte) -72, param5), var9 + this.a(param6, param5, param0, (byte) -13), var11 + this.a(param7, -124, param5, param2), param4, param1);
                            bia.a((byte) 124);
                            return;
                          } else {
                            bia.a((byte) 124);
                            return;
                          }
                        } else {
                          ((bob) this).field_d.a(((bob) this).b((byte) -109, param5), (var9 >> 522853505) + this.a(param6, param5, param0, (byte) -13), this.a(param7, -117, param5, param2) + var11, param4, param1);
                          bia.a((byte) 124);
                          return;
                        }
                      }
                    } else {
                      ((bob) this).field_d.c(((bob) this).b((byte) -68, param5), this.a(param6, param5, param0, (byte) -13), this.a(param7, param3 ^ 14041, param5, param2) - -var11, param4, param1);
                      bia.a((byte) 124);
                      return;
                    }
                  } else {
                    var11 = ((bob) this).field_d.field_k + (-((bob) this).field_d.field_A + var10 - ((bob) this).field_d.field_k >> 237200001);
                    var12 = ((bob) this).field_c;
                    if (0 != var12) {
                      if (-4 == (var12 ^ -1)) {
                        ((bob) this).field_d.c(((bob) this).b((byte) -68, param5), this.a(param6, param5, param0, (byte) -13), this.a(param7, param3 ^ 14041, param5, param2) - -var11, param4, param1);
                        bia.a((byte) 124);
                        return;
                      } else {
                        if (var12 != -2) {
                          if (-3 == var12) {
                            ((bob) this).field_d.b(((bob) this).b((byte) -72, param5), var9 + this.a(param6, param5, param0, (byte) -13), var11 + this.a(param7, -124, param5, param2), param4, param1);
                            bia.a((byte) 124);
                            return;
                          } else {
                            bia.a((byte) 124);
                            return;
                          }
                        } else {
                          ((bob) this).field_d.a(((bob) this).b((byte) -109, param5), (var9 >> 522853505) + this.a(param6, param5, param0, (byte) -13), this.a(param7, -117, param5, param2) + var11, param4, param1);
                          bia.a((byte) 124);
                          return;
                        }
                      }
                    } else {
                      ((bob) this).field_d.c(((bob) this).b((byte) -68, param5), this.a(param6, param5, param0, (byte) -13), this.a(param7, param3 ^ 14041, param5, param2) - -var11, param4, param1);
                      bia.a((byte) 124);
                      return;
                    }
                  }
                } else {
                  var11 = ((bob) this).field_d.field_k + (-((bob) this).field_d.field_A + var10 - ((bob) this).field_d.field_k >> 237200001);
                  var12 = ((bob) this).field_c;
                  if (0 != var12) {
                    if (-4 == (var12 ^ -1)) {
                      ((bob) this).field_d.c(((bob) this).b((byte) -68, param5), this.a(param6, param5, param0, (byte) -13), this.a(param7, param3 ^ 14041, param5, param2) - -var11, param4, param1);
                      bia.a((byte) 124);
                      return;
                    } else {
                      if (var12 != -2) {
                        if (-3 == var12) {
                          ((bob) this).field_d.b(((bob) this).b((byte) -72, param5), var9 + this.a(param6, param5, param0, (byte) -13), var11 + this.a(param7, -124, param5, param2), param4, param1);
                          bia.a((byte) 124);
                          return;
                        } else {
                          bia.a((byte) 124);
                          return;
                        }
                      } else {
                        ((bob) this).field_d.a(((bob) this).b((byte) -109, param5), (var9 >> 522853505) + this.a(param6, param5, param0, (byte) -13), this.a(param7, -117, param5, param2) + var11, param4, param1);
                        bia.a((byte) 124);
                        return;
                      }
                    }
                  } else {
                    ((bob) this).field_d.c(((bob) this).b((byte) -68, param5), this.a(param6, param5, param0, (byte) -13), this.a(param7, param3 ^ 14041, param5, param2) - -var11, param4, param1);
                    bia.a((byte) 124);
                    return;
                  }
                }
              }
            } else {
              var11 = ((bob) this).field_d.field_k;
              var12 = ((bob) this).field_c;
              if (0 != var12) {
                if (-4 == (var12 ^ -1)) {
                  ((bob) this).field_d.c(((bob) this).b((byte) -68, param5), this.a(param6, param5, param0, (byte) -13), this.a(param7, param3 ^ 14041, param5, param2) - -var11, param4, param1);
                  bia.a((byte) 124);
                  return;
                } else {
                  if (var12 != -2) {
                    if (-3 == var12) {
                      ((bob) this).field_d.b(((bob) this).b((byte) -72, param5), var9 + this.a(param6, param5, param0, (byte) -13), var11 + this.a(param7, -124, param5, param2), param4, param1);
                      bia.a((byte) 124);
                      return;
                    } else {
                      bia.a((byte) 124);
                      return;
                    }
                  } else {
                    ((bob) this).field_d.a(((bob) this).b((byte) -109, param5), (var9 >> 522853505) + this.a(param6, param5, param0, (byte) -13), this.a(param7, -117, param5, param2) + var11, param4, param1);
                    bia.a((byte) 124);
                    return;
                  }
                }
              } else {
                ((bob) this).field_d.c(((bob) this).b((byte) -68, param5), this.a(param6, param5, param0, (byte) -13), this.a(param7, param3 ^ 14041, param5, param2) - -var11, param4, param1);
                bia.a((byte) 124);
                return;
              }
            }
          } else {
            int discarded$2 = ((bob) this).field_d.a(((bob) this).b((byte) -112, param5), this.a(param6, param5, param0, (byte) -13), this.a(param7, -117, param5, param2), var9, var10, param4, param1, ((bob) this).field_c, ((bob) this).field_n, ((bob) this).field_h);
            bia.a((byte) 124);
            return;
          }
        } else {
          ((bob) this).field_j = 65;
          if (!((bob) this).field_g) {
            L0: {
              var12 = ((bob) this).field_n;
              if (-1 != var12) {
                if (-3 == var12) {
                  var11 = var10 + -((bob) this).field_d.field_A;
                  break L0;
                } else {
                  L1: {
                    if (3 == var12) {
                      break L1;
                    } else {
                      if ((var12 ^ -1) == -2) {
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var11 = ((bob) this).field_d.field_k + (-((bob) this).field_d.field_A + var10 - ((bob) this).field_d.field_k >> 237200001);
                  break L0;
                }
              } else {
                var11 = ((bob) this).field_d.field_k;
                break L0;
              }
            }
            L2: {
              var12 = ((bob) this).field_c;
              if (0 != var12) {
                if (-4 == (var12 ^ -1)) {
                  break L2;
                } else {
                  if (var12 != -2) {
                    if (-3 == var12) {
                      ((bob) this).field_d.b(((bob) this).b((byte) -72, param5), var9 + this.a(param6, param5, param0, (byte) -13), var11 + this.a(param7, -124, param5, param2), param4, param1);
                      bia.a((byte) 124);
                      return;
                    } else {
                      bia.a((byte) 124);
                      return;
                    }
                  } else {
                    ((bob) this).field_d.a(((bob) this).b((byte) -109, param5), (var9 >> 522853505) + this.a(param6, param5, param0, (byte) -13), this.a(param7, -117, param5, param2) + var11, param4, param1);
                    bia.a((byte) 124);
                    return;
                  }
                }
              } else {
                break L2;
              }
            }
            ((bob) this).field_d.c(((bob) this).b((byte) -68, param5), this.a(param6, param5, param0, (byte) -13), this.a(param7, param3 ^ 14041, param5, param2) - -var11, param4, param1);
            bia.a((byte) 124);
            return;
          } else {
            int discarded$3 = ((bob) this).field_d.a(((bob) this).b((byte) -112, param5), this.a(param6, param5, param0, (byte) -13), this.a(param7, -117, param5, param2), var9, var10, param4, param1, ((bob) this).field_c, ((bob) this).field_n, ((bob) this).field_h);
            bia.a((byte) 124);
            return;
          }
        }
    }

    private final int a(int param0, int param1, shb param2, int param3) {
        if (param1 > -116) {
          ((bob) this).field_g = true;
          return param3 + (((bob) this).field_k + param0) - (-param2.field_r + -param2.field_i);
        } else {
          return param3 + (((bob) this).field_k + param0) - (-param2.field_r + -param2.field_i);
        }
    }

    bob(no param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final int a(int param0, shb param1, int param2, byte param3) {
        if (param3 != -13) {
          ((bob) this).field_n = -85;
          return param2 + (((bob) this).field_f + param1.field_g + param0) + param1.field_s;
        } else {
          return param2 + (((bob) this).field_f + param1.field_g + param0) + param1.field_s;
        }
    }

    public final int a(shb param0, byte param1) {
        ar discarded$0 = ((bob) this).a(param0, 3);
        int var3 = -15 % ((param1 - -1) / 59);
        return param0.field_d.a(29565) - (-((bob) this).field_k + -((bob) this).field_m);
    }

    public final int b(shb param0, byte param1) {
        if (param1 < 66) {
            return -93;
        }
        return param0.field_h + (-((bob) this).field_f - ((bob) this).field_o);
    }

    public final int a(int param0, int param1, int param2, int param3, shb param4, int param5) {
        ar discarded$7 = ((bob) this).a(param4, 3);
        if (param5 != -1) {
          bob.b(38);
          return param4.field_d.a(param1 + -((bob) this).b(-3, param2, param4), -23381, param0 - ((bob) this).a(0, param3, param4));
        } else {
          return param4.field_d.a(param1 + -((bob) this).b(-3, param2, param4), -23381, param0 - ((bob) this).a(0, param3, param4));
        }
    }

    public final ar a(shb param0, int param1) {
        if (param1 == 3) {
          if (param0.field_d != null) {
            if (!((bob) this).field_g) {
              this.c(param0, (byte) 87);
              return param0.field_d;
            } else {
              ((re) (Object) param0.field_d).a(((bob) this).field_h, this.a((byte) 83, param0), ((bob) this).b(param0, (byte) 117), ((bob) this).b((byte) -94, param0), ((bob) this).field_d, ((bob) this).field_c, 3, ((bob) this).field_n);
              return param0.field_d;
            }
          } else {
            param0.field_d = (ar) (Object) new re();
            if (!((bob) this).field_g) {
              this.c(param0, (byte) 87);
              return param0.field_d;
            } else {
              ((re) (Object) param0.field_d).a(((bob) this).field_h, this.a((byte) 83, param0), ((bob) this).b(param0, (byte) 117), ((bob) this).b((byte) -94, param0), ((bob) this).field_d, ((bob) this).field_c, 3, ((bob) this).field_n);
              return param0.field_d;
            }
          }
        } else {
          ((bob) this).field_j = -104;
          if (param0.field_d == null) {
            param0.field_d = (ar) (Object) new re();
            if (!((bob) this).field_g) {
              this.c(param0, (byte) 87);
              return param0.field_d;
            } else {
              ((re) (Object) param0.field_d).a(((bob) this).field_h, this.a((byte) 83, param0), ((bob) this).b(param0, (byte) 117), ((bob) this).b((byte) -94, param0), ((bob) this).field_d, ((bob) this).field_c, 3, ((bob) this).field_n);
              return param0.field_d;
            }
          } else {
            if (!((bob) this).field_g) {
              this.c(param0, (byte) 87);
              return param0.field_d;
            } else {
              ((re) (Object) param0.field_d).a(((bob) this).field_h, this.a((byte) 83, param0), ((bob) this).b(param0, (byte) 117), ((bob) this).b((byte) -94, param0), ((bob) this).field_d, ((bob) this).field_c, 3, ((bob) this).field_n);
              return param0.field_d;
            }
          }
        }
    }

    private final void a(int param0, shb param1, int param2, int param3) {
        this.a(0, ((bob) this).field_j, 0, -13997, ((bob) this).field_i, param1, param3, param2);
        if (param0 != 340287457) {
            Object var6 = null;
            int discarded$0 = this.a(-125, (shb) null, -85, (byte) -70);
        }
    }

    final void a(int param0, bob param1) {
        param1.field_b = ((bob) this).field_b;
        if (param0 >= -121) {
          return;
        } else {
          param1.field_f = ((bob) this).field_f;
          param1.field_m = ((bob) this).field_m;
          param1.field_k = ((bob) this).field_k;
          param1.field_g = ((bob) this).field_g;
          param1.field_c = ((bob) this).field_c;
          param1.field_n = ((bob) this).field_n;
          param1.field_a = ((bob) this).field_a;
          param1.field_i = ((bob) this).field_i;
          param1.field_h = ((bob) this).field_h;
          param1.field_d = ((bob) this).field_d;
          param1.field_j = ((bob) this).field_j;
          param1.field_o = ((bob) this).field_o;
          return;
        }
    }

    public final void b(int param0, int param1, int param2, int param3, shb param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        ar var20 = null;
        ar var21 = null;
        toa var22 = null;
        ar var23 = null;
        ar var24 = null;
        toa var25 = null;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var16 = VoidHunters.field_G;
        if (param2 == -24184) {
          if (param0 == param5) {
            return;
          } else {
            L0: {
              if (param4.e((byte) -120)) {
                L1: {
                  var24 = ((bob) this).a(param4, 3);
                  var23 = var24;
                  if (param5 > param0) {
                    var9 = param5;
                    var8 = param0;
                    break L1;
                  } else {
                    var8 = param5;
                    var9 = param0;
                    break L1;
                  }
                }
                var10 = var23.a(true, var8);
                var11 = var23.a(true, var9);
                qca.a(param4.field_g + param3 + param4.field_h, param4.field_r + param1 + param4.field_f, param4.field_g + param3, true, param1 - -param4.field_r);
                var12 = var10;
                L2: while (true) {
                  if (var11 < var12) {
                    bia.a((byte) 124);
                    break L0;
                  } else {
                    L3: {
                      var25 = var24.field_c[var12];
                      if (var10 == var12) {
                        stackOut_32_0 = var23.a(var8, -112);
                        stackIn_33_0 = stackOut_32_0;
                        break L3;
                      } else {
                        stackOut_31_0 = var25.field_c[0];
                        stackIn_33_0 = stackOut_31_0;
                        break L3;
                      }
                    }
                    L4: {
                      var14 = stackIn_33_0;
                      if (var12 == var11) {
                        stackOut_37_0 = var23.a(var9, -124);
                        stackIn_38_0 = stackOut_37_0;
                        break L4;
                      } else {
                        if (var25 != null) {
                          stackOut_36_0 = var25.field_c[-1 + var25.field_c.length];
                          stackIn_38_0 = stackOut_36_0;
                          break L4;
                        } else {
                          stackOut_35_0 = 0;
                          stackIn_38_0 = stackOut_35_0;
                          break L4;
                        }
                      }
                    }
                    var15 = stackIn_38_0;
                    msa.field_s.a(var25.field_b + (param4.field_i + ((bob) this).field_k + (param4.field_r + param1)), ((bob) this).field_b >>> 1554526424, true, var15 - var14, ((bob) this).field_b, this.a(param3, param4, var14, (byte) -13), var25.field_a);
                    var12++;
                    continue L2;
                  }
                }
              } else {
                break L0;
              }
            }
            return;
          }
        } else {
          var17 = null;
          ((bob) this).b(-123, -97, 78, -103, (shb) null, 79);
          if (param0 == param5) {
            return;
          } else {
            L5: {
              if (param4.e((byte) -120)) {
                L6: {
                  var21 = ((bob) this).a(param4, 3);
                  var20 = var21;
                  if (param5 > param0) {
                    var9 = param5;
                    var8 = param0;
                    break L6;
                  } else {
                    var8 = param5;
                    var9 = param0;
                    break L6;
                  }
                }
                var10 = var20.a(true, var8);
                var11 = var20.a(true, var9);
                qca.a(param4.field_g + param3 + param4.field_h, param4.field_r + param1 + param4.field_f, param4.field_g + param3, true, param1 - -param4.field_r);
                var12 = var10;
                L7: while (true) {
                  if (var11 < var12) {
                    bia.a((byte) 124);
                    break L5;
                  } else {
                    L8: {
                      var22 = var21.field_c[var12];
                      if (var10 == var12) {
                        stackOut_11_0 = var20.a(var8, -112);
                        stackIn_12_0 = stackOut_11_0;
                        break L8;
                      } else {
                        stackOut_10_0 = var22.field_c[0];
                        stackIn_12_0 = stackOut_10_0;
                        break L8;
                      }
                    }
                    L9: {
                      var14 = stackIn_12_0;
                      if (var12 == var11) {
                        stackOut_16_0 = var20.a(var9, -124);
                        stackIn_17_0 = stackOut_16_0;
                        break L9;
                      } else {
                        if (var22 != null) {
                          stackOut_15_0 = var22.field_c[-1 + var22.field_c.length];
                          stackIn_17_0 = stackOut_15_0;
                          break L9;
                        } else {
                          stackOut_14_0 = 0;
                          stackIn_17_0 = stackOut_14_0;
                          break L9;
                        }
                      }
                    }
                    var15 = stackIn_17_0;
                    msa.field_s.a(var22.field_b + (param4.field_i + ((bob) this).field_k + (param4.field_r + param1)), ((bob) this).field_b >>> 1554526424, true, var15 - var14, ((bob) this).field_b, this.a(param3, param4, var14, (byte) -13), var22.field_a);
                    var12++;
                    continue L7;
                  }
                }
              } else {
                break L5;
              }
            }
            return;
          }
        }
    }

    public final int a(int param0, int param1, shb param2) {
        if (param0 != 0) {
          ((bob) this).field_f = -99;
          return this.a(param1, param2, 0, (byte) -13);
        } else {
          return this.a(param1, param2, 0, (byte) -13);
        }
    }

    public final int a(int param0, shb param1) {
        if (param0 != -2) {
          ((bob) this).field_c = 43;
          ar discarded$4 = ((bob) this).a(param1, 3);
          return param1.field_d.c(-18877) + ((bob) this).field_f - -((bob) this).field_o;
        } else {
          ar discarded$5 = ((bob) this).a(param1, 3);
          return param1.field_d.c(-18877) + ((bob) this).field_f - -((bob) this).field_o;
        }
    }

    private final int a(byte param0, shb param1) {
        if (param0 < 50) {
          ((bob) this).field_j = 14;
          return param1.field_f - (((bob) this).field_k + ((bob) this).field_m);
        } else {
          return param1.field_f - (((bob) this).field_k + ((bob) this).field_m);
        }
    }

    public void a(int param0, shb param1, int param2, int param3, boolean param4) {
        if (!(((bob) this).field_d != null)) {
            return;
        }
        this.a(340287457, param1, param3, param2);
        int var6 = 96 / ((param0 - -27) / 35);
    }

    public final int b(int param0, int param1, shb param2) {
        Object var5 = null;
        if (param0 != -3) {
          var5 = null;
          int discarded$2 = ((bob) this).b((shb) null, (byte) -80);
          return this.a(param1, param0 + -114, param2, 0);
        } else {
          return this.a(param1, param0 + -114, param2, 0);
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_l = null;
        if (param0 != 22540) {
            field_l = null;
        }
    }

    public final int a(int param0) {
        if (param0 < 7) {
            return -64;
        }
        return ((bob) this).field_d.field_A + ((bob) this).field_d.field_k;
    }

    String b(byte param0, shb param1) {
        if (param0 >= -53) {
            ((bob) this).field_n = 73;
            return param1.field_j;
        }
        return param1.field_j;
    }

    public final void a(shb param0, int param1, byte param2, int param3, int param4) {
        ar var13 = null;
        ar var14 = null;
        int var7 = 0;
        toa var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (!(!param0.e((byte) -120))) {
            var13 = ((bob) this).a(param0, 3);
            var14 = var13;
            var7 = var14.a(true, param4);
            var8 = var13.field_c[var7];
            var9 = var14.a(param4, -126);
            var10 = this.a(param3, param0, var9, (byte) -13);
            var11 = ((bob) this).b(-3, param1, param0) + Math.max(0, var8.field_b);
            var12 = ((bob) this).b(-3, param1, param0) + Math.min(this.a((byte) 71, param0), Math.min(var8.field_a, 1 + var7 >= var14.field_c.length ? var8.field_a : var13.field_c[var7 - -1].field_b));
            qca.a(param0.field_h + (param3 - -param0.field_g), param0.field_f + param1 + param0.field_r, param0.field_g + param3, true, param0.field_r + param1);
            msa.field_s.a(((bob) this).field_a, var11, var12, var10, var10, 11480);
            bia.a((byte) 124);
        }
        int var6 = -36 / ((6 - param2) / 58);
    }

    protected bob() {
    }

    bob(no param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((bob) this).field_h = param9;
        ((bob) this).field_j = param6;
        ((bob) this).field_k = param3;
        ((bob) this).field_b = param11;
        ((bob) this).field_m = param4;
        ((bob) this).field_a = param10;
        ((bob) this).field_g = param12 ? true : false;
        ((bob) this).field_n = param8;
        ((bob) this).field_i = param5;
        ((bob) this).field_d = param0;
        ((bob) this).field_c = param7;
        ((bob) this).field_o = param2;
        ((bob) this).field_f = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = (dja) (Object) new fjb();
        field_l = "Extend current mission phase";
    }
}
