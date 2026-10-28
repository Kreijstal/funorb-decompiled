/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ResourceArchive {
    private ArchiveProvider provider;
    private boolean discardPackedGroups;
    static Sprite field_a;
    private int fileRetentionPolicy;
    private Object[][] unpackedFiles;
    private ArchiveIndex index;
    private Object[] packedGroups;
    static EmailValidationError field_d;
    static int[] field_l;
    static String field_b;
    static String[] field_f;
    static LoginStage field_k;
    static Sprite field_m;

    final static int objectScore(int gameMode, int objectType, int guard) {
        if (guard != -2) {
          return 21;
        }
        return DraggableWidget.a(gameMode, objectType, false, TerrainMaskSupport.field_b);
    }

    final int findGroupId(int guard, String groupName) {
        String stackIn_14_2 = null;
        try {
          if (!this.ensureIndex(0)) {
            int stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          if (guard != -1) {
            ResourceArchive.objectScore(((int[]) (this.packedGroups[2]))[27], ((int[]) (this.packedGroups[15]))[0], ((int[]) (this.packedGroups[6]))[30]);
          }
          groupName = groupName.toLowerCase();
          CharSequence var4 = (CharSequence) ((Object) groupName);
          int var3_int = this.index.groupNameLookup.find(mh.a(guard + 1, var4), 1);
          if (this.isValidGroup(var3_int, (byte) -124)) {
            int stackIn_10_0 = var3_int;
            return stackIn_10_0;
          }
          int stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var3;
          StringBuilder stackIn_13_1 = new StringBuilder().append("mf.P(").append(guard).append(',');
          if (groupName == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final synchronized boolean tryLoadFile(boolean guard, int groupId, int fileId) {
        if (!guard) {
          field_a = (Sprite) null;
        }
        if (!this.isValidFileSlot(fileId, 11315, groupId)) {
          return false;
        }
        if (null != this.unpackedFiles[groupId] &&
          null != this.unpackedFiles[groupId][fileId]) {
          return true;
        }
        if (null != this.packedGroups[groupId]) {
          return true;
        }
        this.fetchGroup(groupId, 14);
        if (null == this.packedGroups[groupId]) {
          return false;
        }
        return true;
    }

    final static String accountNameValidationMessage(boolean restrictCharacters, boolean allowRepeatedSeparators, CharSequence text) {
        String stackIn_18_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          String var3 = cf.a(allowRepeatedSeparators, 81, text);
          if (var3 != null) {
            String stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          int var4 = 0;
          if (!restrictCharacters) {
            String stackIn_6_0 = (String) null;
            return stackIn_6_0;
          }
          while (var4 < text.length()) {
            if (!SpriteOffset.a(text.charAt(var4), (byte) -124)) {
              String stackIn_12_0 = Js5NetworkRequest.field_B;
              return stackIn_12_0;
            }
            var4++;
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var3_ref;
          StringBuilder stackIn_17_1 = new StringBuilder().append("mf.AA(").append(restrictCharacters).append(',').append(allowRepeatedSeparators).append(',');
          if (text == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final boolean tryLoadNamedGroup(int guard, String groupName) {
        String stackIn_8_2 = null;
        try {
          if (!this.ensureIndex(0)) {
            return false;
          }
          groupName = groupName.toLowerCase();
          CharSequence var4 = (CharSequence) ((Object) groupName);
          int var3_int = this.index.groupNameLookup.find(mh.a(guard, var4), 1);
          boolean stackIn_4_0 = this.tryLoadGroup(118, var3_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var3;
          StringBuilder stackIn_7_1 = new StringBuilder().append("mf.S(").append(guard).append(',');
          if (groupName == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean tryLoadNamedFile(String fileName, String groupName, byte guard) {
        String stackIn_13_2 = null;
        String stackIn_16_2 = null;
        try {
          if (!this.ensureIndex(0)) {
            return false;
          }
          groupName = groupName.toLowerCase();
          fileName = fileName.toLowerCase();
          CharSequence var7 = (CharSequence) ((Object) groupName);
          int var4_int = this.index.groupNameLookup.find(mh.a(0, var7), 1);
          if (!this.isValidGroup(var4_int, (byte) 48)) {
            return false;
          }
          int var6 = 10 / ((-13 - guard) / 52);
          CharSequence var8 = (CharSequence) ((Object) fileName);
          int var5 = this.index.fileNameLookups[var4_int].find(mh.a(0, var8), 1);
          boolean stackIn_9_0 = this.tryLoadFile(true, var4_int, var5);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var4;
          StringBuilder stackIn_12_1 = new StringBuilder().append("mf.C(");
          if (fileName == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (groupName == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(guard).append(')').toString());
        }
    }

    final synchronized byte[] getNamedFile(int guard, String fileName, String groupName) {
        String stackIn_13_2 = null;
        String stackIn_16_2 = null;
        try {
          if (!this.ensureIndex(0)) {
            Object stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          groupName = groupName.toLowerCase();
          fileName = fileName.toLowerCase();
          if (guard != -4) {
            this.tryLoadAllGroups(((byte[]) (this.packedGroups[3]))[3]);
          }
          CharSequence var6 = (CharSequence) ((Object) groupName);
          int var4_int = this.index.groupNameLookup.find(mh.a(guard + 4, var6), 1);
          if (!this.isValidGroup(var4_int, (byte) -113)) {
            return null;
          }
          CharSequence var7 = (CharSequence) ((Object) fileName);
          int var5 = this.index.fileNameLookups[var4_int].find(mh.a(0, var7), 1);
          byte[] stackIn_9_0 = this.getFile(var4_int, (byte) -97, var5);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var4;
          StringBuilder stackIn_12_1 = new StringBuilder().append("mf.E(").append(guard).append(',');
          if (fileName == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (groupName == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final byte[] getNamedFileWithKey(byte guard, String groupName, String fileName, int[] key) {
        String stackIn_11_2 = null;
        String stackIn_14_2 = null;
        String stackIn_17_2 = null;
        try {
          if (!this.ensureIndex(0)) {
            return null;
          }
          groupName = groupName.toLowerCase();
          fileName = fileName.toLowerCase();
          CharSequence var8 = (CharSequence) ((Object) groupName);
          int var5_int = this.index.groupNameLookup.find(mh.a(0, var8), 1);
          if (!this.isValidGroup(var5_int, (byte) 91)) {
            Object stackIn_5_0 = null;
            return (byte[]) (stackIn_5_0);
          }
          int var6 = -115 / ((1 - guard) / 58);
          CharSequence var9 = (CharSequence) ((Object) fileName);
          int var7 = this.index.fileNameLookups[var5_int].find(mh.a(0, var9), 1);
          byte[] stackIn_7_0 = this.getFileWithKey((byte) 75, key, var7, var5_int);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var5;
          StringBuilder stackIn_10_1 = new StringBuilder().append("mf.BA(").append(guard).append(',');
          if (groupName == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          StringBuilder stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (fileName == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          StringBuilder stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (key == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final synchronized int overallProgress(int guard) {
        int var5 = EscapeVector.obfuscationControl;
        if (!this.ensureIndex(0)) {
          return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.packedGroups.length; var4++) {
          if (this.index.groupFileCounts[var4] > 0) {
            var3 = var3 + this.groupProgress(3210, var4);
            var2 += 100;
          }
        }
        if (var2 == 0) {
          return 100;
        }
        if (guard >= -27) {
          return 107;
        }
        int var4Lifetime1 = 100 * var3 / var2;
        return var4Lifetime1;
    }

    final static void writeReflectionCheckResults(int guard, CipherPacketBuffer output) {
        try {
          String stackIn_70_2 = null;
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var8 = 0;
          Object var18 = null;
          Object var16 = null;
          Object var20 = null;
          Object var22 = null;
          int var12 = EscapeVector.obfuscationControl;
          try {
            ReflectionCheck var13 = (ReflectionCheck) (SpriteFactorySupport.field_a.first(false));
            ReflectionCheck var17 = var13;
            if (var17 == null) {
              return;
            }
            boolean var3 = false;
            if (guard != -20157) {
              field_f = (String[]) null;
            }
            for (var4 = 0; var17.operationCount > var4; var4++) {
              if (null != var13.fieldTasks[var4]) {
                if (var13.fieldTasks[var4].field_f == 2) {
                  var13.errors[var4] = -5;
                }
                if (var13.fieldTasks[var4].field_f == 0) {
                  var3 = true;
                }
              }
              if (null != var13.methodTasks[var4]) {
                if (2 == var13.methodTasks[var4].field_f) {
                  var13.errors[var4] = -6;
                }
                if (var13.methodTasks[var4].field_f == 0) {
                  var3 = true;
                }
              }
            }
            if (var3) {
              return;
            }
            var4 = output.position;
            output.writeInt((byte) 125, var17.id);
            for (int var5 = 0; var5 < var17.operationCount; var5++) {
              if (0 != var17.errors[var5]) {
                output.writeByte(var17.errors[var5], -123);
              } else {
                try {
                  int var6_int = var17.operations[var5];
                  if (var6_int == 0) {
                    java.lang.reflect.Field var26 = (java.lang.reflect.Field) (var17.fieldTasks[var5].field_b);
                    var8 = var26.getInt((Object) null);
                    output.writeByte(0, -123);
                    output.writeInt((byte) 123, var8);
                  } else if (var6_int == 1) {
                    java.lang.reflect.Field var16_ref = (java.lang.reflect.Field) (var17.fieldTasks[var5].field_b);
                    java.lang.reflect.Field var19 = var16_ref;
                    var19.setInt((Object) null, var17.replacementValues[var5]);
                    output.writeByte(0, -123);
                  } else if (var6_int == 2) {
                    java.lang.reflect.Field var15 = (java.lang.reflect.Field) (var17.fieldTasks[var5].field_b);
                    var8 = var15.getModifiers();
                    output.writeByte(0, -123);
                    output.writeInt((byte) 125, var8);
                  }
                  if (var6_int == 3) {
                    java.lang.reflect.Method var28 = (java.lang.reflect.Method) (var17.methodTasks[var5].field_b);
                    byte[][] var25 = var17.serializedArguments[var5];
                    Object[] var9 = new Object[var25.length];
                    for (int var10_int = 0; var10_int < var25.length; var10_int++) {
                      ObjectInputStream var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    Object var10 = var28.invoke((Object) null, var9);
                    if (var10 == null) {
                      output.writeByte(0, -123);
                    } else if (var10 instanceof Number) {
                      output.writeByte(1, guard + 20034);
                      output.writeLong(((Number) (var10)).longValue(), (byte) -23);
                    } else if (!(var10 instanceof String)) {
                      output.writeByte(4, -123);
                    } else {
                      output.writeByte(2, -123);
                      output.writeString((String) (var10), 77);
                    }
                  } else if (var6_int == 4) {
                    java.lang.reflect.Method var27 = (java.lang.reflect.Method) (var17.methodTasks[var5].field_b);
                    int var8Lifetime1 = var27.getModifiers();
                    output.writeByte(0, guard ^ 20166);
                    output.writeInt((byte) 124, var8Lifetime1);
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  ClassNotFoundException var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  output.writeByte(-10, -123);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  InvalidClassException var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  output.writeByte(-11, guard + 20034);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  StreamCorruptedException var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  output.writeByte(-12, -123);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  OptionalDataException var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  output.writeByte(-13, -123);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  IllegalAccessException var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  output.writeByte(-14, -123);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  IllegalArgumentException var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  output.writeByte(-15, -123);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  java.lang.reflect.InvocationTargetException var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  output.writeByte(-16, -123);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  SecurityException var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  output.writeByte(-17, -123);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  IOException var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  output.writeByte(-18, -123);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  NullPointerException var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  output.writeByte(-19, -123);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  Exception var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  output.writeByte(-20, -123);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  Throwable var6_ref11 = decompiledCaughtException;
                  output.writeByte(-21, guard ^ 20166);
                }
              }
            }
            output.appendCrc32(var4, guard ^ 20130);
            var17.unlink((byte) -38);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            RuntimeException var2 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_69_0 = var2;
            StringBuilder stackIn_69_1 = new StringBuilder().append("mf.W(").append(guard).append(',');
            if (output == null) {
              stackIn_70_2 = "null";
            } else {
              stackIn_70_2 = "{...}";
            }
            throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int guard) {
        field_m = null;
        field_d = null;
        field_a = null;
        field_b = null;
        field_f = null;
        if (guard <= 119) {
          CipherPacketBuffer var2 = (CipherPacketBuffer) null;
          ResourceArchive.writeReflectionCheckResults(84, (CipherPacketBuffer) null);
        }
        field_l = null;
        field_k = null;
    }

    final static void drawSpriteWithRowJitter(int y, int x, int amplitude, Sprite sprite, int guard) {
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        String stackIn_26_2 = null;
        int var16 = EscapeVector.obfuscationControl;
        try {
          if (guard > -87) {
            return;
          }
          Random var17 = new Random();
          x = x + sprite.offsetX;
          y = y + sprite.offsetY;
          for (int var6 = 0; var6 < sprite.height; var6++) {
            double var7 = var17.nextGaussian();
            if (!(var7 > -64.0)) {
              var7 = -64.0;
            }
            if (!(var7 < 64.0)) {
              var7 = 64.0;
            }
            int var9 = (int)((double)amplitude * var7) + x;
            int var10 = sprite.width * var6;
            int var11 = (var6 + y) * 640 + var9;
            stackIn_12_0 = (0 <= var9) ? (0) : (-var9);
            int var12 = stackIn_12_0;
            if (640 < sprite.width + var9) {
              stackIn_15_0 = 640 - var9;
            } else {
              stackIn_15_0 = sprite.width;
            }
            int var13 = stackIn_15_0;
            for (int var14 = var12; var14 < var13; var14++) {
              int var15 = sprite.pixels[var14 + var10];
              if (var15 != 0) {
                SoftwareRasterizer.pixels[var14 + var11] = var15;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_25_0 = var5;
          StringBuilder stackIn_25_1 = new StringBuilder().append("mf.U(").append(y).append(',').append(x).append(',').append(amplitude).append(',');
          if (sprite == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(guard).append(')').toString());
        }
    }

    private final synchronized void fetchGroup(int groupId, int guard) {
        if (this.discardPackedGroups) {
          this.packedGroups[groupId] = this.provider.getEncodedGroup((byte) -73, groupId);
        } else {
          this.packedGroups[groupId] = SocketJs5Transport.storeBytes(false, this.provider.getEncodedGroup((byte) -47, groupId), 9);
        }
        if (guard != 14) {
          this.index = (ArchiveIndex) null;
        }
    }

    final static boolean isPowerupType(int objectType, int guard) {
        if (objectType < 9) {
          return false;
        }
        if (guard != -64) {
          field_m = (Sprite) null;
        }
        if (14 <= objectType) {
          return false;
        }
        return true;
    }

    final int namedGroupProgress(String groupName, int guard) {
        String stackIn_9_2 = null;
        try {
          if (!this.ensureIndex(guard)) {
            int stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          groupName = groupName.toLowerCase();
          CharSequence var4 = (CharSequence) ((Object) groupName);
          int var3_int = this.index.groupNameLookup.find(mh.a(guard + 0, var4), 1);
          int stackIn_5_0 = this.groupProgress(guard ^ 3210, var3_int);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var3;
          StringBuilder stackIn_8_1 = new StringBuilder().append("mf.CA(");
          if (groupName == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(guard).append(')').toString());
        }
    }

    final int findFileId(int groupId, String fileName, boolean guard) {
        String stackIn_14_2 = null;
        try {
          if (!guard) {
            ((long[]) (((Object[]) (this.packedGroups[15]))[4]))[3] = ((long[]) (this.packedGroups[12]))[2];
          }
          if (!this.isValidGroup(groupId, (byte) -121)) {
            int stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          fileName = fileName.toLowerCase();
          CharSequence var5 = (CharSequence) ((Object) fileName);
          int var4_int = this.index.fileNameLookups[groupId].find(mh.a(0, var5), 1);
          if (this.isValidFileSlot(var4_int, 11315, groupId)) {
            int stackIn_10_0 = var4_int;
            return stackIn_10_0;
          }
          int stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var4;
          StringBuilder stackIn_13_1 = new StringBuilder().append("mf.K(").append(groupId).append(',');
          if (fileName == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(guard).append(')').toString());
        }
    }

    private final synchronized byte[] getFileWithKey(byte guard, int[] key, int fileId, int groupId) {
        String stackIn_31_2 = null;
        Object var5 = null;
        try {
          if (!this.isValidFileSlot(fileId, 11315, groupId)) {
            Object stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          var5 = null;
          if ((null == this.unpackedFiles[groupId] ||
            this.unpackedFiles[groupId][fileId] == null) && !this.unpackGroup(key, -7951, fileId, groupId)) {
            this.fetchGroup(groupId, 14);
            if (!this.unpackGroup(key, -7951, fileId, groupId)) {
              Object stackIn_10_0 = null;
              return (byte[]) (stackIn_10_0);
            }
          }
          if (null == this.unpackedFiles[groupId]) {
            throw new RuntimeException("");
          }
          if (this.unpackedFiles[groupId][fileId] != null) {
            byte[] var7 = LoginCredentialType.extractBytes(this.unpackedFiles[groupId][fileId], (byte) -126, false);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (1 == this.fileRetentionPolicy) {
              this.unpackedFiles[groupId][fileId] = null;
              if (this.index.groupFileCapacities[groupId] == 1) {
                this.unpackedFiles[groupId] = null;
              }
            } else if (2 == this.fileRetentionPolicy) {
              this.unpackedFiles[groupId] = null;
            }
          }
          if (guard != 75) {
            this.overallProgress(-120);
          }
          Object stackIn_27_0 = var5;
          return (byte[]) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          Object stackIn_30_0 = var5;
          StringBuilder stackIn_30_1 = new StringBuilder().append("mf.J(").append(guard).append(',');
          if (key == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) (stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(fileId).append(',').append(groupId).append(')').toString());
        }
    }

    private final synchronized boolean isValidGroup(int groupId, byte guard) {
        int var3 = -14 % ((-55 - guard) / 56);
        if (!this.ensureIndex(0)) {
          return false;
        }
        if (groupId >= 0 &&
          groupId < this.index.groupFileCapacities.length &&
          0 != this.index.groupFileCapacities[groupId]) {
          return true;
        }
        if (uj.field_d) {
          throw new IllegalArgumentException(Integer.toString(groupId));
        }
        return false;
    }

    final synchronized boolean tryLoadGroup(int guard, int groupId) {
        if (!this.isValidGroup(groupId, (byte) 33)) {
          return false;
        }
        if (guard < 81) {
          ((byte[]) (this.packedGroups[11]))[30] = (byte) 8;
        }
        if (this.packedGroups[groupId] != null) {
          return true;
        }
        this.fetchGroup(groupId, 14);
        if (null != this.packedGroups[groupId]) {
          return true;
        }
        return false;
    }

    private final synchronized boolean isValidFileSlot(int fileId, int guard, int groupId) {
        if (!this.ensureIndex(guard ^ guard)) {
          return false;
        }
        if (groupId >= 0 &&
          fileId >= 0 &&
          groupId < this.index.groupFileCapacities.length &&
          fileId < this.index.groupFileCapacities[groupId]) {
          return true;
        }
        if (uj.field_d) {
          throw new IllegalArgumentException(groupId + " " + fileId);
        }
        return false;
    }

    final boolean hasGroupName(String groupName, byte guard) {
        String stackIn_14_2 = null;
        try {
          if (!this.ensureIndex(0)) {
            return false;
          }
          groupName = groupName.toLowerCase();
          if (guard >= -102) {
            return false;
          }
          CharSequence var4 = (CharSequence) ((Object) groupName);
          int var3_int = this.index.groupNameLookup.find(mh.a(0, var4), 1);
          if (var3_int >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var3;
          StringBuilder stackIn_13_1 = new StringBuilder().append("mf.R(");
          if (groupName == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(guard).append(')').toString());
        }
    }

    final synchronized boolean tryLoadAllGroups(byte guard) {
        int var5 = EscapeVector.obfuscationControl;
        if (!this.ensureIndex(0)) {
          return false;
        }
        if (guard != -119) {
          int[] var6 = (int[]) null;
          this.getNamedFileWithKey((byte) -91, (String) null, (String) (this.packedGroups[0]), (int[]) null);
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.index.groupIds.length; var3++) {
          int var4 = this.index.groupIds[var3];
          if (this.packedGroups[var4] == null) {
            this.fetchGroup(var4, 14);
            if (null == this.packedGroups[var4]) {
              var2 = false;
            }
          }
        }
        return (var2);
    }

    final synchronized int groupProgress(int guard, int groupId) {
        if (guard != 3210) {
          ResourceArchive.releaseStatics(69);
        }
        if (!this.isValidGroup(groupId, (byte) 48)) {
          return 0;
        }
        if (this.packedGroups[groupId] != null) {
          return 100;
        }
        return this.provider.groupProgress(0, groupId);
    }

    private final synchronized boolean unpackGroup(int[] key, int guard, int requestedFileId, int groupId) {
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var19 = 0;
        int var21 = 0;
        byte[] var23 = null;
        byte[] var36 = null;
        byte[] var43 = null;
        int var18Lifetime2;
        int var22 = EscapeVector.obfuscationControl;
        try {
          if (!this.isValidGroup(groupId, (byte) 109)) {
            return false;
          }
          if (null == this.packedGroups[groupId]) {
            return false;
          }
          int var5_int = this.index.groupFileCounts[groupId];
          int[] var34 = this.index.fileIds[groupId];
          int[] var24 = var34;
          int[] var6 = var24;
          if (this.unpackedFiles[groupId] == null) {
            Object[] array$0 = new Object[this.index.groupFileCapacities[groupId]];
            this.unpackedFiles[groupId] = array$0;
          }
          Object[] var7 = this.unpackedFiles[groupId];
          boolean var8 = true;
          for (int var9_int = 0; var9_int < var5_int; var9_int++) {
            if (var6 == null) {
              var10 = var9_int;
            } else {
              var10 = var34[var9_int];
            }
            if (var7[var10] != null) {
              continue;
            }
            var8 = false;
            break;
          }
          if (var8) {
            return true;
          }
          if (key != null && (0 != key[0] ||
            key[1] != 0 ||
            key[2] != 0 ||
            key[3] != 0)) {
            byte[] var35 = LoginCredentialType.extractBytes(this.packedGroups[groupId], (byte) -116, true);
            byte[] var25 = var35;
            var9 = var25;
            PacketBuffer var26 = new PacketBuffer(var35);
            var26.xteaDecrypt(5, key, var26.payload.length, 6528);
            boolean decompiledFrameRemainder0 = false;
          }
          else {
            var9 = LoginCredentialType.extractBytes(this.packedGroups[groupId], (byte) -117, false);
          }
          try {
            if (guard != -7951) {
              this.namedGroupProgress((String) (this.packedGroups[3]), ((int[]) (this.packedGroups[2]))[1]);
            }
            var36 = Js5NetworkRequest.decompressGroup((byte) -26, var9);
            byte[] var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            RuntimeException var11_ref_RuntimeException = decompiledCaughtException;
            RuntimeException stackIn_36_0 = var11_ref_RuntimeException;
            StringBuilder stackIn_36_1 = new StringBuilder();
            boolean stackIn_37_2 = (key != null);
            throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(" ").append(groupId).append(" ").append(var9.length).append(" ").append(ji.a(255, var9.length, var9)).append(" ").append(ji.a(255, -2 + var9.length, var9)).append(" ").append(this.index.groupCrc32s[groupId]).append(" ").append(this.index.encodedCrc32).toString());
          }
          if (this.discardPackedGroups) {
            this.packedGroups[groupId] = null;
          }
          if (var5_int > 1) {
            if (this.fileRetentionPolicy == 2) {
              var11 = var36.length;
              var11--;
              int var12 = 255 & var23[var11];
              var11 = var11 - 4 * var5_int * var12;
              PacketBuffer var29 = new PacketBuffer(var43);
              int var14_int = 0;
              int var15_int = 0;
              var29.position = var11;
              for (int var16 = 0; var16 < var12; var16++) {
                int var17 = 0;
                for (int var18 = 0; var5_int > var18; var18++) {
                  var17 = var17 + var29.readInt(-5053);
                  if (var6 != null) {
                    var19 = var34[var18];
                  } else {
                    var19 = var18;
                  }
                  if (var19 == requestedFileId) {
                    var14_int = var14_int + var17;
                    var15_int = var19;
                  }
                }
              }
              if (0 == var14_int) {
                return true;
              }
              byte[] var44 = new byte[var14_int];
              var29.position = var11;
              int var14_intLifetime1 = 0;
              int var17Lifetime4 = 0;
              for (int var18Lifetime3 = 0; var12 > var18Lifetime3; var18Lifetime3++) {
                int var19Lifetime2 = 0;
                for (int var20 = 0; var5_int > var20; var20++) {
                  var19Lifetime2 = var19Lifetime2 + var29.readInt(-5053);
                  if (var6 != null) {
                    var21 = var34[var20];
                  } else {
                    var21 = var20;
                  }
                  if (requestedFileId == var21) {
                    ArraySupport.copy(var43, var17Lifetime4, var44, var14_intLifetime1, var19Lifetime2);
                    var14_intLifetime1 = var14_intLifetime1 + var19Lifetime2;
                  }
                  var17Lifetime4 = var17Lifetime4 + var19Lifetime2;
                }
              }
              var7[var15_int] = var44;
              return true;
            }
            var11 = var36.length;
            var11--;
            int var12Lifetime1 = 255 & var23[var11];
            var11 = var11 - var12Lifetime1 * var5_int * 4;
            PacketBuffer var31 = new PacketBuffer(var43);
            var31.position = var11;
            int[] var39 = new int[var5_int];
            int[] var32 = var39;
            int[] var14 = var32;
            for (int var15_intLifetime1 = 0; var15_intLifetime1 < var12Lifetime1; var15_intLifetime1++) {
              int var16Lifetime1 = 0;
              for (int var17Lifetime1 = 0; var17Lifetime1 < var5_int; var17Lifetime1++) {
                var16Lifetime1 = var16Lifetime1 + var31.readInt(-5053);
                var14[var17Lifetime1] = var14[var17Lifetime1] + var16Lifetime1;
              }
            }
            byte[][] var40 = new byte[var5_int][];
            byte[][] var33 = var40;
            byte[][] var15 = var33;
            for (int var16Lifetime2 = 0; var5_int > var16Lifetime2; var16Lifetime2++) {
              byte[] array$1 = new byte[var39[var16Lifetime2]];
              var15[var16Lifetime2] = array$1;
              var39[var16Lifetime2] = 0;
            }
            var31.position = var11;
            int var16Lifetime3 = 0;
            for (int var17Lifetime2 = 0; var17Lifetime2 < var12Lifetime1; var17Lifetime2++) {
              int var18Lifetime1 = 0;
              for (int var19Lifetime1 = 0; var5_int > var19Lifetime1; var19Lifetime1++) {
                var18Lifetime1 = var18Lifetime1 + var31.readInt(-5053);
                ArraySupport.copy(var43, var16Lifetime3, var40[var19Lifetime1], var39[var19Lifetime1], var18Lifetime1);
                var16Lifetime3 = var16Lifetime3 + var18Lifetime1;
                var14[var19Lifetime1] = var14[var19Lifetime1] + var18Lifetime1;
              }
            }
            for (int var17Lifetime3 = 0; var5_int > var17Lifetime3; var17Lifetime3++) {
              if (var6 != null) {
                var18Lifetime2 = var34[var17Lifetime3];
              } else {
                var18Lifetime2 = var17Lifetime3;
              }
              if (this.fileRetentionPolicy == 0) {
                var7[var18Lifetime2] = SocketJs5Transport.storeBytes(false, var40[var17Lifetime3], PacketBuffer.xor(guard, -7944));
              } else {
                var7[var18Lifetime2] = var40[var17Lifetime3];
              }
            }
          } else {
            if (var6 != null) {
              var11 = var34[0];
            } else {
              var11 = 0;
            }
            if (this.fileRetentionPolicy != 0) {
              var7[var11] = var43;
            } else {
              var7[var11] = SocketJs5Transport.storeBytes(false, var36, 9);
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_104_0 = var5;
          StringBuilder stackIn_104_1 = new StringBuilder().append("mf.T(");
          if (key == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',').append(guard).append(',').append(requestedFileId).append(',').append(groupId).append(')').toString());
        }
    }

    final byte[] getFile(int groupId, byte guard, int fileId) {
        if (guard != -97) {
          return (byte[]) null;
        }
        return this.getFileWithKey((byte) 75, (int[]) null, fileId, groupId);
    }

    ResourceArchive(ArchiveProvider param0, boolean param1, int param2) {
        this.index = null;
        try {
          if (0 > param2 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.discardPackedGroups = param1 ? true : false;
          this.fileRetentionPolicy = param2;
          this.provider = param0;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "mf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized boolean ensureIndex(int guard) {
        if (guard != 0) {
          return true;
        }
        if (null == this.index) {
          this.index = this.provider.getIndex(29192);
          if (null == this.index) {
            return false;
          }
          this.packedGroups = new Object[this.index.groupCapacity];
          this.unpackedFiles = new Object[this.index.groupCapacity][];
        }
        return true;
    }

    static {
        field_a = new Sprite(7, 7);
        field_d = new EmailValidationError();
        field_f = new String[]{"Retrieval - Hard: complete the asteroid<nbsp>levels", "Retrieval - Hard: complete the baked moon<nbsp>levels", "Retrieval - Hard: complete the icy moon<nbsp>levels", "Complete <nbsp>Retrieval - Hard", "Retrieval - Hard:<br>get 25,000<nbsp>points", "Retrieval - Hard:<br>get 100,000<nbsp>points", "Retrieval: complete a level with more than 2500<nbsp>fuel", "Retrieval - Hard: destroy an alien laser gate and complete the<nbsp>level", "Blow yourself up at speed in the mothership's auto-shield<nbsp>area", "Retrieval - Hard: complete all levels in under 30<nbsp>minutes", "Retrieval - Hard: complete all levels in under 20<nbsp>minutes", "Retrieval - Hard: collect all power-ups in one<nbsp>session", "Retrieval - Hard: destroy all possible alien infrastructure in one<nbsp>session", "Retrieval - Hard: complete 'Force Matrix Defence', without using the<nbsp>power-up", "Retrieval - Hard: complete 'Seeker Caves', without using your shield or<nbsp>shooting", "Retrieval - Hard: complete 'High-Security Stronghold', destroying no more than four green<nbsp>pods", "Retrieval - Hard: complete 'Seeker Prison Cell', without using your<nbsp>shield", "Land on one of the attractors in 'Force Matrix<nbsp>Defence' in Retrieval", "Retrieval - Normal: complete the asteroid<nbsp>levels", "Retrieval - Normal: complete the baked moon<nbsp>levels", "Retrieval - Normal: complete the icy moon<nbsp>levels", "Complete <nbsp>Retrieval - Normal", "Complete the asteroids stage in Retribution", "Complete the sun-baked moon stage in Retribution", "Complete the icy moon stage on Retribution", "Complete the Retribution level set", "Score 350,000 points in Retribution", "Score 800,000 points in Retribution", "Destroy all alien infrastructure in Retribution", "Complete the Simulator level set", "Complete 'Pinball' on Simulator", "Complete 'Anti-gravity' on Simulator"};
        field_k = new LoginStage();
    }
}
