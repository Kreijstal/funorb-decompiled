/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectXToolkitFactory {
    final static GraphicsToolkit createToolkit(int guard, ResourceArchive archive, TextureProvider textures, java.awt.Canvas canvas, int options) {
        try {
          Class var5 = null;
          RuntimeException var5_ref = null;
          Throwable var5_ref2 = null;
          java.lang.reflect.Method var6 = null;
          GraphicsToolkit stackIn_7_0 = null;
          GraphicsToolkit stackIn_9_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (!HiscoreRequest.loadNativeSoftwareLibraries((byte) 124)) {
              throw new RuntimeException("");
            }
            if (!ScrollPane.b((byte) 125, "jagdx")) {
              throw new RuntimeException("");
            }
            if (guard != 7023) {
              stackIn_7_0 = (GraphicsToolkit) null;
              return stackIn_7_0;
            }
            var5 = Class.forName("DirectXGraphicsToolkit");
            var6 = var5.getDeclaredMethod("createToolkit", new Class[]{Class.forName("java.awt.Canvas"), Class.forName("TextureProvider"), Class.forName("ResourceArchive"), Class.forName("java.lang.Integer")});
            stackIn_9_0 = (GraphicsToolkit) (var6.invoke((Object) null, new Object[]{canvas, textures, archive, new Integer(options)}));
            return stackIn_9_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw var5_ref;
          } catch (java.lang.Throwable decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref2 = decompiledCaughtException;
            throw new RuntimeException("");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
