/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vp {
    static er field_b;
    static int[] field_d;
    private li field_a;
    private nj field_e;
    static r field_c;

    final li a(int param0, li param1) {
        li var3 = null;
        if (param1 == null) {
            var3 = ((vp) this).field_e.field_h.field_c;
        } else {
            var3 = param1;
        }
        if (!(((vp) this).field_e.field_h != var3)) {
            ((vp) this).field_a = null;
            return null;
        }
        ((vp) this).field_a = var3.field_c;
        int var4 = 33 % ((-64 - param0) / 34);
        return var3;
    }

    final li c(int param0) {
        li var2 = null;
        var2 = ((vp) this).field_a;
        if (var2 == ((vp) this).field_e.field_h) {
          ((vp) this).field_a = null;
          return null;
        } else {
          ((vp) this).field_a = var2.field_c;
          if (param0 != 2) {
            field_d = null;
            return var2;
          } else {
            return var2;
          }
        }
    }

    final li b(int param0) {
        li var2 = null;
        if (param0 != 4) {
            Object var3 = null;
            li discarded$0 = ((vp) this).a(23, (li) null);
            var2 = ((vp) this).field_e.field_h.field_a;
            if (!(((vp) this).field_e.field_h != var2)) {
                ((vp) this).field_a = null;
                return null;
            }
            ((vp) this).field_a = var2.field_a;
            return var2;
        }
        var2 = ((vp) this).field_e.field_h.field_a;
        if (!(((vp) this).field_e.field_h != var2)) {
            ((vp) this).field_a = null;
            return null;
        }
        ((vp) this).field_a = var2.field_a;
        return var2;
    }

    final li a(li param0, int param1) {
        li var3 = null;
        L0: {
          if (param0 == null) {
            var3 = ((vp) this).field_e.field_h.field_a;
            break L0;
          } else {
            var3 = param0;
            break L0;
          }
        }
        if (var3 != ((vp) this).field_e.field_h) {
          ((vp) this).field_a = var3.field_a;
          if (param1 != 3) {
            ((vp) this).field_a = null;
            return var3;
          } else {
            return var3;
          }
        } else {
          ((vp) this).field_a = null;
          return null;
        }
    }

    final li d(int param0) {
        li var2 = null;
        var2 = ((vp) this).field_e.field_h.field_c;
        if (var2 == ((vp) this).field_e.field_h) {
          ((vp) this).field_a = null;
          return null;
        } else {
          if (param0 != 4) {
            return null;
          } else {
            ((vp) this).field_a = var2.field_c;
            return var2;
          }
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = -36 / ((28 - param0) / 47);
        return oj.field_O[param1].length;
    }

    vp(nj param0) {
        ((vp) this).field_e = param0;
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 >= -91) {
            return;
        }
        field_d = null;
    }

    final static boolean a(int param0, int param1) {
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_98_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 == 18055) {
          L0: {
            L1: {
              L2: {
                if ((param1 ^ -1) <= -1) {
                  break L2;
                } else {
                  if (param1 == 3) {
                    break L2;
                  } else {
                    if (4 == param1) {
                      break L2;
                    } else {
                      if ((param1 ^ -1) == 1) {
                        break L2;
                      } else {
                        if ((param1 ^ -1) == 2) {
                          break L2;
                        } else {
                          if (-7 != param1) {
                            break L1;
                          } else {
                            L3: {
                              L4: {
                                if (param1 == 1) {
                                  break L4;
                                } else {
                                  if (2 == param1) {
                                    break L4;
                                  } else {
                                    if (22 == param1) {
                                      break L4;
                                    } else {
                                      if (param1 == 3) {
                                        break L4;
                                      } else {
                                        if (4 != param1) {
                                          stackOut_88_0 = 0;
                                          stackIn_89_0 = stackOut_88_0;
                                          break L3;
                                        } else {
                                          return true;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_87_0 = 1;
                              stackIn_89_0 = stackOut_87_0;
                              break L3;
                            }
                            return stackIn_89_0 != 0;
                          }
                        }
                      }
                    }
                  }
                }
              }
              if (param1 == 1) {
                break L1;
              } else {
                if (2 == param1) {
                  break L1;
                } else {
                  if (22 == param1) {
                    break L1;
                  } else {
                    if (param1 == 3) {
                      break L1;
                    } else {
                      if (4 != param1) {
                        stackOut_97_0 = 0;
                        stackIn_98_0 = stackOut_97_0;
                        break L0;
                      } else {
                        return true;
                      }
                    }
                  }
                }
              }
            }
            stackOut_96_0 = 1;
            stackIn_98_0 = stackOut_96_0;
            break L0;
          }
          return stackIn_98_0 != 0;
        } else {
          vp.a(72);
          if ((param1 ^ -1) > -1) {
            if ((param1 ^ -1) != 3) {
              if (4 != (param1 ^ -1)) {
                if ((param1 ^ -1) != 1) {
                  L5: {
                    L6: {
                      if ((param1 ^ -1) == 2) {
                        if (param1 == 1) {
                          break L6;
                        } else {
                          if (2 == param1) {
                            break L6;
                          } else {
                            if (22 == param1) {
                              break L6;
                            } else {
                              if (param1 == 3) {
                                break L6;
                              } else {
                                if (4 != param1) {
                                  stackOut_73_0 = 0;
                                  stackIn_74_0 = stackOut_73_0;
                                  break L5;
                                } else {
                                  return true;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        if (-7 != param1) {
                          break L6;
                        } else {
                          L7: {
                            L8: {
                              if (param1 == 1) {
                                break L8;
                              } else {
                                if (2 == param1) {
                                  break L8;
                                } else {
                                  if (22 == param1) {
                                    break L8;
                                  } else {
                                    if (param1 == 3) {
                                      break L8;
                                    } else {
                                      if (4 != param1) {
                                        stackOut_64_0 = 0;
                                        stackIn_65_0 = stackOut_64_0;
                                        break L7;
                                      } else {
                                        return true;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_63_0 = 1;
                            stackIn_65_0 = stackOut_63_0;
                            break L7;
                          }
                          return stackIn_65_0 != 0;
                        }
                      }
                    }
                    stackOut_72_0 = 1;
                    stackIn_74_0 = stackOut_72_0;
                    break L5;
                  }
                  return stackIn_74_0 != 0;
                } else {
                  L9: {
                    L10: {
                      if (param1 == 1) {
                        break L10;
                      } else {
                        if (2 == param1) {
                          break L10;
                        } else {
                          if (22 == param1) {
                            break L10;
                          } else {
                            if (param1 == 3) {
                              break L10;
                            } else {
                              if (4 != param1) {
                                stackOut_53_0 = 0;
                                stackIn_54_0 = stackOut_53_0;
                                break L9;
                              } else {
                                return true;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_52_0 = 1;
                    stackIn_54_0 = stackOut_52_0;
                    break L9;
                  }
                  return stackIn_54_0 != 0;
                }
              } else {
                if (param1 != 1) {
                  if (2 != param1) {
                    L11: {
                      L12: {
                        if (22 == param1) {
                          break L12;
                        } else {
                          if (param1 == 3) {
                            break L12;
                          } else {
                            if (4 != param1) {
                              stackOut_43_0 = 0;
                              stackIn_44_0 = stackOut_43_0;
                              break L11;
                            } else {
                              return true;
                            }
                          }
                        }
                      }
                      stackOut_42_0 = 1;
                      stackIn_44_0 = stackOut_42_0;
                      break L11;
                    }
                    return stackIn_44_0 != 0;
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              }
            } else {
              if (param1 != 1) {
                if (2 != param1) {
                  if (22 != param1) {
                    if (param1 != 3) {
                      if (4 == param1) {
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          } else {
            if (param1 != 1) {
              if (2 != param1) {
                if (22 != param1) {
                  if (param1 != 3) {
                    if (4 == param1) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    return stackIn_13_0 != 0;
                  }
                } else {
                  stackOut_7_0 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  return stackIn_9_0 != 0;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        }
    }

    final li a(byte param0) {
        li var2 = null;
        var2 = ((vp) this).field_a;
        if (((vp) this).field_e.field_h != var2) {
          ((vp) this).field_a = var2.field_a;
          if (param0 < 13) {
            return null;
          } else {
            return var2;
          }
        } else {
          ((vp) this).field_a = null;
          return null;
        }
    }

    static {
    }
}
