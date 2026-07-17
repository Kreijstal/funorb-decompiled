/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wm extends mo {
    static jn field_k;
    static int[] field_j;

    wm() {
    }

    final static char a(char param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (param1 < 47) {
          field_k = null;
          var2 = param0;
          if (var2 != 32) {
            L0: {
              if (160 == var2) {
                break L0;
              } else {
                if (var2 != 95) {
                  if (var2 != 45) {
                    L1: {
                      if (var2 == 91) {
                        break L1;
                      } else {
                        if (var2 == 93) {
                          break L1;
                        } else {
                          if (var2 == 35) {
                            break L1;
                          } else {
                            L2: {
                              if (var2 != 224) {
                                if (var2 == 225) {
                                  break L2;
                                } else {
                                  if (226 != var2) {
                                    if (228 == var2) {
                                      break L2;
                                    } else {
                                      if (227 == var2) {
                                        break L2;
                                      } else {
                                        if (192 != var2) {
                                          if (var2 == 193) {
                                            break L2;
                                          } else {
                                            if (194 != var2) {
                                              if (var2 != 196) {
                                                if (195 == var2) {
                                                  break L2;
                                                } else {
                                                  L3: {
                                                    if (var2 == 232) {
                                                      break L3;
                                                    } else {
                                                      if (233 != var2) {
                                                        if (var2 == 234) {
                                                          break L3;
                                                        } else {
                                                          if (var2 == 235) {
                                                            break L3;
                                                          } else {
                                                            if (200 == var2) {
                                                              break L3;
                                                            } else {
                                                              if (201 != var2) {
                                                                if (var2 != 202) {
                                                                  if (var2 != 203) {
                                                                    if (var2 != 237) {
                                                                      if (238 != var2) {
                                                                        L4: {
                                                                          if (var2 == 239) {
                                                                            break L4;
                                                                          } else {
                                                                            if (var2 == 205) {
                                                                              break L4;
                                                                            } else {
                                                                              if (var2 == 206) {
                                                                                break L4;
                                                                              } else {
                                                                                if (var2 == 207) {
                                                                                  break L4;
                                                                                } else {
                                                                                  L5: {
                                                                                    if (var2 == 242) {
                                                                                      break L5;
                                                                                    } else {
                                                                                      if (var2 != 243) {
                                                                                        if (var2 == 244) {
                                                                                          break L5;
                                                                                        } else {
                                                                                          if (var2 == 246) {
                                                                                            break L5;
                                                                                          } else {
                                                                                            if (245 == var2) {
                                                                                              break L5;
                                                                                            } else {
                                                                                              if (var2 == 210) {
                                                                                                break L5;
                                                                                              } else {
                                                                                                if (var2 != 211) {
                                                                                                  if (var2 == 212) {
                                                                                                    break L5;
                                                                                                  } else {
                                                                                                    if (var2 == 214) {
                                                                                                      break L5;
                                                                                                    } else {
                                                                                                      if (var2 == 213) {
                                                                                                        break L5;
                                                                                                      } else {
                                                                                                        if (var2 != 249) {
                                                                                                          if (var2 != 250) {
                                                                                                            L6: {
                                                                                                              if (var2 == 251) {
                                                                                                                break L6;
                                                                                                              } else {
                                                                                                                if (var2 != 252) {
                                                                                                                  if (var2 != 217) {
                                                                                                                    if (var2 == 218) {
                                                                                                                      break L6;
                                                                                                                    } else {
                                                                                                                      if (var2 != 219) {
                                                                                                                        if (var2 != 220) {
                                                                                                                          if (var2 != 231) {
                                                                                                                            if (var2 == 199) {
                                                                                                                              return 'c';
                                                                                                                            } else {
                                                                                                                              if (255 != var2) {
                                                                                                                                if (var2 != 376) {
                                                                                                                                  if (241 == var2) {
                                                                                                                                    return 'n';
                                                                                                                                  } else {
                                                                                                                                    if (var2 != 209) {
                                                                                                                                      if (var2 != 223) {
                                                                                                                                        return Character.toLowerCase(param0);
                                                                                                                                      } else {
                                                                                                                                        return 'b';
                                                                                                                                      }
                                                                                                                                    } else {
                                                                                                                                      return 'n';
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  return 'y';
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                return 'y';
                                                                                                                              }
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            return 'c';
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          return 'u';
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        return 'u';
                                                                                                                      }
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    return 'u';
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  return 'u';
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                            return 'u';
                                                                                                          } else {
                                                                                                            return 'u';
                                                                                                          }
                                                                                                        } else {
                                                                                                          return 'u';
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  return 'o';
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        return 'o';
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  return 'o';
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                        return 'i';
                                                                      } else {
                                                                        return 'i';
                                                                      }
                                                                    } else {
                                                                      return 'i';
                                                                    }
                                                                  } else {
                                                                    return 'e';
                                                                  }
                                                                } else {
                                                                  return 'e';
                                                                }
                                                              } else {
                                                                return 'e';
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        return 'e';
                                                      }
                                                    }
                                                  }
                                                  return 'e';
                                                }
                                              } else {
                                                break L2;
                                              }
                                            } else {
                                              break L2;
                                            }
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                    }
                                  } else {
                                    break L2;
                                  }
                                }
                              } else {
                                break L2;
                              }
                            }
                            return 'a';
                          }
                        }
                      }
                    }
                    return param0;
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
            }
            return '_';
          } else {
            return '_';
          }
        } else {
          var2 = param0;
          if (var2 != 32) {
            if (160 != var2) {
              L7: {
                if (var2 != 95) {
                  if (var2 != 45) {
                    if (var2 != 91) {
                      if (var2 != 93) {
                        if (var2 == 35) {
                          return param0;
                        } else {
                          L8: {
                            if (var2 != 224) {
                              if (var2 == 225) {
                                break L8;
                              } else {
                                if (226 != var2) {
                                  if (228 == var2) {
                                    break L8;
                                  } else {
                                    if (227 == var2) {
                                      break L8;
                                    } else {
                                      if (192 != var2) {
                                        if (var2 == 193) {
                                          break L8;
                                        } else {
                                          if (194 != var2) {
                                            if (var2 != 196) {
                                              if (195 == var2) {
                                                break L8;
                                              } else {
                                                L9: {
                                                  if (var2 == 232) {
                                                    break L9;
                                                  } else {
                                                    if (233 != var2) {
                                                      if (var2 == 234) {
                                                        break L9;
                                                      } else {
                                                        if (var2 == 235) {
                                                          break L9;
                                                        } else {
                                                          if (200 == var2) {
                                                            break L9;
                                                          } else {
                                                            if (201 != var2) {
                                                              if (var2 != 202) {
                                                                if (var2 != 203) {
                                                                  L10: {
                                                                    if (var2 != 237) {
                                                                      if (238 != var2) {
                                                                        if (var2 == 239) {
                                                                          break L10;
                                                                        } else {
                                                                          if (var2 == 205) {
                                                                            break L10;
                                                                          } else {
                                                                            if (var2 == 206) {
                                                                              break L10;
                                                                            } else {
                                                                              if (var2 == 207) {
                                                                                break L10;
                                                                              } else {
                                                                                L11: {
                                                                                  if (var2 == 242) {
                                                                                    break L11;
                                                                                  } else {
                                                                                    if (var2 != 243) {
                                                                                      if (var2 == 244) {
                                                                                        break L11;
                                                                                      } else {
                                                                                        if (var2 == 246) {
                                                                                          break L11;
                                                                                        } else {
                                                                                          if (245 == var2) {
                                                                                            break L11;
                                                                                          } else {
                                                                                            if (var2 == 210) {
                                                                                              break L11;
                                                                                            } else {
                                                                                              if (var2 != 211) {
                                                                                                if (var2 == 212) {
                                                                                                  break L11;
                                                                                                } else {
                                                                                                  if (var2 == 214) {
                                                                                                    break L11;
                                                                                                  } else {
                                                                                                    if (var2 == 213) {
                                                                                                      break L11;
                                                                                                    } else {
                                                                                                      L12: {
                                                                                                        if (var2 != 249) {
                                                                                                          if (var2 != 250) {
                                                                                                            if (var2 == 251) {
                                                                                                              break L12;
                                                                                                            } else {
                                                                                                              if (var2 != 252) {
                                                                                                                if (var2 != 217) {
                                                                                                                  if (var2 == 218) {
                                                                                                                    break L12;
                                                                                                                  } else {
                                                                                                                    if (var2 != 219) {
                                                                                                                      if (var2 != 220) {
                                                                                                                        if (var2 != 231) {
                                                                                                                          if (var2 == 199) {
                                                                                                                            return 'c';
                                                                                                                          } else {
                                                                                                                            if (255 != var2) {
                                                                                                                              if (var2 != 376) {
                                                                                                                                if (241 == var2) {
                                                                                                                                  return 'n';
                                                                                                                                } else {
                                                                                                                                  if (var2 != 209) {
                                                                                                                                    if (var2 != 223) {
                                                                                                                                      return Character.toLowerCase(param0);
                                                                                                                                    } else {
                                                                                                                                      return 'b';
                                                                                                                                    }
                                                                                                                                  } else {
                                                                                                                                    return 'n';
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                return 'y';
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              return 'y';
                                                                                                                            }
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          return 'c';
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        return 'u';
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      return 'u';
                                                                                                                    }
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  break L12;
                                                                                                                }
                                                                                                              } else {
                                                                                                                break L12;
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            break L12;
                                                                                                          }
                                                                                                        } else {
                                                                                                          break L12;
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                break L11;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    } else {
                                                                                      break L11;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                return 'o';
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        break L10;
                                                                      }
                                                                    } else {
                                                                      break L10;
                                                                    }
                                                                  }
                                                                  return 'i';
                                                                } else {
                                                                  break L9;
                                                                }
                                                              } else {
                                                                break L9;
                                                              }
                                                            } else {
                                                              break L9;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      break L9;
                                                    }
                                                  }
                                                }
                                                return 'e';
                                              }
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            break L8;
                                          }
                                        }
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                } else {
                                  break L8;
                                }
                              }
                            } else {
                              break L8;
                            }
                          }
                          return 'a';
                        }
                      } else {
                        return param0;
                      }
                    } else {
                      return param0;
                    }
                  } else {
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              return '_';
            } else {
              return '_';
            }
          } else {
            return '_';
          }
        }
    }

    public static void b(int param0) {
        field_k = null;
        field_j = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[128];
    }
}
